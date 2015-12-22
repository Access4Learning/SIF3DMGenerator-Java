
package sif.dd.us33.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sif.dd.us33.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "description");
    private final static QName _EnergyUsageTypeUsageLocationEnergyZoneTypeFacility_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "facility");
    private final static QName _AssessmentSections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSections");
    private final static QName _AssessmentAssets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentAssets");
    private final static QName _AssessmentRegistration_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentRegistration");
    private final static QName _XStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xStudents");
    private final static QName _XRoster_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xRoster");
    private final static QName _StaffPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffPerson");
    private final static QName _StudentCore_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentCore");
    private final static QName _AssessmentForm_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentForm");
    private final static QName _AssessmentAsset_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentAsset");
    private final static QName _Course_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "course");
    private final static QName _XContacts_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xContacts");
    private final static QName _LearningStandardAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardAssociations");
    private final static QName _SchoolCalendar_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "schoolCalendar");
    private final static QName _Seas_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "seas");
    private final static QName _LibraryPatronStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "libraryPatronStatus");
    private final static QName _AssessmentResponseSets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentResponseSets");
    private final static QName _StaffPersons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffPersons");
    private final static QName _Person_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "person");
    private final static QName _ContactPersons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "contactPersons");
    private final static QName _UserOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "userOrganizationAssociations");
    private final static QName _StaffPersonAssignments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffPersonAssignments");
    private final static QName _LearningStandardItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardItems");
    private final static QName _Authentications_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "authentications");
    private final static QName _StudentProgramAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentProgramAssociations");
    private final static QName _AssessmentItemAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentItemAssociation");
    private final static QName _XLea_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xLea");
    private final static QName _AssessmentAdministrations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentAdministrations");
    private final static QName _XCalendar_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xCalendar");
    private final static QName _Sres_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sres");
    private final static QName _XStudent_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xStudent");
    private final static QName _PersonRoleAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "personRoleAssociations");
    private final static QName _SchoolCalendarItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "schoolCalendarItem");
    private final static QName _Programs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "programs");
    private final static QName _StudentSectionAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentSectionAssociations");
    private final static QName _Sre_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sre");
    private final static QName _AssessmentResponseSet_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentResponseSet");
    private final static QName _AssessmentSessions_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSessions");
    private final static QName _SchoolCalendarItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "schoolCalendarItems");
    private final static QName _Sections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sections");
    private final static QName _StudentSchoolAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentSchoolAssociation");
    private final static QName _LearningStandardDocuments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardDocuments");
    private final static QName _UserOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "userOrganizationAssociation");
    private final static QName _ContactPersonAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "contactPersonAssociation");
    private final static QName _AssessmentItemAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentItemAssociations");
    private final static QName _DisciplineIncident_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "disciplineIncident");
    private final static QName _XSchools_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xSchools");
    private final static QName _XCalendars_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xCalendars");
    private final static QName _AssessmentScoreTables_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentScoreTables");
    private final static QName _XLeas_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xLeas");
    private final static QName _AssessmentItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentItem");
    private final static QName _SectionRosterReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sectionRosterReport");
    private final static QName _DisciplineIncidents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "disciplineIncidents");
    private final static QName _Lea_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "lea");
    private final static QName _Facilitys_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "facilitys");
    private final static QName _AssessmentSubTest_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSubTest");
    private final static QName _StudentActivityParticipation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentActivityParticipation");
    private final static QName _EnergyUsage_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "energyUsage");
    private final static QName _StaffSectionAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffSectionAssociations");
    private final static QName _AssessmentRegistrations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentRegistrations");
    private final static QName _PersonGroupAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "personGroupAssociations");
    private final static QName _Applications_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "applications");
    private final static QName _FinancialReports_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "financialReports");
    private final static QName _LearningResource_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningResource");
    private final static QName _XStaff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xStaff");
    private final static QName _AssessmentAdministration_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentAdministration");
    private final static QName _Student_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "student");
    private final static QName _Schools_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "schools");
    private final static QName _PartyAddressAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "partyAddressAssociation");
    private final static QName _PersonRoleAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "personRoleAssociation");
    private final static QName _Authorization_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "authorization");
    private final static QName _LearningStandardDocument_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardDocument");
    private final static QName _Assessments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessments");
    private final static QName _LearningStandardAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardAssociation");
    private final static QName _XSre_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xSre");
    private final static QName _XCourse_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xCourse");
    private final static QName _Terms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "terms");
    private final static QName _FinancialReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "financialReport");
    private final static QName _StudentActivity_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentActivity");
    private final static QName _AssessmentSummarys_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSummarys");
    private final static QName _PartyOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "partyOrganizationAssociation");
    private final static QName _ContactPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "contactPerson");
    private final static QName _Leas_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "leas");
    private final static QName _StudentCores_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentCores");
    private final static QName _XRosters_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xRosters");
    private final static QName _AssessmentForms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentForms");
    private final static QName _Program_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "program");
    private final static QName _AssessmentScoreTable_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentScoreTable");
    private final static QName _SectionRosterReports_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sectionRosterReports");
    private final static QName _AssessmentRubrics_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentRubrics");
    private final static QName _AssessmentSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSummary");
    private final static QName _XSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xSchool");
    private final static QName _AssessmentRubric_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentRubric");
    private final static QName _Authorizations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "authorizations");
    private final static QName _AssessmentScoreSets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentScoreSets");
    private final static QName _AssessmentSubTests_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSubTests");
    private final static QName _AssessmentItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentItems");
    private final static QName _StaffSectionAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffSectionAssociation");
    private final static QName _LearningStandardItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningStandardItem");
    private final static QName _AssessmentSession_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSession");
    private final static QName _LearningResources_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "learningResources");
    private final static QName _StudentSchoolAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentSchoolAssociations");
    private final static QName _ContactPersonAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "contactPersonAssociations");
    private final static QName _PartyOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "partyOrganizationAssociations");
    private final static QName _AssessmentScoreSet_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentScoreSet");
    private final static QName _StudentSectionAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentSectionAssociation");
    private final static QName _AssessmentSection_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessmentSection");
    private final static QName _Addresss_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "addresss");
    private final static QName _OrganizationOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "organizationOrganizationAssociations");
    private final static QName _Courses_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "courses");
    private final static QName _StudentProgramAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentProgramAssociation");
    private final static QName _PartyAddressAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "partyAddressAssociations");
    private final static QName _XContact_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xContact");
    private final static QName _XCourses_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xCourses");
    private final static QName _SchoolCalendars_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "schoolCalendars");
    private final static QName _Assessment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "assessment");
    private final static QName _CrisisIncidents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "crisisIncidents");
    private final static QName _Group_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "group");
    private final static QName _School_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "school");
    private final static QName _PersonGroupAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "personGroupAssociation");
    private final static QName _OrganizationOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "organizationOrganizationAssociation");
    private final static QName _Authentication_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "authentication");
    private final static QName _Address_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "address");
    private final static QName _Term_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "term");
    private final static QName _Sea_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sea");
    private final static QName _StaffPersonAssignment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "staffPersonAssignment");
    private final static QName _Section_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "section");
    private final static QName _Persons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "persons");
    private final static QName _Students_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "students");
    private final static QName _Application_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "application");
    private final static QName _CrisisIncident_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "crisisIncident");
    private final static QName _XStaffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xStaffs");
    private final static QName _EnergyUsageTypeUsageLocationEnergyZone_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "energyZone");
    private final static QName _EnergyUsageTypeUsageLocationBuilding_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "building");
    private final static QName _EnergyUsageTypeDataSource_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "dataSource");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionCheckout_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "checkout");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionHoldList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "holdList");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "item");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionFineList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "fineList");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateAvailable_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "dateAvailable");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionHoldListHoldExpires_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "expires");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateNeeded_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "dateNeeded");
    private final static QName _StudentActivityParticipationTypeEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "endDate");
    private final static QName _StudentActivityParticipationTypeRole_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "role");
    private final static QName _StudentActivityParticipationTypeParticipationComment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "participationComment");
    private final static QName _StudentActivityParticipationTypeStartDate_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "startDate");
    private final static QName _StudentActivityParticipationTypeRecognitionList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "recognitionList");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "source");
    private final static QName _EnergyUsageTypeUsageLocationEnergyZoneTagList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "tagList");
    private final static QName _XActivityTypeRecognitions_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "recognitions");
    private final static QName _XActivityTypeStudentActivityLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "studentActivityLevel");
    private final static QName _XActivityTypeLocation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "location");
    private final static QName _XActivityTypeGradeLevels_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "gradeLevels");
    private final static QName _LearningStandardAssociationTypeRefURI_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "refURI");
    private final static QName _StudentActivityTypeCurricularStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "curricularStatus");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionItemPrice_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "price");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionItemElectronicId_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "electronicId");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionItemAuthor_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "author");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionItemCallNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "callNumber");
    private final static QName _EnergyUsageTypeDataSourceReadingDataListReadingDataReadingList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "readingList");
    private final static QName _EnergyUsageTypeDataSourceReadingDataListReadingDataReadingName_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "readingName");
    private final static QName _EnergyUsageTypeDataSourceReadingDataListReadingDataSensorId_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sensorId");
    private final static QName _EnergyUsageTypeDataSourceReadingDataListReadingDataInterval_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "interval");
    private final static QName _LibraryPatronStatusTypeTransactionListTransactionFineListFineReference_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "reference");
    private final static QName _EnergyUsageTypeUsageLocationEnergyZoneTagListTagValue_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "value");
    private final static QName _LibraryPatronStatusTypeNumberOfRefunds_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "numberOfRefunds");
    private final static QName _LibraryPatronStatusTypeTransactionList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "transactionList");
    private final static QName _LibraryPatronStatusTypeMessageList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "messageList");
    private final static QName _LibraryPatronStatusTypeRefundAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "refundAmount");
    private final static QName _AssessmentRubricTypeScoreList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoreList");
    private final static QName _AssessmentRubricTypeScoringGuideReference_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoringGuideReference");
    private final static QName _AssessmentRubricTypeRubricIdentifierList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "rubricIdentifierList");
    private final static QName _AssessmentRubricTypeRubricPublishDate_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "rubricPublishDate");
    private final static QName _AssessmentRubricTypeRubricVersion_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "rubricVersion");
    private final static QName _LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "associationStrength");
    private final static QName _LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "associationType");
    private final static QName _GAbstractContentElementTypeBinaryData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "binaryData");
    private final static QName _GAbstractContentElementTypeTextData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "textData");
    private final static QName _GAbstractContentElementTypeXmlData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "xmlData");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValueFeedbackList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "feedbackList");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "passFailIndicator");
    private final static QName _LibraryPatronStatusTypeMessageListMessageSent_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "sent");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCode_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoreCode");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreDescriptionList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoreDescriptionList");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCodeDefinition_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoreCodeDefinition");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCommentList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.3", "scoreCommentList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sif.dd.us33.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GLearningStandardItemType }
     * 
     */
    public GLearningStandardItemType createGLearningStandardItemType() {
        return new GLearningStandardItemType();
    }

    /**
     * Create an instance of {@link GRoomList }
     * 
     */
    public GRoomList createGRoomList() {
        return new GRoomList();
    }

    /**
     * Create an instance of {@link GCodedElementType }
     * 
     */
    public GCodedElementType createGCodedElementType() {
        return new GCodedElementType();
    }

    /**
     * Create an instance of {@link GCodedElementType.OtherCodeList }
     * 
     */
    public GCodedElementType.OtherCodeList createGCodedElementTypeOtherCodeList() {
        return new GCodedElementType.OtherCodeList();
    }

    /**
     * Create an instance of {@link GPersonType }
     * 
     */
    public GPersonType createGPersonType() {
        return new GPersonType();
    }

    /**
     * Create an instance of {@link GPersonType.AddressRefIdList }
     * 
     */
    public GPersonType.AddressRefIdList createGPersonTypeAddressRefIdList() {
        return new GPersonType.AddressRefIdList();
    }

    /**
     * Create an instance of {@link XSreAcademicSummaryType }
     * 
     */
    public XSreAcademicSummaryType createXSreAcademicSummaryType() {
        return new XSreAcademicSummaryType();
    }

    /**
     * Create an instance of {@link GCourseType }
     * 
     */
    public GCourseType createGCourseType() {
        return new GCourseType();
    }

    /**
     * Create an instance of {@link GSessionScheduleType }
     * 
     */
    public GSessionScheduleType createGSessionScheduleType() {
        return new GSessionScheduleType();
    }

    /**
     * Create an instance of {@link GLEAType }
     * 
     */
    public GLEAType createGLEAType() {
        return new GLEAType();
    }

    /**
     * Create an instance of {@link GLEAType.AddressRefIdList }
     * 
     */
    public GLEAType.AddressRefIdList createGLEATypeAddressRefIdList() {
        return new GLEAType.AddressRefIdList();
    }

    /**
     * Create an instance of {@link GLaxCodedElementType }
     * 
     */
    public GLaxCodedElementType createGLaxCodedElementType() {
        return new GLaxCodedElementType();
    }

    /**
     * Create an instance of {@link GLaxCodedElementType.OtherCodeList }
     * 
     */
    public GLaxCodedElementType.OtherCodeList createGLaxCodedElementTypeOtherCodeList() {
        return new GLaxCodedElementType.OtherCodeList();
    }

    /**
     * Create an instance of {@link GSchoolType }
     * 
     */
    public GSchoolType createGSchoolType() {
        return new GSchoolType();
    }

    /**
     * Create an instance of {@link GDemographicsType }
     * 
     */
    public GDemographicsType createGDemographicsType() {
        return new GDemographicsType();
    }

    /**
     * Create an instance of {@link GBellScheduleType }
     * 
     */
    public GBellScheduleType createGBellScheduleType() {
        return new GBellScheduleType();
    }

    /**
     * Create an instance of {@link GAbstractContentElementType }
     * 
     */
    public GAbstractContentElementType createGAbstractContentElementType() {
        return new GAbstractContentElementType();
    }

    /**
     * Create an instance of {@link XCompetencyType }
     * 
     */
    public XCompetencyType createXCompetencyType() {
        return new XCompetencyType();
    }

    /**
     * Create an instance of {@link XGraduationRequirementType }
     * 
     */
    public XGraduationRequirementType createXGraduationRequirementType() {
        return new XGraduationRequirementType();
    }

    /**
     * Create an instance of {@link XTranscriptTermType }
     * 
     */
    public XTranscriptTermType createXTranscriptTermType() {
        return new XTranscriptTermType();
    }

    /**
     * Create an instance of {@link XHealthType }
     * 
     */
    public XHealthType createXHealthType() {
        return new XHealthType();
    }

    /**
     * Create an instance of {@link GK12CourseType }
     * 
     */
    public GK12CourseType createGK12CourseType() {
        return new GK12CourseType();
    }

    /**
     * Create an instance of {@link XAssessmentScoreSetType }
     * 
     */
    public XAssessmentScoreSetType createXAssessmentScoreSetType() {
        return new XAssessmentScoreSetType();
    }

    /**
     * Create an instance of {@link GStudentType }
     * 
     */
    public GStudentType createGStudentType() {
        return new GStudentType();
    }

    /**
     * Create an instance of {@link XAssessmentType }
     * 
     */
    public XAssessmentType createXAssessmentType() {
        return new XAssessmentType();
    }

    /**
     * Create an instance of {@link XActivityType }
     * 
     */
    public XActivityType createXActivityType() {
        return new XActivityType();
    }

    /**
     * Create an instance of {@link XSpecialEducationType }
     * 
     */
    public XSpecialEducationType createXSpecialEducationType() {
        return new XSpecialEducationType();
    }

    /**
     * Create an instance of {@link XDisciplineIncidentType }
     * 
     */
    public XDisciplineIncidentType createXDisciplineIncidentType() {
        return new XDisciplineIncidentType();
    }

    /**
     * Create an instance of {@link XProgramSummaryType }
     * 
     */
    public XProgramSummaryType createXProgramSummaryType() {
        return new XProgramSummaryType();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType }
     * 
     */
    public GLearningStandardDocumentType createGLearningStandardDocumentType() {
        return new GLearningStandardDocumentType();
    }

    /**
     * Create an instance of {@link AssessmentType }
     * 
     */
    public AssessmentType createAssessmentType() {
        return new AssessmentType();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentItemBankList }
     * 
     */
    public AssessmentType.AssessmentItemBankList createAssessmentTypeAssessmentItemBankList() {
        return new AssessmentType.AssessmentItemBankList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentIdentifierList }
     * 
     */
    public AssessmentType.AssessmentIdentifierList createAssessmentTypeAssessmentIdentifierList() {
        return new AssessmentType.AssessmentIdentifierList();
    }

    /**
     * Create an instance of {@link SeaType }
     * 
     */
    public SeaType createSeaType() {
        return new SeaType();
    }

    /**
     * Create an instance of {@link GApplicationType }
     * 
     */
    public GApplicationType createGApplicationType() {
        return new GApplicationType();
    }

    /**
     * Create an instance of {@link AssessmentSessionType }
     * 
     */
    public AssessmentSessionType createAssessmentSessionType() {
        return new AssessmentSessionType();
    }

    /**
     * Create an instance of {@link AssessmentSessionType.UnusualEventList }
     * 
     */
    public AssessmentSessionType.UnusualEventList createAssessmentSessionTypeUnusualEventList() {
        return new AssessmentSessionType.UnusualEventList();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetType }
     * 
     */
    public AssessmentScoreSetType createAssessmentScoreSetType() {
        return new AssessmentScoreSetType();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetType.FeedbackItemList }
     * 
     */
    public AssessmentScoreSetType.FeedbackItemList createAssessmentScoreSetTypeFeedbackItemList() {
        return new AssessmentScoreSetType.FeedbackItemList();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetType.ScoreList }
     * 
     */
    public AssessmentScoreSetType.ScoreList createAssessmentScoreSetTypeScoreList() {
        return new AssessmentScoreSetType.ScoreList();
    }

    /**
     * Create an instance of {@link AssessmentSectionType }
     * 
     */
    public AssessmentSectionType createAssessmentSectionType() {
        return new AssessmentSectionType();
    }

    /**
     * Create an instance of {@link AssessmentSectionType.SectionItemList }
     * 
     */
    public AssessmentSectionType.SectionItemList createAssessmentSectionTypeSectionItemList() {
        return new AssessmentSectionType.SectionItemList();
    }

    /**
     * Create an instance of {@link AssessmentSectionType.SectionItemList.SectionItem }
     * 
     */
    public AssessmentSectionType.SectionItemList.SectionItem createAssessmentSectionTypeSectionItemListSectionItem() {
        return new AssessmentSectionType.SectionItemList.SectionItem();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType }
     * 
     */
    public AssessmentSummaryType createAssessmentSummaryType() {
        return new AssessmentSummaryType();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.RowList }
     * 
     */
    public AssessmentSummaryType.RowList createAssessmentSummaryTypeRowList() {
        return new AssessmentSummaryType.RowList();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.RowList.Row }
     * 
     */
    public AssessmentSummaryType.RowList.Row createAssessmentSummaryTypeRowListRow() {
        return new AssessmentSummaryType.RowList.Row();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.RowList.Row.CellList }
     * 
     */
    public AssessmentSummaryType.RowList.Row.CellList createAssessmentSummaryTypeRowListRowCellList() {
        return new AssessmentSummaryType.RowList.Row.CellList();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.ColumnList }
     * 
     */
    public AssessmentSummaryType.ColumnList createAssessmentSummaryTypeColumnList() {
        return new AssessmentSummaryType.ColumnList();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType }
     * 
     */
    public AssessmentScoreTableType createAssessmentScoreTableType() {
        return new AssessmentScoreTableType();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreValueList }
     * 
     */
    public AssessmentScoreTableType.ScoreValueList createAssessmentScoreTableTypeScoreValueList() {
        return new AssessmentScoreTableType.ScoreValueList();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreValueList.ScoreValue }
     * 
     */
    public AssessmentScoreTableType.ScoreValueList.ScoreValue createAssessmentScoreTableTypeScoreValueListScoreValue() {
        return new AssessmentScoreTableType.ScoreValueList.ScoreValue();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList }
     * 
     */
    public AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackList() {
        return new AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreTableIdentifierList }
     * 
     */
    public AssessmentScoreTableType.ScoreTableIdentifierList createAssessmentScoreTableTypeScoreTableIdentifierList() {
        return new AssessmentScoreTableType.ScoreTableIdentifierList();
    }

    /**
     * Create an instance of {@link StaffSectionAssociationType }
     * 
     */
    public StaffSectionAssociationType createStaffSectionAssociationType() {
        return new StaffSectionAssociationType();
    }

    /**
     * Create an instance of {@link AssessmentRubricType }
     * 
     */
    public AssessmentRubricType createAssessmentRubricType() {
        return new AssessmentRubricType();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.ScoreList }
     * 
     */
    public AssessmentRubricType.ScoreList createAssessmentRubricTypeScoreList() {
        return new AssessmentRubricType.ScoreList();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.ScoreList.Score }
     * 
     */
    public AssessmentRubricType.ScoreList.Score createAssessmentRubricTypeScoreListScore() {
        return new AssessmentRubricType.ScoreList.Score();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.ScoreList.Score.ScoreCommentList }
     * 
     */
    public AssessmentRubricType.ScoreList.Score.ScoreCommentList createAssessmentRubricTypeScoreListScoreScoreCommentList() {
        return new AssessmentRubricType.ScoreList.Score.ScoreCommentList();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.RubricIdentifierList }
     * 
     */
    public AssessmentRubricType.RubricIdentifierList createAssessmentRubricTypeRubricIdentifierList() {
        return new AssessmentRubricType.RubricIdentifierList();
    }

    /**
     * Create an instance of {@link LearningResourceType }
     * 
     */
    public LearningResourceType createLearningResourceType() {
        return new LearningResourceType();
    }

    /**
     * Create an instance of {@link LearningResourceType.ComponentList }
     * 
     */
    public LearningResourceType.ComponentList createLearningResourceTypeComponentList() {
        return new LearningResourceType.ComponentList();
    }

    /**
     * Create an instance of {@link LearningResourceType.ComponentList.Component }
     * 
     */
    public LearningResourceType.ComponentList.Component createLearningResourceTypeComponentListComponent() {
        return new LearningResourceType.ComponentList.Component();
    }

    /**
     * Create an instance of {@link LearningResourceType.EvaluationList }
     * 
     */
    public LearningResourceType.EvaluationList createLearningResourceTypeEvaluationList() {
        return new LearningResourceType.EvaluationList();
    }

    /**
     * Create an instance of {@link LearningResourceType.ApprovalList }
     * 
     */
    public LearningResourceType.ApprovalList createLearningResourceTypeApprovalList() {
        return new LearningResourceType.ApprovalList();
    }

    /**
     * Create an instance of {@link LearningResourceType.ContactList }
     * 
     */
    public LearningResourceType.ContactList createLearningResourceTypeContactList() {
        return new LearningResourceType.ContactList();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationType }
     * 
     */
    public AssessmentAdministrationType createAssessmentAdministrationType() {
        return new AssessmentAdministrationType();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationType.OrganizationList }
     * 
     */
    public AssessmentAdministrationType.OrganizationList createAssessmentAdministrationTypeOrganizationList() {
        return new AssessmentAdministrationType.OrganizationList();
    }

    /**
     * Create an instance of {@link StudentType }
     * 
     */
    public StudentType createStudentType() {
        return new StudentType();
    }

    /**
     * Create an instance of {@link FinancialReportType }
     * 
     */
    public FinancialReportType createFinancialReportType() {
        return new FinancialReportType();
    }

    /**
     * Create an instance of {@link FinancialReportType.RecordList }
     * 
     */
    public FinancialReportType.RecordList createFinancialReportTypeRecordList() {
        return new FinancialReportType.RecordList();
    }

    /**
     * Create an instance of {@link XSreType }
     * 
     */
    public XSreType createXSreType() {
        return new XSreType();
    }

    /**
     * Create an instance of {@link XSreType.Attendance }
     * 
     */
    public XSreType.Attendance createXSreTypeAttendance() {
        return new XSreType.Attendance();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationType }
     * 
     */
    public LearningStandardAssociationType createLearningStandardAssociationType() {
        return new LearningStandardAssociationType();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationType.TargetObjectList }
     * 
     */
    public LearningStandardAssociationType.TargetObjectList createLearningStandardAssociationTypeTargetObjectList() {
        return new LearningStandardAssociationType.TargetObjectList();
    }

    /**
     * Create an instance of {@link SectionRosterReportType }
     * 
     */
    public SectionRosterReportType createSectionRosterReportType() {
        return new SectionRosterReportType();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StudentList }
     * 
     */
    public SectionRosterReportType.StudentList createSectionRosterReportTypeStudentList() {
        return new SectionRosterReportType.StudentList();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StudentList.Student }
     * 
     */
    public SectionRosterReportType.StudentList.Student createSectionRosterReportTypeStudentListStudent() {
        return new SectionRosterReportType.StudentList.Student();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StaffAssignmentList }
     * 
     */
    public SectionRosterReportType.StaffAssignmentList createSectionRosterReportTypeStaffAssignmentList() {
        return new SectionRosterReportType.StaffAssignmentList();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment }
     * 
     */
    public SectionRosterReportType.StaffAssignmentList.StaffAssignment createSectionRosterReportTypeStaffAssignmentListStaffAssignment() {
        return new SectionRosterReportType.StaffAssignmentList.StaffAssignment();
    }

    /**
     * Create an instance of {@link AssessmentItemType }
     * 
     */
    public AssessmentItemType createAssessmentItemType() {
        return new AssessmentItemType();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentItemBankList }
     * 
     */
    public AssessmentItemType.AssessmentItemBankList createAssessmentItemTypeAssessmentItemBankList() {
        return new AssessmentItemType.AssessmentItemBankList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.ResponseChoiceList }
     * 
     */
    public AssessmentItemType.ResponseChoiceList createAssessmentItemTypeResponseChoiceList() {
        return new AssessmentItemType.ResponseChoiceList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentIdentifierList }
     * 
     */
    public AssessmentItemType.AssessmentIdentifierList createAssessmentItemTypeAssessmentIdentifierList() {
        return new AssessmentItemType.AssessmentIdentifierList();
    }

    /**
     * Create an instance of {@link StudentActivityParticipationType }
     * 
     */
    public StudentActivityParticipationType createStudentActivityParticipationType() {
        return new StudentActivityParticipationType();
    }

    /**
     * Create an instance of {@link EnergyUsageType }
     * 
     */
    public EnergyUsageType createEnergyUsageType() {
        return new EnergyUsageType();
    }

    /**
     * Create an instance of {@link EnergyUsageType.DataSource }
     * 
     */
    public EnergyUsageType.DataSource createEnergyUsageTypeDataSource() {
        return new EnergyUsageType.DataSource();
    }

    /**
     * Create an instance of {@link EnergyUsageType.DataSource.ReadingDataList }
     * 
     */
    public EnergyUsageType.DataSource.ReadingDataList createEnergyUsageTypeDataSourceReadingDataList() {
        return new EnergyUsageType.DataSource.ReadingDataList();
    }

    /**
     * Create an instance of {@link EnergyUsageType.DataSource.ReadingDataList.ReadingData }
     * 
     */
    public EnergyUsageType.DataSource.ReadingDataList.ReadingData createEnergyUsageTypeDataSourceReadingDataListReadingData() {
        return new EnergyUsageType.DataSource.ReadingDataList.ReadingData();
    }

    /**
     * Create an instance of {@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList }
     * 
     */
    public EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList createEnergyUsageTypeDataSourceReadingDataListReadingDataReadingList() {
        return new EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList();
    }

    /**
     * Create an instance of {@link EnergyUsageType.UsageLocation }
     * 
     */
    public EnergyUsageType.UsageLocation createEnergyUsageTypeUsageLocation() {
        return new EnergyUsageType.UsageLocation();
    }

    /**
     * Create an instance of {@link EnergyUsageType.UsageLocation.EnergyZone }
     * 
     */
    public EnergyUsageType.UsageLocation.EnergyZone createEnergyUsageTypeUsageLocationEnergyZone() {
        return new EnergyUsageType.UsageLocation.EnergyZone();
    }

    /**
     * Create an instance of {@link EnergyUsageType.UsageLocation.EnergyZone.TagList }
     * 
     */
    public EnergyUsageType.UsageLocation.EnergyZone.TagList createEnergyUsageTypeUsageLocationEnergyZoneTagList() {
        return new EnergyUsageType.UsageLocation.EnergyZone.TagList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType }
     * 
     */
    public AssessmentSubTestType createAssessmentSubTestType() {
        return new AssessmentSubTestType();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.AssessmentItemList }
     * 
     */
    public AssessmentSubTestType.AssessmentItemList createAssessmentSubTestTypeAssessmentItemList() {
        return new AssessmentSubTestType.AssessmentItemList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.ScoreScaleList }
     * 
     */
    public AssessmentSubTestType.ScoreScaleList createAssessmentSubTestTypeScoreScaleList() {
        return new AssessmentSubTestType.ScoreScaleList();
    }

    /**
     * Create an instance of {@link SreType }
     * 
     */
    public SreType createSreType() {
        return new SreType();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList }
     * 
     */
    public SreType.TranscriptTermList createSreTypeTranscriptTermList() {
        return new SreType.TranscriptTermList();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm createSreTypeTranscriptTermListTranscriptTerm() {
        return new SreType.TranscriptTermList.TranscriptTerm();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary createSreTypeTranscriptTermListTranscriptTermAttendanceSummary() {
        return new SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList createSreTypeTranscriptTermListTranscriptTermAttendanceSummaryAttendanceEventList() {
        return new SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.CourseList }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.CourseList createSreTypeTranscriptTermListTranscriptTermCourseList() {
        return new SreType.TranscriptTermList.TranscriptTerm.CourseList();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.CourseList.Course createSreTypeTranscriptTermListTranscriptTermCourseListCourse() {
        return new SreType.TranscriptTermList.TranscriptTerm.CourseList.Course();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList createSreTypeTranscriptTermListTranscriptTermCourseListCourseCompetencyList() {
        return new SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList();
    }

    /**
     * Create an instance of {@link SreType.SpecialEducation }
     * 
     */
    public SreType.SpecialEducation createSreTypeSpecialEducation() {
        return new SreType.SpecialEducation();
    }

    /**
     * Create an instance of {@link SreType.SpecialEducation.ServiceList }
     * 
     */
    public SreType.SpecialEducation.ServiceList createSreTypeSpecialEducationServiceList() {
        return new SreType.SpecialEducation.ServiceList();
    }

    /**
     * Create an instance of {@link SreType.Programs }
     * 
     */
    public SreType.Programs createSreTypePrograms() {
        return new SreType.Programs();
    }

    /**
     * Create an instance of {@link SreType.Programs.ActivityList }
     * 
     */
    public SreType.Programs.ActivityList createSreTypeProgramsActivityList() {
        return new SreType.Programs.ActivityList();
    }

    /**
     * Create an instance of {@link SreType.ParentGuardianList }
     * 
     */
    public SreType.ParentGuardianList createSreTypeParentGuardianList() {
        return new SreType.ParentGuardianList();
    }

    /**
     * Create an instance of {@link SreType.Indicators }
     * 
     */
    public SreType.Indicators createSreTypeIndicators() {
        return new SreType.Indicators();
    }

    /**
     * Create an instance of {@link SreType.Indicators.HealthTestList }
     * 
     */
    public SreType.Indicators.HealthTestList createSreTypeIndicatorsHealthTestList() {
        return new SreType.Indicators.HealthTestList();
    }

    /**
     * Create an instance of {@link SreType.Indicators.ImmunizationList }
     * 
     */
    public SreType.Indicators.ImmunizationList createSreTypeIndicatorsImmunizationList() {
        return new SreType.Indicators.ImmunizationList();
    }

    /**
     * Create an instance of {@link SreType.GraduationRequirementList }
     * 
     */
    public SreType.GraduationRequirementList createSreTypeGraduationRequirementList() {
        return new SreType.GraduationRequirementList();
    }

    /**
     * Create an instance of {@link SreType.GraduationRequirementList.GraduationRequirement }
     * 
     */
    public SreType.GraduationRequirementList.GraduationRequirement createSreTypeGraduationRequirementListGraduationRequirement() {
        return new SreType.GraduationRequirementList.GraduationRequirement();
    }

    /**
     * Create an instance of {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList }
     * 
     */
    public SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList createSreTypeGraduationRequirementListGraduationRequirementSubjectAreaList() {
        return new SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList();
    }

    /**
     * Create an instance of {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea }
     * 
     */
    public SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea createSreTypeGraduationRequirementListGraduationRequirementSubjectAreaListSubjectArea() {
        return new SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidentList }
     * 
     */
    public SreType.DisciplineIncidentList createSreTypeDisciplineIncidentList() {
        return new SreType.DisciplineIncidentList();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidentList.DisciplineIncident }
     * 
     */
    public SreType.DisciplineIncidentList.DisciplineIncident createSreTypeDisciplineIncidentListDisciplineIncident() {
        return new SreType.DisciplineIncidentList.DisciplineIncident();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidentList.DisciplineIncident.ActionList }
     * 
     */
    public SreType.DisciplineIncidentList.DisciplineIncident.ActionList createSreTypeDisciplineIncidentListDisciplineIncidentActionList() {
        return new SreType.DisciplineIncidentList.DisciplineIncident.ActionList();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action }
     * 
     */
    public SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action createSreTypeDisciplineIncidentListDisciplineIncidentActionListAction() {
        return new SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList }
     * 
     */
    public SreType.AssessmentList createSreTypeAssessmentList() {
        return new SreType.AssessmentList();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment }
     * 
     */
    public SreType.AssessmentList.Assessment createSreTypeAssessmentListAssessment() {
        return new SreType.AssessmentList.Assessment();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment.ScoreList }
     * 
     */
    public SreType.AssessmentList.Assessment.ScoreList createSreTypeAssessmentListAssessmentScoreList() {
        return new SreType.AssessmentList.Assessment.ScoreList();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment.AccomodationList }
     * 
     */
    public SreType.AssessmentList.Assessment.AccomodationList createSreTypeAssessmentListAssessmentAccomodationList() {
        return new SreType.AssessmentList.Assessment.AccomodationList();
    }

    /**
     * Create an instance of {@link SreType.AchievementList }
     * 
     */
    public SreType.AchievementList createSreTypeAchievementList() {
        return new SreType.AchievementList();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType }
     * 
     */
    public AssessmentResponseSetType createAssessmentResponseSetType() {
        return new AssessmentResponseSetType();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList }
     * 
     */
    public AssessmentResponseSetType.ItemList createAssessmentResponseSetTypeItemList() {
        return new AssessmentResponseSetType.ItemList();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item createAssessmentResponseSetTypeItemListItem() {
        return new AssessmentResponseSetType.ItemList.Item();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.FeedbackItemList }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.FeedbackItemList createAssessmentResponseSetTypeItemListItemFeedbackItemList() {
        return new AssessmentResponseSetType.ItemList.Item.FeedbackItemList();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.TraitScoreList }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.TraitScoreList createAssessmentResponseSetTypeItemListItemTraitScoreList() {
        return new AssessmentResponseSetType.ItemList.Item.TraitScoreList();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.CommentList }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.CommentList createAssessmentResponseSetTypeItemListItemCommentList() {
        return new AssessmentResponseSetType.ItemList.Item.CommentList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType }
     * 
     */
    public DisciplineIncidentType createDisciplineIncidentType() {
        return new DisciplineIncidentType();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.IncidentActionList }
     * 
     */
    public DisciplineIncidentType.IncidentActionList createDisciplineIncidentTypeIncidentActionList() {
        return new DisciplineIncidentType.IncidentActionList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.VictimList }
     * 
     */
    public DisciplineIncidentType.VictimList createDisciplineIncidentTypeVictimList() {
        return new DisciplineIncidentType.VictimList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList }
     * 
     */
    public DisciplineIncidentType.OffenderList createDisciplineIncidentTypeOffenderList() {
        return new DisciplineIncidentType.OffenderList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender createDisciplineIncidentTypeOffenderListOffender() {
        return new DisciplineIncidentType.OffenderList.Offender();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender.ActionList }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender.ActionList createDisciplineIncidentTypeOffenderListOffenderActionList() {
        return new DisciplineIncidentType.OffenderList.Offender.ActionList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.IncidentCategoryList }
     * 
     */
    public DisciplineIncidentType.IncidentCategoryList createDisciplineIncidentTypeIncidentCategoryList() {
        return new DisciplineIncidentType.IncidentCategoryList();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType }
     * 
     */
    public SchoolCalendarItemType createSchoolCalendarItemType() {
        return new SchoolCalendarItemType();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType.BellScheduleDayList }
     * 
     */
    public SchoolCalendarItemType.BellScheduleDayList createSchoolCalendarItemTypeBellScheduleDayList() {
        return new SchoolCalendarItemType.BellScheduleDayList();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType }
     * 
     */
    public AssessmentRegistrationType createAssessmentRegistrationType() {
        return new AssessmentRegistrationType();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.AssessmentStudentSnapshot }
     * 
     */
    public AssessmentRegistrationType.AssessmentStudentSnapshot createAssessmentRegistrationTypeAssessmentStudentSnapshot() {
        return new AssessmentRegistrationType.AssessmentStudentSnapshot();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment }
     * 
     */
    public AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment createAssessmentRegistrationTypeAssessmentStudentSnapshotHomeEnrollment() {
        return new AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.TestingStatusList }
     * 
     */
    public AssessmentRegistrationType.TestingStatusList createAssessmentRegistrationTypeTestingStatusList() {
        return new AssessmentRegistrationType.TestingStatusList();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.StudentSpecialEventList }
     * 
     */
    public AssessmentRegistrationType.StudentSpecialEventList createAssessmentRegistrationTypeStudentSpecialEventList() {
        return new AssessmentRegistrationType.StudentSpecialEventList();
    }

    /**
     * Create an instance of {@link StudentCoreType }
     * 
     */
    public StudentCoreType createStudentCoreType() {
        return new StudentCoreType();
    }

    /**
     * Create an instance of {@link StudentCoreType.ConcurrentSchoolList }
     * 
     */
    public StudentCoreType.ConcurrentSchoolList createStudentCoreTypeConcurrentSchoolList() {
        return new StudentCoreType.ConcurrentSchoolList();
    }

    /**
     * Create an instance of {@link AssessmentFormType }
     * 
     */
    public AssessmentFormType createAssessmentFormType() {
        return new AssessmentFormType();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentSectionList }
     * 
     */
    public AssessmentFormType.AssessmentSectionList createAssessmentFormTypeAssessmentSectionList() {
        return new AssessmentFormType.AssessmentSectionList();
    }

    /**
     * Create an instance of {@link AssessmentAssetType }
     * 
     */
    public AssessmentAssetType createAssessmentAssetType() {
        return new AssessmentAssetType();
    }

    /**
     * Create an instance of {@link AssessmentAssetType.AssetIdentifierList }
     * 
     */
    public AssessmentAssetType.AssetIdentifierList createAssessmentAssetTypeAssetIdentifierList() {
        return new AssessmentAssetType.AssetIdentifierList();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType }
     * 
     */
    public LibraryPatronStatusType createLibraryPatronStatusType() {
        return new LibraryPatronStatusType();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.MessageList }
     * 
     */
    public LibraryPatronStatusType.MessageList createLibraryPatronStatusTypeMessageList() {
        return new LibraryPatronStatusType.MessageList();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList }
     * 
     */
    public LibraryPatronStatusType.TransactionList createLibraryPatronStatusTypeTransactionList() {
        return new LibraryPatronStatusType.TransactionList();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction createLibraryPatronStatusTypeTransactionListTransaction() {
        return new LibraryPatronStatusType.TransactionList.Transaction();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.HoldList }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.HoldList createLibraryPatronStatusTypeTransactionListTransactionHoldList() {
        return new LibraryPatronStatusType.TransactionList.Transaction.HoldList();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.FineList }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.FineList createLibraryPatronStatusTypeTransactionListTransactionFineList() {
        return new LibraryPatronStatusType.TransactionList.Transaction.FineList();
    }

    /**
     * Create an instance of {@link StaffPersonAssignmentCollectionType }
     * 
     */
    public StaffPersonAssignmentCollectionType createStaffPersonAssignmentCollectionType() {
        return new StaffPersonAssignmentCollectionType();
    }

    /**
     * Create an instance of {@link UserOrganizationAssociationCollectionType }
     * 
     */
    public UserOrganizationAssociationCollectionType createUserOrganizationAssociationCollectionType() {
        return new UserOrganizationAssociationCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonCollectionType }
     * 
     */
    public ContactPersonCollectionType createContactPersonCollectionType() {
        return new ContactPersonCollectionType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link StaffPersonCollectionType }
     * 
     */
    public StaffPersonCollectionType createStaffPersonCollectionType() {
        return new StaffPersonCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetCollectionType }
     * 
     */
    public AssessmentResponseSetCollectionType createAssessmentResponseSetCollectionType() {
        return new AssessmentResponseSetCollectionType();
    }

    /**
     * Create an instance of {@link CourseType }
     * 
     */
    public CourseType createCourseType() {
        return new CourseType();
    }

    /**
     * Create an instance of {@link StaffPersonType }
     * 
     */
    public StaffPersonType createStaffPersonType() {
        return new StaffPersonType();
    }

    /**
     * Create an instance of {@link SeaCollectionType }
     * 
     */
    public SeaCollectionType createSeaCollectionType() {
        return new SeaCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationCollectionType }
     * 
     */
    public LearningStandardAssociationCollectionType createLearningStandardAssociationCollectionType() {
        return new LearningStandardAssociationCollectionType();
    }

    /**
     * Create an instance of {@link SchoolCalendarType }
     * 
     */
    public SchoolCalendarType createSchoolCalendarType() {
        return new SchoolCalendarType();
    }

    /**
     * Create an instance of {@link XContactCollectionType }
     * 
     */
    public XContactCollectionType createXContactCollectionType() {
        return new XContactCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSectionCollectionType }
     * 
     */
    public AssessmentSectionCollectionType createAssessmentSectionCollectionType() {
        return new AssessmentSectionCollectionType();
    }

    /**
     * Create an instance of {@link XRosterType }
     * 
     */
    public XRosterType createXRosterType() {
        return new XRosterType();
    }

    /**
     * Create an instance of {@link XStudentCollectionType }
     * 
     */
    public XStudentCollectionType createXStudentCollectionType() {
        return new XStudentCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentAssetCollectionType }
     * 
     */
    public AssessmentAssetCollectionType createAssessmentAssetCollectionType() {
        return new AssessmentAssetCollectionType();
    }

    /**
     * Create an instance of {@link ProgramCollectionType }
     * 
     */
    public ProgramCollectionType createProgramCollectionType() {
        return new ProgramCollectionType();
    }

    /**
     * Create an instance of {@link StudentSectionAssociationCollectionType }
     * 
     */
    public StudentSectionAssociationCollectionType createStudentSectionAssociationCollectionType() {
        return new StudentSectionAssociationCollectionType();
    }

    /**
     * Create an instance of {@link SreCollectionType }
     * 
     */
    public SreCollectionType createSreCollectionType() {
        return new SreCollectionType();
    }

    /**
     * Create an instance of {@link PersonRoleAssociationCollectionType }
     * 
     */
    public PersonRoleAssociationCollectionType createPersonRoleAssociationCollectionType() {
        return new PersonRoleAssociationCollectionType();
    }

    /**
     * Create an instance of {@link XStudentType }
     * 
     */
    public XStudentType createXStudentType() {
        return new XStudentType();
    }

    /**
     * Create an instance of {@link XLeaType }
     * 
     */
    public XLeaType createXLeaType() {
        return new XLeaType();
    }

    /**
     * Create an instance of {@link AssessmentItemAssociationType }
     * 
     */
    public AssessmentItemAssociationType createAssessmentItemAssociationType() {
        return new AssessmentItemAssociationType();
    }

    /**
     * Create an instance of {@link XCalendarType }
     * 
     */
    public XCalendarType createXCalendarType() {
        return new XCalendarType();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationCollectionType }
     * 
     */
    public AssessmentAdministrationCollectionType createAssessmentAdministrationCollectionType() {
        return new AssessmentAdministrationCollectionType();
    }

    /**
     * Create an instance of {@link StudentProgramAssociationCollectionType }
     * 
     */
    public StudentProgramAssociationCollectionType createStudentProgramAssociationCollectionType() {
        return new StudentProgramAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AuthenticationCollectionType }
     * 
     */
    public AuthenticationCollectionType createAuthenticationCollectionType() {
        return new AuthenticationCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardItemCollectionType }
     * 
     */
    public LearningStandardItemCollectionType createLearningStandardItemCollectionType() {
        return new LearningStandardItemCollectionType();
    }

    /**
     * Create an instance of {@link XCalendarCollectionType }
     * 
     */
    public XCalendarCollectionType createXCalendarCollectionType() {
        return new XCalendarCollectionType();
    }

    /**
     * Create an instance of {@link XLeaCollectionType }
     * 
     */
    public XLeaCollectionType createXLeaCollectionType() {
        return new XLeaCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableCollectionType }
     * 
     */
    public AssessmentScoreTableCollectionType createAssessmentScoreTableCollectionType() {
        return new AssessmentScoreTableCollectionType();
    }

    /**
     * Create an instance of {@link XSchoolCollectionType }
     * 
     */
    public XSchoolCollectionType createXSchoolCollectionType() {
        return new XSchoolCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentItemAssociationCollectionType }
     * 
     */
    public AssessmentItemAssociationCollectionType createAssessmentItemAssociationCollectionType() {
        return new AssessmentItemAssociationCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonAssociationType }
     * 
     */
    public ContactPersonAssociationType createContactPersonAssociationType() {
        return new ContactPersonAssociationType();
    }

    /**
     * Create an instance of {@link UserOrganizationAssociationType }
     * 
     */
    public UserOrganizationAssociationType createUserOrganizationAssociationType() {
        return new UserOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link StudentSchoolAssociationType }
     * 
     */
    public StudentSchoolAssociationType createStudentSchoolAssociationType() {
        return new StudentSchoolAssociationType();
    }

    /**
     * Create an instance of {@link SectionCollectionType }
     * 
     */
    public SectionCollectionType createSectionCollectionType() {
        return new SectionCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardDocumentCollectionType }
     * 
     */
    public LearningStandardDocumentCollectionType createLearningStandardDocumentCollectionType() {
        return new LearningStandardDocumentCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSessionCollectionType }
     * 
     */
    public AssessmentSessionCollectionType createAssessmentSessionCollectionType() {
        return new AssessmentSessionCollectionType();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemCollectionType }
     * 
     */
    public SchoolCalendarItemCollectionType createSchoolCalendarItemCollectionType() {
        return new SchoolCalendarItemCollectionType();
    }

    /**
     * Create an instance of {@link StaffSectionAssociationCollectionType }
     * 
     */
    public StaffSectionAssociationCollectionType createStaffSectionAssociationCollectionType() {
        return new StaffSectionAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationCollectionType }
     * 
     */
    public AssessmentRegistrationCollectionType createAssessmentRegistrationCollectionType() {
        return new AssessmentRegistrationCollectionType();
    }

    /**
     * Create an instance of {@link FacilityCollectionType }
     * 
     */
    public FacilityCollectionType createFacilityCollectionType() {
        return new FacilityCollectionType();
    }

    /**
     * Create an instance of {@link DisciplineIncidentCollectionType }
     * 
     */
    public DisciplineIncidentCollectionType createDisciplineIncidentCollectionType() {
        return new DisciplineIncidentCollectionType();
    }

    /**
     * Create an instance of {@link LeaType }
     * 
     */
    public LeaType createLeaType() {
        return new LeaType();
    }

    /**
     * Create an instance of {@link XCourseType }
     * 
     */
    public XCourseType createXCourseType() {
        return new XCourseType();
    }

    /**
     * Create an instance of {@link AssessmentCollectionType }
     * 
     */
    public AssessmentCollectionType createAssessmentCollectionType() {
        return new AssessmentCollectionType();
    }

    /**
     * Create an instance of {@link TermCollectionType }
     * 
     */
    public TermCollectionType createTermCollectionType() {
        return new TermCollectionType();
    }

    /**
     * Create an instance of {@link PersonRoleAssociationType }
     * 
     */
    public PersonRoleAssociationType createPersonRoleAssociationType() {
        return new PersonRoleAssociationType();
    }

    /**
     * Create an instance of {@link GAuthorizationType }
     * 
     */
    public GAuthorizationType createGAuthorizationType() {
        return new GAuthorizationType();
    }

    /**
     * Create an instance of {@link PartyAddressAssociationType }
     * 
     */
    public PartyAddressAssociationType createPartyAddressAssociationType() {
        return new PartyAddressAssociationType();
    }

    /**
     * Create an instance of {@link LearningStandardDocumentType }
     * 
     */
    public LearningStandardDocumentType createLearningStandardDocumentType() {
        return new LearningStandardDocumentType();
    }

    /**
     * Create an instance of {@link SchoolCollectionType }
     * 
     */
    public SchoolCollectionType createSchoolCollectionType() {
        return new SchoolCollectionType();
    }

    /**
     * Create an instance of {@link FinancialReportCollectionType }
     * 
     */
    public FinancialReportCollectionType createFinancialReportCollectionType() {
        return new FinancialReportCollectionType();
    }

    /**
     * Create an instance of {@link PersonGroupAssociationCollectionType }
     * 
     */
    public PersonGroupAssociationCollectionType createPersonGroupAssociationCollectionType() {
        return new PersonGroupAssociationCollectionType();
    }

    /**
     * Create an instance of {@link ApplicationCollectionType }
     * 
     */
    public ApplicationCollectionType createApplicationCollectionType() {
        return new ApplicationCollectionType();
    }

    /**
     * Create an instance of {@link XStaffType }
     * 
     */
    public XStaffType createXStaffType() {
        return new XStaffType();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetCollectionType }
     * 
     */
    public AssessmentScoreSetCollectionType createAssessmentScoreSetCollectionType() {
        return new AssessmentScoreSetCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSubTestCollectionType }
     * 
     */
    public AssessmentSubTestCollectionType createAssessmentSubTestCollectionType() {
        return new AssessmentSubTestCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentItemCollectionType }
     * 
     */
    public AssessmentItemCollectionType createAssessmentItemCollectionType() {
        return new AssessmentItemCollectionType();
    }

    /**
     * Create an instance of {@link AuthorizationCollectionType }
     * 
     */
    public AuthorizationCollectionType createAuthorizationCollectionType() {
        return new AuthorizationCollectionType();
    }

    /**
     * Create an instance of {@link XSchoolType }
     * 
     */
    public XSchoolType createXSchoolType() {
        return new XSchoolType();
    }

    /**
     * Create an instance of {@link SectionRosterReportCollectionType }
     * 
     */
    public SectionRosterReportCollectionType createSectionRosterReportCollectionType() {
        return new SectionRosterReportCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentRubricCollectionType }
     * 
     */
    public AssessmentRubricCollectionType createAssessmentRubricCollectionType() {
        return new AssessmentRubricCollectionType();
    }

    /**
     * Create an instance of {@link StudentCoreCollectionType }
     * 
     */
    public StudentCoreCollectionType createStudentCoreCollectionType() {
        return new StudentCoreCollectionType();
    }

    /**
     * Create an instance of {@link ProgramType }
     * 
     */
    public ProgramType createProgramType() {
        return new ProgramType();
    }

    /**
     * Create an instance of {@link XRosterCollectionType }
     * 
     */
    public XRosterCollectionType createXRosterCollectionType() {
        return new XRosterCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentFormCollectionType }
     * 
     */
    public AssessmentFormCollectionType createAssessmentFormCollectionType() {
        return new AssessmentFormCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSummaryCollectionType }
     * 
     */
    public AssessmentSummaryCollectionType createAssessmentSummaryCollectionType() {
        return new AssessmentSummaryCollectionType();
    }

    /**
     * Create an instance of {@link StudentActivityType }
     * 
     */
    public StudentActivityType createStudentActivityType() {
        return new StudentActivityType();
    }

    /**
     * Create an instance of {@link PartyOrganizationAssociationType }
     * 
     */
    public PartyOrganizationAssociationType createPartyOrganizationAssociationType() {
        return new PartyOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link LeaCollectionType }
     * 
     */
    public LeaCollectionType createLeaCollectionType() {
        return new LeaCollectionType();
    }

    /**
     * Create an instance of {@link PartyAddressAssociationCollectionType }
     * 
     */
    public PartyAddressAssociationCollectionType createPartyAddressAssociationCollectionType() {
        return new PartyAddressAssociationCollectionType();
    }

    /**
     * Create an instance of {@link StudentProgramAssociationType }
     * 
     */
    public StudentProgramAssociationType createStudentProgramAssociationType() {
        return new StudentProgramAssociationType();
    }

    /**
     * Create an instance of {@link CourseCollectionType }
     * 
     */
    public CourseCollectionType createCourseCollectionType() {
        return new CourseCollectionType();
    }

    /**
     * Create an instance of {@link XContactType }
     * 
     */
    public XContactType createXContactType() {
        return new XContactType();
    }

    /**
     * Create an instance of {@link StudentSectionAssociationType }
     * 
     */
    public StudentSectionAssociationType createStudentSectionAssociationType() {
        return new StudentSectionAssociationType();
    }

    /**
     * Create an instance of {@link PartyOrganizationAssociationCollectionType }
     * 
     */
    public PartyOrganizationAssociationCollectionType createPartyOrganizationAssociationCollectionType() {
        return new PartyOrganizationAssociationCollectionType();
    }

    /**
     * Create an instance of {@link OrganizationOrganizationAssociationCollectionType }
     * 
     */
    public OrganizationOrganizationAssociationCollectionType createOrganizationOrganizationAssociationCollectionType() {
        return new OrganizationOrganizationAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AddressCollectionType }
     * 
     */
    public AddressCollectionType createAddressCollectionType() {
        return new AddressCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonAssociationCollectionType }
     * 
     */
    public ContactPersonAssociationCollectionType createContactPersonAssociationCollectionType() {
        return new ContactPersonAssociationCollectionType();
    }

    /**
     * Create an instance of {@link StudentSchoolAssociationCollectionType }
     * 
     */
    public StudentSchoolAssociationCollectionType createStudentSchoolAssociationCollectionType() {
        return new StudentSchoolAssociationCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardItemType }
     * 
     */
    public LearningStandardItemType createLearningStandardItemType() {
        return new LearningStandardItemType();
    }

    /**
     * Create an instance of {@link LearningResourceCollectionType }
     * 
     */
    public LearningResourceCollectionType createLearningResourceCollectionType() {
        return new LearningResourceCollectionType();
    }

    /**
     * Create an instance of {@link CrisisIncidentType }
     * 
     */
    public CrisisIncidentType createCrisisIncidentType() {
        return new CrisisIncidentType();
    }

    /**
     * Create an instance of {@link StudentCollectionType }
     * 
     */
    public StudentCollectionType createStudentCollectionType() {
        return new StudentCollectionType();
    }

    /**
     * Create an instance of {@link XStaffCollectionType }
     * 
     */
    public XStaffCollectionType createXStaffCollectionType() {
        return new XStaffCollectionType();
    }

    /**
     * Create an instance of {@link StaffPersonAssignmentType }
     * 
     */
    public StaffPersonAssignmentType createStaffPersonAssignmentType() {
        return new StaffPersonAssignmentType();
    }

    /**
     * Create an instance of {@link PersonCollectionType }
     * 
     */
    public PersonCollectionType createPersonCollectionType() {
        return new PersonCollectionType();
    }

    /**
     * Create an instance of {@link SectionType }
     * 
     */
    public SectionType createSectionType() {
        return new SectionType();
    }

    /**
     * Create an instance of {@link SchoolType }
     * 
     */
    public SchoolType createSchoolType() {
        return new SchoolType();
    }

    /**
     * Create an instance of {@link TermType }
     * 
     */
    public TermType createTermType() {
        return new TermType();
    }

    /**
     * Create an instance of {@link GAddressType }
     * 
     */
    public GAddressType createGAddressType() {
        return new GAddressType();
    }

    /**
     * Create an instance of {@link GAuthenticationType }
     * 
     */
    public GAuthenticationType createGAuthenticationType() {
        return new GAuthenticationType();
    }

    /**
     * Create an instance of {@link OrganizationOrganizationAssociationType }
     * 
     */
    public OrganizationOrganizationAssociationType createOrganizationOrganizationAssociationType() {
        return new OrganizationOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link PersonGroupAssociationType }
     * 
     */
    public PersonGroupAssociationType createPersonGroupAssociationType() {
        return new PersonGroupAssociationType();
    }

    /**
     * Create an instance of {@link XCourseCollectionType }
     * 
     */
    public XCourseCollectionType createXCourseCollectionType() {
        return new XCourseCollectionType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link CrisisIncidentCollectionType }
     * 
     */
    public CrisisIncidentCollectionType createCrisisIncidentCollectionType() {
        return new CrisisIncidentCollectionType();
    }

    /**
     * Create an instance of {@link SchoolCalendarCollectionType }
     * 
     */
    public SchoolCalendarCollectionType createSchoolCalendarCollectionType() {
        return new SchoolCalendarCollectionType();
    }

    /**
     * Create an instance of {@link GStaffPersonType }
     * 
     */
    public GStaffPersonType createGStaffPersonType() {
        return new GStaffPersonType();
    }

    /**
     * Create an instance of {@link GEthnicityList }
     * 
     */
    public GEthnicityList createGEthnicityList() {
        return new GEthnicityList();
    }

    /**
     * Create an instance of {@link GOperationalStatusType }
     * 
     */
    public GOperationalStatusType createGOperationalStatusType() {
        return new GOperationalStatusType();
    }

    /**
     * Create an instance of {@link GPlaceType }
     * 
     */
    public GPlaceType createGPlaceType() {
        return new GPlaceType();
    }

    /**
     * Create an instance of {@link XPersonAddressType }
     * 
     */
    public XPersonAddressType createXPersonAddressType() {
        return new XPersonAddressType();
    }

    /**
     * Create an instance of {@link GElectronicIdTypeType }
     * 
     */
    public GElectronicIdTypeType createGElectronicIdTypeType() {
        return new GElectronicIdTypeType();
    }

    /**
     * Create an instance of {@link GAlertMessageType }
     * 
     */
    public GAlertMessageType createGAlertMessageType() {
        return new GAlertMessageType();
    }

    /**
     * Create an instance of {@link GAssociationType }
     * 
     */
    public GAssociationType createGAssociationType() {
        return new GAssociationType();
    }

    /**
     * Create an instance of {@link GCourseCreditType }
     * 
     */
    public GCourseCreditType createGCourseCreditType() {
        return new GCourseCreditType();
    }

    /**
     * Create an instance of {@link GSessionScheduleList }
     * 
     */
    public GSessionScheduleList createGSessionScheduleList() {
        return new GSessionScheduleList();
    }

    /**
     * Create an instance of {@link GStudentSchoolEnrollmentType }
     * 
     */
    public GStudentSchoolEnrollmentType createGStudentSchoolEnrollmentType() {
        return new GStudentSchoolEnrollmentType();
    }

    /**
     * Create an instance of {@link GDiscreteEventType }
     * 
     */
    public GDiscreteEventType createGDiscreteEventType() {
        return new GDiscreteEventType();
    }

    /**
     * Create an instance of {@link GCreatorList }
     * 
     */
    public GCreatorList createGCreatorList() {
        return new GCreatorList();
    }

    /**
     * Create an instance of {@link GCredentialType }
     * 
     */
    public GCredentialType createGCredentialType() {
        return new GCredentialType();
    }

    /**
     * Create an instance of {@link GOtherNameListType }
     * 
     */
    public GOtherNameListType createGOtherNameListType() {
        return new GOtherNameListType();
    }

    /**
     * Create an instance of {@link GEmailTypeType }
     * 
     */
    public GEmailTypeType createGEmailTypeType() {
        return new GEmailTypeType();
    }

    /**
     * Create an instance of {@link GOrganizationUserType }
     * 
     */
    public GOrganizationUserType createGOrganizationUserType() {
        return new GOrganizationUserType();
    }

    /**
     * Create an instance of {@link XMigrantType }
     * 
     */
    public XMigrantType createXMigrantType() {
        return new XMigrantType();
    }

    /**
     * Create an instance of {@link XLanguageListType }
     * 
     */
    public XLanguageListType createXLanguageListType() {
        return new XLanguageListType();
    }

    /**
     * Create an instance of {@link GEventType }
     * 
     */
    public GEventType createGEventType() {
        return new GEventType();
    }

    /**
     * Create an instance of {@link XDayListType }
     * 
     */
    public XDayListType createXDayListType() {
        return new XDayListType();
    }

    /**
     * Create an instance of {@link GOtherSIFType }
     * 
     */
    public GOtherSIFType createGOtherSIFType() {
        return new GOtherSIFType();
    }

    /**
     * Create an instance of {@link XSessionType }
     * 
     */
    public XSessionType createXSessionType() {
        return new XSessionType();
    }

    /**
     * Create an instance of {@link GGenericRefIdPointerType }
     * 
     */
    public GGenericRefIdPointerType createGGenericRefIdPointerType() {
        return new GGenericRefIdPointerType();
    }

    /**
     * Create an instance of {@link GOrganizationSubtypeType }
     * 
     */
    public GOrganizationSubtypeType createGOrganizationSubtypeType() {
        return new GOrganizationSubtypeType();
    }

    /**
     * Create an instance of {@link XYearGroupListType }
     * 
     */
    public XYearGroupListType createXYearGroupListType() {
        return new XYearGroupListType();
    }

    /**
     * Create an instance of {@link GSIFReportType }
     * 
     */
    public GSIFReportType createGSIFReportType() {
        return new GSIFReportType();
    }

    /**
     * Create an instance of {@link GLifeCycleType }
     * 
     */
    public GLifeCycleType createGLifeCycleType() {
        return new GLifeCycleType();
    }

    /**
     * Create an instance of {@link GAreaType }
     * 
     */
    public GAreaType createGAreaType() {
        return new GAreaType();
    }

    /**
     * Create an instance of {@link GIdentityManagementArtifactType }
     * 
     */
    public GIdentityManagementArtifactType createGIdentityManagementArtifactType() {
        return new GIdentityManagementArtifactType();
    }

    /**
     * Create an instance of {@link XOtherPersonIdType }
     * 
     */
    public XOtherPersonIdType createXOtherPersonIdType() {
        return new XOtherPersonIdType();
    }

    /**
     * Create an instance of {@link GModificationHistoryType }
     * 
     */
    public GModificationHistoryType createGModificationHistoryType() {
        return new GModificationHistoryType();
    }

    /**
     * Create an instance of {@link XAttendanceEventType }
     * 
     */
    public XAttendanceEventType createXAttendanceEventType() {
        return new XAttendanceEventType();
    }

    /**
     * Create an instance of {@link GExitStatusType }
     * 
     */
    public GExitStatusType createGExitStatusType() {
        return new GExitStatusType();
    }

    /**
     * Create an instance of {@link GElectronicIdType }
     * 
     */
    public GElectronicIdType createGElectronicIdType() {
        return new GElectronicIdType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link GEducationOrganizationType }
     * 
     */
    public GEducationOrganizationType createGEducationOrganizationType() {
        return new GEducationOrganizationType();
    }

    /**
     * Create an instance of {@link GTimetablePeriodList }
     * 
     */
    public GTimetablePeriodList createGTimetablePeriodList() {
        return new GTimetablePeriodList();
    }

    /**
     * Create an instance of {@link XSpecialEducationServiceType }
     * 
     */
    public XSpecialEducationServiceType createXSpecialEducationServiceType() {
        return new XSpecialEducationServiceType();
    }

    /**
     * Create an instance of {@link GCourseCreditList }
     * 
     */
    public GCourseCreditList createGCourseCreditList() {
        return new GCourseCreditList();
    }

    /**
     * Create an instance of {@link XLanguageType }
     * 
     */
    public XLanguageType createXLanguageType() {
        return new XLanguageType();
    }

    /**
     * Create an instance of {@link GSectionType }
     * 
     */
    public GSectionType createGSectionType() {
        return new GSectionType();
    }

    /**
     * Create an instance of {@link GRoomType }
     * 
     */
    public GRoomType createGRoomType() {
        return new GRoomType();
    }

    /**
     * Create an instance of {@link GRecordClosureReasonType }
     * 
     */
    public GRecordClosureReasonType createGRecordClosureReasonType() {
        return new GRecordClosureReasonType();
    }

    /**
     * Create an instance of {@link XAcademicSummaryType }
     * 
     */
    public XAcademicSummaryType createXAcademicSummaryType() {
        return new XAcademicSummaryType();
    }

    /**
     * Create an instance of {@link GStreetType }
     * 
     */
    public GStreetType createGStreetType() {
        return new GStreetType();
    }

    /**
     * Create an instance of {@link GStudentSectionEnrollmentType }
     * 
     */
    public GStudentSectionEnrollmentType createGStudentSectionEnrollmentType() {
        return new GStudentSectionEnrollmentType();
    }

    /**
     * Create an instance of {@link GProgramType }
     * 
     */
    public GProgramType createGProgramType() {
        return new GProgramType();
    }

    /**
     * Create an instance of {@link GPersonGroupAssociationType }
     * 
     */
    public GPersonGroupAssociationType createGPersonGroupAssociationType() {
        return new GPersonGroupAssociationType();
    }

    /**
     * Create an instance of {@link GCountryList }
     * 
     */
    public GCountryList createGCountryList() {
        return new GCountryList();
    }

    /**
     * Create an instance of {@link XEmailListType }
     * 
     */
    public XEmailListType createXEmailListType() {
        return new XEmailListType();
    }

    /**
     * Create an instance of {@link XApplicableEducationLevelListType }
     * 
     */
    public XApplicableEducationLevelListType createXApplicableEducationLevelListType() {
        return new XApplicableEducationLevelListType();
    }

    /**
     * Create an instance of {@link XStaffReferenceType }
     * 
     */
    public XStaffReferenceType createXStaffReferenceType() {
        return new XStaffReferenceType();
    }

    /**
     * Create an instance of {@link GPersonRoleAssociationType }
     * 
     */
    public GPersonRoleAssociationType createGPersonRoleAssociationType() {
        return new GPersonRoleAssociationType();
    }

    /**
     * Create an instance of {@link XPersonNameType }
     * 
     */
    public XPersonNameType createXPersonNameType() {
        return new XPersonNameType();
    }

    /**
     * Create an instance of {@link XContactStudentRelationshipType }
     * 
     */
    public XContactStudentRelationshipType createXContactStudentRelationshipType() {
        return new XContactStudentRelationshipType();
    }

    /**
     * Create an instance of {@link GOrganizationAssociationType }
     * 
     */
    public GOrganizationAssociationType createGOrganizationAssociationType() {
        return new GOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link GServiceProviderType }
     * 
     */
    public GServiceProviderType createGServiceProviderType() {
        return new GServiceProviderType();
    }

    /**
     * Create an instance of {@link GExternalIdList }
     * 
     */
    public GExternalIdList createGExternalIdList() {
        return new GExternalIdList();
    }

    /**
     * Create an instance of {@link XFoodServiceType }
     * 
     */
    public XFoodServiceType createXFoodServiceType() {
        return new XFoodServiceType();
    }

    /**
     * Create an instance of {@link GElectronicIdList }
     * 
     */
    public GElectronicIdList createGElectronicIdList() {
        return new GElectronicIdList();
    }

    /**
     * Create an instance of {@link GYearGroupType }
     * 
     */
    public GYearGroupType createGYearGroupType() {
        return new GYearGroupType();
    }

    /**
     * Create an instance of {@link GTimeElementType }
     * 
     */
    public GTimeElementType createGTimeElementType() {
        return new GTimeElementType();
    }

    /**
     * Create an instance of {@link XOtherOrganizationIdType }
     * 
     */
    public XOtherOrganizationIdType createXOtherOrganizationIdType() {
        return new XOtherOrganizationIdType();
    }

    /**
     * Create an instance of {@link GBaseNameType }
     * 
     */
    public GBaseNameType createGBaseNameType() {
        return new GBaseNameType();
    }

    /**
     * Create an instance of {@link GContactFlagList }
     * 
     */
    public GContactFlagList createGContactFlagList() {
        return new GContactFlagList();
    }

    /**
     * Create an instance of {@link GOrganizationOrganizationAssociationType }
     * 
     */
    public GOrganizationOrganizationAssociationType createGOrganizationOrganizationAssociationType() {
        return new GOrganizationOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link XSubjectAreaType }
     * 
     */
    public XSubjectAreaType createXSubjectAreaType() {
        return new XSubjectAreaType();
    }

    /**
     * Create an instance of {@link XPersonReferenceType }
     * 
     */
    public XPersonReferenceType createXPersonReferenceType() {
        return new XPersonReferenceType();
    }

    /**
     * Create an instance of {@link XSessionListType }
     * 
     */
    public XSessionListType createXSessionListType() {
        return new XSessionListType();
    }

    /**
     * Create an instance of {@link GPartyAddressRelationType }
     * 
     */
    public GPartyAddressRelationType createGPartyAddressRelationType() {
        return new GPartyAddressRelationType();
    }

    /**
     * Create an instance of {@link GExternalIdType }
     * 
     */
    public GExternalIdType createGExternalIdType() {
        return new GExternalIdType();
    }

    /**
     * Create an instance of {@link GCreatedType }
     * 
     */
    public GCreatedType createGCreatedType() {
        return new GCreatedType();
    }

    /**
     * Create an instance of {@link GTimeElementList }
     * 
     */
    public GTimeElementList createGTimeElementList() {
        return new GTimeElementList();
    }

    /**
     * Create an instance of {@link XTelephoneListType }
     * 
     */
    public XTelephoneListType createXTelephoneListType() {
        return new XTelephoneListType();
    }

    /**
     * Create an instance of {@link XSreCourseType }
     * 
     */
    public XSreCourseType createXSreCourseType() {
        return new XSreCourseType();
    }

    /**
     * Create an instance of {@link GEntryTypeType }
     * 
     */
    public GEntryTypeType createGEntryTypeType() {
        return new GEntryTypeType();
    }

    /**
     * Create an instance of {@link XStaffPersonAssignmentType }
     * 
     */
    public XStaffPersonAssignmentType createXStaffPersonAssignmentType() {
        return new XStaffPersonAssignmentType();
    }

    /**
     * Create an instance of {@link GSpanGapList }
     * 
     */
    public GSpanGapList createGSpanGapList() {
        return new GSpanGapList();
    }

    /**
     * Create an instance of {@link GYearGroupList }
     * 
     */
    public GYearGroupList createGYearGroupList() {
        return new GYearGroupList();
    }

    /**
     * Create an instance of {@link GStaffPersonAssignmentType }
     * 
     */
    public GStaffPersonAssignmentType createGStaffPersonAssignmentType() {
        return new GStaffPersonAssignmentType();
    }

    /**
     * Create an instance of {@link GSectionTeacherType }
     * 
     */
    public GSectionTeacherType createGSectionTeacherType() {
        return new GSectionTeacherType();
    }

    /**
     * Create an instance of {@link XOtherPersonNameListType }
     * 
     */
    public XOtherPersonNameListType createXOtherPersonNameListType() {
        return new XOtherPersonNameListType();
    }

    /**
     * Create an instance of {@link XAttendanceSummaryType }
     * 
     */
    public XAttendanceSummaryType createXAttendanceSummaryType() {
        return new XAttendanceSummaryType();
    }

    /**
     * Create an instance of {@link XMeetingTimeType }
     * 
     */
    public XMeetingTimeType createXMeetingTimeType() {
        return new XMeetingTimeType();
    }

    /**
     * Create an instance of {@link XStudentContactListType }
     * 
     */
    public XStudentContactListType createXStudentContactListType() {
        return new XStudentContactListType();
    }

    /**
     * Create an instance of {@link GAcademicPlanType }
     * 
     */
    public GAcademicPlanType createGAcademicPlanType() {
        return new GAcademicPlanType();
    }

    /**
     * Create an instance of {@link GEventCollectionType }
     * 
     */
    public GEventCollectionType createGEventCollectionType() {
        return new GEventCollectionType();
    }

    /**
     * Create an instance of {@link GPlanType }
     * 
     */
    public GPlanType createGPlanType() {
        return new GPlanType();
    }

    /**
     * Create an instance of {@link GSIFCompositeType }
     * 
     */
    public GSIFCompositeType createGSIFCompositeType() {
        return new GSIFCompositeType();
    }

    /**
     * Create an instance of {@link XAccommodationType }
     * 
     */
    public XAccommodationType createXAccommodationType() {
        return new XAccommodationType();
    }

    /**
     * Create an instance of {@link GRelatedLearningStandardItemList }
     * 
     */
    public GRelatedLearningStandardItemList createGRelatedLearningStandardItemList() {
        return new GRelatedLearningStandardItemList();
    }

    /**
     * Create an instance of {@link GOrganizationType }
     * 
     */
    public GOrganizationType createGOrganizationType() {
        return new GOrganizationType();
    }

    /**
     * Create an instance of {@link GClientType }
     * 
     */
    public GClientType createGClientType() {
        return new GClientType();
    }

    /**
     * Create an instance of {@link GSchoolFocusList }
     * 
     */
    public GSchoolFocusList createGSchoolFocusList() {
        return new GSchoolFocusList();
    }

    /**
     * Create an instance of {@link GSpanGapType }
     * 
     */
    public GSpanGapType createGSpanGapType() {
        return new GSpanGapType();
    }

    /**
     * Create an instance of {@link GOtherIdList }
     * 
     */
    public GOtherIdList createGOtherIdList() {
        return new GOtherIdList();
    }

    /**
     * Create an instance of {@link XOrganizationAddressType }
     * 
     */
    public XOrganizationAddressType createXOrganizationAddressType() {
        return new XOrganizationAddressType();
    }

    /**
     * Create an instance of {@link GCountryType }
     * 
     */
    public GCountryType createGCountryType() {
        return new GCountryType();
    }

    /**
     * Create an instance of {@link GNameOfRecordType }
     * 
     */
    public GNameOfRecordType createGNameOfRecordType() {
        return new GNameOfRecordType();
    }

    /**
     * Create an instance of {@link GStaffSectionAssociationType }
     * 
     */
    public GStaffSectionAssociationType createGStaffSectionAssociationType() {
        return new GStaffSectionAssociationType();
    }

    /**
     * Create an instance of {@link XOtherCourseIdListType }
     * 
     */
    public XOtherCourseIdListType createXOtherCourseIdListType() {
        return new XOtherCourseIdListType();
    }

    /**
     * Create an instance of {@link GPhoneNumberType }
     * 
     */
    public GPhoneNumberType createGPhoneNumberType() {
        return new GPhoneNumberType();
    }

    /**
     * Create an instance of {@link XDisciplineActionType }
     * 
     */
    public XDisciplineActionType createXDisciplineActionType() {
        return new XDisciplineActionType();
    }

    /**
     * Create an instance of {@link XOtherOrganizationIdListType }
     * 
     */
    public XOtherOrganizationIdListType createXOtherOrganizationIdListType() {
        return new XOtherOrganizationIdListType();
    }

    /**
     * Create an instance of {@link GLearnerType }
     * 
     */
    public GLearnerType createGLearnerType() {
        return new GLearnerType();
    }

    /**
     * Create an instance of {@link GEmailList }
     * 
     */
    public GEmailList createGEmailList() {
        return new GEmailList();
    }

    /**
     * Create an instance of {@link XTelephoneType }
     * 
     */
    public XTelephoneType createXTelephoneType() {
        return new XTelephoneType();
    }

    /**
     * Create an instance of {@link XMeetingTimeListType }
     * 
     */
    public XMeetingTimeListType createXMeetingTimeListType() {
        return new XMeetingTimeListType();
    }

    /**
     * Create an instance of {@link GExitTypeType }
     * 
     */
    public GExitTypeType createGExitTypeType() {
        return new GExitTypeType();
    }

    /**
     * Create an instance of {@link XAchievementType }
     * 
     */
    public XAchievementType createXAchievementType() {
        return new XAchievementType();
    }

    /**
     * Create an instance of {@link XStaffPersonAssignmentListType }
     * 
     */
    public XStaffPersonAssignmentListType createXStaffPersonAssignmentListType() {
        return new XStaffPersonAssignmentListType();
    }

    /**
     * Create an instance of {@link XOtherPersonIdListType }
     * 
     */
    public XOtherPersonIdListType createXOtherPersonIdListType() {
        return new XOtherPersonIdListType();
    }

    /**
     * Create an instance of {@link GSIFEntityType }
     * 
     */
    public GSIFEntityType createGSIFEntityType() {
        return new GSIFEntityType();
    }

    /**
     * Create an instance of {@link GSchoolCalendarItemType }
     * 
     */
    public GSchoolCalendarItemType createGSchoolCalendarItemType() {
        return new GSchoolCalendarItemType();
    }

    /**
     * Create an instance of {@link GElectoralDistrictType }
     * 
     */
    public GElectoralDistrictType createGElectoralDistrictType() {
        return new GElectoralDistrictType();
    }

    /**
     * Create an instance of {@link XRaceType }
     * 
     */
    public XRaceType createXRaceType() {
        return new XRaceType();
    }

    /**
     * Create an instance of {@link GPhoneNumberList }
     * 
     */
    public GPhoneNumberList createGPhoneNumberList() {
        return new GPhoneNumberList();
    }

    /**
     * Create an instance of {@link XEnrollmentListType }
     * 
     */
    public XEnrollmentListType createXEnrollmentListType() {
        return new XEnrollmentListType();
    }

    /**
     * Create an instance of {@link GMeetingTimeType }
     * 
     */
    public GMeetingTimeType createGMeetingTimeType() {
        return new GMeetingTimeType();
    }

    /**
     * Create an instance of {@link GEmailType }
     * 
     */
    public GEmailType createGEmailType() {
        return new GEmailType();
    }

    /**
     * Create an instance of {@link GMeetingTimeList }
     * 
     */
    public GMeetingTimeList createGMeetingTimeList() {
        return new GMeetingTimeList();
    }

    /**
     * Create an instance of {@link XRaceListType }
     * 
     */
    public XRaceListType createXRaceListType() {
        return new XRaceListType();
    }

    /**
     * Create an instance of {@link GTimetableDayList }
     * 
     */
    public GTimetableDayList createGTimetableDayList() {
        return new GTimetableDayList();
    }

    /**
     * Create an instance of {@link GLanguageType }
     * 
     */
    public GLanguageType createGLanguageType() {
        return new GLanguageType();
    }

    /**
     * Create an instance of {@link GLearningGoalType }
     * 
     */
    public GLearningGoalType createGLearningGoalType() {
        return new GLearningGoalType();
    }

    /**
     * Create an instance of {@link GSubjectAreaType }
     * 
     */
    public GSubjectAreaType createGSubjectAreaType() {
        return new GSubjectAreaType();
    }

    /**
     * Create an instance of {@link GPartyType }
     * 
     */
    public GPartyType createGPartyType() {
        return new GPartyType();
    }

    /**
     * Create an instance of {@link XContactStudentRelationshipListType }
     * 
     */
    public XContactStudentRelationshipListType createXContactStudentRelationshipListType() {
        return new XContactStudentRelationshipListType();
    }

    /**
     * Create an instance of {@link XScreeningType }
     * 
     */
    public XScreeningType createXScreeningType() {
        return new XScreeningType();
    }

    /**
     * Create an instance of {@link GSchoolCalendarType }
     * 
     */
    public GSchoolCalendarType createGSchoolCalendarType() {
        return new GSchoolCalendarType();
    }

    /**
     * Create an instance of {@link GIntervalEventType }
     * 
     */
    public GIntervalEventType createGIntervalEventType() {
        return new GIntervalEventType();
    }

    /**
     * Create an instance of {@link GEducationGroupingType }
     * 
     */
    public GEducationGroupingType createGEducationGroupingType() {
        return new GEducationGroupingType();
    }

    /**
     * Create an instance of {@link GSessionTypeType }
     * 
     */
    public GSessionTypeType createGSessionTypeType() {
        return new GSessionTypeType();
    }

    /**
     * Create an instance of {@link GEthnicityType }
     * 
     */
    public GEthnicityType createGEthnicityType() {
        return new GEthnicityType();
    }

    /**
     * Create an instance of {@link XImmunizationType }
     * 
     */
    public XImmunizationType createXImmunizationType() {
        return new XImmunizationType();
    }

    /**
     * Create an instance of {@link GBellPeriodType }
     * 
     */
    public GBellPeriodType createGBellPeriodType() {
        return new GBellPeriodType();
    }

    /**
     * Create an instance of {@link XEmailType }
     * 
     */
    public XEmailType createXEmailType() {
        return new XEmailType();
    }

    /**
     * Create an instance of {@link XDemographicsType }
     * 
     */
    public XDemographicsType createXDemographicsType() {
        return new XDemographicsType();
    }

    /**
     * Create an instance of {@link GBellScheduleDayType }
     * 
     */
    public GBellScheduleDayType createGBellScheduleDayType() {
        return new GBellScheduleDayType();
    }

    /**
     * Create an instance of {@link GOtherIdType }
     * 
     */
    public GOtherIdType createGOtherIdType() {
        return new GOtherIdType();
    }

    /**
     * Create an instance of {@link GModifiedType }
     * 
     */
    public GModifiedType createGModifiedType() {
        return new GModifiedType();
    }

    /**
     * Create an instance of {@link GPartyOrganizationAssociationType }
     * 
     */
    public GPartyOrganizationAssociationType createGPartyOrganizationAssociationType() {
        return new GPartyOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link GLanguageDescriptionType }
     * 
     */
    public GLanguageDescriptionType createGLanguageDescriptionType() {
        return new GLanguageDescriptionType();
    }

    /**
     * Create an instance of {@link GTimetableDayType }
     * 
     */
    public GTimetableDayType createGTimetableDayType() {
        return new GTimetableDayType();
    }

    /**
     * Create an instance of {@link XEnrollmentType }
     * 
     */
    public XEnrollmentType createXEnrollmentType() {
        return new XEnrollmentType();
    }

    /**
     * Create an instance of {@link GPersonOrganizationAssociationType }
     * 
     */
    public GPersonOrganizationAssociationType createGPersonOrganizationAssociationType() {
        return new GPersonOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link GContactPersonAssociationType }
     * 
     */
    public GContactPersonAssociationType createGContactPersonAssociationType() {
        return new GContactPersonAssociationType();
    }

    /**
     * Create an instance of {@link GMedicalAlertMessageType }
     * 
     */
    public GMedicalAlertMessageType createGMedicalAlertMessageType() {
        return new GMedicalAlertMessageType();
    }

    /**
     * Create an instance of {@link GLanguageList }
     * 
     */
    public GLanguageList createGLanguageList() {
        return new GLanguageList();
    }

    /**
     * Create an instance of {@link XLepType }
     * 
     */
    public XLepType createXLepType() {
        return new XLepType();
    }

    /**
     * Create an instance of {@link GCredentialList }
     * 
     */
    public GCredentialList createGCredentialList() {
        return new GCredentialList();
    }

    /**
     * Create an instance of {@link GGridLocationType }
     * 
     */
    public GGridLocationType createGGridLocationType() {
        return new GGridLocationType();
    }

    /**
     * Create an instance of {@link GTermType }
     * 
     */
    public GTermType createGTermType() {
        return new GTermType();
    }

    /**
     * Create an instance of {@link GLocalIdType }
     * 
     */
    public GLocalIdType createGLocalIdType() {
        return new GLocalIdType();
    }

    /**
     * Create an instance of {@link XAssessmentScoreType }
     * 
     */
    public XAssessmentScoreType createXAssessmentScoreType() {
        return new XAssessmentScoreType();
    }

    /**
     * Create an instance of {@link GGroupType }
     * 
     */
    public GGroupType createGGroupType() {
        return new GGroupType();
    }

    /**
     * Create an instance of {@link XOtherCourseIdType }
     * 
     */
    public XOtherCourseIdType createXOtherCourseIdType() {
        return new XOtherCourseIdType();
    }

    /**
     * Create an instance of {@link GContactPersonType }
     * 
     */
    public GContactPersonType createGContactPersonType() {
        return new GContactPersonType();
    }

    /**
     * Create an instance of {@link GCreatorType }
     * 
     */
    public GCreatorType createGCreatorType() {
        return new GCreatorType();
    }

    /**
     * Create an instance of {@link GStateProvinceType }
     * 
     */
    public GStateProvinceType createGStateProvinceType() {
        return new GStateProvinceType();
    }

    /**
     * Create an instance of {@link GTimetablePeriodType }
     * 
     */
    public GTimetablePeriodType createGTimetablePeriodType() {
        return new GTimetablePeriodType();
    }

    /**
     * Create an instance of {@link XStaffReferenceListType }
     * 
     */
    public XStaffReferenceListType createXStaffReferenceListType() {
        return new XStaffReferenceListType();
    }

    /**
     * Create an instance of {@link GLocationType }
     * 
     */
    public GLocationType createGLocationType() {
        return new GLocationType();
    }

    /**
     * Create an instance of {@link GRelatedLearningStandardItemType }
     * 
     */
    public GRelatedLearningStandardItemType createGRelatedLearningStandardItemType() {
        return new GRelatedLearningStandardItemType();
    }

    /**
     * Create an instance of {@link GPersonAssociationType }
     * 
     */
    public GPersonAssociationType createGPersonAssociationType() {
        return new GPersonAssociationType();
    }

    /**
     * Create an instance of {@link GOtherNameType }
     * 
     */
    public GOtherNameType createGOtherNameType() {
        return new GOtherNameType();
    }

    /**
     * Create an instance of {@link XStudentReferenceListType }
     * 
     */
    public XStudentReferenceListType createXStudentReferenceListType() {
        return new XStudentReferenceListType();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.OrganizationList }
     * 
     */
    public GLearningStandardItemType.OrganizationList createGLearningStandardItemTypeOrganizationList() {
        return new GLearningStandardItemType.OrganizationList();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.PredecessorItemList }
     * 
     */
    public GLearningStandardItemType.PredecessorItemList createGLearningStandardItemTypePredecessorItemList() {
        return new GLearningStandardItemType.PredecessorItemList();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.StatementCodeList }
     * 
     */
    public GLearningStandardItemType.StatementCodeList createGLearningStandardItemTypeStatementCodeList() {
        return new GLearningStandardItemType.StatementCodeList();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.StatementList }
     * 
     */
    public GLearningStandardItemType.StatementList createGLearningStandardItemTypeStatementList() {
        return new GLearningStandardItemType.StatementList();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.SubjectAreaList }
     * 
     */
    public GLearningStandardItemType.SubjectAreaList createGLearningStandardItemTypeSubjectAreaList() {
        return new GLearningStandardItemType.SubjectAreaList();
    }

    /**
     * Create an instance of {@link GLearningStandardItemType.AlternativeIdCodeList }
     * 
     */
    public GLearningStandardItemType.AlternativeIdCodeList createGLearningStandardItemTypeAlternativeIdCodeList() {
        return new GLearningStandardItemType.AlternativeIdCodeList();
    }

    /**
     * Create an instance of {@link GRoomList.Room }
     * 
     */
    public GRoomList.Room createGRoomListRoom() {
        return new GRoomList.Room();
    }

    /**
     * Create an instance of {@link GCodedElementType.OtherCodeList.OtherCode }
     * 
     */
    public GCodedElementType.OtherCodeList.OtherCode createGCodedElementTypeOtherCodeListOtherCode() {
        return new GCodedElementType.OtherCodeList.OtherCode();
    }

    /**
     * Create an instance of {@link GPersonType.AddressRefIdList.AddressRefId }
     * 
     */
    public GPersonType.AddressRefIdList.AddressRefId createGPersonTypeAddressRefIdListAddressRefId() {
        return new GPersonType.AddressRefIdList.AddressRefId();
    }

    /**
     * Create an instance of {@link XSreAcademicSummaryType.Achievements }
     * 
     */
    public XSreAcademicSummaryType.Achievements createXSreAcademicSummaryTypeAchievements() {
        return new XSreAcademicSummaryType.Achievements();
    }

    /**
     * Create an instance of {@link XSreAcademicSummaryType.GraduationRequirements }
     * 
     */
    public XSreAcademicSummaryType.GraduationRequirements createXSreAcademicSummaryTypeGraduationRequirements() {
        return new XSreAcademicSummaryType.GraduationRequirements();
    }

    /**
     * Create an instance of {@link GCourseType.SubjectAreaList }
     * 
     */
    public GCourseType.SubjectAreaList createGCourseTypeSubjectAreaList() {
        return new GCourseType.SubjectAreaList();
    }

    /**
     * Create an instance of {@link GSessionScheduleType.SectionTeacherList }
     * 
     */
    public GSessionScheduleType.SectionTeacherList createGSessionScheduleTypeSectionTeacherList() {
        return new GSessionScheduleType.SectionTeacherList();
    }

    /**
     * Create an instance of {@link GLEAType.LeaContactList }
     * 
     */
    public GLEAType.LeaContactList createGLEATypeLeaContactList() {
        return new GLEAType.LeaContactList();
    }

    /**
     * Create an instance of {@link GLEAType.AddressRefIdList.AddressRefId }
     * 
     */
    public GLEAType.AddressRefIdList.AddressRefId createGLEATypeAddressRefIdListAddressRefId() {
        return new GLEAType.AddressRefIdList.AddressRefId();
    }

    /**
     * Create an instance of {@link GLaxCodedElementType.OtherCodeList.OtherCode }
     * 
     */
    public GLaxCodedElementType.OtherCodeList.OtherCode createGLaxCodedElementTypeOtherCodeListOtherCode() {
        return new GLaxCodedElementType.OtherCodeList.OtherCode();
    }

    /**
     * Create an instance of {@link GSchoolType.SchoolContactList }
     * 
     */
    public GSchoolType.SchoolContactList createGSchoolTypeSchoolContactList() {
        return new GSchoolType.SchoolContactList();
    }

    /**
     * Create an instance of {@link GDemographicsType.CountryOfCitizenshipList }
     * 
     */
    public GDemographicsType.CountryOfCitizenshipList createGDemographicsTypeCountryOfCitizenshipList() {
        return new GDemographicsType.CountryOfCitizenshipList();
    }

    /**
     * Create an instance of {@link GBellScheduleType.BellPeriodList }
     * 
     */
    public GBellScheduleType.BellPeriodList createGBellScheduleTypeBellPeriodList() {
        return new GBellScheduleType.BellPeriodList();
    }

    /**
     * Create an instance of {@link GAbstractContentElementType.XmlData }
     * 
     */
    public GAbstractContentElementType.XmlData createGAbstractContentElementTypeXmlData() {
        return new GAbstractContentElementType.XmlData();
    }

    /**
     * Create an instance of {@link GAbstractContentElementType.TextData }
     * 
     */
    public GAbstractContentElementType.TextData createGAbstractContentElementTypeTextData() {
        return new GAbstractContentElementType.TextData();
    }

    /**
     * Create an instance of {@link GAbstractContentElementType.Reference }
     * 
     */
    public GAbstractContentElementType.Reference createGAbstractContentElementTypeReference() {
        return new GAbstractContentElementType.Reference();
    }

    /**
     * Create an instance of {@link XCompetencyType.AssociatedCourses }
     * 
     */
    public XCompetencyType.AssociatedCourses createXCompetencyTypeAssociatedCourses() {
        return new XCompetencyType.AssociatedCourses();
    }

    /**
     * Create an instance of {@link XGraduationRequirementType.SubjectAreas }
     * 
     */
    public XGraduationRequirementType.SubjectAreas createXGraduationRequirementTypeSubjectAreas() {
        return new XGraduationRequirementType.SubjectAreas();
    }

    /**
     * Create an instance of {@link XTranscriptTermType.Courses }
     * 
     */
    public XTranscriptTermType.Courses createXTranscriptTermTypeCourses() {
        return new XTranscriptTermType.Courses();
    }

    /**
     * Create an instance of {@link XHealthType.Immunizations }
     * 
     */
    public XHealthType.Immunizations createXHealthTypeImmunizations() {
        return new XHealthType.Immunizations();
    }

    /**
     * Create an instance of {@link XHealthType.Screenings }
     * 
     */
    public XHealthType.Screenings createXHealthTypeScreenings() {
        return new XHealthType.Screenings();
    }

    /**
     * Create an instance of {@link GK12CourseType.ExternalCourseCodeList }
     * 
     */
    public GK12CourseType.ExternalCourseCodeList createGK12CourseTypeExternalCourseCodeList() {
        return new GK12CourseType.ExternalCourseCodeList();
    }

    /**
     * Create an instance of {@link XAssessmentScoreSetType.Scores }
     * 
     */
    public XAssessmentScoreSetType.Scores createXAssessmentScoreSetTypeScores() {
        return new XAssessmentScoreSetType.Scores();
    }

    /**
     * Create an instance of {@link GStudentType.AlertMessageList }
     * 
     */
    public GStudentType.AlertMessageList createGStudentTypeAlertMessageList() {
        return new GStudentType.AlertMessageList();
    }

    /**
     * Create an instance of {@link GStudentType.MedicalAlertMessageList }
     * 
     */
    public GStudentType.MedicalAlertMessageList createGStudentTypeMedicalAlertMessageList() {
        return new GStudentType.MedicalAlertMessageList();
    }

    /**
     * Create an instance of {@link XAssessmentType.Accommodations }
     * 
     */
    public XAssessmentType.Accommodations createXAssessmentTypeAccommodations() {
        return new XAssessmentType.Accommodations();
    }

    /**
     * Create an instance of {@link XAssessmentType.ScoreSets }
     * 
     */
    public XAssessmentType.ScoreSets createXAssessmentTypeScoreSets() {
        return new XAssessmentType.ScoreSets();
    }

    /**
     * Create an instance of {@link XActivityType.Recognitions }
     * 
     */
    public XActivityType.Recognitions createXActivityTypeRecognitions() {
        return new XActivityType.Recognitions();
    }

    /**
     * Create an instance of {@link XSpecialEducationType.Disabilities }
     * 
     */
    public XSpecialEducationType.Disabilities createXSpecialEducationTypeDisabilities() {
        return new XSpecialEducationType.Disabilities();
    }

    /**
     * Create an instance of {@link XSpecialEducationType.Services }
     * 
     */
    public XSpecialEducationType.Services createXSpecialEducationTypeServices() {
        return new XSpecialEducationType.Services();
    }

    /**
     * Create an instance of {@link XDisciplineIncidentType.Actions }
     * 
     */
    public XDisciplineIncidentType.Actions createXDisciplineIncidentTypeActions() {
        return new XDisciplineIncidentType.Actions();
    }

    /**
     * Create an instance of {@link XProgramSummaryType.Activities }
     * 
     */
    public XProgramSummaryType.Activities createXProgramSummaryTypeActivities() {
        return new XProgramSummaryType.Activities();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType.OrganizationList }
     * 
     */
    public GLearningStandardDocumentType.OrganizationList createGLearningStandardDocumentTypeOrganizationList() {
        return new GLearningStandardDocumentType.OrganizationList();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType.AuthorList }
     * 
     */
    public GLearningStandardDocumentType.AuthorList createGLearningStandardDocumentTypeAuthorList() {
        return new GLearningStandardDocumentType.AuthorList();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType.SubjectAreaList }
     * 
     */
    public GLearningStandardDocumentType.SubjectAreaList createGLearningStandardDocumentTypeSubjectAreaList() {
        return new GLearningStandardDocumentType.SubjectAreaList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentDescriptorList }
     * 
     */
    public AssessmentType.AssessmentDescriptorList createAssessmentTypeAssessmentDescriptorList() {
        return new AssessmentType.AssessmentDescriptorList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentSubjectList }
     * 
     */
    public AssessmentType.AssessmentSubjectList createAssessmentTypeAssessmentSubjectList() {
        return new AssessmentType.AssessmentSubjectList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentGradeLevelList }
     * 
     */
    public AssessmentType.AssessmentGradeLevelList createAssessmentTypeAssessmentGradeLevelList() {
        return new AssessmentType.AssessmentGradeLevelList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentLanguageList }
     * 
     */
    public AssessmentType.AssessmentLanguageList createAssessmentTypeAssessmentLanguageList() {
        return new AssessmentType.AssessmentLanguageList();
    }

    /**
     * Create an instance of {@link AssessmentType.LearningStandardItemRefIdList }
     * 
     */
    public AssessmentType.LearningStandardItemRefIdList createAssessmentTypeLearningStandardItemRefIdList() {
        return new AssessmentType.LearningStandardItemRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentItemBankList.AssessmentItemBank }
     * 
     */
    public AssessmentType.AssessmentItemBankList.AssessmentItemBank createAssessmentTypeAssessmentItemBankListAssessmentItemBank() {
        return new AssessmentType.AssessmentItemBankList.AssessmentItemBank();
    }

    /**
     * Create an instance of {@link AssessmentType.AssessmentIdentifierList.AssessmentIdentifier }
     * 
     */
    public AssessmentType.AssessmentIdentifierList.AssessmentIdentifier createAssessmentTypeAssessmentIdentifierListAssessmentIdentifier() {
        return new AssessmentType.AssessmentIdentifierList.AssessmentIdentifier();
    }

    /**
     * Create an instance of {@link SeaType.SeaContactList }
     * 
     */
    public SeaType.SeaContactList createSeaTypeSeaContactList() {
        return new SeaType.SeaContactList();
    }

    /**
     * Create an instance of {@link SeaType.AddressList }
     * 
     */
    public SeaType.AddressList createSeaTypeAddressList() {
        return new SeaType.AddressList();
    }

    /**
     * Create an instance of {@link SeaType.EdenInfo }
     * 
     */
    public SeaType.EdenInfo createSeaTypeEdenInfo() {
        return new SeaType.EdenInfo();
    }

    /**
     * Create an instance of {@link GApplicationType.FunctionList }
     * 
     */
    public GApplicationType.FunctionList createGApplicationTypeFunctionList() {
        return new GApplicationType.FunctionList();
    }

    /**
     * Create an instance of {@link GApplicationType.IdentityProviderList }
     * 
     */
    public GApplicationType.IdentityProviderList createGApplicationTypeIdentityProviderList() {
        return new GApplicationType.IdentityProviderList();
    }

    /**
     * Create an instance of {@link AssessmentSessionType.StaffPersonalRefIdList }
     * 
     */
    public AssessmentSessionType.StaffPersonalRefIdList createAssessmentSessionTypeStaffPersonalRefIdList() {
        return new AssessmentSessionType.StaffPersonalRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentSessionType.UnusualEventList.UnusualEvent }
     * 
     */
    public AssessmentSessionType.UnusualEventList.UnusualEvent createAssessmentSessionTypeUnusualEventListUnusualEvent() {
        return new AssessmentSessionType.UnusualEventList.UnusualEvent();
    }

    /**
     * Create an instance of {@link FacilityType.AddressRefIdList }
     * 
     */
    public FacilityType.AddressRefIdList createFacilityTypeAddressRefIdList() {
        return new FacilityType.AddressRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetType.FeedbackItemList.FeedbackItem }
     * 
     */
    public AssessmentScoreSetType.FeedbackItemList.FeedbackItem createAssessmentScoreSetTypeFeedbackItemListFeedbackItem() {
        return new AssessmentScoreSetType.FeedbackItemList.FeedbackItem();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetType.ScoreList.Score }
     * 
     */
    public AssessmentScoreSetType.ScoreList.Score createAssessmentScoreSetTypeScoreListScore() {
        return new AssessmentScoreSetType.ScoreList.Score();
    }

    /**
     * Create an instance of {@link AssessmentSectionType.SectionIdentifierList }
     * 
     */
    public AssessmentSectionType.SectionIdentifierList createAssessmentSectionTypeSectionIdentifierList() {
        return new AssessmentSectionType.SectionIdentifierList();
    }

    /**
     * Create an instance of {@link AssessmentSectionType.SectionAssetList }
     * 
     */
    public AssessmentSectionType.SectionAssetList createAssessmentSectionTypeSectionAssetList() {
        return new AssessmentSectionType.SectionAssetList();
    }

    /**
     * Create an instance of {@link AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList }
     * 
     */
    public AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList createAssessmentSectionTypeSectionItemListSectionItemSectionItemAssetList() {
        return new AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.SummaryContext }
     * 
     */
    public AssessmentSummaryType.SummaryContext createAssessmentSummaryTypeSummaryContext() {
        return new AssessmentSummaryType.SummaryContext();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.RowList.Row.CellList.Cell }
     * 
     */
    public AssessmentSummaryType.RowList.Row.CellList.Cell createAssessmentSummaryTypeRowListRowCellListCell() {
        return new AssessmentSummaryType.RowList.Row.CellList.Cell();
    }

    /**
     * Create an instance of {@link AssessmentSummaryType.ColumnList.Column }
     * 
     */
    public AssessmentSummaryType.ColumnList.Column createAssessmentSummaryTypeColumnListColumn() {
        return new AssessmentSummaryType.ColumnList.Column();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue }
     * 
     */
    public AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue createAssessmentScoreTableTypeScoreValueListScoreValueDerivedValue() {
        return new AssessmentScoreTableType.ScoreValueList.ScoreValue.DerivedValue();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback }
     * 
     */
    public AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedback() {
        return new AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier }
     * 
     */
    public AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier createAssessmentScoreTableTypeScoreTableIdentifierListScoreTableIdentifier() {
        return new AssessmentScoreTableType.ScoreTableIdentifierList.ScoreTableIdentifier();
    }

    /**
     * Create an instance of {@link StaffSectionAssociationType.RoleList }
     * 
     */
    public StaffSectionAssociationType.RoleList createStaffSectionAssociationTypeRoleList() {
        return new StaffSectionAssociationType.RoleList();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.ScoreList.Score.ScoreDescriptionList }
     * 
     */
    public AssessmentRubricType.ScoreList.Score.ScoreDescriptionList createAssessmentRubricTypeScoreListScoreScoreDescriptionList() {
        return new AssessmentRubricType.ScoreList.Score.ScoreDescriptionList();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment }
     * 
     */
    public AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment createAssessmentRubricTypeScoreListScoreScoreCommentListScoreComment() {
        return new AssessmentRubricType.ScoreList.Score.ScoreCommentList.ScoreComment();
    }

    /**
     * Create an instance of {@link AssessmentRubricType.RubricIdentifierList.RubricIdentifier }
     * 
     */
    public AssessmentRubricType.RubricIdentifierList.RubricIdentifier createAssessmentRubricTypeRubricIdentifierListRubricIdentifier() {
        return new AssessmentRubricType.RubricIdentifierList.RubricIdentifier();
    }

    /**
     * Create an instance of {@link LearningResourceType.Location }
     * 
     */
    public LearningResourceType.Location createLearningResourceTypeLocation() {
        return new LearningResourceType.Location();
    }

    /**
     * Create an instance of {@link LearningResourceType.SubjectAreaList }
     * 
     */
    public LearningResourceType.SubjectAreaList createLearningResourceTypeSubjectAreaList() {
        return new LearningResourceType.SubjectAreaList();
    }

    /**
     * Create an instance of {@link LearningResourceType.MediaTypeList }
     * 
     */
    public LearningResourceType.MediaTypeList createLearningResourceTypeMediaTypeList() {
        return new LearningResourceType.MediaTypeList();
    }

    /**
     * Create an instance of {@link LearningResourceType.LearningStandardItemRefIdList }
     * 
     */
    public LearningResourceType.LearningStandardItemRefIdList createLearningResourceTypeLearningStandardItemRefIdList() {
        return new LearningResourceType.LearningStandardItemRefIdList();
    }

    /**
     * Create an instance of {@link LearningResourceType.ComponentList.Component.StrategyList }
     * 
     */
    public LearningResourceType.ComponentList.Component.StrategyList createLearningResourceTypeComponentListComponentStrategyList() {
        return new LearningResourceType.ComponentList.Component.StrategyList();
    }

    /**
     * Create an instance of {@link LearningResourceType.ComponentList.Component.AssociatedObjectList }
     * 
     */
    public LearningResourceType.ComponentList.Component.AssociatedObjectList createLearningResourceTypeComponentListComponentAssociatedObjectList() {
        return new LearningResourceType.ComponentList.Component.AssociatedObjectList();
    }

    /**
     * Create an instance of {@link LearningResourceType.EvaluationList.Evaluation }
     * 
     */
    public LearningResourceType.EvaluationList.Evaluation createLearningResourceTypeEvaluationListEvaluation() {
        return new LearningResourceType.EvaluationList.Evaluation();
    }

    /**
     * Create an instance of {@link LearningResourceType.ApprovalList.Approval }
     * 
     */
    public LearningResourceType.ApprovalList.Approval createLearningResourceTypeApprovalListApproval() {
        return new LearningResourceType.ApprovalList.Approval();
    }

    /**
     * Create an instance of {@link LearningResourceType.ContactList.Contact }
     * 
     */
    public LearningResourceType.ContactList.Contact createLearningResourceTypeContactListContact() {
        return new LearningResourceType.ContactList.Contact();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationType.AsessmentRefIdList }
     * 
     */
    public AssessmentAdministrationType.AsessmentRefIdList createAssessmentAdministrationTypeAsessmentRefIdList() {
        return new AssessmentAdministrationType.AsessmentRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationType.OrganizationList.Organization }
     * 
     */
    public AssessmentAdministrationType.OrganizationList.Organization createAssessmentAdministrationTypeOrganizationListOrganization() {
        return new AssessmentAdministrationType.OrganizationList.Organization();
    }

    /**
     * Create an instance of {@link StudentType.Disability }
     * 
     */
    public StudentType.Disability createStudentTypeDisability() {
        return new StudentType.Disability();
    }

    /**
     * Create an instance of {@link FinancialReportType.ReportPeriod }
     * 
     */
    public FinancialReportType.ReportPeriod createFinancialReportTypeReportPeriod() {
        return new FinancialReportType.ReportPeriod();
    }

    /**
     * Create an instance of {@link FinancialReportType.RecordList.Record }
     * 
     */
    public FinancialReportType.RecordList.Record createFinancialReportTypeRecordListRecord() {
        return new FinancialReportType.RecordList.Record();
    }

    /**
     * Create an instance of {@link XSreType.Assessments }
     * 
     */
    public XSreType.Assessments createXSreTypeAssessments() {
        return new XSreType.Assessments();
    }

    /**
     * Create an instance of {@link XSreType.DisciplineIncidents }
     * 
     */
    public XSreType.DisciplineIncidents createXSreTypeDisciplineIncidents() {
        return new XSreType.DisciplineIncidents();
    }

    /**
     * Create an instance of {@link XSreType.OtherTranscriptTerms }
     * 
     */
    public XSreType.OtherTranscriptTerms createXSreTypeOtherTranscriptTerms() {
        return new XSreType.OtherTranscriptTerms();
    }

    /**
     * Create an instance of {@link XSreType.Competencies }
     * 
     */
    public XSreType.Competencies createXSreTypeCompetencies() {
        return new XSreType.Competencies();
    }

    /**
     * Create an instance of {@link XSreType.Attendance.Summaries }
     * 
     */
    public XSreType.Attendance.Summaries createXSreTypeAttendanceSummaries() {
        return new XSreType.Attendance.Summaries();
    }

    /**
     * Create an instance of {@link XSreType.Attendance.Events }
     * 
     */
    public XSreType.Attendance.Events createXSreTypeAttendanceEvents() {
        return new XSreType.Attendance.Events();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationType.LearningStandardRefId }
     * 
     */
    public LearningStandardAssociationType.LearningStandardRefId createLearningStandardAssociationTypeLearningStandardRefId() {
        return new LearningStandardAssociationType.LearningStandardRefId();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationType.AssociationCreator }
     * 
     */
    public LearningStandardAssociationType.AssociationCreator createLearningStandardAssociationTypeAssociationCreator() {
        return new LearningStandardAssociationType.AssociationCreator();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationType.TargetObjectList.TargetObject }
     * 
     */
    public LearningStandardAssociationType.TargetObjectList.TargetObject createLearningStandardAssociationTypeTargetObjectListTargetObject() {
        return new LearningStandardAssociationType.TargetObjectList.TargetObject();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.School }
     * 
     */
    public SectionRosterReportType.School createSectionRosterReportTypeSchool() {
        return new SectionRosterReportType.School();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.Course }
     * 
     */
    public SectionRosterReportType.Course createSectionRosterReportTypeCourse() {
        return new SectionRosterReportType.Course();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StudentList.Student.Name }
     * 
     */
    public SectionRosterReportType.StudentList.Student.Name createSectionRosterReportTypeStudentListStudentName() {
        return new SectionRosterReportType.StudentList.Student.Name();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name }
     * 
     */
    public SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name createSectionRosterReportTypeStaffAssignmentListStaffAssignmentName() {
        return new SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name();
    }

    /**
     * Create an instance of {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList }
     * 
     */
    public SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList createSectionRosterReportTypeStaffAssignmentListStaffAssignmentRoleList() {
        return new SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentSubjectList }
     * 
     */
    public AssessmentItemType.AssessmentSubjectList createAssessmentItemTypeAssessmentSubjectList() {
        return new AssessmentItemType.AssessmentSubjectList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentGradeLevelList }
     * 
     */
    public AssessmentItemType.AssessmentGradeLevelList createAssessmentItemTypeAssessmentGradeLevelList() {
        return new AssessmentItemType.AssessmentGradeLevelList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentLanguageList }
     * 
     */
    public AssessmentItemType.AssessmentLanguageList createAssessmentItemTypeAssessmentLanguageList() {
        return new AssessmentItemType.AssessmentLanguageList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.LearningStandardItemRefIdList }
     * 
     */
    public AssessmentItemType.LearningStandardItemRefIdList createAssessmentItemTypeLearningStandardItemRefIdList() {
        return new AssessmentItemType.LearningStandardItemRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentItemAssetRefIdList }
     * 
     */
    public AssessmentItemType.AssessmentItemAssetRefIdList createAssessmentItemTypeAssessmentItemAssetRefIdList() {
        return new AssessmentItemType.AssessmentItemAssetRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.ItemRubricIdList }
     * 
     */
    public AssessmentItemType.ItemRubricIdList createAssessmentItemTypeItemRubricIdList() {
        return new AssessmentItemType.ItemRubricIdList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentItemPlatformList }
     * 
     */
    public AssessmentItemType.AssessmentItemPlatformList createAssessmentItemTypeAssessmentItemPlatformList() {
        return new AssessmentItemType.AssessmentItemPlatformList();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentItemBankList.AssessmentItemBank }
     * 
     */
    public AssessmentItemType.AssessmentItemBankList.AssessmentItemBank createAssessmentItemTypeAssessmentItemBankListAssessmentItemBank() {
        return new AssessmentItemType.AssessmentItemBankList.AssessmentItemBank();
    }

    /**
     * Create an instance of {@link AssessmentItemType.ResponseChoiceList.ResponseChoice }
     * 
     */
    public AssessmentItemType.ResponseChoiceList.ResponseChoice createAssessmentItemTypeResponseChoiceListResponseChoice() {
        return new AssessmentItemType.ResponseChoiceList.ResponseChoice();
    }

    /**
     * Create an instance of {@link AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier }
     * 
     */
    public AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier createAssessmentItemTypeAssessmentIdentifierListAssessmentIdentifier() {
        return new AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier();
    }

    /**
     * Create an instance of {@link StudentActivityParticipationType.RecognitionList }
     * 
     */
    public StudentActivityParticipationType.RecognitionList createStudentActivityParticipationTypeRecognitionList() {
        return new StudentActivityParticipationType.RecognitionList();
    }

    /**
     * Create an instance of {@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading }
     * 
     */
    public EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading createEnergyUsageTypeDataSourceReadingDataListReadingDataReadingListReading() {
        return new EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading();
    }

    /**
     * Create an instance of {@link EnergyUsageType.UsageLocation.EnergyZone.Type }
     * 
     */
    public EnergyUsageType.UsageLocation.EnergyZone.Type createEnergyUsageTypeUsageLocationEnergyZoneType() {
        return new EnergyUsageType.UsageLocation.EnergyZone.Type();
    }

    /**
     * Create an instance of {@link EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag }
     * 
     */
    public EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag createEnergyUsageTypeUsageLocationEnergyZoneTagListTag() {
        return new EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.SubTestIdentifierList }
     * 
     */
    public AssessmentSubTestType.SubTestIdentifierList createAssessmentSubTestTypeSubTestIdentifierList() {
        return new AssessmentSubTestType.SubTestIdentifierList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.SubTestSubjectAreaList }
     * 
     */
    public AssessmentSubTestType.SubTestSubjectAreaList createAssessmentSubTestTypeSubTestSubjectAreaList() {
        return new AssessmentSubTestType.SubTestSubjectAreaList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.SubTestGradeLevelList }
     * 
     */
    public AssessmentSubTestType.SubTestGradeLevelList createAssessmentSubTestTypeSubTestGradeLevelList() {
        return new AssessmentSubTestType.SubTestGradeLevelList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.AssessmentSubTestRefIdList }
     * 
     */
    public AssessmentSubTestType.AssessmentSubTestRefIdList createAssessmentSubTestTypeAssessmentSubTestRefIdList() {
        return new AssessmentSubTestType.AssessmentSubTestRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.LearningStandardItemRefIdList }
     * 
     */
    public AssessmentSubTestType.LearningStandardItemRefIdList createAssessmentSubTestTypeLearningStandardItemRefIdList() {
        return new AssessmentSubTestType.LearningStandardItemRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.AssessmentItemList.AssessmentItem }
     * 
     */
    public AssessmentSubTestType.AssessmentItemList.AssessmentItem createAssessmentSubTestTypeAssessmentItemListAssessmentItem() {
        return new AssessmentSubTestType.AssessmentItemList.AssessmentItem();
    }

    /**
     * Create an instance of {@link AssessmentSubTestType.ScoreScaleList.ScoreScale }
     * 
     */
    public AssessmentSubTestType.ScoreScaleList.ScoreScale createAssessmentSubTestTypeScoreScaleListScoreScale() {
        return new AssessmentSubTestType.ScoreScaleList.ScoreScale();
    }

    /**
     * Create an instance of {@link SreType.LanguageList }
     * 
     */
    public SreType.LanguageList createSreTypeLanguageList() {
        return new SreType.LanguageList();
    }

    /**
     * Create an instance of {@link SreType.RaceList }
     * 
     */
    public SreType.RaceList createSreTypeRaceList() {
        return new SreType.RaceList();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction createSreTypeTranscriptTermListTranscriptTermSchoolOfInstruction() {
        return new SreType.TranscriptTermList.TranscriptTerm.SchoolOfInstruction();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment createSreTypeTranscriptTermListTranscriptTermSchoolOfEnrollment() {
        return new SreType.TranscriptTermList.TranscriptTerm.SchoolOfEnrollment();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent createSreTypeTranscriptTermListTranscriptTermAttendanceSummaryAttendanceEventListAttendanceEvent() {
        return new SreType.TranscriptTermList.TranscriptTerm.AttendanceSummary.AttendanceEventList.AttendanceEvent();
    }

    /**
     * Create an instance of {@link SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency }
     * 
     */
    public SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency createSreTypeTranscriptTermListTranscriptTermCourseListCourseCompetencyListCompetency() {
        return new SreType.TranscriptTermList.TranscriptTerm.CourseList.Course.CompetencyList.Competency();
    }

    /**
     * Create an instance of {@link SreType.SpecialEducation.ServiceList.Service }
     * 
     */
    public SreType.SpecialEducation.ServiceList.Service createSreTypeSpecialEducationServiceListService() {
        return new SreType.SpecialEducation.ServiceList.Service();
    }

    /**
     * Create an instance of {@link SreType.Programs.Lep }
     * 
     */
    public SreType.Programs.Lep createSreTypeProgramsLep() {
        return new SreType.Programs.Lep();
    }

    /**
     * Create an instance of {@link SreType.Programs.Migrant }
     * 
     */
    public SreType.Programs.Migrant createSreTypeProgramsMigrant() {
        return new SreType.Programs.Migrant();
    }

    /**
     * Create an instance of {@link SreType.Programs.ActivityList.Activity }
     * 
     */
    public SreType.Programs.ActivityList.Activity createSreTypeProgramsActivityListActivity() {
        return new SreType.Programs.ActivityList.Activity();
    }

    /**
     * Create an instance of {@link SreType.ParentGuardianList.ParentGuardian }
     * 
     */
    public SreType.ParentGuardianList.ParentGuardian createSreTypeParentGuardianListParentGuardian() {
        return new SreType.ParentGuardianList.ParentGuardian();
    }

    /**
     * Create an instance of {@link SreType.Indicators.HealthTestList.HealthTest }
     * 
     */
    public SreType.Indicators.HealthTestList.HealthTest createSreTypeIndicatorsHealthTestListHealthTest() {
        return new SreType.Indicators.HealthTestList.HealthTest();
    }

    /**
     * Create an instance of {@link SreType.Indicators.ImmunizationList.Immunization }
     * 
     */
    public SreType.Indicators.ImmunizationList.Immunization createSreTypeIndicatorsImmunizationListImmunization() {
        return new SreType.Indicators.ImmunizationList.Immunization();
    }

    /**
     * Create an instance of {@link SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment }
     * 
     */
    public SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment createSreTypeGraduationRequirementListGraduationRequirementSubjectAreaListSubjectAreaSchoolOfEnrollment() {
        return new SreType.GraduationRequirementList.GraduationRequirement.SubjectAreaList.SubjectArea.SchoolOfEnrollment();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action.ReportingSchool }
     * 
     */
    public SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action.ReportingSchool createSreTypeDisciplineIncidentListDisciplineIncidentActionListActionReportingSchool() {
        return new SreType.DisciplineIncidentList.DisciplineIncident.ActionList.Action.ReportingSchool();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment.SchoolWhenTestTaken }
     * 
     */
    public SreType.AssessmentList.Assessment.SchoolWhenTestTaken createSreTypeAssessmentListAssessmentSchoolWhenTestTaken() {
        return new SreType.AssessmentList.Assessment.SchoolWhenTestTaken();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment.ScoreList.Score }
     * 
     */
    public SreType.AssessmentList.Assessment.ScoreList.Score createSreTypeAssessmentListAssessmentScoreListScore() {
        return new SreType.AssessmentList.Assessment.ScoreList.Score();
    }

    /**
     * Create an instance of {@link SreType.AssessmentList.Assessment.AccomodationList.Accomodation }
     * 
     */
    public SreType.AssessmentList.Assessment.AccomodationList.Accomodation createSreTypeAssessmentListAssessmentAccomodationListAccomodation() {
        return new SreType.AssessmentList.Assessment.AccomodationList.Accomodation();
    }

    /**
     * Create an instance of {@link SreType.AchievementList.Achievement }
     * 
     */
    public SreType.AchievementList.Achievement createSreTypeAchievementListAchievement() {
        return new SreType.AchievementList.Achievement();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.ItemAidList }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.ItemAidList createAssessmentResponseSetTypeItemListItemItemAidList() {
        return new AssessmentResponseSetType.ItemList.Item.ItemAidList();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem createAssessmentResponseSetTypeItemListItemFeedbackItemListFeedbackItem() {
        return new AssessmentResponseSetType.ItemList.Item.FeedbackItemList.FeedbackItem();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore createAssessmentResponseSetTypeItemListItemTraitScoreListTraitScore() {
        return new AssessmentResponseSetType.ItemList.Item.TraitScoreList.TraitScore();
    }

    /**
     * Create an instance of {@link AssessmentResponseSetType.ItemList.Item.CommentList.Comment }
     * 
     */
    public AssessmentResponseSetType.ItemList.Item.CommentList.Comment createAssessmentResponseSetTypeItemListItemCommentListComment() {
        return new AssessmentResponseSetType.ItemList.Item.CommentList.Comment();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.ReportingAgency }
     * 
     */
    public DisciplineIncidentType.ReportingAgency createDisciplineIncidentTypeReportingAgency() {
        return new DisciplineIncidentType.ReportingAgency();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.IncidentReporter }
     * 
     */
    public DisciplineIncidentType.IncidentReporter createDisciplineIncidentTypeIncidentReporter() {
        return new DisciplineIncidentType.IncidentReporter();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.SecondaryBehaviorList }
     * 
     */
    public DisciplineIncidentType.SecondaryBehaviorList createDisciplineIncidentTypeSecondaryBehaviorList() {
        return new DisciplineIncidentType.SecondaryBehaviorList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.WeaponTypeList }
     * 
     */
    public DisciplineIncidentType.WeaponTypeList createDisciplineIncidentTypeWeaponTypeList() {
        return new DisciplineIncidentType.WeaponTypeList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.IncidentActionList.IncidentAction }
     * 
     */
    public DisciplineIncidentType.IncidentActionList.IncidentAction createDisciplineIncidentTypeIncidentActionListIncidentAction() {
        return new DisciplineIncidentType.IncidentActionList.IncidentAction();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.VictimList.Victim }
     * 
     */
    public DisciplineIncidentType.VictimList.Victim createDisciplineIncidentTypeVictimListVictim() {
        return new DisciplineIncidentType.VictimList.Victim();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination createDisciplineIncidentTypeOffenderListOffenderManifestationDetermination() {
        return new DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender.WeaponTypeList }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender.WeaponTypeList createDisciplineIncidentTypeOffenderListOffenderWeaponTypeList() {
        return new DisciplineIncidentType.OffenderList.Offender.WeaponTypeList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList createDisciplineIncidentTypeOffenderListOffenderSecondaryBehaviorCodeList() {
        return new DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.OffenderList.Offender.ActionList.Action }
     * 
     */
    public DisciplineIncidentType.OffenderList.Offender.ActionList.Action createDisciplineIncidentTypeOffenderListOffenderActionListAction() {
        return new DisciplineIncidentType.OffenderList.Offender.ActionList.Action();
    }

    /**
     * Create an instance of {@link DisciplineIncidentType.IncidentCategoryList.IncidentCategory }
     * 
     */
    public DisciplineIncidentType.IncidentCategoryList.IncidentCategory createDisciplineIncidentTypeIncidentCategoryListIncidentCategory() {
        return new DisciplineIncidentType.IncidentCategoryList.IncidentCategory();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType.StudentAttendance }
     * 
     */
    public SchoolCalendarItemType.StudentAttendance createSchoolCalendarItemTypeStudentAttendance() {
        return new SchoolCalendarItemType.StudentAttendance();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType.TeacherAttendance }
     * 
     */
    public SchoolCalendarItemType.TeacherAttendance createSchoolCalendarItemTypeTeacherAttendance() {
        return new SchoolCalendarItemType.TeacherAttendance();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType.AdministratorAttendance }
     * 
     */
    public SchoolCalendarItemType.AdministratorAttendance createSchoolCalendarItemTypeAdministratorAttendance() {
        return new SchoolCalendarItemType.AdministratorAttendance();
    }

    /**
     * Create an instance of {@link SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay }
     * 
     */
    public SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay createSchoolCalendarItemTypeBellScheduleDayListBellScheduleDay() {
        return new SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList }
     * 
     */
    public AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList createAssessmentRegistrationTypeAssessmentStudentSnapshotRaceList() {
        return new AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom }
     * 
     */
    public AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom createAssessmentRegistrationTypeAssessmentStudentSnapshotHomeEnrollmentHomeroom() {
        return new AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.TestingStatusList.TestingStatus }
     * 
     */
    public AssessmentRegistrationType.TestingStatusList.TestingStatus createAssessmentRegistrationTypeTestingStatusListTestingStatus() {
        return new AssessmentRegistrationType.TestingStatusList.TestingStatus();
    }

    /**
     * Create an instance of {@link AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent }
     * 
     */
    public AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent createAssessmentRegistrationTypeStudentSpecialEventListStudentSpecialEvent() {
        return new AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent();
    }

    /**
     * Create an instance of {@link StudentCoreType.ConcurrentSchoolList.ConcurrentSchool }
     * 
     */
    public StudentCoreType.ConcurrentSchoolList.ConcurrentSchool createStudentCoreTypeConcurrentSchoolListConcurrentSchool() {
        return new StudentCoreType.ConcurrentSchoolList.ConcurrentSchool();
    }

    /**
     * Create an instance of {@link AssessmentFormType.FormIdentifierList }
     * 
     */
    public AssessmentFormType.FormIdentifierList createAssessmentFormTypeFormIdentifierList() {
        return new AssessmentFormType.FormIdentifierList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.FormAccommodationList }
     * 
     */
    public AssessmentFormType.FormAccommodationList createAssessmentFormTypeFormAccommodationList() {
        return new AssessmentFormType.FormAccommodationList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.GradeLevelList }
     * 
     */
    public AssessmentFormType.GradeLevelList createAssessmentFormTypeGradeLevelList() {
        return new AssessmentFormType.GradeLevelList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentFormSubjectList }
     * 
     */
    public AssessmentFormType.AssessmentFormSubjectList createAssessmentFormTypeAssessmentFormSubjectList() {
        return new AssessmentFormType.AssessmentFormSubjectList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentFormLanguageList }
     * 
     */
    public AssessmentFormType.AssessmentFormLanguageList createAssessmentFormTypeAssessmentFormLanguageList() {
        return new AssessmentFormType.AssessmentFormLanguageList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentSubTestRefIdList }
     * 
     */
    public AssessmentFormType.AssessmentSubTestRefIdList createAssessmentFormTypeAssessmentSubTestRefIdList() {
        return new AssessmentFormType.AssessmentSubTestRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentPlatformList }
     * 
     */
    public AssessmentFormType.AssessmentPlatformList createAssessmentFormTypeAssessmentPlatformList() {
        return new AssessmentFormType.AssessmentPlatformList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentAssetRefIdList }
     * 
     */
    public AssessmentFormType.AssessmentAssetRefIdList createAssessmentFormTypeAssessmentAssetRefIdList() {
        return new AssessmentFormType.AssessmentAssetRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentFormType.AssessmentSectionList.AssessmentSection }
     * 
     */
    public AssessmentFormType.AssessmentSectionList.AssessmentSection createAssessmentFormTypeAssessmentSectionListAssessmentSection() {
        return new AssessmentFormType.AssessmentSectionList.AssessmentSection();
    }

    /**
     * Create an instance of {@link AssessmentAssetType.AssetSubjectList }
     * 
     */
    public AssessmentAssetType.AssetSubjectList createAssessmentAssetTypeAssetSubjectList() {
        return new AssessmentAssetType.AssetSubjectList();
    }

    /**
     * Create an instance of {@link AssessmentAssetType.AssetGradeLevelList }
     * 
     */
    public AssessmentAssetType.AssetGradeLevelList createAssessmentAssetTypeAssetGradeLevelList() {
        return new AssessmentAssetType.AssetGradeLevelList();
    }

    /**
     * Create an instance of {@link AssessmentAssetType.AssetLearningStandardRefIdList }
     * 
     */
    public AssessmentAssetType.AssetLearningStandardRefIdList createAssessmentAssetTypeAssetLearningStandardRefIdList() {
        return new AssessmentAssetType.AssetLearningStandardRefIdList();
    }

    /**
     * Create an instance of {@link AssessmentAssetType.AssetIdentifierList.AssetIdentifier }
     * 
     */
    public AssessmentAssetType.AssetIdentifierList.AssetIdentifier createAssessmentAssetTypeAssetIdentifierListAssetIdentifier() {
        return new AssessmentAssetType.AssetIdentifierList.AssetIdentifier();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.MessageList.Message }
     * 
     */
    public LibraryPatronStatusType.MessageList.Message createLibraryPatronStatusTypeMessageListMessage() {
        return new LibraryPatronStatusType.MessageList.Message();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.Item }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.Item createLibraryPatronStatusTypeTransactionListTransactionItem() {
        return new LibraryPatronStatusType.TransactionList.Transaction.Item();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.Checkout }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.Checkout createLibraryPatronStatusTypeTransactionListTransactionCheckout() {
        return new LibraryPatronStatusType.TransactionList.Transaction.Checkout();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold createLibraryPatronStatusTypeTransactionListTransactionHoldListHold() {
        return new LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold();
    }

    /**
     * Create an instance of {@link LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine }
     * 
     */
    public LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine createLibraryPatronStatusTypeTransactionListTransactionFineListFine() {
        return new LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "description", scope = EnergyUsageType.UsageLocation.EnergyZone.Type.class)
    public JAXBElement<String> createEnergyUsageTypeUsageLocationEnergyZoneTypeDescription(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME, String.class, EnergyUsageType.UsageLocation.EnergyZone.Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "facility", scope = EnergyUsageType.UsageLocation.EnergyZone.Type.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnergyUsageTypeUsageLocationEnergyZoneTypeFacility(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeFacility_QNAME, String.class, EnergyUsageType.UsageLocation.EnergyZone.Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSections")
    public JAXBElement<AssessmentSectionCollectionType> createAssessmentSections(AssessmentSectionCollectionType value) {
        return new JAXBElement<AssessmentSectionCollectionType>(_AssessmentSections_QNAME, AssessmentSectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAssetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentAssets")
    public JAXBElement<AssessmentAssetCollectionType> createAssessmentAssets(AssessmentAssetCollectionType value) {
        return new JAXBElement<AssessmentAssetCollectionType>(_AssessmentAssets_QNAME, AssessmentAssetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentRegistration")
    public JAXBElement<AssessmentRegistrationType> createAssessmentRegistration(AssessmentRegistrationType value) {
        return new JAXBElement<AssessmentRegistrationType>(_AssessmentRegistration_QNAME, AssessmentRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XStudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xStudents")
    public JAXBElement<XStudentCollectionType> createXStudents(XStudentCollectionType value) {
        return new JAXBElement<XStudentCollectionType>(_XStudents_QNAME, XStudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRosterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xRoster")
    public JAXBElement<XRosterType> createXRoster(XRosterType value) {
        return new JAXBElement<XRosterType>(_XRoster_QNAME, XRosterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffPerson")
    public JAXBElement<StaffPersonType> createStaffPerson(StaffPersonType value) {
        return new JAXBElement<StaffPersonType>(_StaffPerson_QNAME, StaffPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentCore")
    public JAXBElement<StudentCoreType> createStudentCore(StudentCoreType value) {
        return new JAXBElement<StudentCoreType>(_StudentCore_QNAME, StudentCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentForm")
    public JAXBElement<AssessmentFormType> createAssessmentForm(AssessmentFormType value) {
        return new JAXBElement<AssessmentFormType>(_AssessmentForm_QNAME, AssessmentFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAssetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentAsset")
    public JAXBElement<AssessmentAssetType> createAssessmentAsset(AssessmentAssetType value) {
        return new JAXBElement<AssessmentAssetType>(_AssessmentAsset_QNAME, AssessmentAssetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "course")
    public JAXBElement<CourseType> createCourse(CourseType value) {
        return new JAXBElement<CourseType>(_Course_QNAME, CourseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XContactCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xContacts")
    public JAXBElement<XContactCollectionType> createXContacts(XContactCollectionType value) {
        return new JAXBElement<XContactCollectionType>(_XContacts_QNAME, XContactCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardAssociations")
    public JAXBElement<LearningStandardAssociationCollectionType> createLearningStandardAssociations(LearningStandardAssociationCollectionType value) {
        return new JAXBElement<LearningStandardAssociationCollectionType>(_LearningStandardAssociations_QNAME, LearningStandardAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "schoolCalendar")
    public JAXBElement<SchoolCalendarType> createSchoolCalendar(SchoolCalendarType value) {
        return new JAXBElement<SchoolCalendarType>(_SchoolCalendar_QNAME, SchoolCalendarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "seas")
    public JAXBElement<SeaCollectionType> createSeas(SeaCollectionType value) {
        return new JAXBElement<SeaCollectionType>(_Seas_QNAME, SeaCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "libraryPatronStatus")
    public JAXBElement<LibraryPatronStatusType> createLibraryPatronStatus(LibraryPatronStatusType value) {
        return new JAXBElement<LibraryPatronStatusType>(_LibraryPatronStatus_QNAME, LibraryPatronStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResponseSetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentResponseSets")
    public JAXBElement<AssessmentResponseSetCollectionType> createAssessmentResponseSets(AssessmentResponseSetCollectionType value) {
        return new JAXBElement<AssessmentResponseSetCollectionType>(_AssessmentResponseSets_QNAME, AssessmentResponseSetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffPersons")
    public JAXBElement<StaffPersonCollectionType> createStaffPersons(StaffPersonCollectionType value) {
        return new JAXBElement<StaffPersonCollectionType>(_StaffPersons_QNAME, StaffPersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "contactPersons")
    public JAXBElement<ContactPersonCollectionType> createContactPersons(ContactPersonCollectionType value) {
        return new JAXBElement<ContactPersonCollectionType>(_ContactPersons_QNAME, ContactPersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "userOrganizationAssociations")
    public JAXBElement<UserOrganizationAssociationCollectionType> createUserOrganizationAssociations(UserOrganizationAssociationCollectionType value) {
        return new JAXBElement<UserOrganizationAssociationCollectionType>(_UserOrganizationAssociations_QNAME, UserOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonAssignmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffPersonAssignments")
    public JAXBElement<StaffPersonAssignmentCollectionType> createStaffPersonAssignments(StaffPersonAssignmentCollectionType value) {
        return new JAXBElement<StaffPersonAssignmentCollectionType>(_StaffPersonAssignments_QNAME, StaffPersonAssignmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardItems")
    public JAXBElement<LearningStandardItemCollectionType> createLearningStandardItems(LearningStandardItemCollectionType value) {
        return new JAXBElement<LearningStandardItemCollectionType>(_LearningStandardItems_QNAME, LearningStandardItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "authentications")
    public JAXBElement<AuthenticationCollectionType> createAuthentications(AuthenticationCollectionType value) {
        return new JAXBElement<AuthenticationCollectionType>(_Authentications_QNAME, AuthenticationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentProgramAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentProgramAssociations")
    public JAXBElement<StudentProgramAssociationCollectionType> createStudentProgramAssociations(StudentProgramAssociationCollectionType value) {
        return new JAXBElement<StudentProgramAssociationCollectionType>(_StudentProgramAssociations_QNAME, StudentProgramAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentItemAssociation")
    public JAXBElement<AssessmentItemAssociationType> createAssessmentItemAssociation(AssessmentItemAssociationType value) {
        return new JAXBElement<AssessmentItemAssociationType>(_AssessmentItemAssociation_QNAME, AssessmentItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XLeaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xLea")
    public JAXBElement<XLeaType> createXLea(XLeaType value) {
        return new JAXBElement<XLeaType>(_XLea_QNAME, XLeaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAdministrationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentAdministrations")
    public JAXBElement<AssessmentAdministrationCollectionType> createAssessmentAdministrations(AssessmentAdministrationCollectionType value) {
        return new JAXBElement<AssessmentAdministrationCollectionType>(_AssessmentAdministrations_QNAME, AssessmentAdministrationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XCalendarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xCalendar")
    public JAXBElement<XCalendarType> createXCalendar(XCalendarType value) {
        return new JAXBElement<XCalendarType>(_XCalendar_QNAME, XCalendarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SreCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sres")
    public JAXBElement<SreCollectionType> createSres(SreCollectionType value) {
        return new JAXBElement<SreCollectionType>(_Sres_QNAME, SreCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XStudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xStudent")
    public JAXBElement<XStudentType> createXStudent(XStudentType value) {
        return new JAXBElement<XStudentType>(_XStudent_QNAME, XStudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRoleAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "personRoleAssociations")
    public JAXBElement<PersonRoleAssociationCollectionType> createPersonRoleAssociations(PersonRoleAssociationCollectionType value) {
        return new JAXBElement<PersonRoleAssociationCollectionType>(_PersonRoleAssociations_QNAME, PersonRoleAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "schoolCalendarItem")
    public JAXBElement<SchoolCalendarItemType> createSchoolCalendarItem(SchoolCalendarItemType value) {
        return new JAXBElement<SchoolCalendarItemType>(_SchoolCalendarItem_QNAME, SchoolCalendarItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "programs")
    public JAXBElement<ProgramCollectionType> createPrograms(ProgramCollectionType value) {
        return new JAXBElement<ProgramCollectionType>(_Programs_QNAME, ProgramCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentSectionAssociations")
    public JAXBElement<StudentSectionAssociationCollectionType> createStudentSectionAssociations(StudentSectionAssociationCollectionType value) {
        return new JAXBElement<StudentSectionAssociationCollectionType>(_StudentSectionAssociations_QNAME, StudentSectionAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sre")
    public JAXBElement<SreType> createSre(SreType value) {
        return new JAXBElement<SreType>(_Sre_QNAME, SreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResponseSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentResponseSet")
    public JAXBElement<AssessmentResponseSetType> createAssessmentResponseSet(AssessmentResponseSetType value) {
        return new JAXBElement<AssessmentResponseSetType>(_AssessmentResponseSet_QNAME, AssessmentResponseSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSessionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSessions")
    public JAXBElement<AssessmentSessionCollectionType> createAssessmentSessions(AssessmentSessionCollectionType value) {
        return new JAXBElement<AssessmentSessionCollectionType>(_AssessmentSessions_QNAME, AssessmentSessionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "schoolCalendarItems")
    public JAXBElement<SchoolCalendarItemCollectionType> createSchoolCalendarItems(SchoolCalendarItemCollectionType value) {
        return new JAXBElement<SchoolCalendarItemCollectionType>(_SchoolCalendarItems_QNAME, SchoolCalendarItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sections")
    public JAXBElement<SectionCollectionType> createSections(SectionCollectionType value) {
        return new JAXBElement<SectionCollectionType>(_Sections_QNAME, SectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentSchoolAssociation")
    public JAXBElement<StudentSchoolAssociationType> createStudentSchoolAssociation(StudentSchoolAssociationType value) {
        return new JAXBElement<StudentSchoolAssociationType>(_StudentSchoolAssociation_QNAME, StudentSchoolAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardDocuments")
    public JAXBElement<LearningStandardDocumentCollectionType> createLearningStandardDocuments(LearningStandardDocumentCollectionType value) {
        return new JAXBElement<LearningStandardDocumentCollectionType>(_LearningStandardDocuments_QNAME, LearningStandardDocumentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "userOrganizationAssociation")
    public JAXBElement<UserOrganizationAssociationType> createUserOrganizationAssociation(UserOrganizationAssociationType value) {
        return new JAXBElement<UserOrganizationAssociationType>(_UserOrganizationAssociation_QNAME, UserOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "contactPersonAssociation")
    public JAXBElement<ContactPersonAssociationType> createContactPersonAssociation(ContactPersonAssociationType value) {
        return new JAXBElement<ContactPersonAssociationType>(_ContactPersonAssociation_QNAME, ContactPersonAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentItemAssociations")
    public JAXBElement<AssessmentItemAssociationCollectionType> createAssessmentItemAssociations(AssessmentItemAssociationCollectionType value) {
        return new JAXBElement<AssessmentItemAssociationCollectionType>(_AssessmentItemAssociations_QNAME, AssessmentItemAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisciplineIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "disciplineIncident")
    public JAXBElement<DisciplineIncidentType> createDisciplineIncident(DisciplineIncidentType value) {
        return new JAXBElement<DisciplineIncidentType>(_DisciplineIncident_QNAME, DisciplineIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XSchoolCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xSchools")
    public JAXBElement<XSchoolCollectionType> createXSchools(XSchoolCollectionType value) {
        return new JAXBElement<XSchoolCollectionType>(_XSchools_QNAME, XSchoolCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XCalendarCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xCalendars")
    public JAXBElement<XCalendarCollectionType> createXCalendars(XCalendarCollectionType value) {
        return new JAXBElement<XCalendarCollectionType>(_XCalendars_QNAME, XCalendarCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentScoreTables")
    public JAXBElement<AssessmentScoreTableCollectionType> createAssessmentScoreTables(AssessmentScoreTableCollectionType value) {
        return new JAXBElement<AssessmentScoreTableCollectionType>(_AssessmentScoreTables_QNAME, AssessmentScoreTableCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XLeaCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xLeas")
    public JAXBElement<XLeaCollectionType> createXLeas(XLeaCollectionType value) {
        return new JAXBElement<XLeaCollectionType>(_XLeas_QNAME, XLeaCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentItem")
    public JAXBElement<AssessmentItemType> createAssessmentItem(AssessmentItemType value) {
        return new JAXBElement<AssessmentItemType>(_AssessmentItem_QNAME, AssessmentItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionRosterReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sectionRosterReport")
    public JAXBElement<SectionRosterReportType> createSectionRosterReport(SectionRosterReportType value) {
        return new JAXBElement<SectionRosterReportType>(_SectionRosterReport_QNAME, SectionRosterReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisciplineIncidentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "disciplineIncidents")
    public JAXBElement<DisciplineIncidentCollectionType> createDisciplineIncidents(DisciplineIncidentCollectionType value) {
        return new JAXBElement<DisciplineIncidentCollectionType>(_DisciplineIncidents_QNAME, DisciplineIncidentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "lea")
    public JAXBElement<LeaType> createLea(LeaType value) {
        return new JAXBElement<LeaType>(_Lea_QNAME, LeaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "facilitys")
    public JAXBElement<FacilityCollectionType> createFacilitys(FacilityCollectionType value) {
        return new JAXBElement<FacilityCollectionType>(_Facilitys_QNAME, FacilityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSubTest")
    public JAXBElement<AssessmentSubTestType> createAssessmentSubTest(AssessmentSubTestType value) {
        return new JAXBElement<AssessmentSubTestType>(_AssessmentSubTest_QNAME, AssessmentSubTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityParticipationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentActivityParticipation")
    public JAXBElement<StudentActivityParticipationType> createStudentActivityParticipation(StudentActivityParticipationType value) {
        return new JAXBElement<StudentActivityParticipationType>(_StudentActivityParticipation_QNAME, StudentActivityParticipationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "energyUsage")
    public JAXBElement<EnergyUsageType> createEnergyUsage(EnergyUsageType value) {
        return new JAXBElement<EnergyUsageType>(_EnergyUsage_QNAME, EnergyUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffSectionAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffSectionAssociations")
    public JAXBElement<StaffSectionAssociationCollectionType> createStaffSectionAssociations(StaffSectionAssociationCollectionType value) {
        return new JAXBElement<StaffSectionAssociationCollectionType>(_StaffSectionAssociations_QNAME, StaffSectionAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRegistrationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentRegistrations")
    public JAXBElement<AssessmentRegistrationCollectionType> createAssessmentRegistrations(AssessmentRegistrationCollectionType value) {
        return new JAXBElement<AssessmentRegistrationCollectionType>(_AssessmentRegistrations_QNAME, AssessmentRegistrationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGroupAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "personGroupAssociations")
    public JAXBElement<PersonGroupAssociationCollectionType> createPersonGroupAssociations(PersonGroupAssociationCollectionType value) {
        return new JAXBElement<PersonGroupAssociationCollectionType>(_PersonGroupAssociations_QNAME, PersonGroupAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "applications")
    public JAXBElement<ApplicationCollectionType> createApplications(ApplicationCollectionType value) {
        return new JAXBElement<ApplicationCollectionType>(_Applications_QNAME, ApplicationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "financialReports")
    public JAXBElement<FinancialReportCollectionType> createFinancialReports(FinancialReportCollectionType value) {
        return new JAXBElement<FinancialReportCollectionType>(_FinancialReports_QNAME, FinancialReportCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningResource")
    public JAXBElement<LearningResourceType> createLearningResource(LearningResourceType value) {
        return new JAXBElement<LearningResourceType>(_LearningResource_QNAME, LearningResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XStaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xStaff")
    public JAXBElement<XStaffType> createXStaff(XStaffType value) {
        return new JAXBElement<XStaffType>(_XStaff_QNAME, XStaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAdministrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentAdministration")
    public JAXBElement<AssessmentAdministrationType> createAssessmentAdministration(AssessmentAdministrationType value) {
        return new JAXBElement<AssessmentAdministrationType>(_AssessmentAdministration_QNAME, AssessmentAdministrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "student")
    public JAXBElement<StudentType> createStudent(StudentType value) {
        return new JAXBElement<StudentType>(_Student_QNAME, StudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "schools")
    public JAXBElement<SchoolCollectionType> createSchools(SchoolCollectionType value) {
        return new JAXBElement<SchoolCollectionType>(_Schools_QNAME, SchoolCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAddressAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "partyAddressAssociation")
    public JAXBElement<PartyAddressAssociationType> createPartyAddressAssociation(PartyAddressAssociationType value) {
        return new JAXBElement<PartyAddressAssociationType>(_PartyAddressAssociation_QNAME, PartyAddressAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRoleAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "personRoleAssociation")
    public JAXBElement<PersonRoleAssociationType> createPersonRoleAssociation(PersonRoleAssociationType value) {
        return new JAXBElement<PersonRoleAssociationType>(_PersonRoleAssociation_QNAME, PersonRoleAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "authorization")
    public JAXBElement<GAuthorizationType> createAuthorization(GAuthorizationType value) {
        return new JAXBElement<GAuthorizationType>(_Authorization_QNAME, GAuthorizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardDocument")
    public JAXBElement<LearningStandardDocumentType> createLearningStandardDocument(LearningStandardDocumentType value) {
        return new JAXBElement<LearningStandardDocumentType>(_LearningStandardDocument_QNAME, LearningStandardDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessments")
    public JAXBElement<AssessmentCollectionType> createAssessments(AssessmentCollectionType value) {
        return new JAXBElement<AssessmentCollectionType>(_Assessments_QNAME, AssessmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardAssociation")
    public JAXBElement<LearningStandardAssociationType> createLearningStandardAssociation(LearningStandardAssociationType value) {
        return new JAXBElement<LearningStandardAssociationType>(_LearningStandardAssociation_QNAME, LearningStandardAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XSreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xSre")
    public JAXBElement<XSreType> createXSre(XSreType value) {
        return new JAXBElement<XSreType>(_XSre_QNAME, XSreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XCourseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xCourse")
    public JAXBElement<XCourseType> createXCourse(XCourseType value) {
        return new JAXBElement<XCourseType>(_XCourse_QNAME, XCourseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "terms")
    public JAXBElement<TermCollectionType> createTerms(TermCollectionType value) {
        return new JAXBElement<TermCollectionType>(_Terms_QNAME, TermCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "financialReport")
    public JAXBElement<FinancialReportType> createFinancialReport(FinancialReportType value) {
        return new JAXBElement<FinancialReportType>(_FinancialReport_QNAME, FinancialReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentActivity")
    public JAXBElement<StudentActivityType> createStudentActivity(StudentActivityType value) {
        return new JAXBElement<StudentActivityType>(_StudentActivity_QNAME, StudentActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSummaryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSummarys")
    public JAXBElement<AssessmentSummaryCollectionType> createAssessmentSummarys(AssessmentSummaryCollectionType value) {
        return new JAXBElement<AssessmentSummaryCollectionType>(_AssessmentSummarys_QNAME, AssessmentSummaryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "partyOrganizationAssociation")
    public JAXBElement<PartyOrganizationAssociationType> createPartyOrganizationAssociation(PartyOrganizationAssociationType value) {
        return new JAXBElement<PartyOrganizationAssociationType>(_PartyOrganizationAssociation_QNAME, PartyOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "contactPerson")
    public JAXBElement<ContactPersonType> createContactPerson(ContactPersonType value) {
        return new JAXBElement<ContactPersonType>(_ContactPerson_QNAME, ContactPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "leas")
    public JAXBElement<LeaCollectionType> createLeas(LeaCollectionType value) {
        return new JAXBElement<LeaCollectionType>(_Leas_QNAME, LeaCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCoreCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentCores")
    public JAXBElement<StudentCoreCollectionType> createStudentCores(StudentCoreCollectionType value) {
        return new JAXBElement<StudentCoreCollectionType>(_StudentCores_QNAME, StudentCoreCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRosterCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xRosters")
    public JAXBElement<XRosterCollectionType> createXRosters(XRosterCollectionType value) {
        return new JAXBElement<XRosterCollectionType>(_XRosters_QNAME, XRosterCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFormCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentForms")
    public JAXBElement<AssessmentFormCollectionType> createAssessmentForms(AssessmentFormCollectionType value) {
        return new JAXBElement<AssessmentFormCollectionType>(_AssessmentForms_QNAME, AssessmentFormCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "program")
    public JAXBElement<ProgramType> createProgram(ProgramType value) {
        return new JAXBElement<ProgramType>(_Program_QNAME, ProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentScoreTable")
    public JAXBElement<AssessmentScoreTableType> createAssessmentScoreTable(AssessmentScoreTableType value) {
        return new JAXBElement<AssessmentScoreTableType>(_AssessmentScoreTable_QNAME, AssessmentScoreTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionRosterReportCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sectionRosterReports")
    public JAXBElement<SectionRosterReportCollectionType> createSectionRosterReports(SectionRosterReportCollectionType value) {
        return new JAXBElement<SectionRosterReportCollectionType>(_SectionRosterReports_QNAME, SectionRosterReportCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentRubrics")
    public JAXBElement<AssessmentRubricCollectionType> createAssessmentRubrics(AssessmentRubricCollectionType value) {
        return new JAXBElement<AssessmentRubricCollectionType>(_AssessmentRubrics_QNAME, AssessmentRubricCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSummary")
    public JAXBElement<AssessmentSummaryType> createAssessmentSummary(AssessmentSummaryType value) {
        return new JAXBElement<AssessmentSummaryType>(_AssessmentSummary_QNAME, AssessmentSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XSchoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xSchool")
    public JAXBElement<XSchoolType> createXSchool(XSchoolType value) {
        return new JAXBElement<XSchoolType>(_XSchool_QNAME, XSchoolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentRubric")
    public JAXBElement<AssessmentRubricType> createAssessmentRubric(AssessmentRubricType value) {
        return new JAXBElement<AssessmentRubricType>(_AssessmentRubric_QNAME, AssessmentRubricType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "authorizations")
    public JAXBElement<AuthorizationCollectionType> createAuthorizations(AuthorizationCollectionType value) {
        return new JAXBElement<AuthorizationCollectionType>(_Authorizations_QNAME, AuthorizationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreSetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentScoreSets")
    public JAXBElement<AssessmentScoreSetCollectionType> createAssessmentScoreSets(AssessmentScoreSetCollectionType value) {
        return new JAXBElement<AssessmentScoreSetCollectionType>(_AssessmentScoreSets_QNAME, AssessmentScoreSetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubTestCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSubTests")
    public JAXBElement<AssessmentSubTestCollectionType> createAssessmentSubTests(AssessmentSubTestCollectionType value) {
        return new JAXBElement<AssessmentSubTestCollectionType>(_AssessmentSubTests_QNAME, AssessmentSubTestCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentItems")
    public JAXBElement<AssessmentItemCollectionType> createAssessmentItems(AssessmentItemCollectionType value) {
        return new JAXBElement<AssessmentItemCollectionType>(_AssessmentItems_QNAME, AssessmentItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffSectionAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffSectionAssociation")
    public JAXBElement<StaffSectionAssociationType> createStaffSectionAssociation(StaffSectionAssociationType value) {
        return new JAXBElement<StaffSectionAssociationType>(_StaffSectionAssociation_QNAME, StaffSectionAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningStandardItem")
    public JAXBElement<LearningStandardItemType> createLearningStandardItem(LearningStandardItemType value) {
        return new JAXBElement<LearningStandardItemType>(_LearningStandardItem_QNAME, LearningStandardItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSessionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSession")
    public JAXBElement<AssessmentSessionType> createAssessmentSession(AssessmentSessionType value) {
        return new JAXBElement<AssessmentSessionType>(_AssessmentSession_QNAME, AssessmentSessionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "learningResources")
    public JAXBElement<LearningResourceCollectionType> createLearningResources(LearningResourceCollectionType value) {
        return new JAXBElement<LearningResourceCollectionType>(_LearningResources_QNAME, LearningResourceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentSchoolAssociations")
    public JAXBElement<StudentSchoolAssociationCollectionType> createStudentSchoolAssociations(StudentSchoolAssociationCollectionType value) {
        return new JAXBElement<StudentSchoolAssociationCollectionType>(_StudentSchoolAssociations_QNAME, StudentSchoolAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "contactPersonAssociations")
    public JAXBElement<ContactPersonAssociationCollectionType> createContactPersonAssociations(ContactPersonAssociationCollectionType value) {
        return new JAXBElement<ContactPersonAssociationCollectionType>(_ContactPersonAssociations_QNAME, ContactPersonAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "facility")
    public JAXBElement<FacilityType> createFacility(FacilityType value) {
        return new JAXBElement<FacilityType>(_EnergyUsageTypeUsageLocationEnergyZoneTypeFacility_QNAME, FacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "partyOrganizationAssociations")
    public JAXBElement<PartyOrganizationAssociationCollectionType> createPartyOrganizationAssociations(PartyOrganizationAssociationCollectionType value) {
        return new JAXBElement<PartyOrganizationAssociationCollectionType>(_PartyOrganizationAssociations_QNAME, PartyOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentScoreSet")
    public JAXBElement<AssessmentScoreSetType> createAssessmentScoreSet(AssessmentScoreSetType value) {
        return new JAXBElement<AssessmentScoreSetType>(_AssessmentScoreSet_QNAME, AssessmentScoreSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentSectionAssociation")
    public JAXBElement<StudentSectionAssociationType> createStudentSectionAssociation(StudentSectionAssociationType value) {
        return new JAXBElement<StudentSectionAssociationType>(_StudentSectionAssociation_QNAME, StudentSectionAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessmentSection")
    public JAXBElement<AssessmentSectionType> createAssessmentSection(AssessmentSectionType value) {
        return new JAXBElement<AssessmentSectionType>(_AssessmentSection_QNAME, AssessmentSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "addresss")
    public JAXBElement<AddressCollectionType> createAddresss(AddressCollectionType value) {
        return new JAXBElement<AddressCollectionType>(_Addresss_QNAME, AddressCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "organizationOrganizationAssociations")
    public JAXBElement<OrganizationOrganizationAssociationCollectionType> createOrganizationOrganizationAssociations(OrganizationOrganizationAssociationCollectionType value) {
        return new JAXBElement<OrganizationOrganizationAssociationCollectionType>(_OrganizationOrganizationAssociations_QNAME, OrganizationOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "courses")
    public JAXBElement<CourseCollectionType> createCourses(CourseCollectionType value) {
        return new JAXBElement<CourseCollectionType>(_Courses_QNAME, CourseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentProgramAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentProgramAssociation")
    public JAXBElement<StudentProgramAssociationType> createStudentProgramAssociation(StudentProgramAssociationType value) {
        return new JAXBElement<StudentProgramAssociationType>(_StudentProgramAssociation_QNAME, StudentProgramAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAddressAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "partyAddressAssociations")
    public JAXBElement<PartyAddressAssociationCollectionType> createPartyAddressAssociations(PartyAddressAssociationCollectionType value) {
        return new JAXBElement<PartyAddressAssociationCollectionType>(_PartyAddressAssociations_QNAME, PartyAddressAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xContact")
    public JAXBElement<XContactType> createXContact(XContactType value) {
        return new JAXBElement<XContactType>(_XContact_QNAME, XContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XCourseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xCourses")
    public JAXBElement<XCourseCollectionType> createXCourses(XCourseCollectionType value) {
        return new JAXBElement<XCourseCollectionType>(_XCourses_QNAME, XCourseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "schoolCalendars")
    public JAXBElement<SchoolCalendarCollectionType> createSchoolCalendars(SchoolCalendarCollectionType value) {
        return new JAXBElement<SchoolCalendarCollectionType>(_SchoolCalendars_QNAME, SchoolCalendarCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "assessment")
    public JAXBElement<AssessmentType> createAssessment(AssessmentType value) {
        return new JAXBElement<AssessmentType>(_Assessment_QNAME, AssessmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "crisisIncidents")
    public JAXBElement<CrisisIncidentCollectionType> createCrisisIncidents(CrisisIncidentCollectionType value) {
        return new JAXBElement<CrisisIncidentCollectionType>(_CrisisIncidents_QNAME, CrisisIncidentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "group")
    public JAXBElement<GroupType> createGroup(GroupType value) {
        return new JAXBElement<GroupType>(_Group_QNAME, GroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "school")
    public JAXBElement<SchoolType> createSchool(SchoolType value) {
        return new JAXBElement<SchoolType>(_School_QNAME, SchoolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGroupAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "personGroupAssociation")
    public JAXBElement<PersonGroupAssociationType> createPersonGroupAssociation(PersonGroupAssociationType value) {
        return new JAXBElement<PersonGroupAssociationType>(_PersonGroupAssociation_QNAME, PersonGroupAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "organizationOrganizationAssociation")
    public JAXBElement<OrganizationOrganizationAssociationType> createOrganizationOrganizationAssociation(OrganizationOrganizationAssociationType value) {
        return new JAXBElement<OrganizationOrganizationAssociationType>(_OrganizationOrganizationAssociation_QNAME, OrganizationOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAuthenticationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "authentication")
    public JAXBElement<GAuthenticationType> createAuthentication(GAuthenticationType value) {
        return new JAXBElement<GAuthenticationType>(_Authentication_QNAME, GAuthenticationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "address")
    public JAXBElement<GAddressType> createAddress(GAddressType value) {
        return new JAXBElement<GAddressType>(_Address_QNAME, GAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "term")
    public JAXBElement<TermType> createTerm(TermType value) {
        return new JAXBElement<TermType>(_Term_QNAME, TermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sea")
    public JAXBElement<SeaType> createSea(SeaType value) {
        return new JAXBElement<SeaType>(_Sea_QNAME, SeaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "staffPersonAssignment")
    public JAXBElement<StaffPersonAssignmentType> createStaffPersonAssignment(StaffPersonAssignmentType value) {
        return new JAXBElement<StaffPersonAssignmentType>(_StaffPersonAssignment_QNAME, StaffPersonAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "section")
    public JAXBElement<SectionType> createSection(SectionType value) {
        return new JAXBElement<SectionType>(_Section_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "persons")
    public JAXBElement<PersonCollectionType> createPersons(PersonCollectionType value) {
        return new JAXBElement<PersonCollectionType>(_Persons_QNAME, PersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "students")
    public JAXBElement<StudentCollectionType> createStudents(StudentCollectionType value) {
        return new JAXBElement<StudentCollectionType>(_Students_QNAME, StudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "application")
    public JAXBElement<GApplicationType> createApplication(GApplicationType value) {
        return new JAXBElement<GApplicationType>(_Application_QNAME, GApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "crisisIncident")
    public JAXBElement<CrisisIncidentType> createCrisisIncident(CrisisIncidentType value) {
        return new JAXBElement<CrisisIncidentType>(_CrisisIncident_QNAME, CrisisIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XStaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xStaffs")
    public JAXBElement<XStaffCollectionType> createXStaffs(XStaffCollectionType value) {
        return new JAXBElement<XStaffCollectionType>(_XStaffs_QNAME, XStaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "energyZone", scope = EnergyUsageType.UsageLocation.class)
    public JAXBElement<EnergyUsageType.UsageLocation.EnergyZone> createEnergyUsageTypeUsageLocationEnergyZone(EnergyUsageType.UsageLocation.EnergyZone value) {
        return new JAXBElement<EnergyUsageType.UsageLocation.EnergyZone>(_EnergyUsageTypeUsageLocationEnergyZone_QNAME, EnergyUsageType.UsageLocation.EnergyZone.class, EnergyUsageType.UsageLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "building", scope = EnergyUsageType.UsageLocation.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnergyUsageTypeUsageLocationBuilding(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationBuilding_QNAME, String.class, EnergyUsageType.UsageLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "dataSource", scope = EnergyUsageType.class)
    public JAXBElement<EnergyUsageType.DataSource> createEnergyUsageTypeDataSource(EnergyUsageType.DataSource value) {
        return new JAXBElement<EnergyUsageType.DataSource>(_EnergyUsageTypeDataSource_QNAME, EnergyUsageType.DataSource.class, EnergyUsageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Checkout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "checkout", scope = LibraryPatronStatusType.TransactionList.Transaction.class)
    public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Checkout> createLibraryPatronStatusTypeTransactionListTransactionCheckout(LibraryPatronStatusType.TransactionList.Transaction.Checkout value) {
        return new JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Checkout>(_LibraryPatronStatusTypeTransactionListTransactionCheckout_QNAME, LibraryPatronStatusType.TransactionList.Transaction.Checkout.class, LibraryPatronStatusType.TransactionList.Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.HoldList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "holdList", scope = LibraryPatronStatusType.TransactionList.Transaction.class)
    public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.HoldList> createLibraryPatronStatusTypeTransactionListTransactionHoldList(LibraryPatronStatusType.TransactionList.Transaction.HoldList value) {
        return new JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.HoldList>(_LibraryPatronStatusTypeTransactionListTransactionHoldList_QNAME, LibraryPatronStatusType.TransactionList.Transaction.HoldList.class, LibraryPatronStatusType.TransactionList.Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "item", scope = LibraryPatronStatusType.TransactionList.Transaction.class)
    public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Item> createLibraryPatronStatusTypeTransactionListTransactionItem(LibraryPatronStatusType.TransactionList.Transaction.Item value) {
        return new JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.Item>(_LibraryPatronStatusTypeTransactionListTransactionItem_QNAME, LibraryPatronStatusType.TransactionList.Transaction.Item.class, LibraryPatronStatusType.TransactionList.Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList.Transaction.FineList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "fineList", scope = LibraryPatronStatusType.TransactionList.Transaction.class)
    public JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.FineList> createLibraryPatronStatusTypeTransactionListTransactionFineList(LibraryPatronStatusType.TransactionList.Transaction.FineList value) {
        return new JAXBElement<LibraryPatronStatusType.TransactionList.Transaction.FineList>(_LibraryPatronStatusTypeTransactionListTransactionFineList_QNAME, LibraryPatronStatusType.TransactionList.Transaction.FineList.class, LibraryPatronStatusType.TransactionList.Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "dateAvailable", scope = LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class)
    public JAXBElement<XMLGregorianCalendar> createLibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateAvailable(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateAvailable_QNAME, XMLGregorianCalendar.class, LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "expires", scope = LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class)
    public JAXBElement<XMLGregorianCalendar> createLibraryPatronStatusTypeTransactionListTransactionHoldListHoldExpires(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LibraryPatronStatusTypeTransactionListTransactionHoldListHoldExpires_QNAME, XMLGregorianCalendar.class, LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "dateNeeded", scope = LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class)
    public JAXBElement<XMLGregorianCalendar> createLibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateNeeded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LibraryPatronStatusTypeTransactionListTransactionHoldListHoldDateNeeded_QNAME, XMLGregorianCalendar.class, LibraryPatronStatusType.TransactionList.Transaction.HoldList.Hold.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "endDate", scope = StudentActivityParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentActivityParticipationTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "role", scope = StudentActivityParticipationType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityParticipationTypeRole(String value) {
        return new JAXBElement<String>(_StudentActivityParticipationTypeRole_QNAME, String.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "participationComment", scope = StudentActivityParticipationType.class)
    public JAXBElement<String> createStudentActivityParticipationTypeParticipationComment(String value) {
        return new JAXBElement<String>(_StudentActivityParticipationTypeParticipationComment_QNAME, String.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "startDate", scope = StudentActivityParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentActivityParticipationTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeStartDate_QNAME, XMLGregorianCalendar.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityParticipationType.RecognitionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "recognitionList", scope = StudentActivityParticipationType.class)
    public JAXBElement<StudentActivityParticipationType.RecognitionList> createStudentActivityParticipationTypeRecognitionList(StudentActivityParticipationType.RecognitionList value) {
        return new JAXBElement<StudentActivityParticipationType.RecognitionList>(_StudentActivityParticipationTypeRecognitionList_QNAME, StudentActivityParticipationType.RecognitionList.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "description", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackDescription(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "source", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource(String value) {
        return new JAXBElement<String>(_AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone.TagList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "tagList", scope = EnergyUsageType.UsageLocation.EnergyZone.class)
    public JAXBElement<EnergyUsageType.UsageLocation.EnergyZone.TagList> createEnergyUsageTypeUsageLocationEnergyZoneTagList(EnergyUsageType.UsageLocation.EnergyZone.TagList value) {
        return new JAXBElement<EnergyUsageType.UsageLocation.EnergyZone.TagList>(_EnergyUsageTypeUsageLocationEnergyZoneTagList_QNAME, EnergyUsageType.UsageLocation.EnergyZone.TagList.class, EnergyUsageType.UsageLocation.EnergyZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "endDate", scope = XActivityType.class)
    public JAXBElement<XMLGregorianCalendar> createXActivityTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "role", scope = XActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createXActivityTypeRole(String value) {
        return new JAXBElement<String>(_StudentActivityParticipationTypeRole_QNAME, String.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XActivityType.Recognitions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "recognitions", scope = XActivityType.class)
    public JAXBElement<XActivityType.Recognitions> createXActivityTypeRecognitions(XActivityType.Recognitions value) {
        return new JAXBElement<XActivityType.Recognitions>(_XActivityTypeRecognitions_QNAME, XActivityType.Recognitions.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentActivityLevel", scope = XActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createXActivityTypeStudentActivityLevel(String value) {
        return new JAXBElement<String>(_XActivityTypeStudentActivityLevel_QNAME, String.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "participationComment", scope = XActivityType.class)
    public JAXBElement<String> createXActivityTypeParticipationComment(String value) {
        return new JAXBElement<String>(_StudentActivityParticipationTypeParticipationComment_QNAME, String.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "startDate", scope = XActivityType.class)
    public JAXBElement<XMLGregorianCalendar> createXActivityTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeStartDate_QNAME, XMLGregorianCalendar.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "description", scope = XActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createXActivityTypeDescription(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME, String.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "location", scope = XActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createXActivityTypeLocation(String value) {
        return new JAXBElement<String>(_XActivityTypeLocation_QNAME, String.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XYearGroupListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "gradeLevels", scope = XActivityType.class)
    public JAXBElement<XYearGroupListType> createXActivityTypeGradeLevels(XYearGroupListType value) {
        return new JAXBElement<XYearGroupListType>(_XActivityTypeGradeLevels_QNAME, XYearGroupListType.class, XActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "endDate", scope = LearningStandardAssociationType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardAssociationTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, LearningStandardAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "refURI", scope = LearningStandardAssociationType.class)
    public JAXBElement<String> createLearningStandardAssociationTypeRefURI(String value) {
        return new JAXBElement<String>(_LearningStandardAssociationTypeRefURI_QNAME, String.class, LearningStandardAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "studentActivityLevel", scope = StudentActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityTypeStudentActivityLevel(String value) {
        return new JAXBElement<String>(_XActivityTypeStudentActivityLevel_QNAME, String.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "description", scope = StudentActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityTypeDescription(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME, String.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "location", scope = StudentActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityTypeLocation(String value) {
        return new JAXBElement<String>(_XActivityTypeLocation_QNAME, String.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GCodedElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "curricularStatus", scope = StudentActivityType.class)
    public JAXBElement<GCodedElementType> createStudentActivityTypeCurricularStatus(GCodedElementType value) {
        return new JAXBElement<GCodedElementType>(_StudentActivityTypeCurricularStatus_QNAME, GCodedElementType.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYearGroupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "gradeLevels", scope = StudentActivityType.class)
    public JAXBElement<GYearGroupList> createStudentActivityTypeGradeLevels(GYearGroupList value) {
        return new JAXBElement<GYearGroupList>(_XActivityTypeGradeLevels_QNAME, GYearGroupList.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "price", scope = LibraryPatronStatusType.TransactionList.Transaction.Item.class)
    public JAXBElement<BigDecimal> createLibraryPatronStatusTypeTransactionListTransactionItemPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LibraryPatronStatusTypeTransactionListTransactionItemPrice_QNAME, BigDecimal.class, LibraryPatronStatusType.TransactionList.Transaction.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GElectronicIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "electronicId", scope = LibraryPatronStatusType.TransactionList.Transaction.Item.class)
    public JAXBElement<GElectronicIdType> createLibraryPatronStatusTypeTransactionListTransactionItemElectronicId(GElectronicIdType value) {
        return new JAXBElement<GElectronicIdType>(_LibraryPatronStatusTypeTransactionListTransactionItemElectronicId_QNAME, GElectronicIdType.class, LibraryPatronStatusType.TransactionList.Transaction.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "author", scope = LibraryPatronStatusType.TransactionList.Transaction.Item.class)
    public JAXBElement<String> createLibraryPatronStatusTypeTransactionListTransactionItemAuthor(String value) {
        return new JAXBElement<String>(_LibraryPatronStatusTypeTransactionListTransactionItemAuthor_QNAME, String.class, LibraryPatronStatusType.TransactionList.Transaction.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "callNumber", scope = LibraryPatronStatusType.TransactionList.Transaction.Item.class)
    public JAXBElement<String> createLibraryPatronStatusTypeTransactionListTransactionItemCallNumber(String value) {
        return new JAXBElement<String>(_LibraryPatronStatusTypeTransactionListTransactionItemCallNumber_QNAME, String.class, LibraryPatronStatusType.TransactionList.Transaction.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "readingList", scope = EnergyUsageType.DataSource.ReadingDataList.ReadingData.class)
    public JAXBElement<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList> createEnergyUsageTypeDataSourceReadingDataListReadingDataReadingList(EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList value) {
        return new JAXBElement<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList>(_EnergyUsageTypeDataSourceReadingDataListReadingDataReadingList_QNAME, EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.class, EnergyUsageType.DataSource.ReadingDataList.ReadingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "readingName", scope = EnergyUsageType.DataSource.ReadingDataList.ReadingData.class)
    public JAXBElement<String> createEnergyUsageTypeDataSourceReadingDataListReadingDataReadingName(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeDataSourceReadingDataListReadingDataReadingName_QNAME, String.class, EnergyUsageType.DataSource.ReadingDataList.ReadingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sensorId", scope = EnergyUsageType.DataSource.ReadingDataList.ReadingData.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnergyUsageTypeDataSourceReadingDataListReadingDataSensorId(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeDataSourceReadingDataListReadingDataSensorId_QNAME, String.class, EnergyUsageType.DataSource.ReadingDataList.ReadingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "interval", scope = EnergyUsageType.DataSource.ReadingDataList.ReadingData.class)
    public JAXBElement<Long> createEnergyUsageTypeDataSourceReadingDataListReadingDataInterval(Long value) {
        return new JAXBElement<Long>(_EnergyUsageTypeDataSourceReadingDataListReadingDataInterval_QNAME, Long.class, EnergyUsageType.DataSource.ReadingDataList.ReadingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "reference", scope = LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine.class)
    public JAXBElement<String> createLibraryPatronStatusTypeTransactionListTransactionFineListFineReference(String value) {
        return new JAXBElement<String>(_LibraryPatronStatusTypeTransactionListTransactionFineListFineReference_QNAME, String.class, LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "description", scope = LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine.class)
    public JAXBElement<String> createLibraryPatronStatusTypeTransactionListTransactionFineListFineDescription(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTypeDescription_QNAME, String.class, LibraryPatronStatusType.TransactionList.Transaction.FineList.Fine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "value", scope = EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnergyUsageTypeUsageLocationEnergyZoneTagListTagValue(String value) {
        return new JAXBElement<String>(_EnergyUsageTypeUsageLocationEnergyZoneTagListTagValue_QNAME, String.class, EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "numberOfRefunds", scope = LibraryPatronStatusType.class)
    public JAXBElement<Long> createLibraryPatronStatusTypeNumberOfRefunds(Long value) {
        return new JAXBElement<Long>(_LibraryPatronStatusTypeNumberOfRefunds_QNAME, Long.class, LibraryPatronStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.TransactionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "transactionList", scope = LibraryPatronStatusType.class)
    public JAXBElement<LibraryPatronStatusType.TransactionList> createLibraryPatronStatusTypeTransactionList(LibraryPatronStatusType.TransactionList value) {
        return new JAXBElement<LibraryPatronStatusType.TransactionList>(_LibraryPatronStatusTypeTransactionList_QNAME, LibraryPatronStatusType.TransactionList.class, LibraryPatronStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryPatronStatusType.MessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "messageList", scope = LibraryPatronStatusType.class)
    public JAXBElement<LibraryPatronStatusType.MessageList> createLibraryPatronStatusTypeMessageList(LibraryPatronStatusType.MessageList value) {
        return new JAXBElement<LibraryPatronStatusType.MessageList>(_LibraryPatronStatusTypeMessageList_QNAME, LibraryPatronStatusType.MessageList.class, LibraryPatronStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "refundAmount", scope = LibraryPatronStatusType.class)
    public JAXBElement<BigDecimal> createLibraryPatronStatusTypeRefundAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LibraryPatronStatusTypeRefundAmount_QNAME, BigDecimal.class, LibraryPatronStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoreList", scope = AssessmentRubricType.class)
    public JAXBElement<AssessmentRubricType.ScoreList> createAssessmentRubricTypeScoreList(AssessmentRubricType.ScoreList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList>(_AssessmentRubricTypeScoreList_QNAME, AssessmentRubricType.ScoreList.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoringGuideReference", scope = AssessmentRubricType.class)
    public JAXBElement<String> createAssessmentRubricTypeScoringGuideReference(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoringGuideReference_QNAME, String.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.RubricIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "rubricIdentifierList", scope = AssessmentRubricType.class)
    public JAXBElement<AssessmentRubricType.RubricIdentifierList> createAssessmentRubricTypeRubricIdentifierList(AssessmentRubricType.RubricIdentifierList value) {
        return new JAXBElement<AssessmentRubricType.RubricIdentifierList>(_AssessmentRubricTypeRubricIdentifierList_QNAME, AssessmentRubricType.RubricIdentifierList.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "rubricPublishDate", scope = AssessmentRubricType.class)
    public JAXBElement<XMLGregorianCalendar> createAssessmentRubricTypeRubricPublishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssessmentRubricTypeRubricPublishDate_QNAME, XMLGregorianCalendar.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "rubricVersion", scope = AssessmentRubricType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentRubricTypeRubricVersion(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeRubricVersion_QNAME, String.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "associationStrength", scope = LearningStandardAssociationType.TargetObjectList.TargetObject.class)
    public JAXBElement<BigDecimal> createLearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength_QNAME, BigDecimal.class, LearningStandardAssociationType.TargetObjectList.TargetObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "associationType", scope = LearningStandardAssociationType.TargetObjectList.TargetObject.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType(String value) {
        return new JAXBElement<String>(_LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType_QNAME, String.class, LearningStandardAssociationType.TargetObjectList.TargetObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "reference", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.Reference> createGAbstractContentElementTypeReference(GAbstractContentElementType.Reference value) {
        return new JAXBElement<GAbstractContentElementType.Reference>(_LibraryPatronStatusTypeTransactionListTransactionFineListFineReference_QNAME, GAbstractContentElementType.Reference.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "binaryData", scope = GAbstractContentElementType.class)
    public JAXBElement<byte[]> createGAbstractContentElementTypeBinaryData(byte[] value) {
        return new JAXBElement<byte[]>(_GAbstractContentElementTypeBinaryData_QNAME, byte[].class, GAbstractContentElementType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.TextData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "textData", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.TextData> createGAbstractContentElementTypeTextData(GAbstractContentElementType.TextData value) {
        return new JAXBElement<GAbstractContentElementType.TextData>(_GAbstractContentElementTypeTextData_QNAME, GAbstractContentElementType.TextData.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.XmlData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "xmlData", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.XmlData> createGAbstractContentElementTypeXmlData(GAbstractContentElementType.XmlData value) {
        return new JAXBElement<GAbstractContentElementType.XmlData>(_GAbstractContentElementTypeXmlData_QNAME, GAbstractContentElementType.XmlData.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "feedbackList", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.class)
    public JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackList(AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList value) {
        return new JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList>(_AssessmentScoreTableTypeScoreValueListScoreValueFeedbackList_QNAME, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "passFailIndicator", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator(String value) {
        return new JAXBElement<String>(_AssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "sent", scope = LibraryPatronStatusType.MessageList.Message.class)
    public JAXBElement<XMLGregorianCalendar> createLibraryPatronStatusTypeMessageListMessageSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LibraryPatronStatusTypeMessageListMessageSent_QNAME, XMLGregorianCalendar.class, LibraryPatronStatusType.MessageList.Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoreCode", scope = AssessmentRubricType.ScoreList.Score.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentRubricTypeScoreListScoreScoreCode(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoreListScoreScoreCode_QNAME, String.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreDescriptionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoreDescriptionList", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList> createAssessmentRubricTypeScoreListScoreScoreDescriptionList(AssessmentRubricType.ScoreList.Score.ScoreDescriptionList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList>(_AssessmentRubricTypeScoreListScoreScoreDescriptionList_QNAME, AssessmentRubricType.ScoreList.Score.ScoreDescriptionList.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoreCodeDefinition", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<String> createAssessmentRubricTypeScoreListScoreScoreCodeDefinition(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoreListScoreScoreCodeDefinition_QNAME, String.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreCommentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.3", name = "scoreCommentList", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList> createAssessmentRubricTypeScoreListScoreScoreCommentList(AssessmentRubricType.ScoreList.Score.ScoreCommentList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList>(_AssessmentRubricTypeScoreListScoreScoreCommentList_QNAME, AssessmentRubricType.ScoreList.Score.ScoreCommentList.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

}
