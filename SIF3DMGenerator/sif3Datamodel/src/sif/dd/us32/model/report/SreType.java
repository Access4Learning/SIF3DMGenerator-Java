
package sif.dd.us32.model.report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Student Record Exchange object is a relatively de-normalized data structure meant to be used to transfer student information from one system to another. 
 * 
 * <p>Java class for sreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="localStudentId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="stateStudentId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="ssn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;length value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="federalMigrantStudentId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="stateMigrantStudentId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="stateProvince" type="{http://www.sifassociation.org/datamodel/na/3.2}gStateProvinceType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.sifassociation.org/datamodel/na/3.2}gCountryType" minOccurs="0"/>
 *         &lt;element name="primaryContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *         &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="race" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ethnicityList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ethnicity" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="achievementList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="achievement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="achievementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="achievementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="assessmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="testingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="studentGradeLevelAtTimeOfTest" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="schoolWhenTestTaken" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                       &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
 *                                       &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="accomodationList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="accomodation" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="accomodationCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="accomodationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="accomodationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="scoreList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="score" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="contentArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                 &lt;element name="assessmentGradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
 *                                                 &lt;element name="scoreMetric1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreValue1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreMetric2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreValue2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreMetric3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreValue3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreMetric4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scoreValue4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="disciplineIncidents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="disciplineIncident" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="incidentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="weaponIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="actionList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="action" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="reportingSchool" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                           &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                           &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                           &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                                           &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
 *                                                           &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="graduationRequirementList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="graduationRequirement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="programOfFocus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="subjectAreaList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="subjectArea" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="subjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                 &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="schoolOfEnrollment" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                           &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                           &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                           &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                                           &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="indicators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="immunizationList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="immunization" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="healthTestList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="healthTest" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="healthTestType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="healthTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="parentGuardianList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parentGuardian" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="gender" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
 *                             &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="stateProvince" type="{http://www.sifassociation.org/datamodel/na/3.2}gStateProvinceType" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="programs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activityList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="activity" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="activityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="activityBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="activityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="timeInvolved" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="lep" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lepStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="perkinsLEPStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="title3AcountabilityStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="title3LEPParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="participationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="migrant" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="moveFromCity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="moveFromState" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="moveFromCountry" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="eligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="enrollmentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="homelessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="foodServiceStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *                   &lt;element name="districtAttended" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="schoolAttended" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="residentSchool" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="iepCompletionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="eligibilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="placementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="placementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryDisability" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="secondaryExceptionality" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="fteRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ideaEnvironmentEarlyChildhood" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="serviceList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="service" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="serviceSettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fundingSourceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="fundingSourceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="providerPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                       &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="noninclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transcriptTermList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transcriptTerm" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="courseList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="course" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="secondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="priorToSecondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                 &lt;element name="stateCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="localCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="otherCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="otherCourseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="classSectionId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *                                                 &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ibCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="competencyList" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="competency" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                                                     &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                                     &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                                     &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                                                     &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="schoolOfInstruction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="schoolOfEnrollment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
 *                                       &lt;element name="enrollmentStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="enrollmentEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
 *                             &lt;element name="gpaScale" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="termWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="termUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="cumulativeWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="cumulativeUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="termCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="termCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="cumulativeCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="cumulativeCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="classRank" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                             &lt;element name="classRankTotalNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                             &lt;element name="attendanceSummary" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="daysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="daysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="studentAttendanceRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="attendanceEventList" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="attendanceEvent" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "sreType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "reportDate",
    "firstName",
    "middleName",
    "lastOrSurname",
    "generationCodeOrSuffix",
    "sex",
    "dateOfBirth",
    "localStudentId",
    "stateStudentId",
    "ssn",
    "federalMigrantStudentId",
    "stateMigrantStudentId",
    "streetAddress1",
    "streetAddress2",
    "city",
    "stateProvince",
    "postalCode",
    "country",
    "primaryContactPhone",
    "hispanicOrLatinoEthnicity",
    "raceList",
    "ethnicityList",
    "achievementList",
    "assessmentList",
    "disciplineIncidents",
    "graduationRequirementList",
    "indicators",
    "parentGuardianList",
    "programs",
    "specialEducation",
    "transcriptTermList"
})
public class SreType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String firstName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String middleName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lastOrSurname;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String generationCodeOrSuffix;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSexusType sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType localStudentId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType stateStudentId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ssn;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType federalMigrantStudentId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLocalIdType stateMigrantStudentId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String streetAddress1;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String streetAddress2;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String city;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GStateProvinceType stateProvince;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCountryType country;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GPhoneNumberType primaryContactPhone;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String hispanicOrLatinoEthnicity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.RaceList raceList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.EthnicityList ethnicityList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.AchievementList achievementList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.AssessmentList assessmentList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.DisciplineIncidents disciplineIncidents;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.GraduationRequirementList graduationRequirementList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.Indicators indicators;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.ParentGuardianList parentGuardianList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.Programs programs;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.SpecialEducation specialEducation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SreType.TranscriptTermList transcriptTermList;

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
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
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link GSexusType }
     *     
     */
    public GSexusType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSexusType }
     *     
     */
    public void setSex(GSexusType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the localStudentId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getLocalStudentId() {
        return localStudentId;
    }

    /**
     * Sets the value of the localStudentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setLocalStudentId(GLocalIdType value) {
        this.localStudentId = value;
    }

    /**
     * Gets the value of the stateStudentId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getStateStudentId() {
        return stateStudentId;
    }

    /**
     * Sets the value of the stateStudentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setStateStudentId(GLocalIdType value) {
        this.stateStudentId = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the federalMigrantStudentId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getFederalMigrantStudentId() {
        return federalMigrantStudentId;
    }

    /**
     * Sets the value of the federalMigrantStudentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setFederalMigrantStudentId(GLocalIdType value) {
        this.federalMigrantStudentId = value;
    }

    /**
     * Gets the value of the stateMigrantStudentId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getStateMigrantStudentId() {
        return stateMigrantStudentId;
    }

    /**
     * Sets the value of the stateMigrantStudentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setStateMigrantStudentId(GLocalIdType value) {
        this.stateMigrantStudentId = value;
    }

    /**
     * Gets the value of the streetAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * Sets the value of the streetAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress1(String value) {
        this.streetAddress1 = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
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
     *     {@link GStateProvinceType }
     *     
     */
    public GStateProvinceType getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStateProvinceType }
     *     
     */
    public void setStateProvince(GStateProvinceType value) {
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link GCountryType }
     *     
     */
    public GCountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCountryType }
     *     
     */
    public void setCountry(GCountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the primaryContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link GPhoneNumberType }
     *     
     */
    public GPhoneNumberType getPrimaryContactPhone() {
        return primaryContactPhone;
    }

    /**
     * Sets the value of the primaryContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPhoneNumberType }
     *     
     */
    public void setPrimaryContactPhone(GPhoneNumberType value) {
        this.primaryContactPhone = value;
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
     * Gets the value of the raceList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.RaceList }
     *     
     */
    public SreType.RaceList getRaceList() {
        return raceList;
    }

    /**
     * Sets the value of the raceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.RaceList }
     *     
     */
    public void setRaceList(SreType.RaceList value) {
        this.raceList = value;
    }

    /**
     * Gets the value of the ethnicityList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.EthnicityList }
     *     
     */
    public SreType.EthnicityList getEthnicityList() {
        return ethnicityList;
    }

    /**
     * Sets the value of the ethnicityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.EthnicityList }
     *     
     */
    public void setEthnicityList(SreType.EthnicityList value) {
        this.ethnicityList = value;
    }

    /**
     * Gets the value of the achievementList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.AchievementList }
     *     
     */
    public SreType.AchievementList getAchievementList() {
        return achievementList;
    }

    /**
     * Sets the value of the achievementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.AchievementList }
     *     
     */
    public void setAchievementList(SreType.AchievementList value) {
        this.achievementList = value;
    }

    /**
     * Gets the value of the assessmentList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.AssessmentList }
     *     
     */
    public SreType.AssessmentList getAssessmentList() {
        return assessmentList;
    }

    /**
     * Sets the value of the assessmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.AssessmentList }
     *     
     */
    public void setAssessmentList(SreType.AssessmentList value) {
        this.assessmentList = value;
    }

    /**
     * Gets the value of the disciplineIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.DisciplineIncidents }
     *     
     */
    public SreType.DisciplineIncidents getDisciplineIncidents() {
        return disciplineIncidents;
    }

    /**
     * Sets the value of the disciplineIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.DisciplineIncidents }
     *     
     */
    public void setDisciplineIncidents(SreType.DisciplineIncidents value) {
        this.disciplineIncidents = value;
    }

    /**
     * Gets the value of the graduationRequirementList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.GraduationRequirementList }
     *     
     */
    public SreType.GraduationRequirementList getGraduationRequirementList() {
        return graduationRequirementList;
    }

    /**
     * Sets the value of the graduationRequirementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.GraduationRequirementList }
     *     
     */
    public void setGraduationRequirementList(SreType.GraduationRequirementList value) {
        this.graduationRequirementList = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.Indicators }
     *     
     */
    public SreType.Indicators getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.Indicators }
     *     
     */
    public void setIndicators(SreType.Indicators value) {
        this.indicators = value;
    }

    /**
     * Gets the value of the parentGuardianList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.ParentGuardianList }
     *     
     */
    public SreType.ParentGuardianList getParentGuardianList() {
        return parentGuardianList;
    }

    /**
     * Sets the value of the parentGuardianList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.ParentGuardianList }
     *     
     */
    public void setParentGuardianList(SreType.ParentGuardianList value) {
        this.parentGuardianList = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.Programs }
     *     
     */
    public SreType.Programs getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.Programs }
     *     
     */
    public void setPrograms(SreType.Programs value) {
        this.programs = value;
    }

    /**
     * Gets the value of the specialEducation property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.SpecialEducation }
     *     
     */
    public SreType.SpecialEducation getSpecialEducation() {
        return specialEducation;
    }

    /**
     * Sets the value of the specialEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.SpecialEducation }
     *     
     */
    public void setSpecialEducation(SreType.SpecialEducation value) {
        this.specialEducation = value;
    }

    /**
     * Gets the value of the transcriptTermList property.
     * 
     * @return
     *     possible object is
     *     {@link SreType.TranscriptTermList }
     *     
     */
    public SreType.TranscriptTermList getTranscriptTermList() {
        return transcriptTermList;
    }

    /**
     * Sets the value of the transcriptTermList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SreType.TranscriptTermList }
     *     
     */
    public void setTranscriptTermList(SreType.TranscriptTermList value) {
        this.transcriptTermList = value;
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
     *         &lt;element name="achievement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="achievementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="achievementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "achievement"
    })
    public static class AchievementList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.AchievementList.Achievement> achievement;

        /**
         * Gets the value of the achievement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the achievement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAchievement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.AchievementList.Achievement }
         * 
         * 
         */
        public List<SreType.AchievementList.Achievement> getAchievement() {
            if (achievement == null) {
                achievement = new ArrayList<SreType.AchievementList.Achievement>();
            }
            return this.achievement;
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
         *         &lt;element name="achievementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="achievementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "achievementType",
            "description",
            "achievementDate",
            "any"
        })
        public static class Achievement {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String achievementType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String description;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar achievementDate;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the achievementType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAchievementType() {
                return achievementType;
            }

            /**
             * Sets the value of the achievementType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAchievementType(String value) {
                this.achievementType = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the achievementDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAchievementDate() {
                return achievementDate;
            }

            /**
             * Sets the value of the achievementDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAchievementDate(XMLGregorianCalendar value) {
                this.achievementDate = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
     *         &lt;element name="assessment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="testingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="studentGradeLevelAtTimeOfTest" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="schoolWhenTestTaken" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                             &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
     *                             &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="accomodationList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="accomodation" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="accomodationCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="accomodationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="accomodationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="scoreList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="score" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="contentArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                       &lt;element name="assessmentGradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
     *                                       &lt;element name="scoreMetric1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreValue1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreMetric2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreValue2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreMetric3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreValue3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreMetric4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scoreValue4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "assessment"
    })
    public static class AssessmentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.AssessmentList.Assessment> assessment;

        /**
         * Gets the value of the assessment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.AssessmentList.Assessment }
         * 
         * 
         */
        public List<SreType.AssessmentList.Assessment> getAssessment() {
            if (assessment == null) {
                assessment = new ArrayList<SreType.AssessmentList.Assessment>();
            }
            return this.assessment;
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
         *         &lt;element name="assessmentName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="testingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="studentGradeLevelAtTimeOfTest" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="schoolWhenTestTaken" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                   &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
         *                   &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="accomodationList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="accomodation" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="accomodationCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="accomodationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="accomodationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="scoreList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="score" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="contentArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                             &lt;element name="assessmentGradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
         *                             &lt;element name="scoreMetric1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreValue1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreMetric2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreValue2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreMetric3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreValue3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreMetric4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scoreValue4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "assessmentName",
            "testingDate",
            "studentGradeLevelAtTimeOfTest",
            "schoolWhenTestTaken",
            "accomodationList",
            "scoreList",
            "any"
        })
        public static class Assessment {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String assessmentName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar testingDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String studentGradeLevelAtTimeOfTest;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.AssessmentList.Assessment.SchoolWhenTestTaken schoolWhenTestTaken;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.AssessmentList.Assessment.AccomodationList accomodationList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.AssessmentList.Assessment.ScoreList scoreList;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the assessmentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentName() {
                return assessmentName;
            }

            /**
             * Sets the value of the assessmentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentName(String value) {
                this.assessmentName = value;
            }

            /**
             * Gets the value of the testingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTestingDate() {
                return testingDate;
            }

            /**
             * Sets the value of the testingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTestingDate(XMLGregorianCalendar value) {
                this.testingDate = value;
            }

            /**
             * Gets the value of the studentGradeLevelAtTimeOfTest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentGradeLevelAtTimeOfTest() {
                return studentGradeLevelAtTimeOfTest;
            }

            /**
             * Sets the value of the studentGradeLevelAtTimeOfTest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentGradeLevelAtTimeOfTest(String value) {
                this.studentGradeLevelAtTimeOfTest = value;
            }

            /**
             * Gets the value of the schoolWhenTestTaken property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.AssessmentList.Assessment.SchoolWhenTestTaken }
             *     
             */
            public SreType.AssessmentList.Assessment.SchoolWhenTestTaken getSchoolWhenTestTaken() {
                return schoolWhenTestTaken;
            }

            /**
             * Sets the value of the schoolWhenTestTaken property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.AssessmentList.Assessment.SchoolWhenTestTaken }
             *     
             */
            public void setSchoolWhenTestTaken(SreType.AssessmentList.Assessment.SchoolWhenTestTaken value) {
                this.schoolWhenTestTaken = value;
            }

            /**
             * Gets the value of the accomodationList property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.AssessmentList.Assessment.AccomodationList }
             *     
             */
            public SreType.AssessmentList.Assessment.AccomodationList getAccomodationList() {
                return accomodationList;
            }

            /**
             * Sets the value of the accomodationList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.AssessmentList.Assessment.AccomodationList }
             *     
             */
            public void setAccomodationList(SreType.AssessmentList.Assessment.AccomodationList value) {
                this.accomodationList = value;
            }

            /**
             * Gets the value of the scoreList property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.AssessmentList.Assessment.ScoreList }
             *     
             */
            public SreType.AssessmentList.Assessment.ScoreList getScoreList() {
                return scoreList;
            }

            /**
             * Sets the value of the scoreList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.AssessmentList.Assessment.ScoreList }
             *     
             */
            public void setScoreList(SreType.AssessmentList.Assessment.ScoreList value) {
                this.scoreList = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *         &lt;element name="accomodation" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="accomodationCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="accomodationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="accomodationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "accomodation"
            })
            public static class AccomodationList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                protected List<SreType.AssessmentList.Assessment.AccomodationList.Accomodation> accomodation;

                /**
                 * Gets the value of the accomodation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accomodation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccomodation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SreType.AssessmentList.Assessment.AccomodationList.Accomodation }
                 * 
                 * 
                 */
                public List<SreType.AssessmentList.Assessment.AccomodationList.Accomodation> getAccomodation() {
                    if (accomodation == null) {
                        accomodation = new ArrayList<SreType.AssessmentList.Assessment.AccomodationList.Accomodation>();
                    }
                    return this.accomodation;
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
                 *         &lt;element name="accomodationCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="accomodationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="accomodationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                    "accomodationCategory",
                    "accomodationType",
                    "accomodationDescription",
                    "any"
                })
                public static class Accomodation {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String accomodationCategory;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String accomodationType;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String accomodationDescription;
                    @XmlAnyElement(lax = true)
                    protected List<Object> any;

                    /**
                     * Gets the value of the accomodationCategory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccomodationCategory() {
                        return accomodationCategory;
                    }

                    /**
                     * Sets the value of the accomodationCategory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccomodationCategory(String value) {
                        this.accomodationCategory = value;
                    }

                    /**
                     * Gets the value of the accomodationType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccomodationType() {
                        return accomodationType;
                    }

                    /**
                     * Sets the value of the accomodationType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccomodationType(String value) {
                        this.accomodationType = value;
                    }

                    /**
                     * Gets the value of the accomodationDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccomodationDescription() {
                        return accomodationDescription;
                    }

                    /**
                     * Sets the value of the accomodationDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccomodationDescription(String value) {
                        this.accomodationDescription = value;
                    }

                    /**
                     * Gets the value of the any property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the any property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAny().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getAny() {
                        if (any == null) {
                            any = new ArrayList<Object>();
                        }
                        return this.any;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *         &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
             *         &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "ncesSchoolCode",
                "ncesLEACode",
                "schoolContactPhone",
                "schoolContactEmail",
                "enrollmentEntryDate",
                "enrollmentExitDate",
                "any"
            })
            public static class SchoolWhenTestTaken {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String name;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesSchoolCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesLEACode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GPhoneNumberType schoolContactPhone;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GEmailType schoolContactEmail;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar enrollmentEntryDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar enrollmentExitDate;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

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
                 * Gets the value of the ncesSchoolCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesSchoolCode() {
                    return ncesSchoolCode;
                }

                /**
                 * Sets the value of the ncesSchoolCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesSchoolCode(String value) {
                    this.ncesSchoolCode = value;
                }

                /**
                 * Gets the value of the ncesLEACode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesLEACode() {
                    return ncesLEACode;
                }

                /**
                 * Sets the value of the ncesLEACode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesLEACode(String value) {
                    this.ncesLEACode = value;
                }

                /**
                 * Gets the value of the schoolContactPhone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public GPhoneNumberType getSchoolContactPhone() {
                    return schoolContactPhone;
                }

                /**
                 * Sets the value of the schoolContactPhone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public void setSchoolContactPhone(GPhoneNumberType value) {
                    this.schoolContactPhone = value;
                }

                /**
                 * Gets the value of the schoolContactEmail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GEmailType }
                 *     
                 */
                public GEmailType getSchoolContactEmail() {
                    return schoolContactEmail;
                }

                /**
                 * Sets the value of the schoolContactEmail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GEmailType }
                 *     
                 */
                public void setSchoolContactEmail(GEmailType value) {
                    this.schoolContactEmail = value;
                }

                /**
                 * Gets the value of the enrollmentEntryDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEnrollmentEntryDate() {
                    return enrollmentEntryDate;
                }

                /**
                 * Sets the value of the enrollmentEntryDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEnrollmentEntryDate(XMLGregorianCalendar value) {
                    this.enrollmentEntryDate = value;
                }

                /**
                 * Gets the value of the enrollmentExitDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEnrollmentExitDate() {
                    return enrollmentExitDate;
                }

                /**
                 * Sets the value of the enrollmentExitDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEnrollmentExitDate(XMLGregorianCalendar value) {
                    this.enrollmentExitDate = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
             *         &lt;element name="score" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="contentArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                   &lt;element name="assessmentGradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
             *                   &lt;element name="scoreMetric1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreValue1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreMetric2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreValue2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreMetric3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreValue3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreMetric4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scoreValue4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "score"
            })
            public static class ScoreList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                protected List<SreType.AssessmentList.Assessment.ScoreList.Score> score;

                /**
                 * Gets the value of the score property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the score property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getScore().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SreType.AssessmentList.Assessment.ScoreList.Score }
                 * 
                 * 
                 */
                public List<SreType.AssessmentList.Assessment.ScoreList.Score> getScore() {
                    if (score == null) {
                        score = new ArrayList<SreType.AssessmentList.Assessment.ScoreList.Score>();
                    }
                    return this.score;
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
                 *         &lt;element name="contentArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *         &lt;element name="assessmentGradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
                 *         &lt;element name="scoreMetric1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreValue1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreMetric2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreValue2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreMetric3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreValue3" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreMetric4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scoreValue4" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                    "contentArea",
                    "subTestName",
                    "assessmentGradeLevels",
                    "scoreMetric1",
                    "scoreValue1",
                    "scoreMetric2",
                    "scoreValue2",
                    "scoreMetric3",
                    "scoreValue3",
                    "scoreMetric4",
                    "scoreValue4",
                    "any"
                })
                public static class Score {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String contentArea;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String subTestName;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYearGroupList assessmentGradeLevels;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreMetric1;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreValue1;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreMetric2;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreValue2;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreMetric3;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreValue3;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreMetric4;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scoreValue4;
                    @XmlAnyElement(lax = true)
                    protected List<Object> any;

                    /**
                     * Gets the value of the contentArea property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContentArea() {
                        return contentArea;
                    }

                    /**
                     * Sets the value of the contentArea property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContentArea(String value) {
                        this.contentArea = value;
                    }

                    /**
                     * Gets the value of the subTestName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubTestName() {
                        return subTestName;
                    }

                    /**
                     * Sets the value of the subTestName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubTestName(String value) {
                        this.subTestName = value;
                    }

                    /**
                     * Gets the value of the assessmentGradeLevels property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYearGroupList }
                     *     
                     */
                    public GYearGroupList getAssessmentGradeLevels() {
                        return assessmentGradeLevels;
                    }

                    /**
                     * Sets the value of the assessmentGradeLevels property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYearGroupList }
                     *     
                     */
                    public void setAssessmentGradeLevels(GYearGroupList value) {
                        this.assessmentGradeLevels = value;
                    }

                    /**
                     * Gets the value of the scoreMetric1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreMetric1() {
                        return scoreMetric1;
                    }

                    /**
                     * Sets the value of the scoreMetric1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreMetric1(String value) {
                        this.scoreMetric1 = value;
                    }

                    /**
                     * Gets the value of the scoreValue1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreValue1() {
                        return scoreValue1;
                    }

                    /**
                     * Sets the value of the scoreValue1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreValue1(String value) {
                        this.scoreValue1 = value;
                    }

                    /**
                     * Gets the value of the scoreMetric2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreMetric2() {
                        return scoreMetric2;
                    }

                    /**
                     * Sets the value of the scoreMetric2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreMetric2(String value) {
                        this.scoreMetric2 = value;
                    }

                    /**
                     * Gets the value of the scoreValue2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreValue2() {
                        return scoreValue2;
                    }

                    /**
                     * Sets the value of the scoreValue2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreValue2(String value) {
                        this.scoreValue2 = value;
                    }

                    /**
                     * Gets the value of the scoreMetric3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreMetric3() {
                        return scoreMetric3;
                    }

                    /**
                     * Sets the value of the scoreMetric3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreMetric3(String value) {
                        this.scoreMetric3 = value;
                    }

                    /**
                     * Gets the value of the scoreValue3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreValue3() {
                        return scoreValue3;
                    }

                    /**
                     * Sets the value of the scoreValue3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreValue3(String value) {
                        this.scoreValue3 = value;
                    }

                    /**
                     * Gets the value of the scoreMetric4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreMetric4() {
                        return scoreMetric4;
                    }

                    /**
                     * Sets the value of the scoreMetric4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreMetric4(String value) {
                        this.scoreMetric4 = value;
                    }

                    /**
                     * Gets the value of the scoreValue4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScoreValue4() {
                        return scoreValue4;
                    }

                    /**
                     * Sets the value of the scoreValue4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScoreValue4(String value) {
                        this.scoreValue4 = value;
                    }

                    /**
                     * Gets the value of the any property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the any property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAny().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getAny() {
                        if (any == null) {
                            any = new ArrayList<Object>();
                        }
                        return this.any;
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
     *         &lt;element name="disciplineIncident" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="incidentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="weaponIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="actionList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="action" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="reportingSchool" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                                 &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                 &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                 &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                                                 &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
     *                                                 &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "disciplineIncident"
    })
    public static class DisciplineIncidents {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.DisciplineIncidents.DisciplineIncident> disciplineIncident;

        /**
         * Gets the value of the disciplineIncident property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disciplineIncident property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisciplineIncident().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.DisciplineIncidents.DisciplineIncident }
         * 
         * 
         */
        public List<SreType.DisciplineIncidents.DisciplineIncident> getDisciplineIncident() {
            if (disciplineIncident == null) {
                disciplineIncident = new ArrayList<SreType.DisciplineIncidents.DisciplineIncident>();
            }
            return this.disciplineIncident;
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
         *         &lt;element name="incidentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="weaponIndicator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="actionList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="action" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="reportingSchool" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                                       &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                       &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                       &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                                       &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
         *                                       &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "incidentType",
            "description",
            "incidentDate",
            "weaponIndicator",
            "actionList",
            "any"
        })
        public static class DisciplineIncident {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String incidentType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String description;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar incidentDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String weaponIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.DisciplineIncidents.DisciplineIncident.ActionList actionList;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the incidentType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncidentType() {
                return incidentType;
            }

            /**
             * Sets the value of the incidentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncidentType(String value) {
                this.incidentType = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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
             * Gets the value of the weaponIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeaponIndicator() {
                return weaponIndicator;
            }

            /**
             * Sets the value of the weaponIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeaponIndicator(String value) {
                this.weaponIndicator = value;
            }

            /**
             * Gets the value of the actionList property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList }
             *     
             */
            public SreType.DisciplineIncidents.DisciplineIncident.ActionList getActionList() {
                return actionList;
            }

            /**
             * Sets the value of the actionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList }
             *     
             */
            public void setActionList(SreType.DisciplineIncidents.DisciplineIncident.ActionList value) {
                this.actionList = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *         &lt;element name="action" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="reportingSchool" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                             &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                             &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                             &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *                             &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
             *                             &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                protected List<SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action> action;

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
                 * {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action }
                 * 
                 * 
                 */
                public List<SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action> getAction() {
                    if (action == null) {
                        action = new ArrayList<SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action>();
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
                 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="reportingSchool" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *                   &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                   &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                   &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
                 *                   &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
                 *                   &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                    "actionCode",
                    "actionStartDate",
                    "actionEndDate",
                    "actionDuration",
                    "reportingSchool",
                    "any"
                })
                public static class Action {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String actionCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar actionStartDate;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar actionEndDate;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected Integer actionDuration;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool reportingSchool;
                    @XmlAnyElement(lax = true)
                    protected List<Object> any;

                    /**
                     * Gets the value of the actionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActionCode() {
                        return actionCode;
                    }

                    /**
                     * Sets the value of the actionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setActionCode(String value) {
                        this.actionCode = value;
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
                     *     {@link Integer }
                     *     
                     */
                    public Integer getActionDuration() {
                        return actionDuration;
                    }

                    /**
                     * Sets the value of the actionDuration property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setActionDuration(Integer value) {
                        this.actionDuration = value;
                    }

                    /**
                     * Gets the value of the reportingSchool property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool }
                     *     
                     */
                    public SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool getReportingSchool() {
                        return reportingSchool;
                    }

                    /**
                     * Sets the value of the reportingSchool property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool }
                     *     
                     */
                    public void setReportingSchool(SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool value) {
                        this.reportingSchool = value;
                    }

                    /**
                     * Gets the value of the any property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the any property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAny().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getAny() {
                        if (any == null) {
                            any = new ArrayList<Object>();
                        }
                        return this.any;
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
                     *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                     *         &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *         &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *         &lt;element name="schoolContactPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
                     *         &lt;element name="schoolContactEmail" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailType" minOccurs="0"/>
                     *         &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                        "schoolName",
                        "ncesSchoolCode",
                        "ncesLEACode",
                        "schoolContactPhone",
                        "schoolContactEmail",
                        "enrollmentEntryDate",
                        "enrollmentExitDate",
                        "any"
                    })
                    public static class ReportingSchool {

                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                        @XmlSchemaType(name = "normalizedString")
                        protected String schoolName;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "token")
                        protected String ncesSchoolCode;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "token")
                        protected String ncesLEACode;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected GPhoneNumberType schoolContactPhone;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected GEmailType schoolContactEmail;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar enrollmentEntryDate;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar enrollmentExitDate;
                        @XmlAnyElement(lax = true)
                        protected List<Object> any;

                        /**
                         * Gets the value of the schoolName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSchoolName() {
                            return schoolName;
                        }

                        /**
                         * Sets the value of the schoolName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSchoolName(String value) {
                            this.schoolName = value;
                        }

                        /**
                         * Gets the value of the ncesSchoolCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNcesSchoolCode() {
                            return ncesSchoolCode;
                        }

                        /**
                         * Sets the value of the ncesSchoolCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNcesSchoolCode(String value) {
                            this.ncesSchoolCode = value;
                        }

                        /**
                         * Gets the value of the ncesLEACode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNcesLEACode() {
                            return ncesLEACode;
                        }

                        /**
                         * Sets the value of the ncesLEACode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNcesLEACode(String value) {
                            this.ncesLEACode = value;
                        }

                        /**
                         * Gets the value of the schoolContactPhone property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GPhoneNumberType }
                         *     
                         */
                        public GPhoneNumberType getSchoolContactPhone() {
                            return schoolContactPhone;
                        }

                        /**
                         * Sets the value of the schoolContactPhone property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GPhoneNumberType }
                         *     
                         */
                        public void setSchoolContactPhone(GPhoneNumberType value) {
                            this.schoolContactPhone = value;
                        }

                        /**
                         * Gets the value of the schoolContactEmail property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GEmailType }
                         *     
                         */
                        public GEmailType getSchoolContactEmail() {
                            return schoolContactEmail;
                        }

                        /**
                         * Sets the value of the schoolContactEmail property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GEmailType }
                         *     
                         */
                        public void setSchoolContactEmail(GEmailType value) {
                            this.schoolContactEmail = value;
                        }

                        /**
                         * Gets the value of the enrollmentEntryDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEnrollmentEntryDate() {
                            return enrollmentEntryDate;
                        }

                        /**
                         * Sets the value of the enrollmentEntryDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEnrollmentEntryDate(XMLGregorianCalendar value) {
                            this.enrollmentEntryDate = value;
                        }

                        /**
                         * Gets the value of the enrollmentExitDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEnrollmentExitDate() {
                            return enrollmentExitDate;
                        }

                        /**
                         * Sets the value of the enrollmentExitDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEnrollmentExitDate(XMLGregorianCalendar value) {
                            this.enrollmentExitDate = value;
                        }

                        /**
                         * Gets the value of the any property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the any property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAny().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getAny() {
                            if (any == null) {
                                any = new ArrayList<Object>();
                            }
                            return this.any;
                        }

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
     *         &lt;element name="ethnicity" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "ethnicity"
    })
    public static class EthnicityList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GCodedElementType> ethnicity;

        /**
         * Gets the value of the ethnicity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ethnicity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEthnicity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCodedElementType }
         * 
         * 
         */
        public List<GCodedElementType> getEthnicity() {
            if (ethnicity == null) {
                ethnicity = new ArrayList<GCodedElementType>();
            }
            return this.ethnicity;
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
     *         &lt;element name="graduationRequirement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="programOfFocus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="subjectAreaList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="subjectArea" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="subjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                       &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="schoolOfEnrollment" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                                 &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                 &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                 &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                                                 &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "graduationRequirement"
    })
    public static class GraduationRequirementList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.GraduationRequirementList.GraduationRequirement> graduationRequirement;

        /**
         * Gets the value of the graduationRequirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the graduationRequirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGraduationRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.GraduationRequirementList.GraduationRequirement }
         * 
         * 
         */
        public List<SreType.GraduationRequirementList.GraduationRequirement> getGraduationRequirement() {
            if (graduationRequirement == null) {
                graduationRequirement = new ArrayList<SreType.GraduationRequirementList.GraduationRequirement>();
            }
            return this.graduationRequirement;
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
         *         &lt;element name="programOfFocus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="subjectAreaList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="subjectArea" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="subjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                             &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="schoolOfEnrollment" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                                       &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                       &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                       &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                                       &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "programOfFocus",
            "subjectAreaList",
            "any"
        })
        public static class GraduationRequirement {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String programOfFocus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList subjectAreaList;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the programOfFocus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramOfFocus() {
                return programOfFocus;
            }

            /**
             * Sets the value of the programOfFocus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramOfFocus(String value) {
                this.programOfFocus = value;
            }

            /**
             * Gets the value of the subjectAreaList property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList }
             *     
             */
            public SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList getSubjectAreaList() {
                return subjectAreaList;
            }

            /**
             * Sets the value of the subjectAreaList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList }
             *     
             */
            public void setSubjectAreaList(SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList value) {
                this.subjectAreaList = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *         &lt;element name="subjectArea" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="subjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                   &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="schoolOfEnrollment" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                             &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                             &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                             &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *                             &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "subjectArea"
            })
            public static class SubjectAreaList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                protected List<SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea> subjectArea;

                /**
                 * Gets the value of the subjectArea property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subjectArea property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubjectArea().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea }
                 * 
                 * 
                 */
                public List<SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea> getSubjectArea() {
                    if (subjectArea == null) {
                        subjectArea = new ArrayList<SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea>();
                    }
                    return this.subjectArea;
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
                 *         &lt;element name="subjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *         &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="schoolOfEnrollment" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *                   &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                   &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                   &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
                 *                   &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                    "subjectAreaCode",
                    "subjectAreaName",
                    "creditsRequired",
                    "creditsEarnedCumulative",
                    "schoolOfEnrollment",
                    "any"
                })
                public static class SubjectArea {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String subjectAreaCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String subjectAreaName;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal creditsRequired;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal creditsEarnedCumulative;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment schoolOfEnrollment;
                    @XmlAnyElement(lax = true)
                    protected List<Object> any;

                    /**
                     * Gets the value of the subjectAreaCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubjectAreaCode() {
                        return subjectAreaCode;
                    }

                    /**
                     * Sets the value of the subjectAreaCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubjectAreaCode(String value) {
                        this.subjectAreaCode = value;
                    }

                    /**
                     * Gets the value of the subjectAreaName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubjectAreaName() {
                        return subjectAreaName;
                    }

                    /**
                     * Sets the value of the subjectAreaName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubjectAreaName(String value) {
                        this.subjectAreaName = value;
                    }

                    /**
                     * Gets the value of the creditsRequired property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCreditsRequired() {
                        return creditsRequired;
                    }

                    /**
                     * Sets the value of the creditsRequired property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCreditsRequired(BigDecimal value) {
                        this.creditsRequired = value;
                    }

                    /**
                     * Gets the value of the creditsEarnedCumulative property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCreditsEarnedCumulative() {
                        return creditsEarnedCumulative;
                    }

                    /**
                     * Sets the value of the creditsEarnedCumulative property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCreditsEarnedCumulative(BigDecimal value) {
                        this.creditsEarnedCumulative = value;
                    }

                    /**
                     * Gets the value of the schoolOfEnrollment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment }
                     *     
                     */
                    public SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment getSchoolOfEnrollment() {
                        return schoolOfEnrollment;
                    }

                    /**
                     * Sets the value of the schoolOfEnrollment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment }
                     *     
                     */
                    public void setSchoolOfEnrollment(SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment value) {
                        this.schoolOfEnrollment = value;
                    }

                    /**
                     * Gets the value of the any property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the any property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAny().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getAny() {
                        if (any == null) {
                            any = new ArrayList<Object>();
                        }
                        return this.any;
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
                     *         &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                     *         &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *         &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *         &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
                     *         &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="enrollmentExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                        "nameOfInstitution",
                        "ncesSchoolCode",
                        "ncesLEACode",
                        "primaryContactPhoneNumber",
                        "enrollmentEntryDate",
                        "enrollmentExitDate",
                        "any"
                    })
                    public static class SchoolOfEnrollment {

                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                        @XmlSchemaType(name = "normalizedString")
                        protected String nameOfInstitution;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "token")
                        protected String ncesSchoolCode;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "token")
                        protected String ncesLEACode;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected GPhoneNumberType primaryContactPhoneNumber;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar enrollmentEntryDate;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar enrollmentExitDate;
                        @XmlAnyElement(lax = true)
                        protected List<Object> any;

                        /**
                         * Gets the value of the nameOfInstitution property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNameOfInstitution() {
                            return nameOfInstitution;
                        }

                        /**
                         * Sets the value of the nameOfInstitution property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNameOfInstitution(String value) {
                            this.nameOfInstitution = value;
                        }

                        /**
                         * Gets the value of the ncesSchoolCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNcesSchoolCode() {
                            return ncesSchoolCode;
                        }

                        /**
                         * Sets the value of the ncesSchoolCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNcesSchoolCode(String value) {
                            this.ncesSchoolCode = value;
                        }

                        /**
                         * Gets the value of the ncesLEACode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNcesLEACode() {
                            return ncesLEACode;
                        }

                        /**
                         * Sets the value of the ncesLEACode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNcesLEACode(String value) {
                            this.ncesLEACode = value;
                        }

                        /**
                         * Gets the value of the primaryContactPhoneNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GPhoneNumberType }
                         *     
                         */
                        public GPhoneNumberType getPrimaryContactPhoneNumber() {
                            return primaryContactPhoneNumber;
                        }

                        /**
                         * Sets the value of the primaryContactPhoneNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GPhoneNumberType }
                         *     
                         */
                        public void setPrimaryContactPhoneNumber(GPhoneNumberType value) {
                            this.primaryContactPhoneNumber = value;
                        }

                        /**
                         * Gets the value of the enrollmentEntryDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEnrollmentEntryDate() {
                            return enrollmentEntryDate;
                        }

                        /**
                         * Sets the value of the enrollmentEntryDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEnrollmentEntryDate(XMLGregorianCalendar value) {
                            this.enrollmentEntryDate = value;
                        }

                        /**
                         * Gets the value of the enrollmentExitDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEnrollmentExitDate() {
                            return enrollmentExitDate;
                        }

                        /**
                         * Sets the value of the enrollmentExitDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEnrollmentExitDate(XMLGregorianCalendar value) {
                            this.enrollmentExitDate = value;
                        }

                        /**
                         * Gets the value of the any property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the any property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAny().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getAny() {
                            if (any == null) {
                                any = new ArrayList<Object>();
                            }
                            return this.any;
                        }

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
     *         &lt;element name="immunizationList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="immunization" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="healthTestList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="healthTest" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="healthTestType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="healthTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "immunizationList",
        "healthTestList"
    })
    public static class Indicators {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.Indicators.ImmunizationList immunizationList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.Indicators.HealthTestList healthTestList;

        /**
         * Gets the value of the immunizationList property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.Indicators.ImmunizationList }
         *     
         */
        public SreType.Indicators.ImmunizationList getImmunizationList() {
            return immunizationList;
        }

        /**
         * Sets the value of the immunizationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.Indicators.ImmunizationList }
         *     
         */
        public void setImmunizationList(SreType.Indicators.ImmunizationList value) {
            this.immunizationList = value;
        }

        /**
         * Gets the value of the healthTestList property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.Indicators.HealthTestList }
         *     
         */
        public SreType.Indicators.HealthTestList getHealthTestList() {
            return healthTestList;
        }

        /**
         * Sets the value of the healthTestList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.Indicators.HealthTestList }
         *     
         */
        public void setHealthTestList(SreType.Indicators.HealthTestList value) {
            this.healthTestList = value;
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
         *         &lt;element name="healthTest" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="healthTestType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="healthTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "healthTest"
        })
        public static class HealthTestList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected List<SreType.Indicators.HealthTestList.HealthTest> healthTest;

            /**
             * Gets the value of the healthTest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the healthTest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHealthTest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SreType.Indicators.HealthTestList.HealthTest }
             * 
             * 
             */
            public List<SreType.Indicators.HealthTestList.HealthTest> getHealthTest() {
                if (healthTest == null) {
                    healthTest = new ArrayList<SreType.Indicators.HealthTestList.HealthTest>();
                }
                return this.healthTest;
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
             *         &lt;element name="healthTestType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="healthTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "healthTestType",
                "healthTestDate",
                "result",
                "any"
            })
            public static class HealthTest {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String healthTestType;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar healthTestDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String result;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the healthTestType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHealthTestType() {
                    return healthTestType;
                }

                /**
                 * Sets the value of the healthTestType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHealthTestType(String value) {
                    this.healthTestType = value;
                }

                /**
                 * Gets the value of the healthTestDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getHealthTestDate() {
                    return healthTestDate;
                }

                /**
                 * Sets the value of the healthTestDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setHealthTestDate(XMLGregorianCalendar value) {
                    this.healthTestDate = value;
                }

                /**
                 * Gets the value of the result property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResult() {
                    return result;
                }

                /**
                 * Sets the value of the result property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResult(String value) {
                    this.result = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
         *         &lt;element name="immunization" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected List<SreType.Indicators.ImmunizationList.Immunization> immunization;

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
             * {@link SreType.Indicators.ImmunizationList.Immunization }
             * 
             * 
             */
            public List<SreType.Indicators.ImmunizationList.Immunization> getImmunization() {
                if (immunization == null) {
                    immunization = new ArrayList<SreType.Indicators.ImmunizationList.Immunization>();
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
             *         &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "immunizationType",
                "immunizationDate",
                "any"
            })
            public static class Immunization {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String immunizationType;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar immunizationDate;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

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
                 * Gets the value of the immunizationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getImmunizationDate() {
                    return immunizationDate;
                }

                /**
                 * Sets the value of the immunizationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setImmunizationDate(XMLGregorianCalendar value) {
                    this.immunizationDate = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
     *         &lt;element name="parentGuardian" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="gender" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
     *                   &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="stateProvince" type="{http://www.sifassociation.org/datamodel/na/3.2}gStateProvinceType" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "parentGuardian"
    })
    public static class ParentGuardianList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.ParentGuardianList.ParentGuardian> parentGuardian;

        /**
         * Gets the value of the parentGuardian property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parentGuardian property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParentGuardian().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.ParentGuardianList.ParentGuardian }
         * 
         * 
         */
        public List<SreType.ParentGuardianList.ParentGuardian> getParentGuardian() {
            if (parentGuardian == null) {
                parentGuardian = new ArrayList<SreType.ParentGuardianList.ParentGuardian>();
            }
            return this.parentGuardian;
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
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="gender" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
         *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="stateProvince" type="{http://www.sifassociation.org/datamodel/na/3.2}gStateProvinceType" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "gender",
            "relationship",
            "streetAddress1",
            "streetAddress2",
            "city",
            "stateProvince",
            "postalCode",
            "primaryContactPhoneNumber",
            "any"
        })
        public static class ParentGuardian {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String firstName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String middleName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String lastName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected Object suffix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GSexusType gender;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String relationship;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String streetAddress1;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String streetAddress2;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GStateProvinceType stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GPhoneNumberType primaryContactPhoneNumber;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

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
             *     {@link Object }
             *     
             */
            public Object getSuffix() {
                return suffix;
            }

            /**
             * Sets the value of the suffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSuffix(Object value) {
                this.suffix = value;
            }

            /**
             * Gets the value of the gender property.
             * 
             * @return
             *     possible object is
             *     {@link GSexusType }
             *     
             */
            public GSexusType getGender() {
                return gender;
            }

            /**
             * Sets the value of the gender property.
             * 
             * @param value
             *     allowed object is
             *     {@link GSexusType }
             *     
             */
            public void setGender(GSexusType value) {
                this.gender = value;
            }

            /**
             * Gets the value of the relationship property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationship() {
                return relationship;
            }

            /**
             * Sets the value of the relationship property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationship(String value) {
                this.relationship = value;
            }

            /**
             * Gets the value of the streetAddress1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetAddress1() {
                return streetAddress1;
            }

            /**
             * Sets the value of the streetAddress1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetAddress1(String value) {
                this.streetAddress1 = value;
            }

            /**
             * Gets the value of the streetAddress2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetAddress2() {
                return streetAddress2;
            }

            /**
             * Sets the value of the streetAddress2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetAddress2(String value) {
                this.streetAddress2 = value;
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
             *     {@link GStateProvinceType }
             *     
             */
            public GStateProvinceType getStateProvince() {
                return stateProvince;
            }

            /**
             * Sets the value of the stateProvince property.
             * 
             * @param value
             *     allowed object is
             *     {@link GStateProvinceType }
             *     
             */
            public void setStateProvince(GStateProvinceType value) {
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
             * Gets the value of the primaryContactPhoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link GPhoneNumberType }
             *     
             */
            public GPhoneNumberType getPrimaryContactPhoneNumber() {
                return primaryContactPhoneNumber;
            }

            /**
             * Sets the value of the primaryContactPhoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link GPhoneNumberType }
             *     
             */
            public void setPrimaryContactPhoneNumber(GPhoneNumberType value) {
                this.primaryContactPhoneNumber = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
     *         &lt;element name="activityList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activity" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="activityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="activityBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="activityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="timeInvolved" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="lep" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lepStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="perkinsLEPStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="title3AcountabilityStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="title3LEPParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="participationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="moveFromCity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="moveFromState" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="moveFromCountry" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="eligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="enrollmentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="homelessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="foodServiceStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "activityList",
        "lep",
        "migrant",
        "homelessIndicator",
        "foodServiceStatus",
        "any"
    })
    public static class Programs {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.Programs.ActivityList activityList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.Programs.Lep lep;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.Programs.Migrant migrant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String homelessIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String foodServiceStatus;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the activityList property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.Programs.ActivityList }
         *     
         */
        public SreType.Programs.ActivityList getActivityList() {
            return activityList;
        }

        /**
         * Sets the value of the activityList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.Programs.ActivityList }
         *     
         */
        public void setActivityList(SreType.Programs.ActivityList value) {
            this.activityList = value;
        }

        /**
         * Gets the value of the lep property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.Programs.Lep }
         *     
         */
        public SreType.Programs.Lep getLep() {
            return lep;
        }

        /**
         * Sets the value of the lep property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.Programs.Lep }
         *     
         */
        public void setLep(SreType.Programs.Lep value) {
            this.lep = value;
        }

        /**
         * Gets the value of the migrant property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.Programs.Migrant }
         *     
         */
        public SreType.Programs.Migrant getMigrant() {
            return migrant;
        }

        /**
         * Sets the value of the migrant property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.Programs.Migrant }
         *     
         */
        public void setMigrant(SreType.Programs.Migrant value) {
            this.migrant = value;
        }

        /**
         * Gets the value of the homelessIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomelessIndicator() {
            return homelessIndicator;
        }

        /**
         * Sets the value of the homelessIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomelessIndicator(String value) {
            this.homelessIndicator = value;
        }

        /**
         * Gets the value of the foodServiceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFoodServiceStatus() {
            return foodServiceStatus;
        }

        /**
         * Sets the value of the foodServiceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFoodServiceStatus(String value) {
            this.foodServiceStatus = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
         *         &lt;element name="activity" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="activityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="activityBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="activityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="timeInvolved" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected List<SreType.Programs.ActivityList.Activity> activity;

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
             * {@link SreType.Programs.ActivityList.Activity }
             * 
             * 
             */
            public List<SreType.Programs.ActivityList.Activity> getActivity() {
                if (activity == null) {
                    activity = new ArrayList<SreType.Programs.ActivityList.Activity>();
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
             *         &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="activityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="activityBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="activityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="timeInvolved" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "activityIdentifier",
                "activityType",
                "activityTitle",
                "activityDescription",
                "activityBeginDate",
                "activityEndDate",
                "timeInvolved",
                "any"
            })
            public static class Activity {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String activityIdentifier;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String activityType;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String activityTitle;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String activityDescription;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar activityBeginDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar activityEndDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String timeInvolved;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

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
                 * Gets the value of the activityType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActivityType() {
                    return activityType;
                }

                /**
                 * Sets the value of the activityType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActivityType(String value) {
                    this.activityType = value;
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
                 * Gets the value of the activityDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActivityDescription() {
                    return activityDescription;
                }

                /**
                 * Sets the value of the activityDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActivityDescription(String value) {
                    this.activityDescription = value;
                }

                /**
                 * Gets the value of the activityBeginDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getActivityBeginDate() {
                    return activityBeginDate;
                }

                /**
                 * Sets the value of the activityBeginDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setActivityBeginDate(XMLGregorianCalendar value) {
                    this.activityBeginDate = value;
                }

                /**
                 * Gets the value of the activityEndDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getActivityEndDate() {
                    return activityEndDate;
                }

                /**
                 * Sets the value of the activityEndDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setActivityEndDate(XMLGregorianCalendar value) {
                    this.activityEndDate = value;
                }

                /**
                 * Gets the value of the timeInvolved property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeInvolved() {
                    return timeInvolved;
                }

                /**
                 * Sets the value of the timeInvolved property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeInvolved(String value) {
                    this.timeInvolved = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
         *         &lt;element name="lepStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="perkinsLEPStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="title3AcountabilityStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="title3LEPParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="participationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "lepStatus",
            "perkinsLEPStatus",
            "title3AcountabilityStatus",
            "title3LEPParticipationStatus",
            "participationStartDate",
            "participationEndDate",
            "any"
        })
        public static class Lep {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String lepStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String perkinsLEPStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String title3AcountabilityStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String title3LEPParticipationStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar participationStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar participationEndDate;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the lepStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLepStatus() {
                return lepStatus;
            }

            /**
             * Sets the value of the lepStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLepStatus(String value) {
                this.lepStatus = value;
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
             * Gets the value of the title3AcountabilityStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle3AcountabilityStatus() {
                return title3AcountabilityStatus;
            }

            /**
             * Sets the value of the title3AcountabilityStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle3AcountabilityStatus(String value) {
                this.title3AcountabilityStatus = value;
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
             * Gets the value of the participationStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getParticipationStartDate() {
                return participationStartDate;
            }

            /**
             * Sets the value of the participationStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setParticipationStartDate(XMLGregorianCalendar value) {
                this.participationStartDate = value;
            }

            /**
             * Gets the value of the participationEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getParticipationEndDate() {
                return participationEndDate;
            }

            /**
             * Sets the value of the participationEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setParticipationEndDate(XMLGregorianCalendar value) {
                this.participationEndDate = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
         *         &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="moveFromCity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="moveFromState" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="moveFromCountry" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="eligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="enrollmentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "lastQualifyingMoveDate",
            "moveFromCity",
            "moveFromState",
            "moveFromCountry",
            "eligibilityExpirationDate",
            "enrollmentDate",
            "enrollmentType",
            "any"
        })
        public static class Migrant {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar lastQualifyingMoveDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String moveFromCity;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String moveFromState;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String moveFromCountry;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar eligibilityExpirationDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar enrollmentDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String enrollmentType;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the lastQualifyingMoveDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastQualifyingMoveDate() {
                return lastQualifyingMoveDate;
            }

            /**
             * Sets the value of the lastQualifyingMoveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastQualifyingMoveDate(XMLGregorianCalendar value) {
                this.lastQualifyingMoveDate = value;
            }

            /**
             * Gets the value of the moveFromCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoveFromCity() {
                return moveFromCity;
            }

            /**
             * Sets the value of the moveFromCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoveFromCity(String value) {
                this.moveFromCity = value;
            }

            /**
             * Gets the value of the moveFromState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoveFromState() {
                return moveFromState;
            }

            /**
             * Sets the value of the moveFromState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoveFromState(String value) {
                this.moveFromState = value;
            }

            /**
             * Gets the value of the moveFromCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoveFromCountry() {
                return moveFromCountry;
            }

            /**
             * Sets the value of the moveFromCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoveFromCountry(String value) {
                this.moveFromCountry = value;
            }

            /**
             * Gets the value of the eligibilityExpirationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEligibilityExpirationDate() {
                return eligibilityExpirationDate;
            }

            /**
             * Sets the value of the eligibilityExpirationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEligibilityExpirationDate(XMLGregorianCalendar value) {
                this.eligibilityExpirationDate = value;
            }

            /**
             * Gets the value of the enrollmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEnrollmentDate() {
                return enrollmentDate;
            }

            /**
             * Sets the value of the enrollmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEnrollmentDate(XMLGregorianCalendar value) {
                this.enrollmentDate = value;
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
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
     *         &lt;element name="race" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "race"
    })
    public static class RaceList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GCodedElementType> race;

        /**
         * Gets the value of the race property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the race property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCodedElementType }
         * 
         * 
         */
        public List<GCodedElementType> getRace() {
            if (race == null) {
                race = new ArrayList<GCodedElementType>();
            }
            return this.race;
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
     *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
     *         &lt;element name="districtAttended" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="schoolAttended" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="residentSchool" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="iepCompletionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="eligibilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="placementType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="placementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryDisability" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="secondaryExceptionality" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="fteRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ideaEnvironmentEarlyChildhood" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="serviceList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="service" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="serviceSettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fundingSourceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="fundingSourceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="providerPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                             &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="noninclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "schoolYear",
        "districtAttended",
        "schoolAttended",
        "residentSchool",
        "iepCompletionDate",
        "eligibilityDate",
        "startDate",
        "exitDate",
        "exitReason",
        "placementType",
        "placementDescription",
        "primaryDisability",
        "secondaryExceptionality",
        "fteRatio",
        "ideaEnvironmentEarlyChildhood",
        "serviceList",
        "any"
    })
    public static class SpecialEducation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar schoolYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String districtAttended;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String schoolAttended;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String residentSchool;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar iepCompletionDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar eligibilityDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar exitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String exitReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String placementType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String placementDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String primaryDisability;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String secondaryExceptionality;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected BigDecimal fteRatio;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ideaEnvironmentEarlyChildhood;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected SreType.SpecialEducation.ServiceList serviceList;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * Gets the value of the districtAttended property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrictAttended() {
            return districtAttended;
        }

        /**
         * Sets the value of the districtAttended property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrictAttended(String value) {
            this.districtAttended = value;
        }

        /**
         * Gets the value of the schoolAttended property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolAttended() {
            return schoolAttended;
        }

        /**
         * Sets the value of the schoolAttended property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolAttended(String value) {
            this.schoolAttended = value;
        }

        /**
         * Gets the value of the residentSchool property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidentSchool() {
            return residentSchool;
        }

        /**
         * Sets the value of the residentSchool property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResidentSchool(String value) {
            this.residentSchool = value;
        }

        /**
         * Gets the value of the iepCompletionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIepCompletionDate() {
            return iepCompletionDate;
        }

        /**
         * Sets the value of the iepCompletionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setIepCompletionDate(XMLGregorianCalendar value) {
            this.iepCompletionDate = value;
        }

        /**
         * Gets the value of the eligibilityDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEligibilityDate() {
            return eligibilityDate;
        }

        /**
         * Sets the value of the eligibilityDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEligibilityDate(XMLGregorianCalendar value) {
            this.eligibilityDate = value;
        }

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
         * Gets the value of the exitDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExitDate() {
            return exitDate;
        }

        /**
         * Sets the value of the exitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExitDate(XMLGregorianCalendar value) {
            this.exitDate = value;
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
         * Gets the value of the placementType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlacementType() {
            return placementType;
        }

        /**
         * Sets the value of the placementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlacementType(String value) {
            this.placementType = value;
        }

        /**
         * Gets the value of the placementDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlacementDescription() {
            return placementDescription;
        }

        /**
         * Sets the value of the placementDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlacementDescription(String value) {
            this.placementDescription = value;
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
         * Gets the value of the secondaryExceptionality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryExceptionality() {
            return secondaryExceptionality;
        }

        /**
         * Sets the value of the secondaryExceptionality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryExceptionality(String value) {
            this.secondaryExceptionality = value;
        }

        /**
         * Gets the value of the fteRatio property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFteRatio() {
            return fteRatio;
        }

        /**
         * Sets the value of the fteRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFteRatio(BigDecimal value) {
            this.fteRatio = value;
        }

        /**
         * Gets the value of the ideaEnvironmentEarlyChildhood property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaEnvironmentEarlyChildhood() {
            return ideaEnvironmentEarlyChildhood;
        }

        /**
         * Sets the value of the ideaEnvironmentEarlyChildhood property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaEnvironmentEarlyChildhood(String value) {
            this.ideaEnvironmentEarlyChildhood = value;
        }

        /**
         * Gets the value of the serviceList property.
         * 
         * @return
         *     possible object is
         *     {@link SreType.SpecialEducation.ServiceList }
         *     
         */
        public SreType.SpecialEducation.ServiceList getServiceList() {
            return serviceList;
        }

        /**
         * Sets the value of the serviceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SreType.SpecialEducation.ServiceList }
         *     
         */
        public void setServiceList(SreType.SpecialEducation.ServiceList value) {
            this.serviceList = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
         *         &lt;element name="service" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="serviceSettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fundingSourceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="fundingSourceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="providerPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                   &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="noninclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "service"
        })
        public static class ServiceList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected List<SreType.SpecialEducation.ServiceList.Service> service;

            /**
             * Gets the value of the service property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the service property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SreType.SpecialEducation.ServiceList.Service }
             * 
             * 
             */
            public List<SreType.SpecialEducation.ServiceList.Service> getService() {
                if (service == null) {
                    service = new ArrayList<SreType.SpecialEducation.ServiceList.Service>();
                }
                return this.service;
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
             *         &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="serviceSettingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fundingSourceCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="fundingSourceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="providerPhone" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *         &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="noninclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "ideaEnvironment",
                "serviceSettingDescription",
                "serviceCode",
                "serviceDescription",
                "fundingSourceCode",
                "fundingSourceCodeDescription",
                "serviceProvider",
                "providerPhone",
                "inclusionMinutes",
                "noninclusionMinutes",
                "any"
            })
            public static class Service {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ideaEnvironment;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String serviceSettingDescription;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String serviceCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String serviceDescription;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String fundingSourceCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String fundingSourceCodeDescription;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String serviceProvider;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GPhoneNumberType providerPhone;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "unsignedInt")
                protected Long inclusionMinutes;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "unsignedInt")
                protected Long noninclusionMinutes;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

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
                 * Gets the value of the serviceSettingDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceSettingDescription() {
                    return serviceSettingDescription;
                }

                /**
                 * Sets the value of the serviceSettingDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceSettingDescription(String value) {
                    this.serviceSettingDescription = value;
                }

                /**
                 * Gets the value of the serviceCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceCode() {
                    return serviceCode;
                }

                /**
                 * Sets the value of the serviceCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceCode(String value) {
                    this.serviceCode = value;
                }

                /**
                 * Gets the value of the serviceDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceDescription() {
                    return serviceDescription;
                }

                /**
                 * Sets the value of the serviceDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceDescription(String value) {
                    this.serviceDescription = value;
                }

                /**
                 * Gets the value of the fundingSourceCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFundingSourceCode() {
                    return fundingSourceCode;
                }

                /**
                 * Sets the value of the fundingSourceCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFundingSourceCode(String value) {
                    this.fundingSourceCode = value;
                }

                /**
                 * Gets the value of the fundingSourceCodeDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFundingSourceCodeDescription() {
                    return fundingSourceCodeDescription;
                }

                /**
                 * Sets the value of the fundingSourceCodeDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFundingSourceCodeDescription(String value) {
                    this.fundingSourceCodeDescription = value;
                }

                /**
                 * Gets the value of the serviceProvider property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceProvider() {
                    return serviceProvider;
                }

                /**
                 * Sets the value of the serviceProvider property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceProvider(String value) {
                    this.serviceProvider = value;
                }

                /**
                 * Gets the value of the providerPhone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public GPhoneNumberType getProviderPhone() {
                    return providerPhone;
                }

                /**
                 * Sets the value of the providerPhone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public void setProviderPhone(GPhoneNumberType value) {
                    this.providerPhone = value;
                }

                /**
                 * Gets the value of the inclusionMinutes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getInclusionMinutes() {
                    return inclusionMinutes;
                }

                /**
                 * Sets the value of the inclusionMinutes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setInclusionMinutes(Long value) {
                    this.inclusionMinutes = value;
                }

                /**
                 * Gets the value of the noninclusionMinutes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getNoninclusionMinutes() {
                    return noninclusionMinutes;
                }

                /**
                 * Sets the value of the noninclusionMinutes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setNoninclusionMinutes(Long value) {
                    this.noninclusionMinutes = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
     *         &lt;element name="transcriptTerm" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="courseList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="course" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="secondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="priorToSecondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                       &lt;element name="stateCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="localCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="otherCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="otherCourseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="classSectionId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
     *                                       &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ibCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="competencyList" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="competency" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                                                           &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                           &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                                           &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                                                           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="schoolOfInstruction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="schoolOfEnrollment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
     *                             &lt;element name="enrollmentStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="enrollmentEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
     *                   &lt;element name="gpaScale" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="termWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="termUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="cumulativeWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="cumulativeUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="termCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="termCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="cumulativeCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="cumulativeCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="classRank" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                   &lt;element name="classRankTotalNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                   &lt;element name="attendanceSummary" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="daysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="daysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="studentAttendanceRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="attendanceEventList" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="attendanceEvent" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "transcriptTerm"
    })
    public static class TranscriptTermList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        protected List<SreType.TranscriptTermList.TranscriptTerm> transcriptTerm;

        /**
         * Gets the value of the transcriptTerm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transcriptTerm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranscriptTerm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SreType.TranscriptTermList.TranscriptTerm }
         * 
         * 
         */
        public List<SreType.TranscriptTermList.TranscriptTerm> getTranscriptTerm() {
            if (transcriptTerm == null) {
                transcriptTerm = new ArrayList<SreType.TranscriptTermList.TranscriptTerm>();
            }
            return this.transcriptTerm;
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
         *         &lt;element name="courseList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="course" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="secondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="priorToSecondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                             &lt;element name="stateCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="localCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="otherCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="otherCourseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="classSectionId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
         *                             &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ibCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="competencyList" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="competency" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                                                 &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                                 &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                                                 &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                                                 &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="schoolOfInstruction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="schoolOfEnrollment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
         *                   &lt;element name="enrollmentStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="enrollmentEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
         *         &lt;element name="gpaScale" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="termWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="termUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="cumulativeWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="cumulativeUnweightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="termCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="termCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="cumulativeCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="cumulativeCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="classRank" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *         &lt;element name="classRankTotalNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *         &lt;element name="attendanceSummary" minOccurs="0">
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
         *                                       &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "courseList",
            "schoolOfInstruction",
            "schoolOfEnrollment",
            "schoolYear",
            "description",
            "code",
            "termType",
            "gradeLevel",
            "gpaScale",
            "termWeightedGpa",
            "termUnweightedGpa",
            "cumulativeWeightedGpa",
            "cumulativeUnweightedGpa",
            "termCreditsEarned",
            "termCreditsAttempted",
            "cumulativeCreditsEarned",
            "cumulativeCreditsAttempted",
            "classRank",
            "classRankTotalNumber",
            "attendanceSummary",
            "any"
        })
        public static class TranscriptTerm {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.TranscriptTermList.TranscriptTerm.CourseList courseList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction schoolOfInstruction;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment schoolOfEnrollment;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "gYear")
            protected XMLGregorianCalendar schoolYear;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String description;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String code;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String termType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYearGroupType gradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String gpaScale;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal termWeightedGpa;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal termUnweightedGpa;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal cumulativeWeightedGpa;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal cumulativeUnweightedGpa;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal termCreditsEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal termCreditsAttempted;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal cumulativeCreditsEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal cumulativeCreditsAttempted;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "unsignedInt")
            protected Long classRank;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "unsignedInt")
            protected Long classRankTotalNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary attendanceSummary;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the courseList property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.CourseList }
             *     
             */
            public SreType.TranscriptTermList.TranscriptTerm.CourseList getCourseList() {
                return courseList;
            }

            /**
             * Sets the value of the courseList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.CourseList }
             *     
             */
            public void setCourseList(SreType.TranscriptTermList.TranscriptTerm.CourseList value) {
                this.courseList = value;
            }

            /**
             * Gets the value of the schoolOfInstruction property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction }
             *     
             */
            public SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction getSchoolOfInstruction() {
                return schoolOfInstruction;
            }

            /**
             * Sets the value of the schoolOfInstruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction }
             *     
             */
            public void setSchoolOfInstruction(SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction value) {
                this.schoolOfInstruction = value;
            }

            /**
             * Gets the value of the schoolOfEnrollment property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment }
             *     
             */
            public SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment getSchoolOfEnrollment() {
                return schoolOfEnrollment;
            }

            /**
             * Sets the value of the schoolOfEnrollment property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment }
             *     
             */
            public void setSchoolOfEnrollment(SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment value) {
                this.schoolOfEnrollment = value;
            }

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
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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

            /**
             * Gets the value of the termType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTermType() {
                return termType;
            }

            /**
             * Sets the value of the termType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTermType(String value) {
                this.termType = value;
            }

            /**
             * Gets the value of the gradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link GYearGroupType }
             *     
             */
            public GYearGroupType getGradeLevel() {
                return gradeLevel;
            }

            /**
             * Sets the value of the gradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYearGroupType }
             *     
             */
            public void setGradeLevel(GYearGroupType value) {
                this.gradeLevel = value;
            }

            /**
             * Gets the value of the gpaScale property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGpaScale() {
                return gpaScale;
            }

            /**
             * Sets the value of the gpaScale property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGpaScale(String value) {
                this.gpaScale = value;
            }

            /**
             * Gets the value of the termWeightedGpa property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTermWeightedGpa() {
                return termWeightedGpa;
            }

            /**
             * Sets the value of the termWeightedGpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTermWeightedGpa(BigDecimal value) {
                this.termWeightedGpa = value;
            }

            /**
             * Gets the value of the termUnweightedGpa property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTermUnweightedGpa() {
                return termUnweightedGpa;
            }

            /**
             * Sets the value of the termUnweightedGpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTermUnweightedGpa(BigDecimal value) {
                this.termUnweightedGpa = value;
            }

            /**
             * Gets the value of the cumulativeWeightedGpa property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCumulativeWeightedGpa() {
                return cumulativeWeightedGpa;
            }

            /**
             * Sets the value of the cumulativeWeightedGpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCumulativeWeightedGpa(BigDecimal value) {
                this.cumulativeWeightedGpa = value;
            }

            /**
             * Gets the value of the cumulativeUnweightedGpa property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCumulativeUnweightedGpa() {
                return cumulativeUnweightedGpa;
            }

            /**
             * Sets the value of the cumulativeUnweightedGpa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCumulativeUnweightedGpa(BigDecimal value) {
                this.cumulativeUnweightedGpa = value;
            }

            /**
             * Gets the value of the termCreditsEarned property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTermCreditsEarned() {
                return termCreditsEarned;
            }

            /**
             * Sets the value of the termCreditsEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTermCreditsEarned(BigDecimal value) {
                this.termCreditsEarned = value;
            }

            /**
             * Gets the value of the termCreditsAttempted property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTermCreditsAttempted() {
                return termCreditsAttempted;
            }

            /**
             * Sets the value of the termCreditsAttempted property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTermCreditsAttempted(BigDecimal value) {
                this.termCreditsAttempted = value;
            }

            /**
             * Gets the value of the cumulativeCreditsEarned property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCumulativeCreditsEarned() {
                return cumulativeCreditsEarned;
            }

            /**
             * Sets the value of the cumulativeCreditsEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCumulativeCreditsEarned(BigDecimal value) {
                this.cumulativeCreditsEarned = value;
            }

            /**
             * Gets the value of the cumulativeCreditsAttempted property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCumulativeCreditsAttempted() {
                return cumulativeCreditsAttempted;
            }

            /**
             * Sets the value of the cumulativeCreditsAttempted property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCumulativeCreditsAttempted(BigDecimal value) {
                this.cumulativeCreditsAttempted = value;
            }

            /**
             * Gets the value of the classRank property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getClassRank() {
                return classRank;
            }

            /**
             * Sets the value of the classRank property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setClassRank(Long value) {
                this.classRank = value;
            }

            /**
             * Gets the value of the classRankTotalNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getClassRankTotalNumber() {
                return classRankTotalNumber;
            }

            /**
             * Sets the value of the classRankTotalNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setClassRankTotalNumber(Long value) {
                this.classRankTotalNumber = value;
            }

            /**
             * Gets the value of the attendanceSummary property.
             * 
             * @return
             *     possible object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary }
             *     
             */
            public SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary getAttendanceSummary() {
                return attendanceSummary;
            }

            /**
             * Sets the value of the attendanceSummary property.
             * 
             * @param value
             *     allowed object is
             *     {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary }
             *     
             */
            public void setAttendanceSummary(SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary value) {
                this.attendanceSummary = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *                             &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            public static class AttendanceSummary {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String daysInAttendance;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String daysAbsent;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String studentAttendanceRate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList attendanceEventList;

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
                 *     {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList }
                 *     
                 */
                public SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList getAttendanceEventList() {
                    return attendanceEventList;
                }

                /**
                 * Sets the value of the attendanceEventList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList }
                 *     
                 */
                public void setAttendanceEventList(SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList value) {
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
                 *                   &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    protected List<SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent> attendanceEvent;

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
                     * {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent }
                     * 
                     * 
                     */
                    public List<SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent> getAttendanceEvent() {
                        if (attendanceEvent == null) {
                            attendanceEvent = new ArrayList<SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent>();
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
                     *         &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "dailyAttendanceStatus",
                        "attendanceEventType",
                        "absentAttendanceCategory",
                        "presentAttendanceCategory"
                    })
                    public static class AttendanceEvent {

                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected String calendarEventDate;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected String dailyAttendanceStatus;
                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                        protected String attendanceEventType;
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
             *         &lt;element name="course" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="secondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="priorToSecondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                   &lt;element name="stateCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="localCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="otherCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="otherCourseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="classSectionId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
             *                   &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ibCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="competencyList" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="competency" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *                                       &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                                       &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                                       &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
             *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                protected List<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course> course;

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
                 * {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course }
                 * 
                 * 
                 */
                public List<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course> getCourse() {
                    if (course == null) {
                        course = new ArrayList<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course>();
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
                 *         &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="secondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="priorToSecondaryCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *         &lt;element name="stateCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="localCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="otherCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="otherCourseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="classSectionId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
                 *         &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ibCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="competencyList" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="competency" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
                 *                             &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                             &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *                             &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                    "creditsAttempted",
                    "creditsEarned",
                    "creditTypeEarned",
                    "progressGPA",
                    "progressMark",
                    "gpaWeightedMark",
                    "gpaUnweightedMark",
                    "finalMarkValue",
                    "secondaryCourseSubjectArea",
                    "priorToSecondaryCourseSubjectArea",
                    "courseDescription",
                    "courseName",
                    "stateCourseCode",
                    "scedCourseCode",
                    "localCourseCode",
                    "otherCourseCode",
                    "otherCourseCodeSystem",
                    "classSectionId",
                    "instructionalLevel",
                    "apCourseCode",
                    "ibCourseCode",
                    "competencyList",
                    "any"
                })
                public static class Course {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal creditsAttempted;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal creditsEarned;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String creditTypeEarned;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal progressGPA;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String progressMark;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal gpaWeightedMark;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal gpaUnweightedMark;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String finalMarkValue;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String secondaryCourseSubjectArea;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String priorToSecondaryCourseSubjectArea;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String courseDescription;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String courseName;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String stateCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String scedCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String localCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String otherCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String otherCourseCodeSystem;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GLocalIdType classSectionId;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String instructionalLevel;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String apCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String ibCourseCode;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList competencyList;
                    @XmlAnyElement(lax = true)
                    protected List<Object> any;

                    /**
                     * Gets the value of the creditsAttempted property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCreditsAttempted() {
                        return creditsAttempted;
                    }

                    /**
                     * Sets the value of the creditsAttempted property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCreditsAttempted(BigDecimal value) {
                        this.creditsAttempted = value;
                    }

                    /**
                     * Gets the value of the creditsEarned property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCreditsEarned() {
                        return creditsEarned;
                    }

                    /**
                     * Sets the value of the creditsEarned property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCreditsEarned(BigDecimal value) {
                        this.creditsEarned = value;
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
                     * Gets the value of the progressGPA property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getProgressGPA() {
                        return progressGPA;
                    }

                    /**
                     * Sets the value of the progressGPA property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setProgressGPA(BigDecimal value) {
                        this.progressGPA = value;
                    }

                    /**
                     * Gets the value of the progressMark property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProgressMark() {
                        return progressMark;
                    }

                    /**
                     * Sets the value of the progressMark property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProgressMark(String value) {
                        this.progressMark = value;
                    }

                    /**
                     * Gets the value of the gpaWeightedMark property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getGpaWeightedMark() {
                        return gpaWeightedMark;
                    }

                    /**
                     * Sets the value of the gpaWeightedMark property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setGpaWeightedMark(BigDecimal value) {
                        this.gpaWeightedMark = value;
                    }

                    /**
                     * Gets the value of the gpaUnweightedMark property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getGpaUnweightedMark() {
                        return gpaUnweightedMark;
                    }

                    /**
                     * Sets the value of the gpaUnweightedMark property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setGpaUnweightedMark(BigDecimal value) {
                        this.gpaUnweightedMark = value;
                    }

                    /**
                     * Gets the value of the finalMarkValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFinalMarkValue() {
                        return finalMarkValue;
                    }

                    /**
                     * Sets the value of the finalMarkValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFinalMarkValue(String value) {
                        this.finalMarkValue = value;
                    }

                    /**
                     * Gets the value of the secondaryCourseSubjectArea property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSecondaryCourseSubjectArea() {
                        return secondaryCourseSubjectArea;
                    }

                    /**
                     * Sets the value of the secondaryCourseSubjectArea property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSecondaryCourseSubjectArea(String value) {
                        this.secondaryCourseSubjectArea = value;
                    }

                    /**
                     * Gets the value of the priorToSecondaryCourseSubjectArea property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPriorToSecondaryCourseSubjectArea() {
                        return priorToSecondaryCourseSubjectArea;
                    }

                    /**
                     * Sets the value of the priorToSecondaryCourseSubjectArea property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPriorToSecondaryCourseSubjectArea(String value) {
                        this.priorToSecondaryCourseSubjectArea = value;
                    }

                    /**
                     * Gets the value of the courseDescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCourseDescription() {
                        return courseDescription;
                    }

                    /**
                     * Sets the value of the courseDescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCourseDescription(String value) {
                        this.courseDescription = value;
                    }

                    /**
                     * Gets the value of the courseName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCourseName() {
                        return courseName;
                    }

                    /**
                     * Sets the value of the courseName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCourseName(String value) {
                        this.courseName = value;
                    }

                    /**
                     * Gets the value of the stateCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStateCourseCode() {
                        return stateCourseCode;
                    }

                    /**
                     * Sets the value of the stateCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStateCourseCode(String value) {
                        this.stateCourseCode = value;
                    }

                    /**
                     * Gets the value of the scedCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScedCourseCode() {
                        return scedCourseCode;
                    }

                    /**
                     * Sets the value of the scedCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScedCourseCode(String value) {
                        this.scedCourseCode = value;
                    }

                    /**
                     * Gets the value of the localCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocalCourseCode() {
                        return localCourseCode;
                    }

                    /**
                     * Sets the value of the localCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocalCourseCode(String value) {
                        this.localCourseCode = value;
                    }

                    /**
                     * Gets the value of the otherCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOtherCourseCode() {
                        return otherCourseCode;
                    }

                    /**
                     * Sets the value of the otherCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOtherCourseCode(String value) {
                        this.otherCourseCode = value;
                    }

                    /**
                     * Gets the value of the otherCourseCodeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOtherCourseCodeSystem() {
                        return otherCourseCodeSystem;
                    }

                    /**
                     * Sets the value of the otherCourseCodeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOtherCourseCodeSystem(String value) {
                        this.otherCourseCodeSystem = value;
                    }

                    /**
                     * Gets the value of the classSectionId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GLocalIdType }
                     *     
                     */
                    public GLocalIdType getClassSectionId() {
                        return classSectionId;
                    }

                    /**
                     * Sets the value of the classSectionId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GLocalIdType }
                     *     
                     */
                    public void setClassSectionId(GLocalIdType value) {
                        this.classSectionId = value;
                    }

                    /**
                     * Gets the value of the instructionalLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInstructionalLevel() {
                        return instructionalLevel;
                    }

                    /**
                     * Sets the value of the instructionalLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInstructionalLevel(String value) {
                        this.instructionalLevel = value;
                    }

                    /**
                     * Gets the value of the apCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getApCourseCode() {
                        return apCourseCode;
                    }

                    /**
                     * Sets the value of the apCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setApCourseCode(String value) {
                        this.apCourseCode = value;
                    }

                    /**
                     * Gets the value of the ibCourseCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIbCourseCode() {
                        return ibCourseCode;
                    }

                    /**
                     * Sets the value of the ibCourseCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIbCourseCode(String value) {
                        this.ibCourseCode = value;
                    }

                    /**
                     * Gets the value of the competencyList property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList }
                     *     
                     */
                    public SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList getCompetencyList() {
                        return competencyList;
                    }

                    /**
                     * Sets the value of the competencyList property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList }
                     *     
                     */
                    public void setCompetencyList(SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList value) {
                        this.competencyList = value;
                    }

                    /**
                     * Gets the value of the any property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the any property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAny().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getAny() {
                        if (any == null) {
                            any = new ArrayList<Object>();
                        }
                        return this.any;
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
                     *         &lt;element name="competency" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
                     *                   &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *                   &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                     *                   &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                        "competency"
                    })
                    public static class CompetencyList {

                        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                        protected List<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency> competency;

                        /**
                         * Gets the value of the competency property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the competency property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCompetency().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency }
                         * 
                         * 
                         */
                        public List<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency> getCompetency() {
                            if (competency == null) {
                                competency = new ArrayList<SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency>();
                            }
                            return this.competency;
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
                         *         &lt;element name="learningStandardItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
                         *         &lt;element name="stateCompetencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                         *         &lt;element name="masteryLevel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                         *         &lt;element name="masteryLevelSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
                         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                            "learningStandardItemURL",
                            "stateCompetencyCode",
                            "masteryLevel",
                            "masteryLevelSystem",
                            "any"
                        })
                        public static class Competency {

                            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                            @XmlSchemaType(name = "anyURI")
                            protected String learningStandardItemURL;
                            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                            @XmlSchemaType(name = "token")
                            protected String stateCompetencyCode;
                            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                            @XmlSchemaType(name = "token")
                            protected String masteryLevel;
                            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                            @XmlSchemaType(name = "normalizedString")
                            protected String masteryLevelSystem;
                            @XmlAnyElement(lax = true)
                            protected List<Object> any;

                            /**
                             * Gets the value of the learningStandardItemURL property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getLearningStandardItemURL() {
                                return learningStandardItemURL;
                            }

                            /**
                             * Sets the value of the learningStandardItemURL property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setLearningStandardItemURL(String value) {
                                this.learningStandardItemURL = value;
                            }

                            /**
                             * Gets the value of the stateCompetencyCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStateCompetencyCode() {
                                return stateCompetencyCode;
                            }

                            /**
                             * Sets the value of the stateCompetencyCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStateCompetencyCode(String value) {
                                this.stateCompetencyCode = value;
                            }

                            /**
                             * Gets the value of the masteryLevel property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMasteryLevel() {
                                return masteryLevel;
                            }

                            /**
                             * Sets the value of the masteryLevel property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMasteryLevel(String value) {
                                this.masteryLevel = value;
                            }

                            /**
                             * Gets the value of the masteryLevelSystem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMasteryLevelSystem() {
                                return masteryLevelSystem;
                            }

                            /**
                             * Sets the value of the masteryLevelSystem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMasteryLevelSystem(String value) {
                                this.masteryLevelSystem = value;
                            }

                            /**
                             * Gets the value of the any property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the any property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAny().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Object }
                             * 
                             * 
                             */
                            public List<Object> getAny() {
                                if (any == null) {
                                    any = new ArrayList<Object>();
                                }
                                return this.any;
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
             *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *         &lt;element name="enrollmentStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="enrollmentEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "schoolName",
                "ncesSchoolCode",
                "ncesLEACode",
                "primaryContactPhoneNumber",
                "enrollmentStartDate",
                "enrollmentEndDate",
                "any"
            })
            public static class SchoolOfEnrollment {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String schoolName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesSchoolCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesLEACode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GPhoneNumberType primaryContactPhoneNumber;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar enrollmentStartDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar enrollmentEndDate;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the schoolName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchoolName() {
                    return schoolName;
                }

                /**
                 * Sets the value of the schoolName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchoolName(String value) {
                    this.schoolName = value;
                }

                /**
                 * Gets the value of the ncesSchoolCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesSchoolCode() {
                    return ncesSchoolCode;
                }

                /**
                 * Sets the value of the ncesSchoolCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesSchoolCode(String value) {
                    this.ncesSchoolCode = value;
                }

                /**
                 * Gets the value of the ncesLEACode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesLEACode() {
                    return ncesLEACode;
                }

                /**
                 * Sets the value of the ncesLEACode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesLEACode(String value) {
                    this.ncesLEACode = value;
                }

                /**
                 * Gets the value of the primaryContactPhoneNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public GPhoneNumberType getPrimaryContactPhoneNumber() {
                    return primaryContactPhoneNumber;
                }

                /**
                 * Sets the value of the primaryContactPhoneNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public void setPrimaryContactPhoneNumber(GPhoneNumberType value) {
                    this.primaryContactPhoneNumber = value;
                }

                /**
                 * Gets the value of the enrollmentStartDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEnrollmentStartDate() {
                    return enrollmentStartDate;
                }

                /**
                 * Sets the value of the enrollmentStartDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEnrollmentStartDate(XMLGregorianCalendar value) {
                    this.enrollmentStartDate = value;
                }

                /**
                 * Gets the value of the enrollmentEndDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEnrollmentEndDate() {
                    return enrollmentEndDate;
                }

                /**
                 * Sets the value of the enrollmentEndDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEnrollmentEndDate(XMLGregorianCalendar value) {
                    this.enrollmentEndDate = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
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
             *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="ncesSchoolCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="ncesLEACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="primaryContactPhoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberType" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
                "schoolName",
                "ncesSchoolCode",
                "ncesLEACode",
                "primaryContactPhoneNumber",
                "any"
            })
            public static class SchoolOfInstruction {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String schoolName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesSchoolCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String ncesLEACode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GPhoneNumberType primaryContactPhoneNumber;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the schoolName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchoolName() {
                    return schoolName;
                }

                /**
                 * Sets the value of the schoolName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchoolName(String value) {
                    this.schoolName = value;
                }

                /**
                 * Gets the value of the ncesSchoolCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesSchoolCode() {
                    return ncesSchoolCode;
                }

                /**
                 * Sets the value of the ncesSchoolCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesSchoolCode(String value) {
                    this.ncesSchoolCode = value;
                }

                /**
                 * Gets the value of the ncesLEACode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcesLEACode() {
                    return ncesLEACode;
                }

                /**
                 * Sets the value of the ncesLEACode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcesLEACode(String value) {
                    this.ncesLEACode = value;
                }

                /**
                 * Gets the value of the primaryContactPhoneNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public GPhoneNumberType getPrimaryContactPhoneNumber() {
                    return primaryContactPhoneNumber;
                }

                /**
                 * Sets the value of the primaryContactPhoneNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GPhoneNumberType }
                 *     
                 */
                public void setPrimaryContactPhoneNumber(GPhoneNumberType value) {
                    this.primaryContactPhoneNumber = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
                }

            }

        }

    }

}
