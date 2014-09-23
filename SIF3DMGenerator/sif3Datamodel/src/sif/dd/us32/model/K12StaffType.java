
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
 * <p>Java class for k12StaffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12StaffType">
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
 *                             &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assignment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingAssignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingAssignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationStaffClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryAssignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classroomPositionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="itinerantTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="migrantEducationProgramStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalEducationalJobClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationAgeGroupTaught" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationParaprofessional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationRelatedServicesPersonnel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIProgramStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="credentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingCredentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingCredentialBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialIssuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="yearsOfPriorTeachingExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highlyQualifiedTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="paraprofessionalQualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programSponsorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteInstructorIndustryCertification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contractDaysOfServicePerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentSeparationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentSeparationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationBaseSalary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationHealthBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationRetirementBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationOtherBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="salaryForTeachingAssignmentOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationTotalBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffCompensationTotalSalary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mepPersonnelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleITargetedAssistanceStaffFunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="staffEvaluationOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffEvaluationScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffEvaluationScoreOrRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffEvaluationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="facultyAndAdministrationPerformanceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="technologySkillsStandardsMet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="professionalDevelopmentActivityApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityApprovedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityEducationLevelsAddressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityTargetAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="session" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentPublishActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="sessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="attendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leaveEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="attendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "k12StaffType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identity",
    "contact",
    "demographic",
    "assignment",
    "credential",
    "employment",
    "professionalDevelopment",
    "professionalDevelopmentActivity",
    "attendance",
    "technicalAssistance"
})
public class K12StaffType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Assignment assignment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Credential credential;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Employment employment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.ProfessionalDevelopment professionalDevelopment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.ProfessionalDevelopmentActivity professionalDevelopmentActivity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.Attendance attendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StaffType.TechnicalAssistance technicalAssistance;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Identity }
     *     
     */
    public K12StaffType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Identity }
     *     
     */
    public void setIdentity(K12StaffType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Contact }
     *     
     */
    public K12StaffType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Contact }
     *     
     */
    public void setContact(K12StaffType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Demographic }
     *     
     */
    public K12StaffType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Demographic }
     *     
     */
    public void setDemographic(K12StaffType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Assignment }
     *     
     */
    public K12StaffType.Assignment getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Assignment }
     *     
     */
    public void setAssignment(K12StaffType.Assignment value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Credential }
     *     
     */
    public K12StaffType.Credential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Credential }
     *     
     */
    public void setCredential(K12StaffType.Credential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Employment }
     *     
     */
    public K12StaffType.Employment getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Employment }
     *     
     */
    public void setEmployment(K12StaffType.Employment value) {
        this.employment = value;
    }

    /**
     * Gets the value of the professionalDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.ProfessionalDevelopment }
     *     
     */
    public K12StaffType.ProfessionalDevelopment getProfessionalDevelopment() {
        return professionalDevelopment;
    }

    /**
     * Sets the value of the professionalDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.ProfessionalDevelopment }
     *     
     */
    public void setProfessionalDevelopment(K12StaffType.ProfessionalDevelopment value) {
        this.professionalDevelopment = value;
    }

    /**
     * Gets the value of the professionalDevelopmentActivity property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.ProfessionalDevelopmentActivity }
     *     
     */
    public K12StaffType.ProfessionalDevelopmentActivity getProfessionalDevelopmentActivity() {
        return professionalDevelopmentActivity;
    }

    /**
     * Sets the value of the professionalDevelopmentActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.ProfessionalDevelopmentActivity }
     *     
     */
    public void setProfessionalDevelopmentActivity(K12StaffType.ProfessionalDevelopmentActivity value) {
        this.professionalDevelopmentActivity = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.Attendance }
     *     
     */
    public K12StaffType.Attendance getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.Attendance }
     *     
     */
    public void setAttendance(K12StaffType.Attendance value) {
        this.attendance = value;
    }

    /**
     * Gets the value of the technicalAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link K12StaffType.TechnicalAssistance }
     *     
     */
    public K12StaffType.TechnicalAssistance getTechnicalAssistance() {
        return technicalAssistance;
    }

    /**
     * Sets the value of the technicalAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StaffType.TechnicalAssistance }
     *     
     */
    public void setTechnicalAssistance(K12StaffType.TechnicalAssistance value) {
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
     *         &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingAssignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingAssignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationStaffClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryAssignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classroomPositionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="itinerantTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="migrantEducationProgramStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalEducationalJobClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationAgeGroupTaught" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationParaprofessional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationRelatedServicesPersonnel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIProgramStaffCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "teachingAssignmentStartDate",
        "teachingAssignmentEndDate",
        "educationStaffClassification",
        "primaryAssignment",
        "staffFTE",
        "assignmentStartDate",
        "assignmentEndDate",
        "classroomPositionType",
        "itinerantTeacher",
        "migrantEducationProgramStaffCategory",
        "professionalEducationalJobClassification",
        "specialEducationAgeGroupTaught",
        "specialEducationParaprofessional",
        "specialEducationRelatedServicesPersonnel",
        "specialEducationStaffCategory",
        "specialEducationTeacher",
        "titleIProgramStaffCategory"
    })
    public static class Assignment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingAssignmentStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingAssignmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationStaffClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String primaryAssignment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffFTE;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assignmentStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assignmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classroomPositionType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String itinerantTeacher;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String migrantEducationProgramStaffCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalEducationalJobClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationAgeGroupTaught;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationParaprofessional;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationRelatedServicesPersonnel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationStaffCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationTeacher;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIProgramStaffCategory;

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
         * Gets the value of the teachingAssignmentStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingAssignmentStartDate() {
            return teachingAssignmentStartDate;
        }

        /**
         * Sets the value of the teachingAssignmentStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingAssignmentStartDate(String value) {
            this.teachingAssignmentStartDate = value;
        }

        /**
         * Gets the value of the teachingAssignmentEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingAssignmentEndDate() {
            return teachingAssignmentEndDate;
        }

        /**
         * Sets the value of the teachingAssignmentEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingAssignmentEndDate(String value) {
            this.teachingAssignmentEndDate = value;
        }

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
         * Gets the value of the primaryAssignment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryAssignment() {
            return primaryAssignment;
        }

        /**
         * Sets the value of the primaryAssignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryAssignment(String value) {
            this.primaryAssignment = value;
        }

        /**
         * Gets the value of the staffFTE property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffFTE() {
            return staffFTE;
        }

        /**
         * Sets the value of the staffFTE property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffFTE(String value) {
            this.staffFTE = value;
        }

        /**
         * Gets the value of the assignmentStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignmentStartDate() {
            return assignmentStartDate;
        }

        /**
         * Sets the value of the assignmentStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignmentStartDate(String value) {
            this.assignmentStartDate = value;
        }

        /**
         * Gets the value of the assignmentEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignmentEndDate() {
            return assignmentEndDate;
        }

        /**
         * Sets the value of the assignmentEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignmentEndDate(String value) {
            this.assignmentEndDate = value;
        }

        /**
         * Gets the value of the classroomPositionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassroomPositionType() {
            return classroomPositionType;
        }

        /**
         * Sets the value of the classroomPositionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassroomPositionType(String value) {
            this.classroomPositionType = value;
        }

        /**
         * Gets the value of the itinerantTeacher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItinerantTeacher() {
            return itinerantTeacher;
        }

        /**
         * Sets the value of the itinerantTeacher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItinerantTeacher(String value) {
            this.itinerantTeacher = value;
        }

        /**
         * Gets the value of the migrantEducationProgramStaffCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMigrantEducationProgramStaffCategory() {
            return migrantEducationProgramStaffCategory;
        }

        /**
         * Sets the value of the migrantEducationProgramStaffCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMigrantEducationProgramStaffCategory(String value) {
            this.migrantEducationProgramStaffCategory = value;
        }

        /**
         * Gets the value of the professionalEducationalJobClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalEducationalJobClassification() {
            return professionalEducationalJobClassification;
        }

        /**
         * Sets the value of the professionalEducationalJobClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalEducationalJobClassification(String value) {
            this.professionalEducationalJobClassification = value;
        }

        /**
         * Gets the value of the specialEducationAgeGroupTaught property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationAgeGroupTaught() {
            return specialEducationAgeGroupTaught;
        }

        /**
         * Sets the value of the specialEducationAgeGroupTaught property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationAgeGroupTaught(String value) {
            this.specialEducationAgeGroupTaught = value;
        }

        /**
         * Gets the value of the specialEducationParaprofessional property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationParaprofessional() {
            return specialEducationParaprofessional;
        }

        /**
         * Sets the value of the specialEducationParaprofessional property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationParaprofessional(String value) {
            this.specialEducationParaprofessional = value;
        }

        /**
         * Gets the value of the specialEducationRelatedServicesPersonnel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationRelatedServicesPersonnel() {
            return specialEducationRelatedServicesPersonnel;
        }

        /**
         * Sets the value of the specialEducationRelatedServicesPersonnel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationRelatedServicesPersonnel(String value) {
            this.specialEducationRelatedServicesPersonnel = value;
        }

        /**
         * Gets the value of the specialEducationStaffCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationStaffCategory() {
            return specialEducationStaffCategory;
        }

        /**
         * Sets the value of the specialEducationStaffCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationStaffCategory(String value) {
            this.specialEducationStaffCategory = value;
        }

        /**
         * Gets the value of the specialEducationTeacher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationTeacher() {
            return specialEducationTeacher;
        }

        /**
         * Sets the value of the specialEducationTeacher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationTeacher(String value) {
            this.specialEducationTeacher = value;
        }

        /**
         * Gets the value of the titleIProgramStaffCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIProgramStaffCategory() {
            return titleIProgramStaffCategory;
        }

        /**
         * Sets the value of the titleIProgramStaffCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIProgramStaffCategory(String value) {
            this.titleIProgramStaffCategory = value;
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
     *         &lt;element name="leaveEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="attendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "leaveEventType",
        "attendanceStatus"
    })
    public static class Attendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaveEventType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String attendanceStatus;

        /**
         * Gets the value of the leaveEventType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaveEventType() {
            return leaveEventType;
        }

        /**
         * Sets the value of the leaveEventType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaveEventType(String value) {
            this.leaveEventType = value;
        }

        /**
         * Gets the value of the attendanceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttendanceStatus() {
            return attendanceStatus;
        }

        /**
         * Sets the value of the attendanceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttendanceStatus(String value) {
            this.attendanceStatus = value;
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
        protected K12StaffType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Contact.AddressList }
         *     
         */
        public K12StaffType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Contact.AddressList }
         *     
         */
        public void setAddressList(K12StaffType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Contact.PhoneNumberList }
         *     
         */
        public K12StaffType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(K12StaffType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Contact.EmailList }
         *     
         */
        public K12StaffType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Contact.EmailList }
         *     
         */
        public void setEmailList(K12StaffType.Contact.EmailList value) {
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
            protected List<K12StaffType.Contact.AddressList.Address> address;

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
             * {@link K12StaffType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<K12StaffType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<K12StaffType.Contact.AddressList.Address>();
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
                protected K12StaffType.Contact.AddressList.Address.Street street;
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
                 *     {@link K12StaffType.Contact.AddressList.Address.Street }
                 *     
                 */
                public K12StaffType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link K12StaffType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(K12StaffType.Contact.AddressList.Address.Street value) {
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
            protected List<K12StaffType.Contact.EmailList.Email> email;

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
             * {@link K12StaffType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<K12StaffType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<K12StaffType.Contact.EmailList.Email>();
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
            protected List<K12StaffType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

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
             * {@link K12StaffType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<K12StaffType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<K12StaffType.Contact.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="credentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingCredentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingCredentialBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialIssuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="yearsOfPriorTeachingExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highlyQualifiedTeacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="paraprofessionalQualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programSponsorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteInstructorIndustryCertification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "credentialType",
        "teachingCredentialType",
        "teachingCredentialBasis",
        "credentialIssuanceDate",
        "credentialExpirationDate",
        "yearsOfPriorTeachingExperience",
        "highestLevelOfEducationCompleted",
        "highlyQualifiedTeacher",
        "paraprofessionalQualification",
        "programSponsorType",
        "cteInstructorIndustryCertification"
    })
    public static class Credential {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingCredentialType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingCredentialBasis;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialIssuanceDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String yearsOfPriorTeachingExperience;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highestLevelOfEducationCompleted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highlyQualifiedTeacher;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String paraprofessionalQualification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programSponsorType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteInstructorIndustryCertification;

        /**
         * Gets the value of the credentialType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredentialType() {
            return credentialType;
        }

        /**
         * Sets the value of the credentialType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredentialType(String value) {
            this.credentialType = value;
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
         * Gets the value of the yearsOfPriorTeachingExperience property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYearsOfPriorTeachingExperience() {
            return yearsOfPriorTeachingExperience;
        }

        /**
         * Sets the value of the yearsOfPriorTeachingExperience property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYearsOfPriorTeachingExperience(String value) {
            this.yearsOfPriorTeachingExperience = value;
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
         * Gets the value of the highlyQualifiedTeacher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighlyQualifiedTeacher() {
            return highlyQualifiedTeacher;
        }

        /**
         * Sets the value of the highlyQualifiedTeacher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighlyQualifiedTeacher(String value) {
            this.highlyQualifiedTeacher = value;
        }

        /**
         * Gets the value of the paraprofessionalQualification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParaprofessionalQualification() {
            return paraprofessionalQualification;
        }

        /**
         * Sets the value of the paraprofessionalQualification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParaprofessionalQualification(String value) {
            this.paraprofessionalQualification = value;
        }

        /**
         * Gets the value of the programSponsorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramSponsorType() {
            return programSponsorType;
        }

        /**
         * Sets the value of the programSponsorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramSponsorType(String value) {
            this.programSponsorType = value;
        }

        /**
         * Gets the value of the cteInstructorIndustryCertification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteInstructorIndustryCertification() {
            return cteInstructorIndustryCertification;
        }

        /**
         * Sets the value of the cteInstructorIndustryCertification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteInstructorIndustryCertification(String value) {
            this.cteInstructorIndustryCertification = value;
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
     *         &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contractDaysOfServicePerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentSeparationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentSeparationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationBaseSalary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationHealthBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationRetirementBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationOtherBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="salaryForTeachingAssignmentOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationTotalBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffCompensationTotalSalary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mepPersonnelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleITargetedAssistanceStaffFunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "positionTitle",
        "hireDate",
        "contractDaysOfServicePerYear",
        "employmentStatus",
        "employmentSeparationReason",
        "employmentSeparationType",
        "staffCompensationBaseSalary",
        "staffCompensationHealthBenefits",
        "staffCompensationRetirementBenefits",
        "staffCompensationOtherBenefits",
        "salaryForTeachingAssignmentOnlyIndicator",
        "staffCompensationTotalBenefits",
        "staffCompensationTotalSalary",
        "mepPersonnelIndicator",
        "titleITargetedAssistanceStaffFunded",
        "employmentEndDate",
        "employmentStartDate"
    })
    public static class Employment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String positionTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hireDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String contractDaysOfServicePerYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentSeparationReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentSeparationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationBaseSalary;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationHealthBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationRetirementBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationOtherBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String salaryForTeachingAssignmentOnlyIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationTotalBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffCompensationTotalSalary;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String mepPersonnelIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleITargetedAssistanceStaffFunded;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStartDate;

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
         * Gets the value of the contractDaysOfServicePerYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractDaysOfServicePerYear() {
            return contractDaysOfServicePerYear;
        }

        /**
         * Sets the value of the contractDaysOfServicePerYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractDaysOfServicePerYear(String value) {
            this.contractDaysOfServicePerYear = value;
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
         * Gets the value of the employmentSeparationReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentSeparationReason() {
            return employmentSeparationReason;
        }

        /**
         * Sets the value of the employmentSeparationReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentSeparationReason(String value) {
            this.employmentSeparationReason = value;
        }

        /**
         * Gets the value of the employmentSeparationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentSeparationType() {
            return employmentSeparationType;
        }

        /**
         * Sets the value of the employmentSeparationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentSeparationType(String value) {
            this.employmentSeparationType = value;
        }

        /**
         * Gets the value of the staffCompensationBaseSalary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationBaseSalary() {
            return staffCompensationBaseSalary;
        }

        /**
         * Sets the value of the staffCompensationBaseSalary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationBaseSalary(String value) {
            this.staffCompensationBaseSalary = value;
        }

        /**
         * Gets the value of the staffCompensationHealthBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationHealthBenefits() {
            return staffCompensationHealthBenefits;
        }

        /**
         * Sets the value of the staffCompensationHealthBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationHealthBenefits(String value) {
            this.staffCompensationHealthBenefits = value;
        }

        /**
         * Gets the value of the staffCompensationRetirementBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationRetirementBenefits() {
            return staffCompensationRetirementBenefits;
        }

        /**
         * Sets the value of the staffCompensationRetirementBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationRetirementBenefits(String value) {
            this.staffCompensationRetirementBenefits = value;
        }

        /**
         * Gets the value of the staffCompensationOtherBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationOtherBenefits() {
            return staffCompensationOtherBenefits;
        }

        /**
         * Sets the value of the staffCompensationOtherBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationOtherBenefits(String value) {
            this.staffCompensationOtherBenefits = value;
        }

        /**
         * Gets the value of the salaryForTeachingAssignmentOnlyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSalaryForTeachingAssignmentOnlyIndicator() {
            return salaryForTeachingAssignmentOnlyIndicator;
        }

        /**
         * Sets the value of the salaryForTeachingAssignmentOnlyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSalaryForTeachingAssignmentOnlyIndicator(String value) {
            this.salaryForTeachingAssignmentOnlyIndicator = value;
        }

        /**
         * Gets the value of the staffCompensationTotalBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationTotalBenefits() {
            return staffCompensationTotalBenefits;
        }

        /**
         * Sets the value of the staffCompensationTotalBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationTotalBenefits(String value) {
            this.staffCompensationTotalBenefits = value;
        }

        /**
         * Gets the value of the staffCompensationTotalSalary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffCompensationTotalSalary() {
            return staffCompensationTotalSalary;
        }

        /**
         * Sets the value of the staffCompensationTotalSalary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffCompensationTotalSalary(String value) {
            this.staffCompensationTotalSalary = value;
        }

        /**
         * Gets the value of the mepPersonnelIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMepPersonnelIndicator() {
            return mepPersonnelIndicator;
        }

        /**
         * Sets the value of the mepPersonnelIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMepPersonnelIndicator(String value) {
            this.mepPersonnelIndicator = value;
        }

        /**
         * Gets the value of the titleITargetedAssistanceStaffFunded property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleITargetedAssistanceStaffFunded() {
            return titleITargetedAssistanceStaffFunded;
        }

        /**
         * Sets the value of the titleITargetedAssistanceStaffFunded property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleITargetedAssistanceStaffFunded(String value) {
            this.titleITargetedAssistanceStaffFunded = value;
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
     *                   &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected K12StaffType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.Identity.Identification identification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Identity.Name }
         *     
         */
        public K12StaffType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Identity.Name }
         *     
         */
        public void setName(K12StaffType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Identity.OtherNameList }
         *     
         */
        public K12StaffType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(K12StaffType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.Identity.Identification }
         *     
         */
        public K12StaffType.Identity.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.Identity.Identification }
         *     
         */
        public void setIdentification(K12StaffType.Identity.Identification value) {
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
         *         &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "staffIdSystem",
            "staffId",
            "socialSecurityNumber",
            "idVerification"
        })
        public static class Identification {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String idVerification;

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
            protected List<K12StaffType.Identity.OtherNameList.OtherName> otherName;

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
             * {@link K12StaffType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<K12StaffType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<K12StaffType.Identity.OtherNameList.OtherName>();
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
     *         &lt;element name="staffEvaluationOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffEvaluationScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffEvaluationScoreOrRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffEvaluationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="facultyAndAdministrationPerformanceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="technologySkillsStandardsMet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staffEvaluationOutcome",
        "staffEvaluationScale",
        "staffEvaluationScoreOrRating",
        "staffEvaluationSystem",
        "facultyAndAdministrationPerformanceLevel",
        "technologySkillsStandardsMet",
        "careerEducationPlanDate",
        "careerEducationPlanType"
    })
    public static class ProfessionalDevelopment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEvaluationOutcome;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEvaluationScale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEvaluationScoreOrRating;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEvaluationSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String facultyAndAdministrationPerformanceLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String technologySkillsStandardsMet;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanType;

        /**
         * Gets the value of the staffEvaluationOutcome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEvaluationOutcome() {
            return staffEvaluationOutcome;
        }

        /**
         * Sets the value of the staffEvaluationOutcome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEvaluationOutcome(String value) {
            this.staffEvaluationOutcome = value;
        }

        /**
         * Gets the value of the staffEvaluationScale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEvaluationScale() {
            return staffEvaluationScale;
        }

        /**
         * Sets the value of the staffEvaluationScale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEvaluationScale(String value) {
            this.staffEvaluationScale = value;
        }

        /**
         * Gets the value of the staffEvaluationScoreOrRating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEvaluationScoreOrRating() {
            return staffEvaluationScoreOrRating;
        }

        /**
         * Sets the value of the staffEvaluationScoreOrRating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEvaluationScoreOrRating(String value) {
            this.staffEvaluationScoreOrRating = value;
        }

        /**
         * Gets the value of the staffEvaluationSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEvaluationSystem() {
            return staffEvaluationSystem;
        }

        /**
         * Sets the value of the staffEvaluationSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEvaluationSystem(String value) {
            this.staffEvaluationSystem = value;
        }

        /**
         * Gets the value of the facultyAndAdministrationPerformanceLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacultyAndAdministrationPerformanceLevel() {
            return facultyAndAdministrationPerformanceLevel;
        }

        /**
         * Sets the value of the facultyAndAdministrationPerformanceLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacultyAndAdministrationPerformanceLevel(String value) {
            this.facultyAndAdministrationPerformanceLevel = value;
        }

        /**
         * Gets the value of the technologySkillsStandardsMet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnologySkillsStandardsMet() {
            return technologySkillsStandardsMet;
        }

        /**
         * Sets the value of the technologySkillsStandardsMet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnologySkillsStandardsMet(String value) {
            this.technologySkillsStandardsMet = value;
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
     *         &lt;element name="professionalDevelopmentActivityApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityApprovedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityEducationLevelsAddressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityTargetAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="session" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentPublishActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="sessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "professionalDevelopmentActivityApprovalCode",
        "professionalDevelopmentActivityApprovedFor",
        "professionalDevelopmentActivityCode",
        "professionalDevelopmentActivityCost",
        "professionalDevelopmentActivityCreditType",
        "professionalDevelopmentActivityCredits",
        "professionalDevelopmentActivityDescription",
        "professionalDevelopmentActivityEducationLevelsAddressed",
        "professionalDevelopmentActivityExpirationDate",
        "professionalDevelopmentActivityLevel",
        "professionalDevelopmentActivityObjective",
        "professionalDevelopmentActivityTargetAudience",
        "professionalDevelopmentActivityType",
        "session",
        "sessionLocation"
    })
    public static class ProfessionalDevelopmentActivity {

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
        protected String professionalDevelopmentActivityEducationLevelsAddressed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityObjective;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityTargetAudience;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.ProfessionalDevelopmentActivity.Session session;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StaffType.ProfessionalDevelopmentActivity.SessionLocation sessionLocation;

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
         *     {@link K12StaffType.ProfessionalDevelopmentActivity.Session }
         *     
         */
        public K12StaffType.ProfessionalDevelopmentActivity.Session getSession() {
            return session;
        }

        /**
         * Sets the value of the session property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.ProfessionalDevelopmentActivity.Session }
         *     
         */
        public void setSession(K12StaffType.ProfessionalDevelopmentActivity.Session value) {
            this.session = value;
        }

        /**
         * Gets the value of the sessionLocation property.
         * 
         * @return
         *     possible object is
         *     {@link K12StaffType.ProfessionalDevelopmentActivity.SessionLocation }
         *     
         */
        public K12StaffType.ProfessionalDevelopmentActivity.SessionLocation getSessionLocation() {
            return sessionLocation;
        }

        /**
         * Sets the value of the sessionLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StaffType.ProfessionalDevelopmentActivity.SessionLocation }
         *     
         */
        public void setSessionLocation(K12StaffType.ProfessionalDevelopmentActivity.SessionLocation value) {
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
         *         &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentPublishActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "professionalDevelopmentDeliveryMethod",
            "professionalDevelopmentFundingSource",
            "professionalDevelopmentInstructionalDeliveryMode",
            "professionalDevelopmentInstructorIdentifier",
            "professionalDevelopmentPublishActivityIndicator",
            "professionalDevelopmentSessionCapacity",
            "professionalDevelopmentSessionEndDate",
            "professionalDevelopmentSessionEndTime",
            "professionalDevelopmentSessionEvaluationMethod",
            "professionalDevelopmentSessionEvaluationScore",
            "professionalDevelopmentSessionIdentifier",
            "professionalDevelopmentSessionLocationName",
            "professionalDevelopmentSessionStartDate",
            "professionalDevelopmentSessionStartTime",
            "professionalDevelopmentSessionStatus",
            "sponsoringAgencyName"
        })
        public static class Session {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentDeliveryMethod;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentFundingSource;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentInstructionalDeliveryMode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentInstructorIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentPublishActivityIndicator;
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
            protected String professionalDevelopmentSessionLocationName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStartTime;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sponsoringAgencyName;

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
         *         &lt;element name="sessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "sessionLocationName",
            "addressStreetNumberAndName",
            "addressApartmentRoomOrSuiteNumber",
            "addressCity",
            "stateAbbreviation",
            "addressPostalCode",
            "telephoneNumber"
        })
        public static class SessionLocation {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionLocationName;
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
             * Gets the value of the sessionLocationName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionLocationName() {
                return sessionLocationName;
            }

            /**
             * Sets the value of the sessionLocationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionLocationName(String value) {
                this.sessionLocationName = value;
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
