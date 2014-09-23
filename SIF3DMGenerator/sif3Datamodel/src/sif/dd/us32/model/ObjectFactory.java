
package sif.dd.us32.model;

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
 * generated in the sif.dd.us32.model package. 
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

    private final static QName _AeStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeStudents");
    private final static QName _PsAssessment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psAssessment");
    private final static QName _AssessmentPersonalNeedsProfileCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentPersonalNeedsProfileCEDS");
    private final static QName _AssessmentRegistration_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentRegistration");
    private final static QName _AeStudent_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeStudent");
    private final static QName _StaffPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffPerson");
    private final static QName _StudentCore_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentCore");
    private final static QName _AssessmentForm_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentForm");
    private final static QName _AssessmentAsset_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAsset");
    private final static QName _Seas_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "seas");
    private final static QName _SchoolCalendar_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "schoolCalendar");
    private final static QName _AssessmentResponseSets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentResponseSets");
    private final static QName _StaffPersons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffPersons");
    private final static QName _PsStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psStudents");
    private final static QName _ContactPersons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPersons");
    private final static QName _LearningStandardItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardItems");
    private final static QName _Authentications_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authentications");
    private final static QName _K12Students_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Students");
    private final static QName _ElContactPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elContactPerson");
    private final static QName _AchievementCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "achievementCEDS");
    private final static QName _AssessmentAdministrations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAdministrations");
    private final static QName _Sres_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sres");
    private final static QName _ProgramCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "programCEDSs");
    private final static QName _CteStaff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteStaff");
    private final static QName _SchoolCalendarItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "schoolCalendarItem");
    private final static QName _ElAssessment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elAssessment");
    private final static QName _AeSections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeSections");
    private final static QName _StudentSchoolAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentSchoolAssociation");
    private final static QName _AchievementCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "achievementCEDSs");
    private final static QName _AePrograms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aePrograms");
    private final static QName _LearnerActivityCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learnerActivityCEDS");
    private final static QName _AuthorizationApplications_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authorizationApplications");
    private final static QName _K12Course_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Course");
    private final static QName _ContactPersonAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPersonAssociation");
    private final static QName _ElChilds_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elChilds");
    private final static QName _DisciplineIncident_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "disciplineIncident");
    private final static QName _FacilityCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "facilityCEDSs");
    private final static QName _AssessmentScoreTables_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentScoreTables");
    private final static QName _ElOrganizations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elOrganizations");
    private final static QName _IncidentCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "incidentCEDS");
    private final static QName _AeStaffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeStaffs");
    private final static QName _K12Staff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Staff");
    private final static QName _ElClassGroups_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elClassGroups");
    private final static QName _AeProgram_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeProgram");
    private final static QName _LearningGoalCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningGoalCEDS");
    private final static QName _StaffSectionAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffSectionAssociations");
    private final static QName _PersonGroupAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "personGroupAssociations");
    private final static QName _PsContactPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psContactPerson");
    private final static QName _LearningResource_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningResource");
    private final static QName _ContactPersonCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPersonCEDS");
    private final static QName _AssessmentAdministration_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAdministration");
    private final static QName _Student_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "student");
    private final static QName _CteSections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteSections");
    private final static QName _CteStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteStudents");
    private final static QName _AeProvider_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeProvider");
    private final static QName _Assessments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessments");
    private final static QName _AssessmentItemCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentItemCEDS");
    private final static QName _LearningStandardAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardAssociation");
    private final static QName _FinancialReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "financialReport");
    private final static QName _CalendarCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "calendarCEDSs");
    private final static QName _Terms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "terms");
    private final static QName _AssessmentSummarys_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSummarys");
    private final static QName _Leas_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "leas");
    private final static QName _AssessmentForms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentForms");
    private final static QName _AssessmentSubtestResultCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSubtestResultCEDS");
    private final static QName _AssessmentScoreTable_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentScoreTable");
    private final static QName _AssessmentCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentCEDS");
    private final static QName _SectionRosterReports_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sectionRosterReports");
    private final static QName _AssessmentSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSummary");
    private final static QName _AssessmentRubric_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentRubric");
    private final static QName _LearningStandardDocumentCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardDocumentCEDS");
    private final static QName _AssessmentItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentItems");
    private final static QName _StaffSectionAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffSectionAssociation");
    private final static QName _LearningStandardItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardItem");
    private final static QName _AssessmentParticipantSessionCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentParticipantSessionCEDS");
    private final static QName _AssessmentFormCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentFormCEDS");
    private final static QName _LearningResources_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningResources");
    private final static QName _K12Sections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Sections");
    private final static QName _ParentGuardianCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "parentGuardianCEDSs");
    private final static QName _ContactPersonAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPersonAssociations");
    private final static QName _Facility_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "facility");
    private final static QName _AeStaff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeStaff");
    private final static QName _PartyOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "partyOrganizationAssociations");
    private final static QName _StudentSectionAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentSectionAssociation");
    private final static QName _AssessmentScoreSet_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentScoreSet");
    private final static QName _OrganizationOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "organizationOrganizationAssociations");
    private final static QName _RubricCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "rubricCEDS");
    private final static QName _Addresss_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "addresss");
    private final static QName _WfParticipant_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "wfParticipant");
    private final static QName _PsInstitution_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psInstitution");
    private final static QName _AeProviders_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeProviders");
    private final static QName _PsApplicants_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psApplicants");
    private final static QName _SchoolCalendars_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "schoolCalendars");
    private final static QName _AeSection_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "aeSection");
    private final static QName _AuthenticationIdentityProvider_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authenticationIdentityProvider");
    private final static QName _Assessment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessment");
    private final static QName _School_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "school");
    private final static QName _CrisisIncidentCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "crisisIncidentCEDS");
    private final static QName _Authentication_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authentication");
    private final static QName _PersonGroupAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "personGroupAssociation");
    private final static QName _CteCourses_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteCourses");
    private final static QName _ElChild_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elChild");
    private final static QName _ElClassGroup_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elClassGroup");
    private final static QName _LeaCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "leaCEDSs");
    private final static QName _Sea_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sea");
    private final static QName _Persons_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "persons");
    private final static QName _CrisisIncident_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "crisisIncident");
    private final static QName _FamilyCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "familyCEDSs");
    private final static QName _SeaCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "seaCEDS");
    private final static QName _ElStaff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elStaff");
    private final static QName _AssessmentSections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSections");
    private final static QName _AssessmentAssets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAssets");
    private final static QName _AssessmentAdministrationCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAdministrationCEDS");
    private final static QName _PsSections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psSections");
    private final static QName _Course_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "course");
    private final static QName _LearningStandardAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardAssociations");
    private final static QName _AssessmentSessionCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSessionCEDS");
    private final static QName _IncidentCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "incidentCEDSs");
    private final static QName _PeerRatingSystemCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "peerRatingSystemCEDS");
    private final static QName _K12Schools_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Schools");
    private final static QName _WfParticipants_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "wfParticipants");
    private final static QName _Person_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "person");
    private final static QName _StaffPersonAssignments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffPersonAssignments");
    private final static QName _UserOrganizationAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "userOrganizationAssociations");
    private final static QName _K12Organization_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Organization");
    private final static QName _CompetencySetCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "competencySetCEDS");
    private final static QName _StudentProgramAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentProgramAssociations");
    private final static QName _PsSection_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psSection");
    private final static QName _CteProgram_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteProgram");
    private final static QName _PsStudent_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psStudent");
    private final static QName _CtePrograms_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "ctePrograms");
    private final static QName _AssessmentItemAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentItemAssociation");
    private final static QName _ProgramCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "programCEDS");
    private final static QName _PersonRoleAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "personRoleAssociations");
    private final static QName _CrisisIncidentCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "crisisIncidentCEDSs");
    private final static QName _Programs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "programs");
    private final static QName _AssessmentAssetCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentAssetCEDS");
    private final static QName _StudentSectionAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentSectionAssociations");
    private final static QName _LearningStandardItemCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardItemCEDS");
    private final static QName _PsInstitutions_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psInstitutions");
    private final static QName _Sre_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sre");
    private final static QName _AssessmentResponseSet_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentResponseSet");
    private final static QName _AssessmentSessions_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSessions");
    private final static QName _K12Student_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Student");
    private final static QName _SchoolCalendarItems_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "schoolCalendarItems");
    private final static QName _Sections_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sections");
    private final static QName _LearningStandardDocuments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardDocuments");
    private final static QName _ContactPersonCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPersonCEDSs");
    private final static QName _UserOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "userOrganizationAssociation");
    private final static QName _AuthenticationIdentityProviders_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authenticationIdentityProviders");
    private final static QName _AssessmentItemAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentItemAssociations");
    private final static QName _FacilityCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "facilityCEDS");
    private final static QName _AssessmentItem_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentItem");
    private final static QName _AssessmentFamilyCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentFamilyCEDS");
    private final static QName _SectionRosterReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sectionRosterReport");
    private final static QName _AssessmentRegistrationCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentRegistrationCEDS");
    private final static QName _DisciplineIncidents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "disciplineIncidents");
    private final static QName _Lea_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "lea");
    private final static QName _LearningResourceCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningResourceCEDS");
    private final static QName _Facilitys_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "facilitys");
    private final static QName _AssessmentSubTest_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSubTest");
    private final static QName _AssessmentRegistrations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentRegistrations");
    private final static QName _CteStudent_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteStudent");
    private final static QName _Applications_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "applications");
    private final static QName _FinancialReports_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "financialReports");
    private final static QName _ContactRelationships_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactRelationships");
    private final static QName _AssessmentPerformanceLevelCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentPerformanceLevelCEDS");
    private final static QName _ElProgram_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elProgram");
    private final static QName _PsStaffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psStaffs");
    private final static QName _Schools_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "schools");
    private final static QName _Authorization_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authorization");
    private final static QName _PersonRoleAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "personRoleAssociation");
    private final static QName _LearningResourceCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningResourceCEDSs");
    private final static QName _PartyAddressAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "partyAddressAssociation");
    private final static QName _LearningStandardDocument_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningStandardDocument");
    private final static QName _K12Section_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Section");
    private final static QName _LearningGoalCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learningGoalCEDSs");
    private final static QName _ElStaffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elStaffs");
    private final static QName _PsStaff_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psStaff");
    private final static QName _ElOrganization_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elOrganization");
    private final static QName _PartyOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "partyOrganizationAssociation");
    private final static QName _ContactPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactPerson");
    private final static QName _ElAssessments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "elAssessments");
    private final static QName _K12Staffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Staffs");
    private final static QName _StudentCores_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentCores");
    private final static QName _ContactRelationship_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "contactRelationship");
    private final static QName _K12Courses_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12Courses");
    private final static QName _ParentGuardianCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "parentGuardianCEDS");
    private final static QName _Program_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "program");
    private final static QName _PsApplicant_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psApplicant");
    private final static QName _LeaCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "leaCEDS");
    private final static QName _AssessmentRubrics_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentRubrics");
    private final static QName _AssessmentSubtestCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSubtestCEDS");
    private final static QName _Authorizations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authorizations");
    private final static QName _AssessmentSubTests_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSubTests");
    private final static QName _AssessmentScoreSets_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentScoreSets");
    private final static QName _AssessmentSession_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSession");
    private final static QName _CteSection_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteSection");
    private final static QName _FamilyCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "familyCEDS");
    private final static QName _StudentSchoolAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentSchoolAssociations");
    private final static QName _PsAssessments_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "psAssessments");
    private final static QName _AssessmentSection_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSection");
    private final static QName _StudentProgramAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "studentProgramAssociation");
    private final static QName _Courses_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "courses");
    private final static QName _PartyAddressAssociations_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "partyAddressAssociations");
    private final static QName _WfQuarterlyEmploymentRecords_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "wfQuarterlyEmploymentRecords");
    private final static QName _WfQuarterlyEmploymentRecord_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "wfQuarterlyEmploymentRecord");
    private final static QName _CrisisIncidents_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "crisisIncidents");
    private final static QName _Group_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "group");
    private final static QName _OrganizationOrganizationAssociation_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "organizationOrganizationAssociation");
    private final static QName _AuthorizationApplication_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "authorizationApplication");
    private final static QName _CteCourse_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteCourse");
    private final static QName _Term_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "term");
    private final static QName _Address_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "address");
    private final static QName _LearnerActionCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "learnerActionCEDS");
    private final static QName _StaffPersonAssignment_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "staffPersonAssignment");
    private final static QName _Section_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "section");
    private final static QName _SeaCEDSs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "seaCEDSs");
    private final static QName _K12School_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "k12School");
    private final static QName _Students_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "students");
    private final static QName _CalendarCEDS_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "calendarCEDS");
    private final static QName _Application_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "application");
    private final static QName _CteStaffs_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "cteStaffs");
    private final static QName _AssessmentRubricTypeScoreList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoreList");
    private final static QName _AssessmentRubricTypeScoringGuideReference_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoringGuideReference");
    private final static QName _AssessmentRubricTypeRubricPublishDate_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "rubricPublishDate");
    private final static QName _AssessmentRubricTypeRubricIdentifierList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "rubricIdentifierList");
    private final static QName _AssessmentRubricTypeRubricVersion_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "rubricVersion");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "description");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "source");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValueFeedbackList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "feedbackList");
    private final static QName _AssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "passFailIndicator");
    private final static QName _LearningStandardAssociationTypeEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "endDate");
    private final static QName _LearningStandardAssociationTypeRefURI_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "refURI");
    private final static QName _LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "associationStrength");
    private final static QName _LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "associationType");
    private final static QName _GAbstractContentElementTypeReference_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "reference");
    private final static QName _GAbstractContentElementTypeTextData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "textData");
    private final static QName _GAbstractContentElementTypeBinaryData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "binaryData");
    private final static QName _GAbstractContentElementTypeXmlData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "xmlData");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreDescriptionList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoreDescriptionList");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCode_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoreCode");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCodeDefinition_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoreCodeDefinition");
    private final static QName _AssessmentRubricTypeScoreListScoreScoreCommentList_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "scoreCommentList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sif.dd.us32.model
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
     * Create an instance of {@link GDemographicsType }
     * 
     */
    public GDemographicsType createGDemographicsType() {
        return new GDemographicsType();
    }

    /**
     * Create an instance of {@link GLEAType }
     * 
     */
    public GLEAType createGLEAType() {
        return new GLEAType();
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
     * Create an instance of {@link GK12CourseType }
     * 
     */
    public GK12CourseType createGK12CourseType() {
        return new GK12CourseType();
    }

    /**
     * Create an instance of {@link GStudentType }
     * 
     */
    public GStudentType createGStudentType() {
        return new GStudentType();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType }
     * 
     */
    public GLearningStandardDocumentType createGLearningStandardDocumentType() {
        return new GLearningStandardDocumentType();
    }

    /**
     * Create an instance of {@link K12SchoolType }
     * 
     */
    public K12SchoolType createK12SchoolType() {
        return new K12SchoolType();
    }

    /**
     * Create an instance of {@link K12SchoolType.SessionList }
     * 
     */
    public K12SchoolType.SessionList createK12SchoolTypeSessionList() {
        return new K12SchoolType.SessionList();
    }

    /**
     * Create an instance of {@link K12SchoolType.Directory }
     * 
     */
    public K12SchoolType.Directory createK12SchoolTypeDirectory() {
        return new K12SchoolType.Directory();
    }

    /**
     * Create an instance of {@link K12SchoolType.PhoneNumberList }
     * 
     */
    public K12SchoolType.PhoneNumberList createK12SchoolTypePhoneNumberList() {
        return new K12SchoolType.PhoneNumberList();
    }

    /**
     * Create an instance of {@link K12SchoolType.AddressList }
     * 
     */
    public K12SchoolType.AddressList createK12SchoolTypeAddressList() {
        return new K12SchoolType.AddressList();
    }

    /**
     * Create an instance of {@link K12SchoolType.AddressList.Address }
     * 
     */
    public K12SchoolType.AddressList.Address createK12SchoolTypeAddressListAddress() {
        return new K12SchoolType.AddressList.Address();
    }

    /**
     * Create an instance of {@link CalendarCEDSType }
     * 
     */
    public CalendarCEDSType createCalendarCEDSType() {
        return new CalendarCEDSType();
    }

    /**
     * Create an instance of {@link CalendarCEDSType.EventList }
     * 
     */
    public CalendarCEDSType.EventList createCalendarCEDSTypeEventList() {
        return new CalendarCEDSType.EventList();
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
     * Create an instance of {@link PsStaffType }
     * 
     */
    public PsStaffType createPsStaffType() {
        return new PsStaffType();
    }

    /**
     * Create an instance of {@link PsStaffType.Contact }
     * 
     */
    public PsStaffType.Contact createPsStaffTypeContact() {
        return new PsStaffType.Contact();
    }

    /**
     * Create an instance of {@link PsStaffType.Contact.AddressList }
     * 
     */
    public PsStaffType.Contact.AddressList createPsStaffTypeContactAddressList() {
        return new PsStaffType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link PsStaffType.Contact.AddressList.Address }
     * 
     */
    public PsStaffType.Contact.AddressList.Address createPsStaffTypeContactAddressListAddress() {
        return new PsStaffType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link PsStaffType.Identity }
     * 
     */
    public PsStaffType.Identity createPsStaffTypeIdentity() {
        return new PsStaffType.Identity();
    }

    /**
     * Create an instance of {@link PsStaffType.Identity.OtherNameList }
     * 
     */
    public PsStaffType.Identity.OtherNameList createPsStaffTypeIdentityOtherNameList() {
        return new PsStaffType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link ElOrganizationType }
     * 
     */
    public ElOrganizationType createElOrganizationType() {
        return new ElOrganizationType();
    }

    /**
     * Create an instance of {@link ElOrganizationType.ElProgramList }
     * 
     */
    public ElOrganizationType.ElProgramList createElOrganizationTypeElProgramList() {
        return new ElOrganizationType.ElProgramList();
    }

    /**
     * Create an instance of {@link ElOrganizationType.HealthPromotion }
     * 
     */
    public ElOrganizationType.HealthPromotion createElOrganizationTypeHealthPromotion() {
        return new ElOrganizationType.HealthPromotion();
    }

    /**
     * Create an instance of {@link ElOrganizationType.PhoneNumberList }
     * 
     */
    public ElOrganizationType.PhoneNumberList createElOrganizationTypePhoneNumberList() {
        return new ElOrganizationType.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ElOrganizationType.AddressList }
     * 
     */
    public ElOrganizationType.AddressList createElOrganizationTypeAddressList() {
        return new ElOrganizationType.AddressList();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType }
     * 
     */
    public ParentGuardianCEDSType createParentGuardianCEDSType() {
        return new ParentGuardianCEDSType();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.EmailList }
     * 
     */
    public ParentGuardianCEDSType.EmailList createParentGuardianCEDSTypeEmailList() {
        return new ParentGuardianCEDSType.EmailList();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.PhoneNumberList }
     * 
     */
    public ParentGuardianCEDSType.PhoneNumberList createParentGuardianCEDSTypePhoneNumberList() {
        return new ParentGuardianCEDSType.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.AddressList }
     * 
     */
    public ParentGuardianCEDSType.AddressList createParentGuardianCEDSTypeAddressList() {
        return new ParentGuardianCEDSType.AddressList();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.AddressList.Address }
     * 
     */
    public ParentGuardianCEDSType.AddressList.Address createParentGuardianCEDSTypeAddressListAddress() {
        return new ParentGuardianCEDSType.AddressList.Address();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.OtherNameList }
     * 
     */
    public ParentGuardianCEDSType.OtherNameList createParentGuardianCEDSTypeOtherNameList() {
        return new ParentGuardianCEDSType.OtherNameList();
    }

    /**
     * Create an instance of {@link LeaCEDSType }
     * 
     */
    public LeaCEDSType createLeaCEDSType() {
        return new LeaCEDSType();
    }

    /**
     * Create an instance of {@link LeaCEDSType.PhoneNumberList }
     * 
     */
    public LeaCEDSType.PhoneNumberList createLeaCEDSTypePhoneNumberList() {
        return new LeaCEDSType.PhoneNumberList();
    }

    /**
     * Create an instance of {@link LeaCEDSType.AddressList }
     * 
     */
    public LeaCEDSType.AddressList createLeaCEDSTypeAddressList() {
        return new LeaCEDSType.AddressList();
    }

    /**
     * Create an instance of {@link LeaCEDSType.AddressList.Address }
     * 
     */
    public LeaCEDSType.AddressList.Address createLeaCEDSTypeAddressListAddress() {
        return new LeaCEDSType.AddressList.Address();
    }

    /**
     * Create an instance of {@link CteStudentType }
     * 
     */
    public CteStudentType createCteStudentType() {
        return new CteStudentType();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact }
     * 
     */
    public CteStudentType.Contact createCteStudentTypeContact() {
        return new CteStudentType.Contact();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.EmailList }
     * 
     */
    public CteStudentType.Contact.EmailList createCteStudentTypeContactEmailList() {
        return new CteStudentType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.PhoneNumberList }
     * 
     */
    public CteStudentType.Contact.PhoneNumberList createCteStudentTypeContactPhoneNumberList() {
        return new CteStudentType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.AddressList }
     * 
     */
    public CteStudentType.Contact.AddressList createCteStudentTypeContactAddressList() {
        return new CteStudentType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.AddressList.Address }
     * 
     */
    public CteStudentType.Contact.AddressList.Address createCteStudentTypeContactAddressListAddress() {
        return new CteStudentType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link CteStudentType.Identity }
     * 
     */
    public CteStudentType.Identity createCteStudentTypeIdentity() {
        return new CteStudentType.Identity();
    }

    /**
     * Create an instance of {@link CteStudentType.Identity.OtherNameList }
     * 
     */
    public CteStudentType.Identity.OtherNameList createCteStudentTypeIdentityOtherNameList() {
        return new CteStudentType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link K12SectionType }
     * 
     */
    public K12SectionType createK12SectionType() {
        return new K12SectionType();
    }

    /**
     * Create an instance of {@link K12SectionType.Enrollment }
     * 
     */
    public K12SectionType.Enrollment createK12SectionTypeEnrollment() {
        return new K12SectionType.Enrollment();
    }

    /**
     * Create an instance of {@link K12SectionType.Course }
     * 
     */
    public K12SectionType.Course createK12SectionTypeCourse() {
        return new K12SectionType.Course();
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
     * Create an instance of {@link LearningResourceCEDSType }
     * 
     */
    public LearningResourceCEDSType createLearningResourceCEDSType() {
        return new LearningResourceCEDSType();
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
     * Create an instance of {@link K12StudentType }
     * 
     */
    public K12StudentType createK12StudentType() {
        return new K12StudentType();
    }

    /**
     * Create an instance of {@link K12StudentType.EmploymentRecordList }
     * 
     */
    public K12StudentType.EmploymentRecordList createK12StudentTypeEmploymentRecordList() {
        return new K12StudentType.EmploymentRecordList();
    }

    /**
     * Create an instance of {@link K12StudentType.HealthRecordList }
     * 
     */
    public K12StudentType.HealthRecordList createK12StudentTypeHealthRecordList() {
        return new K12StudentType.HealthRecordList();
    }

    /**
     * Create an instance of {@link K12StudentType.IndividualizedProgramList }
     * 
     */
    public K12StudentType.IndividualizedProgramList createK12StudentTypeIndividualizedProgramList() {
        return new K12StudentType.IndividualizedProgramList();
    }

    /**
     * Create an instance of {@link K12StudentType.ProgramList }
     * 
     */
    public K12StudentType.ProgramList createK12StudentTypeProgramList() {
        return new K12StudentType.ProgramList();
    }

    /**
     * Create an instance of {@link K12StudentType.LanguageList }
     * 
     */
    public K12StudentType.LanguageList createK12StudentTypeLanguageList() {
        return new K12StudentType.LanguageList();
    }

    /**
     * Create an instance of {@link K12StudentType.DisciplineEventList }
     * 
     */
    public K12StudentType.DisciplineEventList createK12StudentTypeDisciplineEventList() {
        return new K12StudentType.DisciplineEventList();
    }

    /**
     * Create an instance of {@link K12StudentType.Attendance }
     * 
     */
    public K12StudentType.Attendance createK12StudentTypeAttendance() {
        return new K12StudentType.Attendance();
    }

    /**
     * Create an instance of {@link K12StudentType.Attendance.AttendanceEventList }
     * 
     */
    public K12StudentType.Attendance.AttendanceEventList createK12StudentTypeAttendanceAttendanceEventList() {
        return new K12StudentType.Attendance.AttendanceEventList();
    }

    /**
     * Create an instance of {@link K12StudentType.CourseList }
     * 
     */
    public K12StudentType.CourseList createK12StudentTypeCourseList() {
        return new K12StudentType.CourseList();
    }

    /**
     * Create an instance of {@link K12StudentType.ActivityList }
     * 
     */
    public K12StudentType.ActivityList createK12StudentTypeActivityList() {
        return new K12StudentType.ActivityList();
    }

    /**
     * Create an instance of {@link K12StudentType.EnrollmentList }
     * 
     */
    public K12StudentType.EnrollmentList createK12StudentTypeEnrollmentList() {
        return new K12StudentType.EnrollmentList();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact }
     * 
     */
    public K12StudentType.Contact createK12StudentTypeContact() {
        return new K12StudentType.Contact();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.EmailList }
     * 
     */
    public K12StudentType.Contact.EmailList createK12StudentTypeContactEmailList() {
        return new K12StudentType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.PhoneNumberList }
     * 
     */
    public K12StudentType.Contact.PhoneNumberList createK12StudentTypeContactPhoneNumberList() {
        return new K12StudentType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.AddressList }
     * 
     */
    public K12StudentType.Contact.AddressList createK12StudentTypeContactAddressList() {
        return new K12StudentType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.AddressList.Address }
     * 
     */
    public K12StudentType.Contact.AddressList.Address createK12StudentTypeContactAddressListAddress() {
        return new K12StudentType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link K12StudentType.Identity }
     * 
     */
    public K12StudentType.Identity createK12StudentTypeIdentity() {
        return new K12StudentType.Identity();
    }

    /**
     * Create an instance of {@link K12StudentType.Identity.OtherNameList }
     * 
     */
    public K12StudentType.Identity.OtherNameList createK12StudentTypeIdentityOtherNameList() {
        return new K12StudentType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link LearningStandardItemCEDSType }
     * 
     */
    public LearningStandardItemCEDSType createLearningStandardItemCEDSType() {
        return new LearningStandardItemCEDSType();
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
     * Create an instance of {@link SreType.DisciplineIncidents }
     * 
     */
    public SreType.DisciplineIncidents createSreTypeDisciplineIncidents() {
        return new SreType.DisciplineIncidents();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidents.DisciplineIncident }
     * 
     */
    public SreType.DisciplineIncidents.DisciplineIncident createSreTypeDisciplineIncidentsDisciplineIncident() {
        return new SreType.DisciplineIncidents.DisciplineIncident();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList }
     * 
     */
    public SreType.DisciplineIncidents.DisciplineIncident.ActionList createSreTypeDisciplineIncidentsDisciplineIncidentActionList() {
        return new SreType.DisciplineIncidents.DisciplineIncident.ActionList();
    }

    /**
     * Create an instance of {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action }
     * 
     */
    public SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action createSreTypeDisciplineIncidentsDisciplineIncidentActionListAction() {
        return new SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action();
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
     * Create an instance of {@link FacilityCEDSType }
     * 
     */
    public FacilityCEDSType createFacilityCEDSType() {
        return new FacilityCEDSType();
    }

    /**
     * Create an instance of {@link FacilityCEDSType.BuildingList }
     * 
     */
    public FacilityCEDSType.BuildingList createFacilityCEDSTypeBuildingList() {
        return new FacilityCEDSType.BuildingList();
    }

    /**
     * Create an instance of {@link FacilityCEDSType.AddressList }
     * 
     */
    public FacilityCEDSType.AddressList createFacilityCEDSTypeAddressList() {
        return new FacilityCEDSType.AddressList();
    }

    /**
     * Create an instance of {@link FacilityCEDSType.AddressList.Address }
     * 
     */
    public FacilityCEDSType.AddressList.Address createFacilityCEDSTypeAddressListAddress() {
        return new FacilityCEDSType.AddressList.Address();
    }

    /**
     * Create an instance of {@link PsStudentType }
     * 
     */
    public PsStudentType createPsStudentType() {
        return new PsStudentType();
    }

    /**
     * Create an instance of {@link PsStudentType.ProgramList }
     * 
     */
    public PsStudentType.ProgramList createPsStudentTypeProgramList() {
        return new PsStudentType.ProgramList();
    }

    /**
     * Create an instance of {@link PsStudentType.GraduateStudent }
     * 
     */
    public PsStudentType.GraduateStudent createPsStudentTypeGraduateStudent() {
        return new PsStudentType.GraduateStudent();
    }

    /**
     * Create an instance of {@link PsStudentType.GraduateStudent.AdvisorList }
     * 
     */
    public PsStudentType.GraduateStudent.AdvisorList createPsStudentTypeGraduateStudentAdvisorList() {
        return new PsStudentType.GraduateStudent.AdvisorList();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact }
     * 
     */
    public PsStudentType.Contact createPsStudentTypeContact() {
        return new PsStudentType.Contact();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.EmailList }
     * 
     */
    public PsStudentType.Contact.EmailList createPsStudentTypeContactEmailList() {
        return new PsStudentType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.PhoneNumberList }
     * 
     */
    public PsStudentType.Contact.PhoneNumberList createPsStudentTypeContactPhoneNumberList() {
        return new PsStudentType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.AddressList }
     * 
     */
    public PsStudentType.Contact.AddressList createPsStudentTypeContactAddressList() {
        return new PsStudentType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.AddressList.Address }
     * 
     */
    public PsStudentType.Contact.AddressList.Address createPsStudentTypeContactAddressListAddress() {
        return new PsStudentType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link PsStudentType.Identity }
     * 
     */
    public PsStudentType.Identity createPsStudentTypeIdentity() {
        return new PsStudentType.Identity();
    }

    /**
     * Create an instance of {@link PsStudentType.Identity.OtherNameList }
     * 
     */
    public PsStudentType.Identity.OtherNameList createPsStudentTypeIdentityOtherNameList() {
        return new PsStudentType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link PsSectionType }
     * 
     */
    public PsSectionType createPsSectionType() {
        return new PsSectionType();
    }

    /**
     * Create an instance of {@link PsSectionType.EnrollmentList }
     * 
     */
    public PsSectionType.EnrollmentList createPsSectionTypeEnrollmentList() {
        return new PsSectionType.EnrollmentList();
    }

    /**
     * Create an instance of {@link PsSectionType.EnrollmentList.Enrollment }
     * 
     */
    public PsSectionType.EnrollmentList.Enrollment createPsSectionTypeEnrollmentListEnrollment() {
        return new PsSectionType.EnrollmentList.Enrollment();
    }

    /**
     * Create an instance of {@link ProgramCEDSType }
     * 
     */
    public ProgramCEDSType createProgramCEDSType() {
        return new ProgramCEDSType();
    }

    /**
     * Create an instance of {@link ProgramCEDSType.AddressList }
     * 
     */
    public ProgramCEDSType.AddressList createProgramCEDSTypeAddressList() {
        return new ProgramCEDSType.AddressList();
    }

    /**
     * Create an instance of {@link ProgramCEDSType.AddressList.Address }
     * 
     */
    public ProgramCEDSType.AddressList.Address createProgramCEDSTypeAddressListAddress() {
        return new ProgramCEDSType.AddressList.Address();
    }

    /**
     * Create an instance of {@link SeaCEDSType }
     * 
     */
    public SeaCEDSType createSeaCEDSType() {
        return new SeaCEDSType();
    }

    /**
     * Create an instance of {@link SeaCEDSType.FederalFunds }
     * 
     */
    public SeaCEDSType.FederalFunds createSeaCEDSTypeFederalFunds() {
        return new SeaCEDSType.FederalFunds();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact }
     * 
     */
    public SeaCEDSType.Contact createSeaCEDSTypeContact() {
        return new SeaCEDSType.Contact();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.OtherNameList }
     * 
     */
    public SeaCEDSType.Contact.OtherNameList createSeaCEDSTypeContactOtherNameList() {
        return new SeaCEDSType.Contact.OtherNameList();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.AddressList }
     * 
     */
    public SeaCEDSType.Contact.AddressList createSeaCEDSTypeContactAddressList() {
        return new SeaCEDSType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.AddressList.Address }
     * 
     */
    public SeaCEDSType.Contact.AddressList.Address createSeaCEDSTypeContactAddressListAddress() {
        return new SeaCEDSType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link SeaCEDSType.AddressList }
     * 
     */
    public SeaCEDSType.AddressList createSeaCEDSTypeAddressList() {
        return new SeaCEDSType.AddressList();
    }

    /**
     * Create an instance of {@link SeaCEDSType.AddressList.Address }
     * 
     */
    public SeaCEDSType.AddressList.Address createSeaCEDSTypeAddressListAddress() {
        return new SeaCEDSType.AddressList.Address();
    }

    /**
     * Create an instance of {@link ElStaffType }
     * 
     */
    public ElStaffType createElStaffType() {
        return new ElStaffType();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopmentActivity }
     * 
     */
    public ElStaffType.ProfessionalDevelopmentActivity createElStaffTypeProfessionalDevelopmentActivity() {
        return new ElStaffType.ProfessionalDevelopmentActivity();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopment }
     * 
     */
    public ElStaffType.ProfessionalDevelopment createElStaffTypeProfessionalDevelopment() {
        return new ElStaffType.ProfessionalDevelopment();
    }

    /**
     * Create an instance of {@link ElStaffType.LanguageList }
     * 
     */
    public ElStaffType.LanguageList createElStaffTypeLanguageList() {
        return new ElStaffType.LanguageList();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact }
     * 
     */
    public ElStaffType.Contact createElStaffTypeContact() {
        return new ElStaffType.Contact();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.EmailList }
     * 
     */
    public ElStaffType.Contact.EmailList createElStaffTypeContactEmailList() {
        return new ElStaffType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.PhoneNumberList }
     * 
     */
    public ElStaffType.Contact.PhoneNumberList createElStaffTypeContactPhoneNumberList() {
        return new ElStaffType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.AddressList }
     * 
     */
    public ElStaffType.Contact.AddressList createElStaffTypeContactAddressList() {
        return new ElStaffType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.AddressList.Address }
     * 
     */
    public ElStaffType.Contact.AddressList.Address createElStaffTypeContactAddressListAddress() {
        return new ElStaffType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link ElStaffType.Identity }
     * 
     */
    public ElStaffType.Identity createElStaffTypeIdentity() {
        return new ElStaffType.Identity();
    }

    /**
     * Create an instance of {@link ElStaffType.Identity.OtherNameList }
     * 
     */
    public ElStaffType.Identity.OtherNameList createElStaffTypeIdentityOtherNameList() {
        return new ElStaffType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link K12OrganizationType }
     * 
     */
    public K12OrganizationType createK12OrganizationType() {
        return new K12OrganizationType();
    }

    /**
     * Create an instance of {@link K12OrganizationType.AddressList }
     * 
     */
    public K12OrganizationType.AddressList createK12OrganizationTypeAddressList() {
        return new K12OrganizationType.AddressList();
    }

    /**
     * Create an instance of {@link K12OrganizationType.AddressList.Address }
     * 
     */
    public K12OrganizationType.AddressList.Address createK12OrganizationTypeAddressListAddress() {
        return new K12OrganizationType.AddressList.Address();
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
     * Create an instance of {@link ElChildType }
     * 
     */
    public ElChildType createElChildType() {
        return new ElChildType();
    }

    /**
     * Create an instance of {@link ElChildType.IndiviualizedProgramsList }
     * 
     */
    public ElChildType.IndiviualizedProgramsList createElChildTypeIndiviualizedProgramsList() {
        return new ElChildType.IndiviualizedProgramsList();
    }

    /**
     * Create an instance of {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram }
     * 
     */
    public ElChildType.IndiviualizedProgramsList.IndividualizedProgram createElChildTypeIndiviualizedProgramsListIndividualizedProgram() {
        return new ElChildType.IndiviualizedProgramsList.IndividualizedProgram();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList }
     * 
     */
    public ElChildType.ElEducationalExperienceList createElChildTypeElEducationalExperienceList() {
        return new ElChildType.ElEducationalExperienceList();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience }
     * 
     */
    public ElChildType.ElEducationalExperienceList.ElEducationalExperience createElChildTypeElEducationalExperienceListElEducationalExperience() {
        return new ElChildType.ElEducationalExperienceList.ElEducationalExperience();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList }
     * 
     */
    public ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList createElChildTypeElEducationalExperienceListElEducationalExperienceSpecialEducationServiceList() {
        return new ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList();
    }

    /**
     * Create an instance of {@link ElChildType.LanguageList }
     * 
     */
    public ElChildType.LanguageList createElChildTypeLanguageList() {
        return new ElChildType.LanguageList();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation }
     * 
     */
    public ElChildType.HealthInformation createElChildTypeHealthInformation() {
        return new ElChildType.HealthInformation();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.DentalScreeningList }
     * 
     */
    public ElChildType.HealthInformation.DentalScreeningList createElChildTypeHealthInformationDentalScreeningList() {
        return new ElChildType.HealthInformation.DentalScreeningList();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.HearingScreeningList }
     * 
     */
    public ElChildType.HealthInformation.HearingScreeningList createElChildTypeHealthInformationHearingScreeningList() {
        return new ElChildType.HealthInformation.HearingScreeningList();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.VisonScreeningList }
     * 
     */
    public ElChildType.HealthInformation.VisonScreeningList createElChildTypeHealthInformationVisonScreeningList() {
        return new ElChildType.HealthInformation.VisonScreeningList();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.ImmunizationList }
     * 
     */
    public ElChildType.HealthInformation.ImmunizationList createElChildTypeHealthInformationImmunizationList() {
        return new ElChildType.HealthInformation.ImmunizationList();
    }

    /**
     * Create an instance of {@link ElChildType.Contact }
     * 
     */
    public ElChildType.Contact createElChildTypeContact() {
        return new ElChildType.Contact();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.EmailList }
     * 
     */
    public ElChildType.Contact.EmailList createElChildTypeContactEmailList() {
        return new ElChildType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.PhoneNumberList }
     * 
     */
    public ElChildType.Contact.PhoneNumberList createElChildTypeContactPhoneNumberList() {
        return new ElChildType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.AddressList }
     * 
     */
    public ElChildType.Contact.AddressList createElChildTypeContactAddressList() {
        return new ElChildType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.AddressList.Address }
     * 
     */
    public ElChildType.Contact.AddressList.Address createElChildTypeContactAddressListAddress() {
        return new ElChildType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link ElChildType.Identity }
     * 
     */
    public ElChildType.Identity createElChildTypeIdentity() {
        return new ElChildType.Identity();
    }

    /**
     * Create an instance of {@link ElChildType.Identity.OtherNameList }
     * 
     */
    public ElChildType.Identity.OtherNameList createElChildTypeIdentityOtherNameList() {
        return new ElChildType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link ElClassGroupType }
     * 
     */
    public ElClassGroupType createElClassGroupType() {
        return new ElClassGroupType();
    }

    /**
     * Create an instance of {@link SeaType }
     * 
     */
    public SeaType createSeaType() {
        return new SeaType();
    }

    /**
     * Create an instance of {@link AssessmentFormCEDSType }
     * 
     */
    public AssessmentFormCEDSType createAssessmentFormCEDSType() {
        return new AssessmentFormCEDSType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link AeStaffType }
     * 
     */
    public AeStaffType createAeStaffType() {
        return new AeStaffType();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact }
     * 
     */
    public AeStaffType.Contact createAeStaffTypeContact() {
        return new AeStaffType.Contact();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.EmailList }
     * 
     */
    public AeStaffType.Contact.EmailList createAeStaffTypeContactEmailList() {
        return new AeStaffType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.PhoneNumberList }
     * 
     */
    public AeStaffType.Contact.PhoneNumberList createAeStaffTypeContactPhoneNumberList() {
        return new AeStaffType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.AddressList }
     * 
     */
    public AeStaffType.Contact.AddressList createAeStaffTypeContactAddressList() {
        return new AeStaffType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.AddressList.Address }
     * 
     */
    public AeStaffType.Contact.AddressList.Address createAeStaffTypeContactAddressListAddress() {
        return new AeStaffType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link AeStaffType.Identity }
     * 
     */
    public AeStaffType.Identity createAeStaffTypeIdentity() {
        return new AeStaffType.Identity();
    }

    /**
     * Create an instance of {@link AeStaffType.Identity.OtherNameList }
     * 
     */
    public AeStaffType.Identity.OtherNameList createAeStaffTypeIdentityOtherNameList() {
        return new AeStaffType.Identity.OtherNameList();
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
     * Create an instance of {@link WfParticipantType }
     * 
     */
    public WfParticipantType createWfParticipantType() {
        return new WfParticipantType();
    }

    /**
     * Create an instance of {@link WfParticipantType.ProgramParticipationList }
     * 
     */
    public WfParticipantType.ProgramParticipationList createWfParticipantTypeProgramParticipationList() {
        return new WfParticipantType.ProgramParticipationList();
    }

    /**
     * Create an instance of {@link WfParticipantType.Identity }
     * 
     */
    public WfParticipantType.Identity createWfParticipantTypeIdentity() {
        return new WfParticipantType.Identity();
    }

    /**
     * Create an instance of {@link WfParticipantType.Identity.OtherNameList }
     * 
     */
    public WfParticipantType.Identity.OtherNameList createWfParticipantTypeIdentityOtherNameList() {
        return new WfParticipantType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link PsInstitutionType }
     * 
     */
    public PsInstitutionType createPsInstitutionType() {
        return new PsInstitutionType();
    }

    /**
     * Create an instance of {@link PsInstitutionType.AddressList }
     * 
     */
    public PsInstitutionType.AddressList createPsInstitutionTypeAddressList() {
        return new PsInstitutionType.AddressList();
    }

    /**
     * Create an instance of {@link PsInstitutionType.AddressList.Address }
     * 
     */
    public PsInstitutionType.AddressList.Address createPsInstitutionTypeAddressListAddress() {
        return new PsInstitutionType.AddressList.Address();
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
     * Create an instance of {@link PsContactPersonType }
     * 
     */
    public PsContactPersonType createPsContactPersonType() {
        return new PsContactPersonType();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact }
     * 
     */
    public PsContactPersonType.Contact createPsContactPersonTypeContact() {
        return new PsContactPersonType.Contact();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.EmailList }
     * 
     */
    public PsContactPersonType.Contact.EmailList createPsContactPersonTypeContactEmailList() {
        return new PsContactPersonType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.PhoneNumberList }
     * 
     */
    public PsContactPersonType.Contact.PhoneNumberList createPsContactPersonTypeContactPhoneNumberList() {
        return new PsContactPersonType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.AddressList }
     * 
     */
    public PsContactPersonType.Contact.AddressList createPsContactPersonTypeContactAddressList() {
        return new PsContactPersonType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.AddressList.Address }
     * 
     */
    public PsContactPersonType.Contact.AddressList.Address createPsContactPersonTypeContactAddressListAddress() {
        return new PsContactPersonType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Identity }
     * 
     */
    public PsContactPersonType.Identity createPsContactPersonTypeIdentity() {
        return new PsContactPersonType.Identity();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Identity.OtherNameList }
     * 
     */
    public PsContactPersonType.Identity.OtherNameList createPsContactPersonTypeIdentityOtherNameList() {
        return new PsContactPersonType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType }
     * 
     */
    public ContactPersonCEDSType createContactPersonCEDSType() {
        return new ContactPersonCEDSType();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact }
     * 
     */
    public ContactPersonCEDSType.Contact createContactPersonCEDSTypeContact() {
        return new ContactPersonCEDSType.Contact();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.EmailList }
     * 
     */
    public ContactPersonCEDSType.Contact.EmailList createContactPersonCEDSTypeContactEmailList() {
        return new ContactPersonCEDSType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.PhoneNumberList }
     * 
     */
    public ContactPersonCEDSType.Contact.PhoneNumberList createContactPersonCEDSTypeContactPhoneNumberList() {
        return new ContactPersonCEDSType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.AddressList }
     * 
     */
    public ContactPersonCEDSType.Contact.AddressList createContactPersonCEDSTypeContactAddressList() {
        return new ContactPersonCEDSType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.AddressList.Address }
     * 
     */
    public ContactPersonCEDSType.Contact.AddressList.Address createContactPersonCEDSTypeContactAddressListAddress() {
        return new ContactPersonCEDSType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Identity }
     * 
     */
    public ContactPersonCEDSType.Identity createContactPersonCEDSTypeIdentity() {
        return new ContactPersonCEDSType.Identity();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Identity.OtherNameList }
     * 
     */
    public ContactPersonCEDSType.Identity.OtherNameList createContactPersonCEDSTypeIdentityOtherNameList() {
        return new ContactPersonCEDSType.Identity.OtherNameList();
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
     * Create an instance of {@link AssessmentItemCEDSType }
     * 
     */
    public AssessmentItemCEDSType createAssessmentItemCEDSType() {
        return new AssessmentItemCEDSType();
    }

    /**
     * Create an instance of {@link K12StaffType }
     * 
     */
    public K12StaffType createK12StaffType() {
        return new K12StaffType();
    }

    /**
     * Create an instance of {@link K12StaffType.ProfessionalDevelopmentActivity }
     * 
     */
    public K12StaffType.ProfessionalDevelopmentActivity createK12StaffTypeProfessionalDevelopmentActivity() {
        return new K12StaffType.ProfessionalDevelopmentActivity();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact }
     * 
     */
    public K12StaffType.Contact createK12StaffTypeContact() {
        return new K12StaffType.Contact();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.EmailList }
     * 
     */
    public K12StaffType.Contact.EmailList createK12StaffTypeContactEmailList() {
        return new K12StaffType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.PhoneNumberList }
     * 
     */
    public K12StaffType.Contact.PhoneNumberList createK12StaffTypeContactPhoneNumberList() {
        return new K12StaffType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.AddressList }
     * 
     */
    public K12StaffType.Contact.AddressList createK12StaffTypeContactAddressList() {
        return new K12StaffType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.AddressList.Address }
     * 
     */
    public K12StaffType.Contact.AddressList.Address createK12StaffTypeContactAddressListAddress() {
        return new K12StaffType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link K12StaffType.Identity }
     * 
     */
    public K12StaffType.Identity createK12StaffTypeIdentity() {
        return new K12StaffType.Identity();
    }

    /**
     * Create an instance of {@link K12StaffType.Identity.OtherNameList }
     * 
     */
    public K12StaffType.Identity.OtherNameList createK12StaffTypeIdentityOtherNameList() {
        return new K12StaffType.Identity.OtherNameList();
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
     * Create an instance of {@link ElContactPersonType }
     * 
     */
    public ElContactPersonType createElContactPersonType() {
        return new ElContactPersonType();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact }
     * 
     */
    public ElContactPersonType.Contact createElContactPersonTypeContact() {
        return new ElContactPersonType.Contact();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.EmailList }
     * 
     */
    public ElContactPersonType.Contact.EmailList createElContactPersonTypeContactEmailList() {
        return new ElContactPersonType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.PhoneNumberList }
     * 
     */
    public ElContactPersonType.Contact.PhoneNumberList createElContactPersonTypeContactPhoneNumberList() {
        return new ElContactPersonType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.AddressList }
     * 
     */
    public ElContactPersonType.Contact.AddressList createElContactPersonTypeContactAddressList() {
        return new ElContactPersonType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.AddressList.Address }
     * 
     */
    public ElContactPersonType.Contact.AddressList.Address createElContactPersonTypeContactAddressListAddress() {
        return new ElContactPersonType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Identity }
     * 
     */
    public ElContactPersonType.Identity createElContactPersonTypeIdentity() {
        return new ElContactPersonType.Identity();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Identity.OtherNameList }
     * 
     */
    public ElContactPersonType.Identity.OtherNameList createElContactPersonTypeIdentityOtherNameList() {
        return new ElContactPersonType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link CteStaffType }
     * 
     */
    public CteStaffType createCteStaffType() {
        return new CteStaffType();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact }
     * 
     */
    public CteStaffType.Contact createCteStaffTypeContact() {
        return new CteStaffType.Contact();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.EmailList }
     * 
     */
    public CteStaffType.Contact.EmailList createCteStaffTypeContactEmailList() {
        return new CteStaffType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.PhoneNumberList }
     * 
     */
    public CteStaffType.Contact.PhoneNumberList createCteStaffTypeContactPhoneNumberList() {
        return new CteStaffType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.AddressList }
     * 
     */
    public CteStaffType.Contact.AddressList createCteStaffTypeContactAddressList() {
        return new CteStaffType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.AddressList.Address }
     * 
     */
    public CteStaffType.Contact.AddressList.Address createCteStaffTypeContactAddressListAddress() {
        return new CteStaffType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link CteStaffType.Identity }
     * 
     */
    public CteStaffType.Identity createCteStaffTypeIdentity() {
        return new CteStaffType.Identity();
    }

    /**
     * Create an instance of {@link CteStaffType.Identity.OtherNameList }
     * 
     */
    public CteStaffType.Identity.OtherNameList createCteStaffTypeIdentityOtherNameList() {
        return new CteStaffType.Identity.OtherNameList();
    }

    /**
     * Create an instance of {@link ElAssessmentType }
     * 
     */
    public ElAssessmentType createElAssessmentType() {
        return new ElAssessmentType();
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
     * Create an instance of {@link AssessmentPersonalNeedsProfileCEDSType }
     * 
     */
    public AssessmentPersonalNeedsProfileCEDSType createAssessmentPersonalNeedsProfileCEDSType() {
        return new AssessmentPersonalNeedsProfileCEDSType();
    }

    /**
     * Create an instance of {@link AeStudentType }
     * 
     */
    public AeStudentType createAeStudentType() {
        return new AeStudentType();
    }

    /**
     * Create an instance of {@link AeStudentType.AeProgramList }
     * 
     */
    public AeStudentType.AeProgramList createAeStudentTypeAeProgramList() {
        return new AeStudentType.AeProgramList();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact }
     * 
     */
    public AeStudentType.Contact createAeStudentTypeContact() {
        return new AeStudentType.Contact();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.EmailList }
     * 
     */
    public AeStudentType.Contact.EmailList createAeStudentTypeContactEmailList() {
        return new AeStudentType.Contact.EmailList();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.PhoneNumberList }
     * 
     */
    public AeStudentType.Contact.PhoneNumberList createAeStudentTypeContactPhoneNumberList() {
        return new AeStudentType.Contact.PhoneNumberList();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.AddressList }
     * 
     */
    public AeStudentType.Contact.AddressList createAeStudentTypeContactAddressList() {
        return new AeStudentType.Contact.AddressList();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.AddressList.Address }
     * 
     */
    public AeStudentType.Contact.AddressList.Address createAeStudentTypeContactAddressListAddress() {
        return new AeStudentType.Contact.AddressList.Address();
    }

    /**
     * Create an instance of {@link AeStudentType.Identity }
     * 
     */
    public AeStudentType.Identity createAeStudentTypeIdentity() {
        return new AeStudentType.Identity();
    }

    /**
     * Create an instance of {@link AeStudentType.Identity.OtherNameList }
     * 
     */
    public AeStudentType.Identity.OtherNameList createAeStudentTypeIdentityOtherNameList() {
        return new AeStudentType.Identity.OtherNameList();
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
     * Create an instance of {@link PsStudentCollectionType }
     * 
     */
    public PsStudentCollectionType createPsStudentCollectionType() {
        return new PsStudentCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonCollectionType }
     * 
     */
    public ContactPersonCollectionType createContactPersonCollectionType() {
        return new ContactPersonCollectionType();
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
     * Create an instance of {@link SchoolCalendarType }
     * 
     */
    public SchoolCalendarType createSchoolCalendarType() {
        return new SchoolCalendarType();
    }

    /**
     * Create an instance of {@link AeStudentCollectionType }
     * 
     */
    public AeStudentCollectionType createAeStudentCollectionType() {
        return new AeStudentCollectionType();
    }

    /**
     * Create an instance of {@link PsAssessmentType }
     * 
     */
    public PsAssessmentType createPsAssessmentType() {
        return new PsAssessmentType();
    }

    /**
     * Create an instance of {@link SreCollectionType }
     * 
     */
    public SreCollectionType createSreCollectionType() {
        return new SreCollectionType();
    }

    /**
     * Create an instance of {@link ProgramCEDSCollectionType }
     * 
     */
    public ProgramCEDSCollectionType createProgramCEDSCollectionType() {
        return new ProgramCEDSCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationCollectionType }
     * 
     */
    public AssessmentAdministrationCollectionType createAssessmentAdministrationCollectionType() {
        return new AssessmentAdministrationCollectionType();
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
     * Create an instance of {@link AchievementCEDSType }
     * 
     */
    public AchievementCEDSType createAchievementCEDSType() {
        return new AchievementCEDSType();
    }

    /**
     * Create an instance of {@link K12StudentCollectionType }
     * 
     */
    public K12StudentCollectionType createK12StudentCollectionType() {
        return new K12StudentCollectionType();
    }

    /**
     * Create an instance of {@link ElOrganizationCollectionType }
     * 
     */
    public ElOrganizationCollectionType createElOrganizationCollectionType() {
        return new ElOrganizationCollectionType();
    }

    /**
     * Create an instance of {@link IncidentCEDSType }
     * 
     */
    public IncidentCEDSType createIncidentCEDSType() {
        return new IncidentCEDSType();
    }

    /**
     * Create an instance of {@link AssessmentScoreTableCollectionType }
     * 
     */
    public AssessmentScoreTableCollectionType createAssessmentScoreTableCollectionType() {
        return new AssessmentScoreTableCollectionType();
    }

    /**
     * Create an instance of {@link ElChildCollectionType }
     * 
     */
    public ElChildCollectionType createElChildCollectionType() {
        return new ElChildCollectionType();
    }

    /**
     * Create an instance of {@link FacilityCEDSCollectionType }
     * 
     */
    public FacilityCEDSCollectionType createFacilityCEDSCollectionType() {
        return new FacilityCEDSCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonAssociationType }
     * 
     */
    public ContactPersonAssociationType createContactPersonAssociationType() {
        return new ContactPersonAssociationType();
    }

    /**
     * Create an instance of {@link StudentSchoolAssociationType }
     * 
     */
    public StudentSchoolAssociationType createStudentSchoolAssociationType() {
        return new StudentSchoolAssociationType();
    }

    /**
     * Create an instance of {@link AchievementCEDSCollectionType }
     * 
     */
    public AchievementCEDSCollectionType createAchievementCEDSCollectionType() {
        return new AchievementCEDSCollectionType();
    }

    /**
     * Create an instance of {@link AeProgramCollectionType }
     * 
     */
    public AeProgramCollectionType createAeProgramCollectionType() {
        return new AeProgramCollectionType();
    }

    /**
     * Create an instance of {@link AuthorizationApplicationCollectionType }
     * 
     */
    public AuthorizationApplicationCollectionType createAuthorizationApplicationCollectionType() {
        return new AuthorizationApplicationCollectionType();
    }

    /**
     * Create an instance of {@link K12CourseType }
     * 
     */
    public K12CourseType createK12CourseType() {
        return new K12CourseType();
    }

    /**
     * Create an instance of {@link LearnerActivityCEDSType }
     * 
     */
    public LearnerActivityCEDSType createLearnerActivityCEDSType() {
        return new LearnerActivityCEDSType();
    }

    /**
     * Create an instance of {@link AeSectionCollectionType }
     * 
     */
    public AeSectionCollectionType createAeSectionCollectionType() {
        return new AeSectionCollectionType();
    }

    /**
     * Create an instance of {@link StaffSectionAssociationCollectionType }
     * 
     */
    public StaffSectionAssociationCollectionType createStaffSectionAssociationCollectionType() {
        return new StaffSectionAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AeProgramType }
     * 
     */
    public AeProgramType createAeProgramType() {
        return new AeProgramType();
    }

    /**
     * Create an instance of {@link LearningGoalCEDSType }
     * 
     */
    public LearningGoalCEDSType createLearningGoalCEDSType() {
        return new LearningGoalCEDSType();
    }

    /**
     * Create an instance of {@link ElClassGroupCollectionType }
     * 
     */
    public ElClassGroupCollectionType createElClassGroupCollectionType() {
        return new ElClassGroupCollectionType();
    }

    /**
     * Create an instance of {@link AeStaffCollectionType }
     * 
     */
    public AeStaffCollectionType createAeStaffCollectionType() {
        return new AeStaffCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentCollectionType }
     * 
     */
    public AssessmentCollectionType createAssessmentCollectionType() {
        return new AssessmentCollectionType();
    }

    /**
     * Create an instance of {@link CalendarCEDSCollectionType }
     * 
     */
    public CalendarCEDSCollectionType createCalendarCEDSCollectionType() {
        return new CalendarCEDSCollectionType();
    }

    /**
     * Create an instance of {@link TermCollectionType }
     * 
     */
    public TermCollectionType createTermCollectionType() {
        return new TermCollectionType();
    }

    /**
     * Create an instance of {@link AeProviderType }
     * 
     */
    public AeProviderType createAeProviderType() {
        return new AeProviderType();
    }

    /**
     * Create an instance of {@link CteStudentCollectionType }
     * 
     */
    public CteStudentCollectionType createCteStudentCollectionType() {
        return new CteStudentCollectionType();
    }

    /**
     * Create an instance of {@link CteSectionCollectionType }
     * 
     */
    public CteSectionCollectionType createCteSectionCollectionType() {
        return new CteSectionCollectionType();
    }

    /**
     * Create an instance of {@link PersonGroupAssociationCollectionType }
     * 
     */
    public PersonGroupAssociationCollectionType createPersonGroupAssociationCollectionType() {
        return new PersonGroupAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentItemCollectionType }
     * 
     */
    public AssessmentItemCollectionType createAssessmentItemCollectionType() {
        return new AssessmentItemCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardDocumentCEDSType }
     * 
     */
    public LearningStandardDocumentCEDSType createLearningStandardDocumentCEDSType() {
        return new LearningStandardDocumentCEDSType();
    }

    /**
     * Create an instance of {@link SectionRosterReportCollectionType }
     * 
     */
    public SectionRosterReportCollectionType createSectionRosterReportCollectionType() {
        return new SectionRosterReportCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentCEDSType }
     * 
     */
    public AssessmentCEDSType createAssessmentCEDSType() {
        return new AssessmentCEDSType();
    }

    /**
     * Create an instance of {@link AssessmentSubtestResultCEDSType }
     * 
     */
    public AssessmentSubtestResultCEDSType createAssessmentSubtestResultCEDSType() {
        return new AssessmentSubtestResultCEDSType();
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
     * Create an instance of {@link LeaCollectionType }
     * 
     */
    public LeaCollectionType createLeaCollectionType() {
        return new LeaCollectionType();
    }

    /**
     * Create an instance of {@link AeProviderCollectionType }
     * 
     */
    public AeProviderCollectionType createAeProviderCollectionType() {
        return new AeProviderCollectionType();
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
     * Create an instance of {@link RubricCEDSType }
     * 
     */
    public RubricCEDSType createRubricCEDSType() {
        return new RubricCEDSType();
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
     * Create an instance of {@link K12SectionCollectionType }
     * 
     */
    public K12SectionCollectionType createK12SectionCollectionType() {
        return new K12SectionCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonAssociationCollectionType }
     * 
     */
    public ContactPersonAssociationCollectionType createContactPersonAssociationCollectionType() {
        return new ContactPersonAssociationCollectionType();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSCollectionType }
     * 
     */
    public ParentGuardianCEDSCollectionType createParentGuardianCEDSCollectionType() {
        return new ParentGuardianCEDSCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentParticipantSessionCEDSType }
     * 
     */
    public AssessmentParticipantSessionCEDSType createAssessmentParticipantSessionCEDSType() {
        return new AssessmentParticipantSessionCEDSType();
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
     * Create an instance of {@link FamilyCEDSCollectionType }
     * 
     */
    public FamilyCEDSCollectionType createFamilyCEDSCollectionType() {
        return new FamilyCEDSCollectionType();
    }

    /**
     * Create an instance of {@link LeaCEDSCollectionType }
     * 
     */
    public LeaCEDSCollectionType createLeaCEDSCollectionType() {
        return new LeaCEDSCollectionType();
    }

    /**
     * Create an instance of {@link PersonCollectionType }
     * 
     */
    public PersonCollectionType createPersonCollectionType() {
        return new PersonCollectionType();
    }

    /**
     * Create an instance of {@link CrisisIncidentCEDSType }
     * 
     */
    public CrisisIncidentCEDSType createCrisisIncidentCEDSType() {
        return new CrisisIncidentCEDSType();
    }

    /**
     * Create an instance of {@link SchoolType }
     * 
     */
    public SchoolType createSchoolType() {
        return new SchoolType();
    }

    /**
     * Create an instance of {@link GAuthenticationType }
     * 
     */
    public GAuthenticationType createGAuthenticationType() {
        return new GAuthenticationType();
    }

    /**
     * Create an instance of {@link PersonGroupAssociationType }
     * 
     */
    public PersonGroupAssociationType createPersonGroupAssociationType() {
        return new PersonGroupAssociationType();
    }

    /**
     * Create an instance of {@link CteCourseCollectionType }
     * 
     */
    public CteCourseCollectionType createCteCourseCollectionType() {
        return new CteCourseCollectionType();
    }

    /**
     * Create an instance of {@link PsApplicantCollectionType }
     * 
     */
    public PsApplicantCollectionType createPsApplicantCollectionType() {
        return new PsApplicantCollectionType();
    }

    /**
     * Create an instance of {@link AuthenticationIdentityProviderType }
     * 
     */
    public AuthenticationIdentityProviderType createAuthenticationIdentityProviderType() {
        return new AuthenticationIdentityProviderType();
    }

    /**
     * Create an instance of {@link SchoolCalendarCollectionType }
     * 
     */
    public SchoolCalendarCollectionType createSchoolCalendarCollectionType() {
        return new SchoolCalendarCollectionType();
    }

    /**
     * Create an instance of {@link AeSectionType }
     * 
     */
    public AeSectionType createAeSectionType() {
        return new AeSectionType();
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
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link AssessmentSessionCEDSType }
     * 
     */
    public AssessmentSessionCEDSType createAssessmentSessionCEDSType() {
        return new AssessmentSessionCEDSType();
    }

    /**
     * Create an instance of {@link IncidentCEDSCollectionType }
     * 
     */
    public IncidentCEDSCollectionType createIncidentCEDSCollectionType() {
        return new IncidentCEDSCollectionType();
    }

    /**
     * Create an instance of {@link K12SchoolCollectionType }
     * 
     */
    public K12SchoolCollectionType createK12SchoolCollectionType() {
        return new K12SchoolCollectionType();
    }

    /**
     * Create an instance of {@link WfParticipantCollectionType }
     * 
     */
    public WfParticipantCollectionType createWfParticipantCollectionType() {
        return new WfParticipantCollectionType();
    }

    /**
     * Create an instance of {@link PeerRatingSystemCEDSType }
     * 
     */
    public PeerRatingSystemCEDSType createPeerRatingSystemCEDSType() {
        return new PeerRatingSystemCEDSType();
    }

    /**
     * Create an instance of {@link PsSectionCollectionType }
     * 
     */
    public PsSectionCollectionType createPsSectionCollectionType() {
        return new PsSectionCollectionType();
    }

    /**
     * Create an instance of {@link CourseType }
     * 
     */
    public CourseType createCourseType() {
        return new CourseType();
    }

    /**
     * Create an instance of {@link AssessmentAdministrationCEDSType }
     * 
     */
    public AssessmentAdministrationCEDSType createAssessmentAdministrationCEDSType() {
        return new AssessmentAdministrationCEDSType();
    }

    /**
     * Create an instance of {@link LearningStandardAssociationCollectionType }
     * 
     */
    public LearningStandardAssociationCollectionType createLearningStandardAssociationCollectionType() {
        return new LearningStandardAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSectionCollectionType }
     * 
     */
    public AssessmentSectionCollectionType createAssessmentSectionCollectionType() {
        return new AssessmentSectionCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentAssetCollectionType }
     * 
     */
    public AssessmentAssetCollectionType createAssessmentAssetCollectionType() {
        return new AssessmentAssetCollectionType();
    }

    /**
     * Create an instance of {@link CrisisIncidentCEDSCollectionType }
     * 
     */
    public CrisisIncidentCEDSCollectionType createCrisisIncidentCEDSCollectionType() {
        return new CrisisIncidentCEDSCollectionType();
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
     * Create an instance of {@link AssessmentAssetCEDSType }
     * 
     */
    public AssessmentAssetCEDSType createAssessmentAssetCEDSType() {
        return new AssessmentAssetCEDSType();
    }

    /**
     * Create an instance of {@link PersonRoleAssociationCollectionType }
     * 
     */
    public PersonRoleAssociationCollectionType createPersonRoleAssociationCollectionType() {
        return new PersonRoleAssociationCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentItemAssociationType }
     * 
     */
    public AssessmentItemAssociationType createAssessmentItemAssociationType() {
        return new AssessmentItemAssociationType();
    }

    /**
     * Create an instance of {@link StudentProgramAssociationCollectionType }
     * 
     */
    public StudentProgramAssociationCollectionType createStudentProgramAssociationCollectionType() {
        return new StudentProgramAssociationCollectionType();
    }

    /**
     * Create an instance of {@link CompetencySetCEDSType }
     * 
     */
    public CompetencySetCEDSType createCompetencySetCEDSType() {
        return new CompetencySetCEDSType();
    }

    /**
     * Create an instance of {@link CteProgramType }
     * 
     */
    public CteProgramType createCteProgramType() {
        return new CteProgramType();
    }

    /**
     * Create an instance of {@link CteProgramCollectionType }
     * 
     */
    public CteProgramCollectionType createCteProgramCollectionType() {
        return new CteProgramCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentItemAssociationCollectionType }
     * 
     */
    public AssessmentItemAssociationCollectionType createAssessmentItemAssociationCollectionType() {
        return new AssessmentItemAssociationCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSCollectionType }
     * 
     */
    public ContactPersonCEDSCollectionType createContactPersonCEDSCollectionType() {
        return new ContactPersonCEDSCollectionType();
    }

    /**
     * Create an instance of {@link UserOrganizationAssociationType }
     * 
     */
    public UserOrganizationAssociationType createUserOrganizationAssociationType() {
        return new UserOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link AuthenticationIdentityProviderCollectionType }
     * 
     */
    public AuthenticationIdentityProviderCollectionType createAuthenticationIdentityProviderCollectionType() {
        return new AuthenticationIdentityProviderCollectionType();
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
     * Create an instance of {@link PsInstitutionCollectionType }
     * 
     */
    public PsInstitutionCollectionType createPsInstitutionCollectionType() {
        return new PsInstitutionCollectionType();
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
     * Create an instance of {@link AssessmentRegistrationCEDSType }
     * 
     */
    public AssessmentRegistrationCEDSType createAssessmentRegistrationCEDSType() {
        return new AssessmentRegistrationCEDSType();
    }

    /**
     * Create an instance of {@link LeaType }
     * 
     */
    public LeaType createLeaType() {
        return new LeaType();
    }

    /**
     * Create an instance of {@link AssessmentFamilyCEDSType }
     * 
     */
    public AssessmentFamilyCEDSType createAssessmentFamilyCEDSType() {
        return new AssessmentFamilyCEDSType();
    }

    /**
     * Create an instance of {@link LearningGoalCEDSCollectionType }
     * 
     */
    public LearningGoalCEDSCollectionType createLearningGoalCEDSCollectionType() {
        return new LearningGoalCEDSCollectionType();
    }

    /**
     * Create an instance of {@link GAuthorizationType }
     * 
     */
    public GAuthorizationType createGAuthorizationType() {
        return new GAuthorizationType();
    }

    /**
     * Create an instance of {@link PersonRoleAssociationType }
     * 
     */
    public PersonRoleAssociationType createPersonRoleAssociationType() {
        return new PersonRoleAssociationType();
    }

    /**
     * Create an instance of {@link LearningResourceCEDSCollectionType }
     * 
     */
    public LearningResourceCEDSCollectionType createLearningResourceCEDSCollectionType() {
        return new LearningResourceCEDSCollectionType();
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
     * Create an instance of {@link PsStaffCollectionType }
     * 
     */
    public PsStaffCollectionType createPsStaffCollectionType() {
        return new PsStaffCollectionType();
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
     * Create an instance of {@link ApplicationCollectionType }
     * 
     */
    public ApplicationCollectionType createApplicationCollectionType() {
        return new ApplicationCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentPerformanceLevelCEDSType }
     * 
     */
    public AssessmentPerformanceLevelCEDSType createAssessmentPerformanceLevelCEDSType() {
        return new AssessmentPerformanceLevelCEDSType();
    }

    /**
     * Create an instance of {@link ElProgramType }
     * 
     */
    public ElProgramType createElProgramType() {
        return new ElProgramType();
    }

    /**
     * Create an instance of {@link ContactRelationshipCollectionType }
     * 
     */
    public ContactRelationshipCollectionType createContactRelationshipCollectionType() {
        return new ContactRelationshipCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSubTestCollectionType }
     * 
     */
    public AssessmentSubTestCollectionType createAssessmentSubTestCollectionType() {
        return new AssessmentSubTestCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentScoreSetCollectionType }
     * 
     */
    public AssessmentScoreSetCollectionType createAssessmentScoreSetCollectionType() {
        return new AssessmentScoreSetCollectionType();
    }

    /**
     * Create an instance of {@link AssessmentSubtestCEDSType }
     * 
     */
    public AssessmentSubtestCEDSType createAssessmentSubtestCEDSType() {
        return new AssessmentSubtestCEDSType();
    }

    /**
     * Create an instance of {@link AuthorizationCollectionType }
     * 
     */
    public AuthorizationCollectionType createAuthorizationCollectionType() {
        return new AuthorizationCollectionType();
    }

    /**
     * Create an instance of {@link PsApplicantType }
     * 
     */
    public PsApplicantType createPsApplicantType() {
        return new PsApplicantType();
    }

    /**
     * Create an instance of {@link AssessmentRubricCollectionType }
     * 
     */
    public AssessmentRubricCollectionType createAssessmentRubricCollectionType() {
        return new AssessmentRubricCollectionType();
    }

    /**
     * Create an instance of {@link K12CourseCollectionType }
     * 
     */
    public K12CourseCollectionType createK12CourseCollectionType() {
        return new K12CourseCollectionType();
    }

    /**
     * Create an instance of {@link K12StaffCollectionType }
     * 
     */
    public K12StaffCollectionType createK12StaffCollectionType() {
        return new K12StaffCollectionType();
    }

    /**
     * Create an instance of {@link StudentCoreCollectionType }
     * 
     */
    public StudentCoreCollectionType createStudentCoreCollectionType() {
        return new StudentCoreCollectionType();
    }

    /**
     * Create an instance of {@link ContactRelationshipType }
     * 
     */
    public ContactRelationshipType createContactRelationshipType() {
        return new ContactRelationshipType();
    }

    /**
     * Create an instance of {@link ProgramType }
     * 
     */
    public ProgramType createProgramType() {
        return new ProgramType();
    }

    /**
     * Create an instance of {@link ElStaffCollectionType }
     * 
     */
    public ElStaffCollectionType createElStaffCollectionType() {
        return new ElStaffCollectionType();
    }

    /**
     * Create an instance of {@link ElAssessmentCollectionType }
     * 
     */
    public ElAssessmentCollectionType createElAssessmentCollectionType() {
        return new ElAssessmentCollectionType();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link PartyOrganizationAssociationType }
     * 
     */
    public PartyOrganizationAssociationType createPartyOrganizationAssociationType() {
        return new PartyOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link PartyAddressAssociationCollectionType }
     * 
     */
    public PartyAddressAssociationCollectionType createPartyAddressAssociationCollectionType() {
        return new PartyAddressAssociationCollectionType();
    }

    /**
     * Create an instance of {@link WfQuarterlyEmploymentRecordCollectionType }
     * 
     */
    public WfQuarterlyEmploymentRecordCollectionType createWfQuarterlyEmploymentRecordCollectionType() {
        return new WfQuarterlyEmploymentRecordCollectionType();
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
     * Create an instance of {@link FamilyCEDSType }
     * 
     */
    public FamilyCEDSType createFamilyCEDSType() {
        return new FamilyCEDSType();
    }

    /**
     * Create an instance of {@link CteSectionType }
     * 
     */
    public CteSectionType createCteSectionType() {
        return new CteSectionType();
    }

    /**
     * Create an instance of {@link PsAssessmentCollectionType }
     * 
     */
    public PsAssessmentCollectionType createPsAssessmentCollectionType() {
        return new PsAssessmentCollectionType();
    }

    /**
     * Create an instance of {@link StudentSchoolAssociationCollectionType }
     * 
     */
    public StudentSchoolAssociationCollectionType createStudentSchoolAssociationCollectionType() {
        return new StudentSchoolAssociationCollectionType();
    }

    /**
     * Create an instance of {@link StudentCollectionType }
     * 
     */
    public StudentCollectionType createStudentCollectionType() {
        return new StudentCollectionType();
    }

    /**
     * Create an instance of {@link CteStaffCollectionType }
     * 
     */
    public CteStaffCollectionType createCteStaffCollectionType() {
        return new CteStaffCollectionType();
    }

    /**
     * Create an instance of {@link StaffPersonAssignmentType }
     * 
     */
    public StaffPersonAssignmentType createStaffPersonAssignmentType() {
        return new StaffPersonAssignmentType();
    }

    /**
     * Create an instance of {@link LearnerActionCEDSType }
     * 
     */
    public LearnerActionCEDSType createLearnerActionCEDSType() {
        return new LearnerActionCEDSType();
    }

    /**
     * Create an instance of {@link SeaCEDSCollectionType }
     * 
     */
    public SeaCEDSCollectionType createSeaCEDSCollectionType() {
        return new SeaCEDSCollectionType();
    }

    /**
     * Create an instance of {@link SectionType }
     * 
     */
    public SectionType createSectionType() {
        return new SectionType();
    }

    /**
     * Create an instance of {@link GAddressType }
     * 
     */
    public GAddressType createGAddressType() {
        return new GAddressType();
    }

    /**
     * Create an instance of {@link TermType }
     * 
     */
    public TermType createTermType() {
        return new TermType();
    }

    /**
     * Create an instance of {@link OrganizationOrganizationAssociationType }
     * 
     */
    public OrganizationOrganizationAssociationType createOrganizationOrganizationAssociationType() {
        return new OrganizationOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link CteCourseType }
     * 
     */
    public CteCourseType createCteCourseType() {
        return new CteCourseType();
    }

    /**
     * Create an instance of {@link AuthorizationApplicationType }
     * 
     */
    public AuthorizationApplicationType createAuthorizationApplicationType() {
        return new AuthorizationApplicationType();
    }

    /**
     * Create an instance of {@link WfQuarterlyEmploymentRecordType }
     * 
     */
    public WfQuarterlyEmploymentRecordType createWfQuarterlyEmploymentRecordType() {
        return new WfQuarterlyEmploymentRecordType();
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
     * Create an instance of {@link GEventType }
     * 
     */
    public GEventType createGEventType() {
        return new GEventType();
    }

    /**
     * Create an instance of {@link GOtherSIFType }
     * 
     */
    public GOtherSIFType createGOtherSIFType() {
        return new GOtherSIFType();
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
     * Create an instance of {@link GModificationHistoryType }
     * 
     */
    public GModificationHistoryType createGModificationHistoryType() {
        return new GModificationHistoryType();
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
     * Create an instance of {@link GCourseCreditList }
     * 
     */
    public GCourseCreditList createGCourseCreditList() {
        return new GCourseCreditList();
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
     * Create an instance of {@link GPersonRoleAssociationType }
     * 
     */
    public GPersonRoleAssociationType createGPersonRoleAssociationType() {
        return new GPersonRoleAssociationType();
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
     * Create an instance of {@link GEntryTypeType }
     * 
     */
    public GEntryTypeType createGEntryTypeType() {
        return new GEntryTypeType();
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
     * Create an instance of {@link GPhoneNumberType }
     * 
     */
    public GPhoneNumberType createGPhoneNumberType() {
        return new GPhoneNumberType();
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
     * Create an instance of {@link GExitTypeType }
     * 
     */
    public GExitTypeType createGExitTypeType() {
        return new GExitTypeType();
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
     * Create an instance of {@link GPhoneNumberList }
     * 
     */
    public GPhoneNumberList createGPhoneNumberList() {
        return new GPhoneNumberList();
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
     * Create an instance of {@link GBellPeriodType }
     * 
     */
    public GBellPeriodType createGBellPeriodType() {
        return new GBellPeriodType();
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
     * Create an instance of {@link DemographicsType }
     * 
     */
    public DemographicsType createDemographicsType() {
        return new DemographicsType();
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
     * Create an instance of {@link GGroupType }
     * 
     */
    public GGroupType createGGroupType() {
        return new GGroupType();
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
     * Create an instance of {@link GDemographicsType.CountryOfCitizenshipList }
     * 
     */
    public GDemographicsType.CountryOfCitizenshipList createGDemographicsTypeCountryOfCitizenshipList() {
        return new GDemographicsType.CountryOfCitizenshipList();
    }

    /**
     * Create an instance of {@link GLEAType.LeaContactList }
     * 
     */
    public GLEAType.LeaContactList createGLEATypeLeaContactList() {
        return new GLEAType.LeaContactList();
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
     * Create an instance of {@link GK12CourseType.ExternalCourseCodeList }
     * 
     */
    public GK12CourseType.ExternalCourseCodeList createGK12CourseTypeExternalCourseCodeList() {
        return new GK12CourseType.ExternalCourseCodeList();
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
     * Create an instance of {@link K12SchoolType.Identification }
     * 
     */
    public K12SchoolType.Identification createK12SchoolTypeIdentification() {
        return new K12SchoolType.Identification();
    }

    /**
     * Create an instance of {@link K12SchoolType.InstitutionCharacteristics }
     * 
     */
    public K12SchoolType.InstitutionCharacteristics createK12SchoolTypeInstitutionCharacteristics() {
        return new K12SchoolType.InstitutionCharacteristics();
    }

    /**
     * Create an instance of {@link K12SchoolType.Accountability }
     * 
     */
    public K12SchoolType.Accountability createK12SchoolTypeAccountability() {
        return new K12SchoolType.Accountability();
    }

    /**
     * Create an instance of {@link K12SchoolType.Finance }
     * 
     */
    public K12SchoolType.Finance createK12SchoolTypeFinance() {
        return new K12SchoolType.Finance();
    }

    /**
     * Create an instance of {@link K12SchoolType.FederalFunds }
     * 
     */
    public K12SchoolType.FederalFunds createK12SchoolTypeFederalFunds() {
        return new K12SchoolType.FederalFunds();
    }

    /**
     * Create an instance of {@link K12SchoolType.TechnicalAssistance }
     * 
     */
    public K12SchoolType.TechnicalAssistance createK12SchoolTypeTechnicalAssistance() {
        return new K12SchoolType.TechnicalAssistance();
    }

    /**
     * Create an instance of {@link K12SchoolType.SessionList.Session }
     * 
     */
    public K12SchoolType.SessionList.Session createK12SchoolTypeSessionListSession() {
        return new K12SchoolType.SessionList.Session();
    }

    /**
     * Create an instance of {@link K12SchoolType.Directory.GradesOfferedList }
     * 
     */
    public K12SchoolType.Directory.GradesOfferedList createK12SchoolTypeDirectoryGradesOfferedList() {
        return new K12SchoolType.Directory.GradesOfferedList();
    }

    /**
     * Create an instance of {@link K12SchoolType.PhoneNumberList.PhoneNumber }
     * 
     */
    public K12SchoolType.PhoneNumberList.PhoneNumber createK12SchoolTypePhoneNumberListPhoneNumber() {
        return new K12SchoolType.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link K12SchoolType.AddressList.Address.Street }
     * 
     */
    public K12SchoolType.AddressList.Address.Street createK12SchoolTypeAddressListAddressStreet() {
        return new K12SchoolType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link K12SchoolType.AddressList.Address.GridLocation }
     * 
     */
    public K12SchoolType.AddressList.Address.GridLocation createK12SchoolTypeAddressListAddressGridLocation() {
        return new K12SchoolType.AddressList.Address.GridLocation();
    }

    /**
     * Create an instance of {@link CalendarCEDSType.Period }
     * 
     */
    public CalendarCEDSType.Period createCalendarCEDSTypePeriod() {
        return new CalendarCEDSType.Period();
    }

    /**
     * Create an instance of {@link CalendarCEDSType.Crisis }
     * 
     */
    public CalendarCEDSType.Crisis createCalendarCEDSTypeCrisis() {
        return new CalendarCEDSType.Crisis();
    }

    /**
     * Create an instance of {@link CalendarCEDSType.EventList.Event }
     * 
     */
    public CalendarCEDSType.EventList.Event createCalendarCEDSTypeEventListEvent() {
        return new CalendarCEDSType.EventList.Event();
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
     * Create an instance of {@link PsStaffType.Demographic }
     * 
     */
    public PsStaffType.Demographic createPsStaffTypeDemographic() {
        return new PsStaffType.Demographic();
    }

    /**
     * Create an instance of {@link PsStaffType.Employment }
     * 
     */
    public PsStaffType.Employment createPsStaffTypeEmployment() {
        return new PsStaffType.Employment();
    }

    /**
     * Create an instance of {@link PsStaffType.Credential }
     * 
     */
    public PsStaffType.Credential createPsStaffTypeCredential() {
        return new PsStaffType.Credential();
    }

    /**
     * Create an instance of {@link PsStaffType.Contact.AddressList.Address.Street }
     * 
     */
    public PsStaffType.Contact.AddressList.Address.Street createPsStaffTypeContactAddressListAddressStreet() {
        return new PsStaffType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link PsStaffType.Identity.Name }
     * 
     */
    public PsStaffType.Identity.Name createPsStaffTypeIdentityName() {
        return new PsStaffType.Identity.Name();
    }

    /**
     * Create an instance of {@link PsStaffType.Identity.Identification }
     * 
     */
    public PsStaffType.Identity.Identification createPsStaffTypeIdentityIdentification() {
        return new PsStaffType.Identity.Identification();
    }

    /**
     * Create an instance of {@link PsStaffType.Identity.OtherNameList.OtherName }
     * 
     */
    public PsStaffType.Identity.OtherNameList.OtherName createPsStaffTypeIdentityOtherNameListOtherName() {
        return new PsStaffType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Name }
     * 
     */
    public ElOrganizationType.Name createElOrganizationTypeName() {
        return new ElOrganizationType.Name();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Identifier }
     * 
     */
    public ElOrganizationType.Identifier createElOrganizationTypeIdentifier() {
        return new ElOrganizationType.Identifier();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Licensing }
     * 
     */
    public ElOrganizationType.Licensing createElOrganizationTypeLicensing() {
        return new ElOrganizationType.Licensing();
    }

    /**
     * Create an instance of {@link ElOrganizationType.OrganizationCharacteristics }
     * 
     */
    public ElOrganizationType.OrganizationCharacteristics createElOrganizationTypeOrganizationCharacteristics() {
        return new ElOrganizationType.OrganizationCharacteristics();
    }

    /**
     * Create an instance of {@link ElOrganizationType.QrisRating }
     * 
     */
    public ElOrganizationType.QrisRating createElOrganizationTypeQrisRating() {
        return new ElOrganizationType.QrisRating();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Facility }
     * 
     */
    public ElOrganizationType.Facility createElOrganizationTypeFacility() {
        return new ElOrganizationType.Facility();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Monitoring }
     * 
     */
    public ElOrganizationType.Monitoring createElOrganizationTypeMonitoring() {
        return new ElOrganizationType.Monitoring();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Accreditation }
     * 
     */
    public ElOrganizationType.Accreditation createElOrganizationTypeAccreditation() {
        return new ElOrganizationType.Accreditation();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Policies }
     * 
     */
    public ElOrganizationType.Policies createElOrganizationTypePolicies() {
        return new ElOrganizationType.Policies();
    }

    /**
     * Create an instance of {@link ElOrganizationType.CulturalAndLinguisticDiversity }
     * 
     */
    public ElOrganizationType.CulturalAndLinguisticDiversity createElOrganizationTypeCulturalAndLinguisticDiversity() {
        return new ElOrganizationType.CulturalAndLinguisticDiversity();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Inclusion }
     * 
     */
    public ElOrganizationType.Inclusion createElOrganizationTypeInclusion() {
        return new ElOrganizationType.Inclusion();
    }

    /**
     * Create an instance of {@link ElOrganizationType.OrganizationInformation }
     * 
     */
    public ElOrganizationType.OrganizationInformation createElOrganizationTypeOrganizationInformation() {
        return new ElOrganizationType.OrganizationInformation();
    }

    /**
     * Create an instance of {@link ElOrganizationType.ParentalFamilyInvolvement }
     * 
     */
    public ElOrganizationType.ParentalFamilyInvolvement createElOrganizationTypeParentalFamilyInvolvement() {
        return new ElOrganizationType.ParentalFamilyInvolvement();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Compensation }
     * 
     */
    public ElOrganizationType.Compensation createElOrganizationTypeCompensation() {
        return new ElOrganizationType.Compensation();
    }

    /**
     * Create an instance of {@link ElOrganizationType.ProfessionalDevelopment }
     * 
     */
    public ElOrganizationType.ProfessionalDevelopment createElOrganizationTypeProfessionalDevelopment() {
        return new ElOrganizationType.ProfessionalDevelopment();
    }

    /**
     * Create an instance of {@link ElOrganizationType.SiteLevelCharacteristics }
     * 
     */
    public ElOrganizationType.SiteLevelCharacteristics createElOrganizationTypeSiteLevelCharacteristics() {
        return new ElOrganizationType.SiteLevelCharacteristics();
    }

    /**
     * Create an instance of {@link ElOrganizationType.Quality }
     * 
     */
    public ElOrganizationType.Quality createElOrganizationTypeQuality() {
        return new ElOrganizationType.Quality();
    }

    /**
     * Create an instance of {@link ElOrganizationType.ElProgramList.ElProgram }
     * 
     */
    public ElOrganizationType.ElProgramList.ElProgram createElOrganizationTypeElProgramListElProgram() {
        return new ElOrganizationType.ElProgramList.ElProgram();
    }

    /**
     * Create an instance of {@link ElOrganizationType.HealthPromotion.RequiredImmunizationList }
     * 
     */
    public ElOrganizationType.HealthPromotion.RequiredImmunizationList createElOrganizationTypeHealthPromotionRequiredImmunizationList() {
        return new ElOrganizationType.HealthPromotion.RequiredImmunizationList();
    }

    /**
     * Create an instance of {@link ElOrganizationType.PhoneNumberList.PhoneNumber }
     * 
     */
    public ElOrganizationType.PhoneNumberList.PhoneNumber createElOrganizationTypePhoneNumberListPhoneNumber() {
        return new ElOrganizationType.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ElOrganizationType.AddressList.Address }
     * 
     */
    public ElOrganizationType.AddressList.Address createElOrganizationTypeAddressListAddress() {
        return new ElOrganizationType.AddressList.Address();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.Name }
     * 
     */
    public ParentGuardianCEDSType.Name createParentGuardianCEDSTypeName() {
        return new ParentGuardianCEDSType.Name();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.EmailList.Email }
     * 
     */
    public ParentGuardianCEDSType.EmailList.Email createParentGuardianCEDSTypeEmailListEmail() {
        return new ParentGuardianCEDSType.EmailList.Email();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.PhoneNumberList.PhoneNumber }
     * 
     */
    public ParentGuardianCEDSType.PhoneNumberList.PhoneNumber createParentGuardianCEDSTypePhoneNumberListPhoneNumber() {
        return new ParentGuardianCEDSType.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.AddressList.Address.Street }
     * 
     */
    public ParentGuardianCEDSType.AddressList.Address.Street createParentGuardianCEDSTypeAddressListAddressStreet() {
        return new ParentGuardianCEDSType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ParentGuardianCEDSType.OtherNameList.OtherName }
     * 
     */
    public ParentGuardianCEDSType.OtherNameList.OtherName createParentGuardianCEDSTypeOtherNameListOtherName() {
        return new ParentGuardianCEDSType.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link LeaCEDSType.Identification }
     * 
     */
    public LeaCEDSType.Identification createLeaCEDSTypeIdentification() {
        return new LeaCEDSType.Identification();
    }

    /**
     * Create an instance of {@link LeaCEDSType.Directory }
     * 
     */
    public LeaCEDSType.Directory createLeaCEDSTypeDirectory() {
        return new LeaCEDSType.Directory();
    }

    /**
     * Create an instance of {@link LeaCEDSType.Accountability }
     * 
     */
    public LeaCEDSType.Accountability createLeaCEDSTypeAccountability() {
        return new LeaCEDSType.Accountability();
    }

    /**
     * Create an instance of {@link LeaCEDSType.FederalFunds }
     * 
     */
    public LeaCEDSType.FederalFunds createLeaCEDSTypeFederalFunds() {
        return new LeaCEDSType.FederalFunds();
    }

    /**
     * Create an instance of {@link LeaCEDSType.ProgramFederalReporting }
     * 
     */
    public LeaCEDSType.ProgramFederalReporting createLeaCEDSTypeProgramFederalReporting() {
        return new LeaCEDSType.ProgramFederalReporting();
    }

    /**
     * Create an instance of {@link LeaCEDSType.SafeDrugFree }
     * 
     */
    public LeaCEDSType.SafeDrugFree createLeaCEDSTypeSafeDrugFree() {
        return new LeaCEDSType.SafeDrugFree();
    }

    /**
     * Create an instance of {@link LeaCEDSType.ProgramsServices }
     * 
     */
    public LeaCEDSType.ProgramsServices createLeaCEDSTypeProgramsServices() {
        return new LeaCEDSType.ProgramsServices();
    }

    /**
     * Create an instance of {@link LeaCEDSType.Finance }
     * 
     */
    public LeaCEDSType.Finance createLeaCEDSTypeFinance() {
        return new LeaCEDSType.Finance();
    }

    /**
     * Create an instance of {@link LeaCEDSType.TechnicalAssistance }
     * 
     */
    public LeaCEDSType.TechnicalAssistance createLeaCEDSTypeTechnicalAssistance() {
        return new LeaCEDSType.TechnicalAssistance();
    }

    /**
     * Create an instance of {@link LeaCEDSType.PhoneNumberList.PhoneNumber }
     * 
     */
    public LeaCEDSType.PhoneNumberList.PhoneNumber createLeaCEDSTypePhoneNumberListPhoneNumber() {
        return new LeaCEDSType.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link LeaCEDSType.AddressList.Address.Street }
     * 
     */
    public LeaCEDSType.AddressList.Address.Street createLeaCEDSTypeAddressListAddressStreet() {
        return new LeaCEDSType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link CteStudentType.Demographic }
     * 
     */
    public CteStudentType.Demographic createCteStudentTypeDemographic() {
        return new CteStudentType.Demographic();
    }

    /**
     * Create an instance of {@link CteStudentType.AcademicRecord }
     * 
     */
    public CteStudentType.AcademicRecord createCteStudentTypeAcademicRecord() {
        return new CteStudentType.AcademicRecord();
    }

    /**
     * Create an instance of {@link CteStudentType.ProgramParticipation }
     * 
     */
    public CteStudentType.ProgramParticipation createCteStudentTypeProgramParticipation() {
        return new CteStudentType.ProgramParticipation();
    }

    /**
     * Create an instance of {@link CteStudentType.EducationPlan }
     * 
     */
    public CteStudentType.EducationPlan createCteStudentTypeEducationPlan() {
        return new CteStudentType.EducationPlan();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.EmailList.Email }
     * 
     */
    public CteStudentType.Contact.EmailList.Email createCteStudentTypeContactEmailListEmail() {
        return new CteStudentType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public CteStudentType.Contact.PhoneNumberList.PhoneNumber createCteStudentTypeContactPhoneNumberListPhoneNumber() {
        return new CteStudentType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link CteStudentType.Contact.AddressList.Address.Street }
     * 
     */
    public CteStudentType.Contact.AddressList.Address.Street createCteStudentTypeContactAddressListAddressStreet() {
        return new CteStudentType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link CteStudentType.Identity.Name }
     * 
     */
    public CteStudentType.Identity.Name createCteStudentTypeIdentityName() {
        return new CteStudentType.Identity.Name();
    }

    /**
     * Create an instance of {@link CteStudentType.Identity.Identifier }
     * 
     */
    public CteStudentType.Identity.Identifier createCteStudentTypeIdentityIdentifier() {
        return new CteStudentType.Identity.Identifier();
    }

    /**
     * Create an instance of {@link CteStudentType.Identity.OtherNameList.OtherName }
     * 
     */
    public CteStudentType.Identity.OtherNameList.OtherName createCteStudentTypeIdentityOtherNameListOtherName() {
        return new CteStudentType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link K12SectionType.Directory }
     * 
     */
    public K12SectionType.Directory createK12SectionTypeDirectory() {
        return new K12SectionType.Directory();
    }

    /**
     * Create an instance of {@link K12SectionType.Staff }
     * 
     */
    public K12SectionType.Staff createK12SectionTypeStaff() {
        return new K12SectionType.Staff();
    }

    /**
     * Create an instance of {@link K12SectionType.Attendance }
     * 
     */
    public K12SectionType.Attendance createK12SectionTypeAttendance() {
        return new K12SectionType.Attendance();
    }

    /**
     * Create an instance of {@link K12SectionType.Enrollment.StudentMark }
     * 
     */
    public K12SectionType.Enrollment.StudentMark createK12SectionTypeEnrollmentStudentMark() {
        return new K12SectionType.Enrollment.StudentMark();
    }

    /**
     * Create an instance of {@link K12SectionType.Course.RelatedLearningStandardList }
     * 
     */
    public K12SectionType.Course.RelatedLearningStandardList createK12SectionTypeCourseRelatedLearningStandardList() {
        return new K12SectionType.Course.RelatedLearningStandardList();
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
     * Create an instance of {@link LearningResourceCEDSType.PeerRating }
     * 
     */
    public LearningResourceCEDSType.PeerRating createLearningResourceCEDSTypePeerRating() {
        return new LearningResourceCEDSType.PeerRating();
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
     * Create an instance of {@link K12StudentType.Demographic }
     * 
     */
    public K12StudentType.Demographic createK12StudentTypeDemographic() {
        return new K12StudentType.Demographic();
    }

    /**
     * Create an instance of {@link K12StudentType.AcademicRecord }
     * 
     */
    public K12StudentType.AcademicRecord createK12StudentTypeAcademicRecord() {
        return new K12StudentType.AcademicRecord();
    }

    /**
     * Create an instance of {@link K12StudentType.Cte }
     * 
     */
    public K12StudentType.Cte createK12StudentTypeCte() {
        return new K12StudentType.Cte();
    }

    /**
     * Create an instance of {@link K12StudentType.Disability }
     * 
     */
    public K12StudentType.Disability createK12StudentTypeDisability() {
        return new K12StudentType.Disability();
    }

    /**
     * Create an instance of {@link K12StudentType.Economic }
     * 
     */
    public K12StudentType.Economic createK12StudentTypeEconomic() {
        return new K12StudentType.Economic();
    }

    /**
     * Create an instance of {@link K12StudentType.Homeless }
     * 
     */
    public K12StudentType.Homeless createK12StudentTypeHomeless() {
        return new K12StudentType.Homeless();
    }

    /**
     * Create an instance of {@link K12StudentType.Immigrant }
     * 
     */
    public K12StudentType.Immigrant createK12StudentTypeImmigrant() {
        return new K12StudentType.Immigrant();
    }

    /**
     * Create an instance of {@link K12StudentType.Lep }
     * 
     */
    public K12StudentType.Lep createK12StudentTypeLep() {
        return new K12StudentType.Lep();
    }

    /**
     * Create an instance of {@link K12StudentType.Migrant }
     * 
     */
    public K12StudentType.Migrant createK12StudentTypeMigrant() {
        return new K12StudentType.Migrant();
    }

    /**
     * Create an instance of {@link K12StudentType.NeglectedOrDelinquent }
     * 
     */
    public K12StudentType.NeglectedOrDelinquent createK12StudentTypeNeglectedOrDelinquent() {
        return new K12StudentType.NeglectedOrDelinquent();
    }

    /**
     * Create an instance of {@link K12StudentType.SpecialEducation }
     * 
     */
    public K12StudentType.SpecialEducation createK12StudentTypeSpecialEducation() {
        return new K12StudentType.SpecialEducation();
    }

    /**
     * Create an instance of {@link K12StudentType.Title1 }
     * 
     */
    public K12StudentType.Title1 createK12StudentTypeTitle1() {
        return new K12StudentType.Title1();
    }

    /**
     * Create an instance of {@link K12StudentType.EmploymentRecordList.EmploymentRecord }
     * 
     */
    public K12StudentType.EmploymentRecordList.EmploymentRecord createK12StudentTypeEmploymentRecordListEmploymentRecord() {
        return new K12StudentType.EmploymentRecordList.EmploymentRecord();
    }

    /**
     * Create an instance of {@link K12StudentType.HealthRecordList.HealthRecord }
     * 
     */
    public K12StudentType.HealthRecordList.HealthRecord createK12StudentTypeHealthRecordListHealthRecord() {
        return new K12StudentType.HealthRecordList.HealthRecord();
    }

    /**
     * Create an instance of {@link K12StudentType.IndividualizedProgramList.IndividualizedProgram }
     * 
     */
    public K12StudentType.IndividualizedProgramList.IndividualizedProgram createK12StudentTypeIndividualizedProgramListIndividualizedProgram() {
        return new K12StudentType.IndividualizedProgramList.IndividualizedProgram();
    }

    /**
     * Create an instance of {@link K12StudentType.ProgramList.Program }
     * 
     */
    public K12StudentType.ProgramList.Program createK12StudentTypeProgramListProgram() {
        return new K12StudentType.ProgramList.Program();
    }

    /**
     * Create an instance of {@link K12StudentType.LanguageList.Language }
     * 
     */
    public K12StudentType.LanguageList.Language createK12StudentTypeLanguageListLanguage() {
        return new K12StudentType.LanguageList.Language();
    }

    /**
     * Create an instance of {@link K12StudentType.DisciplineEventList.DisciplineEvent }
     * 
     */
    public K12StudentType.DisciplineEventList.DisciplineEvent createK12StudentTypeDisciplineEventListDisciplineEvent() {
        return new K12StudentType.DisciplineEventList.DisciplineEvent();
    }

    /**
     * Create an instance of {@link K12StudentType.Attendance.AttendanceEventList.AttendanceEvent }
     * 
     */
    public K12StudentType.Attendance.AttendanceEventList.AttendanceEvent createK12StudentTypeAttendanceAttendanceEventListAttendanceEvent() {
        return new K12StudentType.Attendance.AttendanceEventList.AttendanceEvent();
    }

    /**
     * Create an instance of {@link K12StudentType.CourseList.Course }
     * 
     */
    public K12StudentType.CourseList.Course createK12StudentTypeCourseListCourse() {
        return new K12StudentType.CourseList.Course();
    }

    /**
     * Create an instance of {@link K12StudentType.ActivityList.Activity }
     * 
     */
    public K12StudentType.ActivityList.Activity createK12StudentTypeActivityListActivity() {
        return new K12StudentType.ActivityList.Activity();
    }

    /**
     * Create an instance of {@link K12StudentType.EnrollmentList.Enrollment }
     * 
     */
    public K12StudentType.EnrollmentList.Enrollment createK12StudentTypeEnrollmentListEnrollment() {
        return new K12StudentType.EnrollmentList.Enrollment();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.EmailList.Email }
     * 
     */
    public K12StudentType.Contact.EmailList.Email createK12StudentTypeContactEmailListEmail() {
        return new K12StudentType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public K12StudentType.Contact.PhoneNumberList.PhoneNumber createK12StudentTypeContactPhoneNumberListPhoneNumber() {
        return new K12StudentType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link K12StudentType.Contact.AddressList.Address.Street }
     * 
     */
    public K12StudentType.Contact.AddressList.Address.Street createK12StudentTypeContactAddressListAddressStreet() {
        return new K12StudentType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link K12StudentType.Identity.Name }
     * 
     */
    public K12StudentType.Identity.Name createK12StudentTypeIdentityName() {
        return new K12StudentType.Identity.Name();
    }

    /**
     * Create an instance of {@link K12StudentType.Identity.Identification }
     * 
     */
    public K12StudentType.Identity.Identification createK12StudentTypeIdentityIdentification() {
        return new K12StudentType.Identity.Identification();
    }

    /**
     * Create an instance of {@link K12StudentType.Identity.OtherNameList.OtherName }
     * 
     */
    public K12StudentType.Identity.OtherNameList.OtherName createK12StudentTypeIdentityOtherNameListOtherName() {
        return new K12StudentType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link LearningStandardItemCEDSType.ItemAssociation }
     * 
     */
    public LearningStandardItemCEDSType.ItemAssociation createLearningStandardItemCEDSTypeItemAssociation() {
        return new LearningStandardItemCEDSType.ItemAssociation();
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
     * Create an instance of {@link SreType.RaceList }
     * 
     */
    public SreType.RaceList createSreTypeRaceList() {
        return new SreType.RaceList();
    }

    /**
     * Create an instance of {@link SreType.EthnicityList }
     * 
     */
    public SreType.EthnicityList createSreTypeEthnicityList() {
        return new SreType.EthnicityList();
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
     * Create an instance of {@link SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool }
     * 
     */
    public SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool createSreTypeDisciplineIncidentsDisciplineIncidentActionListActionReportingSchool() {
        return new SreType.DisciplineIncidents.DisciplineIncident.ActionList.Action.ReportingSchool();
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
     * Create an instance of {@link FacilityCEDSType.BuildingList.Building }
     * 
     */
    public FacilityCEDSType.BuildingList.Building createFacilityCEDSTypeBuildingListBuilding() {
        return new FacilityCEDSType.BuildingList.Building();
    }

    /**
     * Create an instance of {@link FacilityCEDSType.AddressList.Address.Street }
     * 
     */
    public FacilityCEDSType.AddressList.Address.Street createFacilityCEDSTypeAddressListAddressStreet() {
        return new FacilityCEDSType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link PsStudentType.Demographic }
     * 
     */
    public PsStudentType.Demographic createPsStudentTypeDemographic() {
        return new PsStudentType.Demographic();
    }

    /**
     * Create an instance of {@link PsStudentType.Application }
     * 
     */
    public PsStudentType.Application createPsStudentTypeApplication() {
        return new PsStudentType.Application();
    }

    /**
     * Create an instance of {@link PsStudentType.Enrollment }
     * 
     */
    public PsStudentType.Enrollment createPsStudentTypeEnrollment() {
        return new PsStudentType.Enrollment();
    }

    /**
     * Create an instance of {@link PsStudentType.FinancialAid }
     * 
     */
    public PsStudentType.FinancialAid createPsStudentTypeFinancialAid() {
        return new PsStudentType.FinancialAid();
    }

    /**
     * Create an instance of {@link PsStudentType.AcademicRecord }
     * 
     */
    public PsStudentType.AcademicRecord createPsStudentTypeAcademicRecord() {
        return new PsStudentType.AcademicRecord();
    }

    /**
     * Create an instance of {@link PsStudentType.Cte }
     * 
     */
    public PsStudentType.Cte createPsStudentTypeCte() {
        return new PsStudentType.Cte();
    }

    /**
     * Create an instance of {@link PsStudentType.Assessment }
     * 
     */
    public PsStudentType.Assessment createPsStudentTypeAssessment() {
        return new PsStudentType.Assessment();
    }

    /**
     * Create an instance of {@link PsStudentType.TeacherPrep }
     * 
     */
    public PsStudentType.TeacherPrep createPsStudentTypeTeacherPrep() {
        return new PsStudentType.TeacherPrep();
    }

    /**
     * Create an instance of {@link PsStudentType.Employment }
     * 
     */
    public PsStudentType.Employment createPsStudentTypeEmployment() {
        return new PsStudentType.Employment();
    }

    /**
     * Create an instance of {@link PsStudentType.K12Transcript }
     * 
     */
    public PsStudentType.K12Transcript createPsStudentTypeK12Transcript() {
        return new PsStudentType.K12Transcript();
    }

    /**
     * Create an instance of {@link PsStudentType.ProgramList.Program }
     * 
     */
    public PsStudentType.ProgramList.Program createPsStudentTypeProgramListProgram() {
        return new PsStudentType.ProgramList.Program();
    }

    /**
     * Create an instance of {@link PsStudentType.GraduateStudent.AdvisorList.Advisor }
     * 
     */
    public PsStudentType.GraduateStudent.AdvisorList.Advisor createPsStudentTypeGraduateStudentAdvisorListAdvisor() {
        return new PsStudentType.GraduateStudent.AdvisorList.Advisor();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.EmailList.Email }
     * 
     */
    public PsStudentType.Contact.EmailList.Email createPsStudentTypeContactEmailListEmail() {
        return new PsStudentType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public PsStudentType.Contact.PhoneNumberList.PhoneNumber createPsStudentTypeContactPhoneNumberListPhoneNumber() {
        return new PsStudentType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link PsStudentType.Contact.AddressList.Address.Street }
     * 
     */
    public PsStudentType.Contact.AddressList.Address.Street createPsStudentTypeContactAddressListAddressStreet() {
        return new PsStudentType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link PsStudentType.Identity.Name }
     * 
     */
    public PsStudentType.Identity.Name createPsStudentTypeIdentityName() {
        return new PsStudentType.Identity.Name();
    }

    /**
     * Create an instance of {@link PsStudentType.Identity.Identification }
     * 
     */
    public PsStudentType.Identity.Identification createPsStudentTypeIdentityIdentification() {
        return new PsStudentType.Identity.Identification();
    }

    /**
     * Create an instance of {@link PsStudentType.Identity.OtherNameList.OtherName }
     * 
     */
    public PsStudentType.Identity.OtherNameList.OtherName createPsStudentTypeIdentityOtherNameListOtherName() {
        return new PsStudentType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link PsSectionType.Course }
     * 
     */
    public PsSectionType.Course createPsSectionTypeCourse() {
        return new PsSectionType.Course();
    }

    /**
     * Create an instance of {@link PsSectionType.Instructor }
     * 
     */
    public PsSectionType.Instructor createPsSectionTypeInstructor() {
        return new PsSectionType.Instructor();
    }

    /**
     * Create an instance of {@link PsSectionType.EnrollmentList.Enrollment.StudentMark }
     * 
     */
    public PsSectionType.EnrollmentList.Enrollment.StudentMark createPsSectionTypeEnrollmentListEnrollmentStudentMark() {
        return new PsSectionType.EnrollmentList.Enrollment.StudentMark();
    }

    /**
     * Create an instance of {@link ProgramCEDSType.Finance }
     * 
     */
    public ProgramCEDSType.Finance createProgramCEDSTypeFinance() {
        return new ProgramCEDSType.Finance();
    }

    /**
     * Create an instance of {@link ProgramCEDSType.AddressList.Address.Street }
     * 
     */
    public ProgramCEDSType.AddressList.Address.Street createProgramCEDSTypeAddressListAddressStreet() {
        return new ProgramCEDSType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Identification }
     * 
     */
    public SeaCEDSType.Identification createSeaCEDSTypeIdentification() {
        return new SeaCEDSType.Identification();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Finance }
     * 
     */
    public SeaCEDSType.Finance createSeaCEDSTypeFinance() {
        return new SeaCEDSType.Finance();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Accountability }
     * 
     */
    public SeaCEDSType.Accountability createSeaCEDSTypeAccountability() {
        return new SeaCEDSType.Accountability();
    }

    /**
     * Create an instance of {@link SeaCEDSType.FederalFunds.FederalProgramCodeList }
     * 
     */
    public SeaCEDSType.FederalFunds.FederalProgramCodeList createSeaCEDSTypeFederalFundsFederalProgramCodeList() {
        return new SeaCEDSType.FederalFunds.FederalProgramCodeList();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.Name }
     * 
     */
    public SeaCEDSType.Contact.Name createSeaCEDSTypeContactName() {
        return new SeaCEDSType.Contact.Name();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.EMail }
     * 
     */
    public SeaCEDSType.Contact.EMail createSeaCEDSTypeContactEMail() {
        return new SeaCEDSType.Contact.EMail();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.Telephone }
     * 
     */
    public SeaCEDSType.Contact.Telephone createSeaCEDSTypeContactTelephone() {
        return new SeaCEDSType.Contact.Telephone();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.OtherNameList.OtherName }
     * 
     */
    public SeaCEDSType.Contact.OtherNameList.OtherName createSeaCEDSTypeContactOtherNameListOtherName() {
        return new SeaCEDSType.Contact.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link SeaCEDSType.Contact.AddressList.Address.Street }
     * 
     */
    public SeaCEDSType.Contact.AddressList.Address.Street createSeaCEDSTypeContactAddressListAddressStreet() {
        return new SeaCEDSType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link SeaCEDSType.AddressList.Address.Street }
     * 
     */
    public SeaCEDSType.AddressList.Address.Street createSeaCEDSTypeAddressListAddressStreet() {
        return new SeaCEDSType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ElStaffType.Demographic }
     * 
     */
    public ElStaffType.Demographic createElStaffTypeDemographic() {
        return new ElStaffType.Demographic();
    }

    /**
     * Create an instance of {@link ElStaffType.Education }
     * 
     */
    public ElStaffType.Education createElStaffTypeEducation() {
        return new ElStaffType.Education();
    }

    /**
     * Create an instance of {@link ElStaffType.Employment }
     * 
     */
    public ElStaffType.Employment createElStaffTypeEmployment() {
        return new ElStaffType.Employment();
    }

    /**
     * Create an instance of {@link ElStaffType.Credential }
     * 
     */
    public ElStaffType.Credential createElStaffTypeCredential() {
        return new ElStaffType.Credential();
    }

    /**
     * Create an instance of {@link ElStaffType.License }
     * 
     */
    public ElStaffType.License createElStaffTypeLicense() {
        return new ElStaffType.License();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopmentEvent }
     * 
     */
    public ElStaffType.ProfessionalDevelopmentEvent createElStaffTypeProfessionalDevelopmentEvent() {
        return new ElStaffType.ProfessionalDevelopmentEvent();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopmentActivity.Session }
     * 
     */
    public ElStaffType.ProfessionalDevelopmentActivity.Session createElStaffTypeProfessionalDevelopmentActivitySession() {
        return new ElStaffType.ProfessionalDevelopmentActivity.Session();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopmentActivity.SessionLocation }
     * 
     */
    public ElStaffType.ProfessionalDevelopmentActivity.SessionLocation createElStaffTypeProfessionalDevelopmentActivitySessionLocation() {
        return new ElStaffType.ProfessionalDevelopmentActivity.SessionLocation();
    }

    /**
     * Create an instance of {@link ElStaffType.ProfessionalDevelopment.Instructor }
     * 
     */
    public ElStaffType.ProfessionalDevelopment.Instructor createElStaffTypeProfessionalDevelopmentInstructor() {
        return new ElStaffType.ProfessionalDevelopment.Instructor();
    }

    /**
     * Create an instance of {@link ElStaffType.LanguageList.Language }
     * 
     */
    public ElStaffType.LanguageList.Language createElStaffTypeLanguageListLanguage() {
        return new ElStaffType.LanguageList.Language();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.EmailList.Email }
     * 
     */
    public ElStaffType.Contact.EmailList.Email createElStaffTypeContactEmailListEmail() {
        return new ElStaffType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public ElStaffType.Contact.PhoneNumberList.PhoneNumber createElStaffTypeContactPhoneNumberListPhoneNumber() {
        return new ElStaffType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ElStaffType.Contact.AddressList.Address.Street }
     * 
     */
    public ElStaffType.Contact.AddressList.Address.Street createElStaffTypeContactAddressListAddressStreet() {
        return new ElStaffType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ElStaffType.Identity.Name }
     * 
     */
    public ElStaffType.Identity.Name createElStaffTypeIdentityName() {
        return new ElStaffType.Identity.Name();
    }

    /**
     * Create an instance of {@link ElStaffType.Identity.Identifier }
     * 
     */
    public ElStaffType.Identity.Identifier createElStaffTypeIdentityIdentifier() {
        return new ElStaffType.Identity.Identifier();
    }

    /**
     * Create an instance of {@link ElStaffType.Identity.OtherNameList.OtherName }
     * 
     */
    public ElStaffType.Identity.OtherNameList.OtherName createElStaffTypeIdentityOtherNameListOtherName() {
        return new ElStaffType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link K12OrganizationType.AddressList.Address.Street }
     * 
     */
    public K12OrganizationType.AddressList.Address.Street createK12OrganizationTypeAddressListAddressStreet() {
        return new K12OrganizationType.AddressList.Address.Street();
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
     * Create an instance of {@link ElChildType.Demographic }
     * 
     */
    public ElChildType.Demographic createElChildTypeDemographic() {
        return new ElChildType.Demographic();
    }

    /**
     * Create an instance of {@link ElChildType.Referral }
     * 
     */
    public ElChildType.Referral createElChildTypeReferral() {
        return new ElChildType.Referral();
    }

    /**
     * Create an instance of {@link ElChildType.DevelopmentalAssessment }
     * 
     */
    public ElChildType.DevelopmentalAssessment createElChildTypeDevelopmentalAssessment() {
        return new ElChildType.DevelopmentalAssessment();
    }

    /**
     * Create an instance of {@link ElChildType.Eligibility }
     * 
     */
    public ElChildType.Eligibility createElChildTypeEligibility() {
        return new ElChildType.Eligibility();
    }

    /**
     * Create an instance of {@link ElChildType.Idea }
     * 
     */
    public ElChildType.Idea createElChildTypeIdea() {
        return new ElChildType.Idea();
    }

    /**
     * Create an instance of {@link ElChildType.Finance }
     * 
     */
    public ElChildType.Finance createElChildTypeFinance() {
        return new ElChildType.Finance();
    }

    /**
     * Create an instance of {@link ElChildType.Services }
     * 
     */
    public ElChildType.Services createElChildTypeServices() {
        return new ElChildType.Services();
    }

    /**
     * Create an instance of {@link ElChildType.ChildOutcomeSummary }
     * 
     */
    public ElChildType.ChildOutcomeSummary createElChildTypeChildOutcomeSummary() {
        return new ElChildType.ChildOutcomeSummary();
    }

    /**
     * Create an instance of {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList }
     * 
     */
    public ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList createElChildTypeIndiviualizedProgramsListIndividualizedProgramPlanMeetingParticipantList() {
        return new ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList();
    }

    /**
     * Create an instance of {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList }
     * 
     */
    public ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList createElChildTypeIndiviualizedProgramsListIndividualizedProgramPlanSigneeList() {
        return new ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList }
     * 
     */
    public ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList createElChildTypeElEducationalExperienceListElEducationalExperiencePriorELExperienceList() {
        return new ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList }
     * 
     */
    public ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList createElChildTypeElEducationalExperienceListElEducationalExperienceFoodServiceList() {
        return new ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList();
    }

    /**
     * Create an instance of {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService }
     * 
     */
    public ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService createElChildTypeElEducationalExperienceListElEducationalExperienceSpecialEducationServiceListSpecialEducationService() {
        return new ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService();
    }

    /**
     * Create an instance of {@link ElChildType.LanguageList.Language }
     * 
     */
    public ElChildType.LanguageList.Language createElChildTypeLanguageListLanguage() {
        return new ElChildType.LanguageList.Language();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.Insurance }
     * 
     */
    public ElChildType.HealthInformation.Insurance createElChildTypeHealthInformationInsurance() {
        return new ElChildType.HealthInformation.Insurance();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.Birth }
     * 
     */
    public ElChildType.HealthInformation.Birth createElChildTypeHealthInformationBirth() {
        return new ElChildType.HealthInformation.Birth();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.DentalScreeningList.DentalScreening }
     * 
     */
    public ElChildType.HealthInformation.DentalScreeningList.DentalScreening createElChildTypeHealthInformationDentalScreeningListDentalScreening() {
        return new ElChildType.HealthInformation.DentalScreeningList.DentalScreening();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.HearingScreeningList.HearingScreening }
     * 
     */
    public ElChildType.HealthInformation.HearingScreeningList.HearingScreening createElChildTypeHealthInformationHearingScreeningListHearingScreening() {
        return new ElChildType.HealthInformation.HearingScreeningList.HearingScreening();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.VisonScreeningList.VisionScreening }
     * 
     */
    public ElChildType.HealthInformation.VisonScreeningList.VisionScreening createElChildTypeHealthInformationVisonScreeningListVisionScreening() {
        return new ElChildType.HealthInformation.VisonScreeningList.VisionScreening();
    }

    /**
     * Create an instance of {@link ElChildType.HealthInformation.ImmunizationList.Immunization }
     * 
     */
    public ElChildType.HealthInformation.ImmunizationList.Immunization createElChildTypeHealthInformationImmunizationListImmunization() {
        return new ElChildType.HealthInformation.ImmunizationList.Immunization();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.EmailList.Email }
     * 
     */
    public ElChildType.Contact.EmailList.Email createElChildTypeContactEmailListEmail() {
        return new ElChildType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public ElChildType.Contact.PhoneNumberList.PhoneNumber createElChildTypeContactPhoneNumberListPhoneNumber() {
        return new ElChildType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ElChildType.Contact.AddressList.Address.Street }
     * 
     */
    public ElChildType.Contact.AddressList.Address.Street createElChildTypeContactAddressListAddressStreet() {
        return new ElChildType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ElChildType.Identity.Name }
     * 
     */
    public ElChildType.Identity.Name createElChildTypeIdentityName() {
        return new ElChildType.Identity.Name();
    }

    /**
     * Create an instance of {@link ElChildType.Identity.Identifier }
     * 
     */
    public ElChildType.Identity.Identifier createElChildTypeIdentityIdentifier() {
        return new ElChildType.Identity.Identifier();
    }

    /**
     * Create an instance of {@link ElChildType.Identity.OtherNameList.OtherName }
     * 
     */
    public ElChildType.Identity.OtherNameList.OtherName createElChildTypeIdentityOtherNameListOtherName() {
        return new ElChildType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link ElClassGroupType.Identification }
     * 
     */
    public ElClassGroupType.Identification createElClassGroupTypeIdentification() {
        return new ElClassGroupType.Identification();
    }

    /**
     * Create an instance of {@link ElClassGroupType.Structure }
     * 
     */
    public ElClassGroupType.Structure createElClassGroupTypeStructure() {
        return new ElClassGroupType.Structure();
    }

    /**
     * Create an instance of {@link ElClassGroupType.Population }
     * 
     */
    public ElClassGroupType.Population createElClassGroupTypePopulation() {
        return new ElClassGroupType.Population();
    }

    /**
     * Create an instance of {@link ElClassGroupType.Curriculum }
     * 
     */
    public ElClassGroupType.Curriculum createElClassGroupTypeCurriculum() {
        return new ElClassGroupType.Curriculum();
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
     * Create an instance of {@link AssessmentFormCEDSType.Subtest }
     * 
     */
    public AssessmentFormCEDSType.Subtest createAssessmentFormCEDSTypeSubtest() {
        return new AssessmentFormCEDSType.Subtest();
    }

    /**
     * Create an instance of {@link AssessmentFormCEDSType.SubtestAssessmentItem }
     * 
     */
    public AssessmentFormCEDSType.SubtestAssessmentItem createAssessmentFormCEDSTypeSubtestAssessmentItem() {
        return new AssessmentFormCEDSType.SubtestAssessmentItem();
    }

    /**
     * Create an instance of {@link FacilityType.AddressRefIdList }
     * 
     */
    public FacilityType.AddressRefIdList createFacilityTypeAddressRefIdList() {
        return new FacilityType.AddressRefIdList();
    }

    /**
     * Create an instance of {@link AeStaffType.Certification }
     * 
     */
    public AeStaffType.Certification createAeStaffTypeCertification() {
        return new AeStaffType.Certification();
    }

    /**
     * Create an instance of {@link AeStaffType.Credential }
     * 
     */
    public AeStaffType.Credential createAeStaffTypeCredential() {
        return new AeStaffType.Credential();
    }

    /**
     * Create an instance of {@link AeStaffType.Experience }
     * 
     */
    public AeStaffType.Experience createAeStaffTypeExperience() {
        return new AeStaffType.Experience();
    }

    /**
     * Create an instance of {@link AeStaffType.Employment }
     * 
     */
    public AeStaffType.Employment createAeStaffTypeEmployment() {
        return new AeStaffType.Employment();
    }

    /**
     * Create an instance of {@link AeStaffType.Assignment }
     * 
     */
    public AeStaffType.Assignment createAeStaffTypeAssignment() {
        return new AeStaffType.Assignment();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.EmailList.Email }
     * 
     */
    public AeStaffType.Contact.EmailList.Email createAeStaffTypeContactEmailListEmail() {
        return new AeStaffType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public AeStaffType.Contact.PhoneNumberList.PhoneNumber createAeStaffTypeContactPhoneNumberListPhoneNumber() {
        return new AeStaffType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link AeStaffType.Contact.AddressList.Address.Street }
     * 
     */
    public AeStaffType.Contact.AddressList.Address.Street createAeStaffTypeContactAddressListAddressStreet() {
        return new AeStaffType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link AeStaffType.Identity.Name }
     * 
     */
    public AeStaffType.Identity.Name createAeStaffTypeIdentityName() {
        return new AeStaffType.Identity.Name();
    }

    /**
     * Create an instance of {@link AeStaffType.Identity.Identification }
     * 
     */
    public AeStaffType.Identity.Identification createAeStaffTypeIdentityIdentification() {
        return new AeStaffType.Identity.Identification();
    }

    /**
     * Create an instance of {@link AeStaffType.Identity.OtherNameList.OtherName }
     * 
     */
    public AeStaffType.Identity.OtherNameList.OtherName createAeStaffTypeIdentityOtherNameListOtherName() {
        return new AeStaffType.Identity.OtherNameList.OtherName();
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
     * Create an instance of {@link WfParticipantType.AcademicRecord }
     * 
     */
    public WfParticipantType.AcademicRecord createWfParticipantTypeAcademicRecord() {
        return new WfParticipantType.AcademicRecord();
    }

    /**
     * Create an instance of {@link WfParticipantType.ProgramParticipationList.ProgramParticipation }
     * 
     */
    public WfParticipantType.ProgramParticipationList.ProgramParticipation createWfParticipantTypeProgramParticipationListProgramParticipation() {
        return new WfParticipantType.ProgramParticipationList.ProgramParticipation();
    }

    /**
     * Create an instance of {@link WfParticipantType.Identity.Name }
     * 
     */
    public WfParticipantType.Identity.Name createWfParticipantTypeIdentityName() {
        return new WfParticipantType.Identity.Name();
    }

    /**
     * Create an instance of {@link WfParticipantType.Identity.Identification }
     * 
     */
    public WfParticipantType.Identity.Identification createWfParticipantTypeIdentityIdentification() {
        return new WfParticipantType.Identity.Identification();
    }

    /**
     * Create an instance of {@link WfParticipantType.Identity.OtherNameList.OtherName }
     * 
     */
    public WfParticipantType.Identity.OtherNameList.OtherName createWfParticipantTypeIdentityOtherNameListOtherName() {
        return new WfParticipantType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link PsInstitutionType.Directory }
     * 
     */
    public PsInstitutionType.Directory createPsInstitutionTypeDirectory() {
        return new PsInstitutionType.Directory();
    }

    /**
     * Create an instance of {@link PsInstitutionType.Ipeds }
     * 
     */
    public PsInstitutionType.Ipeds createPsInstitutionTypeIpeds() {
        return new PsInstitutionType.Ipeds();
    }

    /**
     * Create an instance of {@link PsInstitutionType.AddressList.Address.Street }
     * 
     */
    public PsInstitutionType.AddressList.Address.Street createPsInstitutionTypeAddressListAddressStreet() {
        return new PsInstitutionType.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link PsInstitutionType.AddressList.Address.Gridlocation }
     * 
     */
    public PsInstitutionType.AddressList.Address.Gridlocation createPsInstitutionTypeAddressListAddressGridlocation() {
        return new PsInstitutionType.AddressList.Address.Gridlocation();
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
     * Create an instance of {@link PsContactPersonType.Relationship }
     * 
     */
    public PsContactPersonType.Relationship createPsContactPersonTypeRelationship() {
        return new PsContactPersonType.Relationship();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.EmailList.Email }
     * 
     */
    public PsContactPersonType.Contact.EmailList.Email createPsContactPersonTypeContactEmailListEmail() {
        return new PsContactPersonType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public PsContactPersonType.Contact.PhoneNumberList.PhoneNumber createPsContactPersonTypeContactPhoneNumberListPhoneNumber() {
        return new PsContactPersonType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Contact.AddressList.Address.Street }
     * 
     */
    public PsContactPersonType.Contact.AddressList.Address.Street createPsContactPersonTypeContactAddressListAddressStreet() {
        return new PsContactPersonType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Identity.Name }
     * 
     */
    public PsContactPersonType.Identity.Name createPsContactPersonTypeIdentityName() {
        return new PsContactPersonType.Identity.Name();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Identity.Identification }
     * 
     */
    public PsContactPersonType.Identity.Identification createPsContactPersonTypeIdentityIdentification() {
        return new PsContactPersonType.Identity.Identification();
    }

    /**
     * Create an instance of {@link PsContactPersonType.Identity.OtherNameList.OtherName }
     * 
     */
    public PsContactPersonType.Identity.OtherNameList.OtherName createPsContactPersonTypeIdentityOtherNameListOtherName() {
        return new PsContactPersonType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Demographic }
     * 
     */
    public ContactPersonCEDSType.Demographic createContactPersonCEDSTypeDemographic() {
        return new ContactPersonCEDSType.Demographic();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Relationship }
     * 
     */
    public ContactPersonCEDSType.Relationship createContactPersonCEDSTypeRelationship() {
        return new ContactPersonCEDSType.Relationship();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.EmailList.Email }
     * 
     */
    public ContactPersonCEDSType.Contact.EmailList.Email createContactPersonCEDSTypeContactEmailListEmail() {
        return new ContactPersonCEDSType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public ContactPersonCEDSType.Contact.PhoneNumberList.PhoneNumber createContactPersonCEDSTypeContactPhoneNumberListPhoneNumber() {
        return new ContactPersonCEDSType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Contact.AddressList.Address.Street }
     * 
     */
    public ContactPersonCEDSType.Contact.AddressList.Address.Street createContactPersonCEDSTypeContactAddressListAddressStreet() {
        return new ContactPersonCEDSType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Identity.Name }
     * 
     */
    public ContactPersonCEDSType.Identity.Name createContactPersonCEDSTypeIdentityName() {
        return new ContactPersonCEDSType.Identity.Name();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Identity.Identification }
     * 
     */
    public ContactPersonCEDSType.Identity.Identification createContactPersonCEDSTypeIdentityIdentification() {
        return new ContactPersonCEDSType.Identity.Identification();
    }

    /**
     * Create an instance of {@link ContactPersonCEDSType.Identity.OtherNameList.OtherName }
     * 
     */
    public ContactPersonCEDSType.Identity.OtherNameList.OtherName createContactPersonCEDSTypeIdentityOtherNameListOtherName() {
        return new ContactPersonCEDSType.Identity.OtherNameList.OtherName();
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
     * Create an instance of {@link AssessmentItemCEDSType.ItemPossibleResponse }
     * 
     */
    public AssessmentItemCEDSType.ItemPossibleResponse createAssessmentItemCEDSTypeItemPossibleResponse() {
        return new AssessmentItemCEDSType.ItemPossibleResponse();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.ItemResponse }
     * 
     */
    public AssessmentItemCEDSType.ItemResponse createAssessmentItemCEDSTypeItemResponse() {
        return new AssessmentItemCEDSType.ItemResponse();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.ItemResponseTheory }
     * 
     */
    public AssessmentItemCEDSType.ItemResponseTheory createAssessmentItemCEDSTypeItemResponseTheory() {
        return new AssessmentItemCEDSType.ItemResponseTheory();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.ItemBodyCustomInteraction }
     * 
     */
    public AssessmentItemCEDSType.ItemBodyCustomInteraction createAssessmentItemCEDSTypeItemBodyCustomInteraction() {
        return new AssessmentItemCEDSType.ItemBodyCustomInteraction();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.ItemCharacteristic }
     * 
     */
    public AssessmentItemCEDSType.ItemCharacteristic createAssessmentItemCEDSTypeItemCharacteristic() {
        return new AssessmentItemCEDSType.ItemCharacteristic();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.AssessmentRubric }
     * 
     */
    public AssessmentItemCEDSType.AssessmentRubric createAssessmentItemCEDSTypeAssessmentRubric() {
        return new AssessmentItemCEDSType.AssessmentRubric();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.Apip }
     * 
     */
    public AssessmentItemCEDSType.Apip createAssessmentItemCEDSTypeApip() {
        return new AssessmentItemCEDSType.Apip();
    }

    /**
     * Create an instance of {@link AssessmentItemCEDSType.ApipInteraction }
     * 
     */
    public AssessmentItemCEDSType.ApipInteraction createAssessmentItemCEDSTypeApipInteraction() {
        return new AssessmentItemCEDSType.ApipInteraction();
    }

    /**
     * Create an instance of {@link K12StaffType.Demographic }
     * 
     */
    public K12StaffType.Demographic createK12StaffTypeDemographic() {
        return new K12StaffType.Demographic();
    }

    /**
     * Create an instance of {@link K12StaffType.Assignment }
     * 
     */
    public K12StaffType.Assignment createK12StaffTypeAssignment() {
        return new K12StaffType.Assignment();
    }

    /**
     * Create an instance of {@link K12StaffType.Credential }
     * 
     */
    public K12StaffType.Credential createK12StaffTypeCredential() {
        return new K12StaffType.Credential();
    }

    /**
     * Create an instance of {@link K12StaffType.Employment }
     * 
     */
    public K12StaffType.Employment createK12StaffTypeEmployment() {
        return new K12StaffType.Employment();
    }

    /**
     * Create an instance of {@link K12StaffType.ProfessionalDevelopment }
     * 
     */
    public K12StaffType.ProfessionalDevelopment createK12StaffTypeProfessionalDevelopment() {
        return new K12StaffType.ProfessionalDevelopment();
    }

    /**
     * Create an instance of {@link K12StaffType.Attendance }
     * 
     */
    public K12StaffType.Attendance createK12StaffTypeAttendance() {
        return new K12StaffType.Attendance();
    }

    /**
     * Create an instance of {@link K12StaffType.TechnicalAssistance }
     * 
     */
    public K12StaffType.TechnicalAssistance createK12StaffTypeTechnicalAssistance() {
        return new K12StaffType.TechnicalAssistance();
    }

    /**
     * Create an instance of {@link K12StaffType.ProfessionalDevelopmentActivity.Session }
     * 
     */
    public K12StaffType.ProfessionalDevelopmentActivity.Session createK12StaffTypeProfessionalDevelopmentActivitySession() {
        return new K12StaffType.ProfessionalDevelopmentActivity.Session();
    }

    /**
     * Create an instance of {@link K12StaffType.ProfessionalDevelopmentActivity.SessionLocation }
     * 
     */
    public K12StaffType.ProfessionalDevelopmentActivity.SessionLocation createK12StaffTypeProfessionalDevelopmentActivitySessionLocation() {
        return new K12StaffType.ProfessionalDevelopmentActivity.SessionLocation();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.EmailList.Email }
     * 
     */
    public K12StaffType.Contact.EmailList.Email createK12StaffTypeContactEmailListEmail() {
        return new K12StaffType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public K12StaffType.Contact.PhoneNumberList.PhoneNumber createK12StaffTypeContactPhoneNumberListPhoneNumber() {
        return new K12StaffType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link K12StaffType.Contact.AddressList.Address.Street }
     * 
     */
    public K12StaffType.Contact.AddressList.Address.Street createK12StaffTypeContactAddressListAddressStreet() {
        return new K12StaffType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link K12StaffType.Identity.Name }
     * 
     */
    public K12StaffType.Identity.Name createK12StaffTypeIdentityName() {
        return new K12StaffType.Identity.Name();
    }

    /**
     * Create an instance of {@link K12StaffType.Identity.Identification }
     * 
     */
    public K12StaffType.Identity.Identification createK12StaffTypeIdentityIdentification() {
        return new K12StaffType.Identity.Identification();
    }

    /**
     * Create an instance of {@link K12StaffType.Identity.OtherNameList.OtherName }
     * 
     */
    public K12StaffType.Identity.OtherNameList.OtherName createK12StaffTypeIdentityOtherNameListOtherName() {
        return new K12StaffType.Identity.OtherNameList.OtherName();
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
     * Create an instance of {@link ElContactPersonType.Demographic }
     * 
     */
    public ElContactPersonType.Demographic createElContactPersonTypeDemographic() {
        return new ElContactPersonType.Demographic();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Education }
     * 
     */
    public ElContactPersonType.Education createElContactPersonTypeEducation() {
        return new ElContactPersonType.Education();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.EmailList.Email }
     * 
     */
    public ElContactPersonType.Contact.EmailList.Email createElContactPersonTypeContactEmailListEmail() {
        return new ElContactPersonType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public ElContactPersonType.Contact.PhoneNumberList.PhoneNumber createElContactPersonTypeContactPhoneNumberListPhoneNumber() {
        return new ElContactPersonType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Contact.AddressList.Address.Street }
     * 
     */
    public ElContactPersonType.Contact.AddressList.Address.Street createElContactPersonTypeContactAddressListAddressStreet() {
        return new ElContactPersonType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Identity.Name }
     * 
     */
    public ElContactPersonType.Identity.Name createElContactPersonTypeIdentityName() {
        return new ElContactPersonType.Identity.Name();
    }

    /**
     * Create an instance of {@link ElContactPersonType.Identity.OtherNameList.OtherName }
     * 
     */
    public ElContactPersonType.Identity.OtherNameList.OtherName createElContactPersonTypeIdentityOtherNameListOtherName() {
        return new ElContactPersonType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link CteStaffType.Credential }
     * 
     */
    public CteStaffType.Credential createCteStaffTypeCredential() {
        return new CteStaffType.Credential();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.EmailList.Email }
     * 
     */
    public CteStaffType.Contact.EmailList.Email createCteStaffTypeContactEmailListEmail() {
        return new CteStaffType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public CteStaffType.Contact.PhoneNumberList.PhoneNumber createCteStaffTypeContactPhoneNumberListPhoneNumber() {
        return new CteStaffType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link CteStaffType.Contact.AddressList.Address.Street }
     * 
     */
    public CteStaffType.Contact.AddressList.Address.Street createCteStaffTypeContactAddressListAddressStreet() {
        return new CteStaffType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link CteStaffType.Identity.Name }
     * 
     */
    public CteStaffType.Identity.Name createCteStaffTypeIdentityName() {
        return new CteStaffType.Identity.Name();
    }

    /**
     * Create an instance of {@link CteStaffType.Identity.Identification }
     * 
     */
    public CteStaffType.Identity.Identification createCteStaffTypeIdentityIdentification() {
        return new CteStaffType.Identity.Identification();
    }

    /**
     * Create an instance of {@link CteStaffType.Identity.OtherNameList.OtherName }
     * 
     */
    public CteStaffType.Identity.OtherNameList.OtherName createCteStaffTypeIdentityOtherNameListOtherName() {
        return new CteStaffType.Identity.OtherNameList.OtherName();
    }

    /**
     * Create an instance of {@link ElAssessmentType.Design }
     * 
     */
    public ElAssessmentType.Design createElAssessmentTypeDesign() {
        return new ElAssessmentType.Design();
    }

    /**
     * Create an instance of {@link ElAssessmentType.Administration }
     * 
     */
    public ElAssessmentType.Administration createElAssessmentTypeAdministration() {
        return new ElAssessmentType.Administration();
    }

    /**
     * Create an instance of {@link ElAssessmentType.Result }
     * 
     */
    public ElAssessmentType.Result createElAssessmentTypeResult() {
        return new ElAssessmentType.Result();
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
     * Create an instance of {@link AssessmentPersonalNeedsProfileCEDSType.ProfileContent }
     * 
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileContent createAssessmentPersonalNeedsProfileCEDSTypeProfileContent() {
        return new AssessmentPersonalNeedsProfileCEDSType.ProfileContent();
    }

    /**
     * Create an instance of {@link AssessmentPersonalNeedsProfileCEDSType.ProfileControl }
     * 
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileControl createAssessmentPersonalNeedsProfileCEDSTypeProfileControl() {
        return new AssessmentPersonalNeedsProfileCEDSType.ProfileControl();
    }

    /**
     * Create an instance of {@link AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay }
     * 
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay createAssessmentPersonalNeedsProfileCEDSTypeProfileDisplay() {
        return new AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay();
    }

    /**
     * Create an instance of {@link AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement }
     * 
     */
    public AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement createAssessmentPersonalNeedsProfileCEDSTypeScreenEnhancement() {
        return new AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement();
    }

    /**
     * Create an instance of {@link AeStudentType.Demographic }
     * 
     */
    public AeStudentType.Demographic createAeStudentTypeDemographic() {
        return new AeStudentType.Demographic();
    }

    /**
     * Create an instance of {@link AeStudentType.Status }
     * 
     */
    public AeStudentType.Status createAeStudentTypeStatus() {
        return new AeStudentType.Status();
    }

    /**
     * Create an instance of {@link AeStudentType.Employment }
     * 
     */
    public AeStudentType.Employment createAeStudentTypeEmployment() {
        return new AeStudentType.Employment();
    }

    /**
     * Create an instance of {@link AeStudentType.AcademicRecord }
     * 
     */
    public AeStudentType.AcademicRecord createAeStudentTypeAcademicRecord() {
        return new AeStudentType.AcademicRecord();
    }

    /**
     * Create an instance of {@link AeStudentType.AeProgramList.AeProgram }
     * 
     */
    public AeStudentType.AeProgramList.AeProgram createAeStudentTypeAeProgramListAeProgram() {
        return new AeStudentType.AeProgramList.AeProgram();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.EmailList.Email }
     * 
     */
    public AeStudentType.Contact.EmailList.Email createAeStudentTypeContactEmailListEmail() {
        return new AeStudentType.Contact.EmailList.Email();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.PhoneNumberList.PhoneNumber }
     * 
     */
    public AeStudentType.Contact.PhoneNumberList.PhoneNumber createAeStudentTypeContactPhoneNumberListPhoneNumber() {
        return new AeStudentType.Contact.PhoneNumberList.PhoneNumber();
    }

    /**
     * Create an instance of {@link AeStudentType.Contact.AddressList.Address.Street }
     * 
     */
    public AeStudentType.Contact.AddressList.Address.Street createAeStudentTypeContactAddressListAddressStreet() {
        return new AeStudentType.Contact.AddressList.Address.Street();
    }

    /**
     * Create an instance of {@link AeStudentType.Identity.Name }
     * 
     */
    public AeStudentType.Identity.Name createAeStudentTypeIdentityName() {
        return new AeStudentType.Identity.Name();
    }

    /**
     * Create an instance of {@link AeStudentType.Identity.Identification }
     * 
     */
    public AeStudentType.Identity.Identification createAeStudentTypeIdentityIdentification() {
        return new AeStudentType.Identity.Identification();
    }

    /**
     * Create an instance of {@link AeStudentType.Identity.OtherNameList.OtherName }
     * 
     */
    public AeStudentType.Identity.OtherNameList.OtherName createAeStudentTypeIdentityOtherNameListOtherName() {
        return new AeStudentType.Identity.OtherNameList.OtherName();
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
     * Create an instance of {@link StudentCoreType.ConcurrentSchoolList.ConcurrentSchool }
     * 
     */
    public StudentCoreType.ConcurrentSchoolList.ConcurrentSchool createStudentCoreTypeConcurrentSchoolListConcurrentSchool() {
        return new StudentCoreType.ConcurrentSchoolList.ConcurrentSchool();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeStudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeStudents")
    public JAXBElement<AeStudentCollectionType> createAeStudents(AeStudentCollectionType value) {
        return new JAXBElement<AeStudentCollectionType>(_AeStudents_QNAME, AeStudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsAssessmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psAssessment")
    public JAXBElement<PsAssessmentType> createPsAssessment(PsAssessmentType value) {
        return new JAXBElement<PsAssessmentType>(_PsAssessment_QNAME, PsAssessmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentPersonalNeedsProfileCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentPersonalNeedsProfileCEDS")
    public JAXBElement<AssessmentPersonalNeedsProfileCEDSType> createAssessmentPersonalNeedsProfileCEDS(AssessmentPersonalNeedsProfileCEDSType value) {
        return new JAXBElement<AssessmentPersonalNeedsProfileCEDSType>(_AssessmentPersonalNeedsProfileCEDS_QNAME, AssessmentPersonalNeedsProfileCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentRegistration")
    public JAXBElement<AssessmentRegistrationType> createAssessmentRegistration(AssessmentRegistrationType value) {
        return new JAXBElement<AssessmentRegistrationType>(_AssessmentRegistration_QNAME, AssessmentRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeStudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeStudent")
    public JAXBElement<AeStudentType> createAeStudent(AeStudentType value) {
        return new JAXBElement<AeStudentType>(_AeStudent_QNAME, AeStudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffPerson")
    public JAXBElement<StaffPersonType> createStaffPerson(StaffPersonType value) {
        return new JAXBElement<StaffPersonType>(_StaffPerson_QNAME, StaffPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentCore")
    public JAXBElement<StudentCoreType> createStudentCore(StudentCoreType value) {
        return new JAXBElement<StudentCoreType>(_StudentCore_QNAME, StudentCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentForm")
    public JAXBElement<AssessmentFormType> createAssessmentForm(AssessmentFormType value) {
        return new JAXBElement<AssessmentFormType>(_AssessmentForm_QNAME, AssessmentFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAssetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAsset")
    public JAXBElement<AssessmentAssetType> createAssessmentAsset(AssessmentAssetType value) {
        return new JAXBElement<AssessmentAssetType>(_AssessmentAsset_QNAME, AssessmentAssetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "seas")
    public JAXBElement<SeaCollectionType> createSeas(SeaCollectionType value) {
        return new JAXBElement<SeaCollectionType>(_Seas_QNAME, SeaCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "schoolCalendar")
    public JAXBElement<SchoolCalendarType> createSchoolCalendar(SchoolCalendarType value) {
        return new JAXBElement<SchoolCalendarType>(_SchoolCalendar_QNAME, SchoolCalendarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResponseSetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentResponseSets")
    public JAXBElement<AssessmentResponseSetCollectionType> createAssessmentResponseSets(AssessmentResponseSetCollectionType value) {
        return new JAXBElement<AssessmentResponseSetCollectionType>(_AssessmentResponseSets_QNAME, AssessmentResponseSetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffPersons")
    public JAXBElement<StaffPersonCollectionType> createStaffPersons(StaffPersonCollectionType value) {
        return new JAXBElement<StaffPersonCollectionType>(_StaffPersons_QNAME, StaffPersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsStudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psStudents")
    public JAXBElement<PsStudentCollectionType> createPsStudents(PsStudentCollectionType value) {
        return new JAXBElement<PsStudentCollectionType>(_PsStudents_QNAME, PsStudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPersons")
    public JAXBElement<ContactPersonCollectionType> createContactPersons(ContactPersonCollectionType value) {
        return new JAXBElement<ContactPersonCollectionType>(_ContactPersons_QNAME, ContactPersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardItems")
    public JAXBElement<LearningStandardItemCollectionType> createLearningStandardItems(LearningStandardItemCollectionType value) {
        return new JAXBElement<LearningStandardItemCollectionType>(_LearningStandardItems_QNAME, LearningStandardItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authentications")
    public JAXBElement<AuthenticationCollectionType> createAuthentications(AuthenticationCollectionType value) {
        return new JAXBElement<AuthenticationCollectionType>(_Authentications_QNAME, AuthenticationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12StudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Students")
    public JAXBElement<K12StudentCollectionType> createK12Students(K12StudentCollectionType value) {
        return new JAXBElement<K12StudentCollectionType>(_K12Students_QNAME, K12StudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElContactPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elContactPerson")
    public JAXBElement<ElContactPersonType> createElContactPerson(ElContactPersonType value) {
        return new JAXBElement<ElContactPersonType>(_ElContactPerson_QNAME, ElContactPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchievementCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "achievementCEDS")
    public JAXBElement<AchievementCEDSType> createAchievementCEDS(AchievementCEDSType value) {
        return new JAXBElement<AchievementCEDSType>(_AchievementCEDS_QNAME, AchievementCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAdministrationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAdministrations")
    public JAXBElement<AssessmentAdministrationCollectionType> createAssessmentAdministrations(AssessmentAdministrationCollectionType value) {
        return new JAXBElement<AssessmentAdministrationCollectionType>(_AssessmentAdministrations_QNAME, AssessmentAdministrationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SreCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sres")
    public JAXBElement<SreCollectionType> createSres(SreCollectionType value) {
        return new JAXBElement<SreCollectionType>(_Sres_QNAME, SreCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "programCEDSs")
    public JAXBElement<ProgramCEDSCollectionType> createProgramCEDSs(ProgramCEDSCollectionType value) {
        return new JAXBElement<ProgramCEDSCollectionType>(_ProgramCEDSs_QNAME, ProgramCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteStaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteStaff")
    public JAXBElement<CteStaffType> createCteStaff(CteStaffType value) {
        return new JAXBElement<CteStaffType>(_CteStaff_QNAME, CteStaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "schoolCalendarItem")
    public JAXBElement<SchoolCalendarItemType> createSchoolCalendarItem(SchoolCalendarItemType value) {
        return new JAXBElement<SchoolCalendarItemType>(_SchoolCalendarItem_QNAME, SchoolCalendarItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElAssessmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elAssessment")
    public JAXBElement<ElAssessmentType> createElAssessment(ElAssessmentType value) {
        return new JAXBElement<ElAssessmentType>(_ElAssessment_QNAME, ElAssessmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeSectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeSections")
    public JAXBElement<AeSectionCollectionType> createAeSections(AeSectionCollectionType value) {
        return new JAXBElement<AeSectionCollectionType>(_AeSections_QNAME, AeSectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentSchoolAssociation")
    public JAXBElement<StudentSchoolAssociationType> createStudentSchoolAssociation(StudentSchoolAssociationType value) {
        return new JAXBElement<StudentSchoolAssociationType>(_StudentSchoolAssociation_QNAME, StudentSchoolAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchievementCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "achievementCEDSs")
    public JAXBElement<AchievementCEDSCollectionType> createAchievementCEDSs(AchievementCEDSCollectionType value) {
        return new JAXBElement<AchievementCEDSCollectionType>(_AchievementCEDSs_QNAME, AchievementCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeProgramCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aePrograms")
    public JAXBElement<AeProgramCollectionType> createAePrograms(AeProgramCollectionType value) {
        return new JAXBElement<AeProgramCollectionType>(_AePrograms_QNAME, AeProgramCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearnerActivityCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learnerActivityCEDS")
    public JAXBElement<LearnerActivityCEDSType> createLearnerActivityCEDS(LearnerActivityCEDSType value) {
        return new JAXBElement<LearnerActivityCEDSType>(_LearnerActivityCEDS_QNAME, LearnerActivityCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationApplicationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authorizationApplications")
    public JAXBElement<AuthorizationApplicationCollectionType> createAuthorizationApplications(AuthorizationApplicationCollectionType value) {
        return new JAXBElement<AuthorizationApplicationCollectionType>(_AuthorizationApplications_QNAME, AuthorizationApplicationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12CourseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Course")
    public JAXBElement<K12CourseType> createK12Course(K12CourseType value) {
        return new JAXBElement<K12CourseType>(_K12Course_QNAME, K12CourseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPersonAssociation")
    public JAXBElement<ContactPersonAssociationType> createContactPersonAssociation(ContactPersonAssociationType value) {
        return new JAXBElement<ContactPersonAssociationType>(_ContactPersonAssociation_QNAME, ContactPersonAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElChildCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elChilds")
    public JAXBElement<ElChildCollectionType> createElChilds(ElChildCollectionType value) {
        return new JAXBElement<ElChildCollectionType>(_ElChilds_QNAME, ElChildCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisciplineIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "disciplineIncident")
    public JAXBElement<DisciplineIncidentType> createDisciplineIncident(DisciplineIncidentType value) {
        return new JAXBElement<DisciplineIncidentType>(_DisciplineIncident_QNAME, DisciplineIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "facilityCEDSs")
    public JAXBElement<FacilityCEDSCollectionType> createFacilityCEDSs(FacilityCEDSCollectionType value) {
        return new JAXBElement<FacilityCEDSCollectionType>(_FacilityCEDSs_QNAME, FacilityCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentScoreTables")
    public JAXBElement<AssessmentScoreTableCollectionType> createAssessmentScoreTables(AssessmentScoreTableCollectionType value) {
        return new JAXBElement<AssessmentScoreTableCollectionType>(_AssessmentScoreTables_QNAME, AssessmentScoreTableCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElOrganizationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elOrganizations")
    public JAXBElement<ElOrganizationCollectionType> createElOrganizations(ElOrganizationCollectionType value) {
        return new JAXBElement<ElOrganizationCollectionType>(_ElOrganizations_QNAME, ElOrganizationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "incidentCEDS")
    public JAXBElement<IncidentCEDSType> createIncidentCEDS(IncidentCEDSType value) {
        return new JAXBElement<IncidentCEDSType>(_IncidentCEDS_QNAME, IncidentCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeStaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeStaffs")
    public JAXBElement<AeStaffCollectionType> createAeStaffs(AeStaffCollectionType value) {
        return new JAXBElement<AeStaffCollectionType>(_AeStaffs_QNAME, AeStaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12StaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Staff")
    public JAXBElement<K12StaffType> createK12Staff(K12StaffType value) {
        return new JAXBElement<K12StaffType>(_K12Staff_QNAME, K12StaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElClassGroupCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elClassGroups")
    public JAXBElement<ElClassGroupCollectionType> createElClassGroups(ElClassGroupCollectionType value) {
        return new JAXBElement<ElClassGroupCollectionType>(_ElClassGroups_QNAME, ElClassGroupCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeProgram")
    public JAXBElement<AeProgramType> createAeProgram(AeProgramType value) {
        return new JAXBElement<AeProgramType>(_AeProgram_QNAME, AeProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningGoalCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningGoalCEDS")
    public JAXBElement<LearningGoalCEDSType> createLearningGoalCEDS(LearningGoalCEDSType value) {
        return new JAXBElement<LearningGoalCEDSType>(_LearningGoalCEDS_QNAME, LearningGoalCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffSectionAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffSectionAssociations")
    public JAXBElement<StaffSectionAssociationCollectionType> createStaffSectionAssociations(StaffSectionAssociationCollectionType value) {
        return new JAXBElement<StaffSectionAssociationCollectionType>(_StaffSectionAssociations_QNAME, StaffSectionAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGroupAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "personGroupAssociations")
    public JAXBElement<PersonGroupAssociationCollectionType> createPersonGroupAssociations(PersonGroupAssociationCollectionType value) {
        return new JAXBElement<PersonGroupAssociationCollectionType>(_PersonGroupAssociations_QNAME, PersonGroupAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsContactPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psContactPerson")
    public JAXBElement<PsContactPersonType> createPsContactPerson(PsContactPersonType value) {
        return new JAXBElement<PsContactPersonType>(_PsContactPerson_QNAME, PsContactPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningResource")
    public JAXBElement<LearningResourceType> createLearningResource(LearningResourceType value) {
        return new JAXBElement<LearningResourceType>(_LearningResource_QNAME, LearningResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPersonCEDS")
    public JAXBElement<ContactPersonCEDSType> createContactPersonCEDS(ContactPersonCEDSType value) {
        return new JAXBElement<ContactPersonCEDSType>(_ContactPersonCEDS_QNAME, ContactPersonCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAdministrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAdministration")
    public JAXBElement<AssessmentAdministrationType> createAssessmentAdministration(AssessmentAdministrationType value) {
        return new JAXBElement<AssessmentAdministrationType>(_AssessmentAdministration_QNAME, AssessmentAdministrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "student")
    public JAXBElement<StudentType> createStudent(StudentType value) {
        return new JAXBElement<StudentType>(_Student_QNAME, StudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteSectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteSections")
    public JAXBElement<CteSectionCollectionType> createCteSections(CteSectionCollectionType value) {
        return new JAXBElement<CteSectionCollectionType>(_CteSections_QNAME, CteSectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteStudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteStudents")
    public JAXBElement<CteStudentCollectionType> createCteStudents(CteStudentCollectionType value) {
        return new JAXBElement<CteStudentCollectionType>(_CteStudents_QNAME, CteStudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeProviderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeProvider")
    public JAXBElement<AeProviderType> createAeProvider(AeProviderType value) {
        return new JAXBElement<AeProviderType>(_AeProvider_QNAME, AeProviderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessments")
    public JAXBElement<AssessmentCollectionType> createAssessments(AssessmentCollectionType value) {
        return new JAXBElement<AssessmentCollectionType>(_Assessments_QNAME, AssessmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentItemCEDS")
    public JAXBElement<AssessmentItemCEDSType> createAssessmentItemCEDS(AssessmentItemCEDSType value) {
        return new JAXBElement<AssessmentItemCEDSType>(_AssessmentItemCEDS_QNAME, AssessmentItemCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardAssociation")
    public JAXBElement<LearningStandardAssociationType> createLearningStandardAssociation(LearningStandardAssociationType value) {
        return new JAXBElement<LearningStandardAssociationType>(_LearningStandardAssociation_QNAME, LearningStandardAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "financialReport")
    public JAXBElement<FinancialReportType> createFinancialReport(FinancialReportType value) {
        return new JAXBElement<FinancialReportType>(_FinancialReport_QNAME, FinancialReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "calendarCEDSs")
    public JAXBElement<CalendarCEDSCollectionType> createCalendarCEDSs(CalendarCEDSCollectionType value) {
        return new JAXBElement<CalendarCEDSCollectionType>(_CalendarCEDSs_QNAME, CalendarCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "terms")
    public JAXBElement<TermCollectionType> createTerms(TermCollectionType value) {
        return new JAXBElement<TermCollectionType>(_Terms_QNAME, TermCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSummaryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSummarys")
    public JAXBElement<AssessmentSummaryCollectionType> createAssessmentSummarys(AssessmentSummaryCollectionType value) {
        return new JAXBElement<AssessmentSummaryCollectionType>(_AssessmentSummarys_QNAME, AssessmentSummaryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "leas")
    public JAXBElement<LeaCollectionType> createLeas(LeaCollectionType value) {
        return new JAXBElement<LeaCollectionType>(_Leas_QNAME, LeaCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFormCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentForms")
    public JAXBElement<AssessmentFormCollectionType> createAssessmentForms(AssessmentFormCollectionType value) {
        return new JAXBElement<AssessmentFormCollectionType>(_AssessmentForms_QNAME, AssessmentFormCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubtestResultCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSubtestResultCEDS")
    public JAXBElement<AssessmentSubtestResultCEDSType> createAssessmentSubtestResultCEDS(AssessmentSubtestResultCEDSType value) {
        return new JAXBElement<AssessmentSubtestResultCEDSType>(_AssessmentSubtestResultCEDS_QNAME, AssessmentSubtestResultCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentScoreTable")
    public JAXBElement<AssessmentScoreTableType> createAssessmentScoreTable(AssessmentScoreTableType value) {
        return new JAXBElement<AssessmentScoreTableType>(_AssessmentScoreTable_QNAME, AssessmentScoreTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentCEDS")
    public JAXBElement<AssessmentCEDSType> createAssessmentCEDS(AssessmentCEDSType value) {
        return new JAXBElement<AssessmentCEDSType>(_AssessmentCEDS_QNAME, AssessmentCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionRosterReportCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sectionRosterReports")
    public JAXBElement<SectionRosterReportCollectionType> createSectionRosterReports(SectionRosterReportCollectionType value) {
        return new JAXBElement<SectionRosterReportCollectionType>(_SectionRosterReports_QNAME, SectionRosterReportCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSummary")
    public JAXBElement<AssessmentSummaryType> createAssessmentSummary(AssessmentSummaryType value) {
        return new JAXBElement<AssessmentSummaryType>(_AssessmentSummary_QNAME, AssessmentSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentRubric")
    public JAXBElement<AssessmentRubricType> createAssessmentRubric(AssessmentRubricType value) {
        return new JAXBElement<AssessmentRubricType>(_AssessmentRubric_QNAME, AssessmentRubricType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardDocumentCEDS")
    public JAXBElement<LearningStandardDocumentCEDSType> createLearningStandardDocumentCEDS(LearningStandardDocumentCEDSType value) {
        return new JAXBElement<LearningStandardDocumentCEDSType>(_LearningStandardDocumentCEDS_QNAME, LearningStandardDocumentCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentItems")
    public JAXBElement<AssessmentItemCollectionType> createAssessmentItems(AssessmentItemCollectionType value) {
        return new JAXBElement<AssessmentItemCollectionType>(_AssessmentItems_QNAME, AssessmentItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffSectionAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffSectionAssociation")
    public JAXBElement<StaffSectionAssociationType> createStaffSectionAssociation(StaffSectionAssociationType value) {
        return new JAXBElement<StaffSectionAssociationType>(_StaffSectionAssociation_QNAME, StaffSectionAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardItem")
    public JAXBElement<LearningStandardItemType> createLearningStandardItem(LearningStandardItemType value) {
        return new JAXBElement<LearningStandardItemType>(_LearningStandardItem_QNAME, LearningStandardItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentParticipantSessionCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentParticipantSessionCEDS")
    public JAXBElement<AssessmentParticipantSessionCEDSType> createAssessmentParticipantSessionCEDS(AssessmentParticipantSessionCEDSType value) {
        return new JAXBElement<AssessmentParticipantSessionCEDSType>(_AssessmentParticipantSessionCEDS_QNAME, AssessmentParticipantSessionCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFormCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentFormCEDS")
    public JAXBElement<AssessmentFormCEDSType> createAssessmentFormCEDS(AssessmentFormCEDSType value) {
        return new JAXBElement<AssessmentFormCEDSType>(_AssessmentFormCEDS_QNAME, AssessmentFormCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningResources")
    public JAXBElement<LearningResourceCollectionType> createLearningResources(LearningResourceCollectionType value) {
        return new JAXBElement<LearningResourceCollectionType>(_LearningResources_QNAME, LearningResourceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12SectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Sections")
    public JAXBElement<K12SectionCollectionType> createK12Sections(K12SectionCollectionType value) {
        return new JAXBElement<K12SectionCollectionType>(_K12Sections_QNAME, K12SectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentGuardianCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "parentGuardianCEDSs")
    public JAXBElement<ParentGuardianCEDSCollectionType> createParentGuardianCEDSs(ParentGuardianCEDSCollectionType value) {
        return new JAXBElement<ParentGuardianCEDSCollectionType>(_ParentGuardianCEDSs_QNAME, ParentGuardianCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPersonAssociations")
    public JAXBElement<ContactPersonAssociationCollectionType> createContactPersonAssociations(ContactPersonAssociationCollectionType value) {
        return new JAXBElement<ContactPersonAssociationCollectionType>(_ContactPersonAssociations_QNAME, ContactPersonAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "facility")
    public JAXBElement<FacilityType> createFacility(FacilityType value) {
        return new JAXBElement<FacilityType>(_Facility_QNAME, FacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeStaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeStaff")
    public JAXBElement<AeStaffType> createAeStaff(AeStaffType value) {
        return new JAXBElement<AeStaffType>(_AeStaff_QNAME, AeStaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "partyOrganizationAssociations")
    public JAXBElement<PartyOrganizationAssociationCollectionType> createPartyOrganizationAssociations(PartyOrganizationAssociationCollectionType value) {
        return new JAXBElement<PartyOrganizationAssociationCollectionType>(_PartyOrganizationAssociations_QNAME, PartyOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentSectionAssociation")
    public JAXBElement<StudentSectionAssociationType> createStudentSectionAssociation(StudentSectionAssociationType value) {
        return new JAXBElement<StudentSectionAssociationType>(_StudentSectionAssociation_QNAME, StudentSectionAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentScoreSet")
    public JAXBElement<AssessmentScoreSetType> createAssessmentScoreSet(AssessmentScoreSetType value) {
        return new JAXBElement<AssessmentScoreSetType>(_AssessmentScoreSet_QNAME, AssessmentScoreSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "organizationOrganizationAssociations")
    public JAXBElement<OrganizationOrganizationAssociationCollectionType> createOrganizationOrganizationAssociations(OrganizationOrganizationAssociationCollectionType value) {
        return new JAXBElement<OrganizationOrganizationAssociationCollectionType>(_OrganizationOrganizationAssociations_QNAME, OrganizationOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RubricCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "rubricCEDS")
    public JAXBElement<RubricCEDSType> createRubricCEDS(RubricCEDSType value) {
        return new JAXBElement<RubricCEDSType>(_RubricCEDS_QNAME, RubricCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "addresss")
    public JAXBElement<AddressCollectionType> createAddresss(AddressCollectionType value) {
        return new JAXBElement<AddressCollectionType>(_Addresss_QNAME, AddressCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "wfParticipant")
    public JAXBElement<WfParticipantType> createWfParticipant(WfParticipantType value) {
        return new JAXBElement<WfParticipantType>(_WfParticipant_QNAME, WfParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsInstitutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psInstitution")
    public JAXBElement<PsInstitutionType> createPsInstitution(PsInstitutionType value) {
        return new JAXBElement<PsInstitutionType>(_PsInstitution_QNAME, PsInstitutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeProviderCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeProviders")
    public JAXBElement<AeProviderCollectionType> createAeProviders(AeProviderCollectionType value) {
        return new JAXBElement<AeProviderCollectionType>(_AeProviders_QNAME, AeProviderCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsApplicantCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psApplicants")
    public JAXBElement<PsApplicantCollectionType> createPsApplicants(PsApplicantCollectionType value) {
        return new JAXBElement<PsApplicantCollectionType>(_PsApplicants_QNAME, PsApplicantCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "schoolCalendars")
    public JAXBElement<SchoolCalendarCollectionType> createSchoolCalendars(SchoolCalendarCollectionType value) {
        return new JAXBElement<SchoolCalendarCollectionType>(_SchoolCalendars_QNAME, SchoolCalendarCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "aeSection")
    public JAXBElement<AeSectionType> createAeSection(AeSectionType value) {
        return new JAXBElement<AeSectionType>(_AeSection_QNAME, AeSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationIdentityProviderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authenticationIdentityProvider")
    public JAXBElement<AuthenticationIdentityProviderType> createAuthenticationIdentityProvider(AuthenticationIdentityProviderType value) {
        return new JAXBElement<AuthenticationIdentityProviderType>(_AuthenticationIdentityProvider_QNAME, AuthenticationIdentityProviderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessment")
    public JAXBElement<AssessmentType> createAssessment(AssessmentType value) {
        return new JAXBElement<AssessmentType>(_Assessment_QNAME, AssessmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "school")
    public JAXBElement<SchoolType> createSchool(SchoolType value) {
        return new JAXBElement<SchoolType>(_School_QNAME, SchoolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "crisisIncidentCEDS")
    public JAXBElement<CrisisIncidentCEDSType> createCrisisIncidentCEDS(CrisisIncidentCEDSType value) {
        return new JAXBElement<CrisisIncidentCEDSType>(_CrisisIncidentCEDS_QNAME, CrisisIncidentCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAuthenticationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authentication")
    public JAXBElement<GAuthenticationType> createAuthentication(GAuthenticationType value) {
        return new JAXBElement<GAuthenticationType>(_Authentication_QNAME, GAuthenticationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGroupAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "personGroupAssociation")
    public JAXBElement<PersonGroupAssociationType> createPersonGroupAssociation(PersonGroupAssociationType value) {
        return new JAXBElement<PersonGroupAssociationType>(_PersonGroupAssociation_QNAME, PersonGroupAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteCourseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteCourses")
    public JAXBElement<CteCourseCollectionType> createCteCourses(CteCourseCollectionType value) {
        return new JAXBElement<CteCourseCollectionType>(_CteCourses_QNAME, CteCourseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElChildType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elChild")
    public JAXBElement<ElChildType> createElChild(ElChildType value) {
        return new JAXBElement<ElChildType>(_ElChild_QNAME, ElChildType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElClassGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elClassGroup")
    public JAXBElement<ElClassGroupType> createElClassGroup(ElClassGroupType value) {
        return new JAXBElement<ElClassGroupType>(_ElClassGroup_QNAME, ElClassGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "leaCEDSs")
    public JAXBElement<LeaCEDSCollectionType> createLeaCEDSs(LeaCEDSCollectionType value) {
        return new JAXBElement<LeaCEDSCollectionType>(_LeaCEDSs_QNAME, LeaCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sea")
    public JAXBElement<SeaType> createSea(SeaType value) {
        return new JAXBElement<SeaType>(_Sea_QNAME, SeaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "persons")
    public JAXBElement<PersonCollectionType> createPersons(PersonCollectionType value) {
        return new JAXBElement<PersonCollectionType>(_Persons_QNAME, PersonCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "crisisIncident")
    public JAXBElement<CrisisIncidentType> createCrisisIncident(CrisisIncidentType value) {
        return new JAXBElement<CrisisIncidentType>(_CrisisIncident_QNAME, CrisisIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "familyCEDSs")
    public JAXBElement<FamilyCEDSCollectionType> createFamilyCEDSs(FamilyCEDSCollectionType value) {
        return new JAXBElement<FamilyCEDSCollectionType>(_FamilyCEDSs_QNAME, FamilyCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "seaCEDS")
    public JAXBElement<SeaCEDSType> createSeaCEDS(SeaCEDSType value) {
        return new JAXBElement<SeaCEDSType>(_SeaCEDS_QNAME, SeaCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElStaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elStaff")
    public JAXBElement<ElStaffType> createElStaff(ElStaffType value) {
        return new JAXBElement<ElStaffType>(_ElStaff_QNAME, ElStaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSections")
    public JAXBElement<AssessmentSectionCollectionType> createAssessmentSections(AssessmentSectionCollectionType value) {
        return new JAXBElement<AssessmentSectionCollectionType>(_AssessmentSections_QNAME, AssessmentSectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAssetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAssets")
    public JAXBElement<AssessmentAssetCollectionType> createAssessmentAssets(AssessmentAssetCollectionType value) {
        return new JAXBElement<AssessmentAssetCollectionType>(_AssessmentAssets_QNAME, AssessmentAssetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAdministrationCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAdministrationCEDS")
    public JAXBElement<AssessmentAdministrationCEDSType> createAssessmentAdministrationCEDS(AssessmentAdministrationCEDSType value) {
        return new JAXBElement<AssessmentAdministrationCEDSType>(_AssessmentAdministrationCEDS_QNAME, AssessmentAdministrationCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsSectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psSections")
    public JAXBElement<PsSectionCollectionType> createPsSections(PsSectionCollectionType value) {
        return new JAXBElement<PsSectionCollectionType>(_PsSections_QNAME, PsSectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "course")
    public JAXBElement<CourseType> createCourse(CourseType value) {
        return new JAXBElement<CourseType>(_Course_QNAME, CourseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardAssociations")
    public JAXBElement<LearningStandardAssociationCollectionType> createLearningStandardAssociations(LearningStandardAssociationCollectionType value) {
        return new JAXBElement<LearningStandardAssociationCollectionType>(_LearningStandardAssociations_QNAME, LearningStandardAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSessionCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSessionCEDS")
    public JAXBElement<AssessmentSessionCEDSType> createAssessmentSessionCEDS(AssessmentSessionCEDSType value) {
        return new JAXBElement<AssessmentSessionCEDSType>(_AssessmentSessionCEDS_QNAME, AssessmentSessionCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "incidentCEDSs")
    public JAXBElement<IncidentCEDSCollectionType> createIncidentCEDSs(IncidentCEDSCollectionType value) {
        return new JAXBElement<IncidentCEDSCollectionType>(_IncidentCEDSs_QNAME, IncidentCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeerRatingSystemCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "peerRatingSystemCEDS")
    public JAXBElement<PeerRatingSystemCEDSType> createPeerRatingSystemCEDS(PeerRatingSystemCEDSType value) {
        return new JAXBElement<PeerRatingSystemCEDSType>(_PeerRatingSystemCEDS_QNAME, PeerRatingSystemCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12SchoolCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Schools")
    public JAXBElement<K12SchoolCollectionType> createK12Schools(K12SchoolCollectionType value) {
        return new JAXBElement<K12SchoolCollectionType>(_K12Schools_QNAME, K12SchoolCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfParticipantCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "wfParticipants")
    public JAXBElement<WfParticipantCollectionType> createWfParticipants(WfParticipantCollectionType value) {
        return new JAXBElement<WfParticipantCollectionType>(_WfParticipants_QNAME, WfParticipantCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonAssignmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffPersonAssignments")
    public JAXBElement<StaffPersonAssignmentCollectionType> createStaffPersonAssignments(StaffPersonAssignmentCollectionType value) {
        return new JAXBElement<StaffPersonAssignmentCollectionType>(_StaffPersonAssignments_QNAME, StaffPersonAssignmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOrganizationAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "userOrganizationAssociations")
    public JAXBElement<UserOrganizationAssociationCollectionType> createUserOrganizationAssociations(UserOrganizationAssociationCollectionType value) {
        return new JAXBElement<UserOrganizationAssociationCollectionType>(_UserOrganizationAssociations_QNAME, UserOrganizationAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Organization")
    public JAXBElement<K12OrganizationType> createK12Organization(K12OrganizationType value) {
        return new JAXBElement<K12OrganizationType>(_K12Organization_QNAME, K12OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetencySetCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "competencySetCEDS")
    public JAXBElement<CompetencySetCEDSType> createCompetencySetCEDS(CompetencySetCEDSType value) {
        return new JAXBElement<CompetencySetCEDSType>(_CompetencySetCEDS_QNAME, CompetencySetCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentProgramAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentProgramAssociations")
    public JAXBElement<StudentProgramAssociationCollectionType> createStudentProgramAssociations(StudentProgramAssociationCollectionType value) {
        return new JAXBElement<StudentProgramAssociationCollectionType>(_StudentProgramAssociations_QNAME, StudentProgramAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psSection")
    public JAXBElement<PsSectionType> createPsSection(PsSectionType value) {
        return new JAXBElement<PsSectionType>(_PsSection_QNAME, PsSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteProgram")
    public JAXBElement<CteProgramType> createCteProgram(CteProgramType value) {
        return new JAXBElement<CteProgramType>(_CteProgram_QNAME, CteProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsStudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psStudent")
    public JAXBElement<PsStudentType> createPsStudent(PsStudentType value) {
        return new JAXBElement<PsStudentType>(_PsStudent_QNAME, PsStudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteProgramCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "ctePrograms")
    public JAXBElement<CteProgramCollectionType> createCtePrograms(CteProgramCollectionType value) {
        return new JAXBElement<CteProgramCollectionType>(_CtePrograms_QNAME, CteProgramCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentItemAssociation")
    public JAXBElement<AssessmentItemAssociationType> createAssessmentItemAssociation(AssessmentItemAssociationType value) {
        return new JAXBElement<AssessmentItemAssociationType>(_AssessmentItemAssociation_QNAME, AssessmentItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "programCEDS")
    public JAXBElement<ProgramCEDSType> createProgramCEDS(ProgramCEDSType value) {
        return new JAXBElement<ProgramCEDSType>(_ProgramCEDS_QNAME, ProgramCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRoleAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "personRoleAssociations")
    public JAXBElement<PersonRoleAssociationCollectionType> createPersonRoleAssociations(PersonRoleAssociationCollectionType value) {
        return new JAXBElement<PersonRoleAssociationCollectionType>(_PersonRoleAssociations_QNAME, PersonRoleAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "crisisIncidentCEDSs")
    public JAXBElement<CrisisIncidentCEDSCollectionType> createCrisisIncidentCEDSs(CrisisIncidentCEDSCollectionType value) {
        return new JAXBElement<CrisisIncidentCEDSCollectionType>(_CrisisIncidentCEDSs_QNAME, CrisisIncidentCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "programs")
    public JAXBElement<ProgramCollectionType> createPrograms(ProgramCollectionType value) {
        return new JAXBElement<ProgramCollectionType>(_Programs_QNAME, ProgramCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentAssetCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentAssetCEDS")
    public JAXBElement<AssessmentAssetCEDSType> createAssessmentAssetCEDS(AssessmentAssetCEDSType value) {
        return new JAXBElement<AssessmentAssetCEDSType>(_AssessmentAssetCEDS_QNAME, AssessmentAssetCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentSectionAssociations")
    public JAXBElement<StudentSectionAssociationCollectionType> createStudentSectionAssociations(StudentSectionAssociationCollectionType value) {
        return new JAXBElement<StudentSectionAssociationCollectionType>(_StudentSectionAssociations_QNAME, StudentSectionAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardItemCEDS")
    public JAXBElement<LearningStandardItemCEDSType> createLearningStandardItemCEDS(LearningStandardItemCEDSType value) {
        return new JAXBElement<LearningStandardItemCEDSType>(_LearningStandardItemCEDS_QNAME, LearningStandardItemCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsInstitutionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psInstitutions")
    public JAXBElement<PsInstitutionCollectionType> createPsInstitutions(PsInstitutionCollectionType value) {
        return new JAXBElement<PsInstitutionCollectionType>(_PsInstitutions_QNAME, PsInstitutionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sre")
    public JAXBElement<SreType> createSre(SreType value) {
        return new JAXBElement<SreType>(_Sre_QNAME, SreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResponseSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentResponseSet")
    public JAXBElement<AssessmentResponseSetType> createAssessmentResponseSet(AssessmentResponseSetType value) {
        return new JAXBElement<AssessmentResponseSetType>(_AssessmentResponseSet_QNAME, AssessmentResponseSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSessionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSessions")
    public JAXBElement<AssessmentSessionCollectionType> createAssessmentSessions(AssessmentSessionCollectionType value) {
        return new JAXBElement<AssessmentSessionCollectionType>(_AssessmentSessions_QNAME, AssessmentSessionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Student")
    public JAXBElement<K12StudentType> createK12Student(K12StudentType value) {
        return new JAXBElement<K12StudentType>(_K12Student_QNAME, K12StudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCalendarItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "schoolCalendarItems")
    public JAXBElement<SchoolCalendarItemCollectionType> createSchoolCalendarItems(SchoolCalendarItemCollectionType value) {
        return new JAXBElement<SchoolCalendarItemCollectionType>(_SchoolCalendarItems_QNAME, SchoolCalendarItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sections")
    public JAXBElement<SectionCollectionType> createSections(SectionCollectionType value) {
        return new JAXBElement<SectionCollectionType>(_Sections_QNAME, SectionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardDocuments")
    public JAXBElement<LearningStandardDocumentCollectionType> createLearningStandardDocuments(LearningStandardDocumentCollectionType value) {
        return new JAXBElement<LearningStandardDocumentCollectionType>(_LearningStandardDocuments_QNAME, LearningStandardDocumentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPersonCEDSs")
    public JAXBElement<ContactPersonCEDSCollectionType> createContactPersonCEDSs(ContactPersonCEDSCollectionType value) {
        return new JAXBElement<ContactPersonCEDSCollectionType>(_ContactPersonCEDSs_QNAME, ContactPersonCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "userOrganizationAssociation")
    public JAXBElement<UserOrganizationAssociationType> createUserOrganizationAssociation(UserOrganizationAssociationType value) {
        return new JAXBElement<UserOrganizationAssociationType>(_UserOrganizationAssociation_QNAME, UserOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationIdentityProviderCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authenticationIdentityProviders")
    public JAXBElement<AuthenticationIdentityProviderCollectionType> createAuthenticationIdentityProviders(AuthenticationIdentityProviderCollectionType value) {
        return new JAXBElement<AuthenticationIdentityProviderCollectionType>(_AuthenticationIdentityProviders_QNAME, AuthenticationIdentityProviderCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentItemAssociations")
    public JAXBElement<AssessmentItemAssociationCollectionType> createAssessmentItemAssociations(AssessmentItemAssociationCollectionType value) {
        return new JAXBElement<AssessmentItemAssociationCollectionType>(_AssessmentItemAssociations_QNAME, AssessmentItemAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "facilityCEDS")
    public JAXBElement<FacilityCEDSType> createFacilityCEDS(FacilityCEDSType value) {
        return new JAXBElement<FacilityCEDSType>(_FacilityCEDS_QNAME, FacilityCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentItem")
    public JAXBElement<AssessmentItemType> createAssessmentItem(AssessmentItemType value) {
        return new JAXBElement<AssessmentItemType>(_AssessmentItem_QNAME, AssessmentItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentFamilyCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentFamilyCEDS")
    public JAXBElement<AssessmentFamilyCEDSType> createAssessmentFamilyCEDS(AssessmentFamilyCEDSType value) {
        return new JAXBElement<AssessmentFamilyCEDSType>(_AssessmentFamilyCEDS_QNAME, AssessmentFamilyCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionRosterReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sectionRosterReport")
    public JAXBElement<SectionRosterReportType> createSectionRosterReport(SectionRosterReportType value) {
        return new JAXBElement<SectionRosterReportType>(_SectionRosterReport_QNAME, SectionRosterReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRegistrationCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentRegistrationCEDS")
    public JAXBElement<AssessmentRegistrationCEDSType> createAssessmentRegistrationCEDS(AssessmentRegistrationCEDSType value) {
        return new JAXBElement<AssessmentRegistrationCEDSType>(_AssessmentRegistrationCEDS_QNAME, AssessmentRegistrationCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisciplineIncidentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "disciplineIncidents")
    public JAXBElement<DisciplineIncidentCollectionType> createDisciplineIncidents(DisciplineIncidentCollectionType value) {
        return new JAXBElement<DisciplineIncidentCollectionType>(_DisciplineIncidents_QNAME, DisciplineIncidentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "lea")
    public JAXBElement<LeaType> createLea(LeaType value) {
        return new JAXBElement<LeaType>(_Lea_QNAME, LeaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningResourceCEDS")
    public JAXBElement<LearningResourceCEDSType> createLearningResourceCEDS(LearningResourceCEDSType value) {
        return new JAXBElement<LearningResourceCEDSType>(_LearningResourceCEDS_QNAME, LearningResourceCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "facilitys")
    public JAXBElement<FacilityCollectionType> createFacilitys(FacilityCollectionType value) {
        return new JAXBElement<FacilityCollectionType>(_Facilitys_QNAME, FacilityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSubTest")
    public JAXBElement<AssessmentSubTestType> createAssessmentSubTest(AssessmentSubTestType value) {
        return new JAXBElement<AssessmentSubTestType>(_AssessmentSubTest_QNAME, AssessmentSubTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRegistrationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentRegistrations")
    public JAXBElement<AssessmentRegistrationCollectionType> createAssessmentRegistrations(AssessmentRegistrationCollectionType value) {
        return new JAXBElement<AssessmentRegistrationCollectionType>(_AssessmentRegistrations_QNAME, AssessmentRegistrationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteStudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteStudent")
    public JAXBElement<CteStudentType> createCteStudent(CteStudentType value) {
        return new JAXBElement<CteStudentType>(_CteStudent_QNAME, CteStudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "applications")
    public JAXBElement<ApplicationCollectionType> createApplications(ApplicationCollectionType value) {
        return new JAXBElement<ApplicationCollectionType>(_Applications_QNAME, ApplicationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "financialReports")
    public JAXBElement<FinancialReportCollectionType> createFinancialReports(FinancialReportCollectionType value) {
        return new JAXBElement<FinancialReportCollectionType>(_FinancialReports_QNAME, FinancialReportCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRelationshipCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactRelationships")
    public JAXBElement<ContactRelationshipCollectionType> createContactRelationships(ContactRelationshipCollectionType value) {
        return new JAXBElement<ContactRelationshipCollectionType>(_ContactRelationships_QNAME, ContactRelationshipCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentPerformanceLevelCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentPerformanceLevelCEDS")
    public JAXBElement<AssessmentPerformanceLevelCEDSType> createAssessmentPerformanceLevelCEDS(AssessmentPerformanceLevelCEDSType value) {
        return new JAXBElement<AssessmentPerformanceLevelCEDSType>(_AssessmentPerformanceLevelCEDS_QNAME, AssessmentPerformanceLevelCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elProgram")
    public JAXBElement<ElProgramType> createElProgram(ElProgramType value) {
        return new JAXBElement<ElProgramType>(_ElProgram_QNAME, ElProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsStaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psStaffs")
    public JAXBElement<PsStaffCollectionType> createPsStaffs(PsStaffCollectionType value) {
        return new JAXBElement<PsStaffCollectionType>(_PsStaffs_QNAME, PsStaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "schools")
    public JAXBElement<SchoolCollectionType> createSchools(SchoolCollectionType value) {
        return new JAXBElement<SchoolCollectionType>(_Schools_QNAME, SchoolCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authorization")
    public JAXBElement<GAuthorizationType> createAuthorization(GAuthorizationType value) {
        return new JAXBElement<GAuthorizationType>(_Authorization_QNAME, GAuthorizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRoleAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "personRoleAssociation")
    public JAXBElement<PersonRoleAssociationType> createPersonRoleAssociation(PersonRoleAssociationType value) {
        return new JAXBElement<PersonRoleAssociationType>(_PersonRoleAssociation_QNAME, PersonRoleAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningResourceCEDSs")
    public JAXBElement<LearningResourceCEDSCollectionType> createLearningResourceCEDSs(LearningResourceCEDSCollectionType value) {
        return new JAXBElement<LearningResourceCEDSCollectionType>(_LearningResourceCEDSs_QNAME, LearningResourceCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAddressAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "partyAddressAssociation")
    public JAXBElement<PartyAddressAssociationType> createPartyAddressAssociation(PartyAddressAssociationType value) {
        return new JAXBElement<PartyAddressAssociationType>(_PartyAddressAssociation_QNAME, PartyAddressAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningStandardDocument")
    public JAXBElement<LearningStandardDocumentType> createLearningStandardDocument(LearningStandardDocumentType value) {
        return new JAXBElement<LearningStandardDocumentType>(_LearningStandardDocument_QNAME, LearningStandardDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Section")
    public JAXBElement<K12SectionType> createK12Section(K12SectionType value) {
        return new JAXBElement<K12SectionType>(_K12Section_QNAME, K12SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningGoalCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learningGoalCEDSs")
    public JAXBElement<LearningGoalCEDSCollectionType> createLearningGoalCEDSs(LearningGoalCEDSCollectionType value) {
        return new JAXBElement<LearningGoalCEDSCollectionType>(_LearningGoalCEDSs_QNAME, LearningGoalCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElStaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elStaffs")
    public JAXBElement<ElStaffCollectionType> createElStaffs(ElStaffCollectionType value) {
        return new JAXBElement<ElStaffCollectionType>(_ElStaffs_QNAME, ElStaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsStaffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psStaff")
    public JAXBElement<PsStaffType> createPsStaff(PsStaffType value) {
        return new JAXBElement<PsStaffType>(_PsStaff_QNAME, PsStaffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElOrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elOrganization")
    public JAXBElement<ElOrganizationType> createElOrganization(ElOrganizationType value) {
        return new JAXBElement<ElOrganizationType>(_ElOrganization_QNAME, ElOrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "partyOrganizationAssociation")
    public JAXBElement<PartyOrganizationAssociationType> createPartyOrganizationAssociation(PartyOrganizationAssociationType value) {
        return new JAXBElement<PartyOrganizationAssociationType>(_PartyOrganizationAssociation_QNAME, PartyOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactPerson")
    public JAXBElement<ContactPersonType> createContactPerson(ContactPersonType value) {
        return new JAXBElement<ContactPersonType>(_ContactPerson_QNAME, ContactPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElAssessmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "elAssessments")
    public JAXBElement<ElAssessmentCollectionType> createElAssessments(ElAssessmentCollectionType value) {
        return new JAXBElement<ElAssessmentCollectionType>(_ElAssessments_QNAME, ElAssessmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12StaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Staffs")
    public JAXBElement<K12StaffCollectionType> createK12Staffs(K12StaffCollectionType value) {
        return new JAXBElement<K12StaffCollectionType>(_K12Staffs_QNAME, K12StaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCoreCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentCores")
    public JAXBElement<StudentCoreCollectionType> createStudentCores(StudentCoreCollectionType value) {
        return new JAXBElement<StudentCoreCollectionType>(_StudentCores_QNAME, StudentCoreCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRelationshipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "contactRelationship")
    public JAXBElement<ContactRelationshipType> createContactRelationship(ContactRelationshipType value) {
        return new JAXBElement<ContactRelationshipType>(_ContactRelationship_QNAME, ContactRelationshipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12CourseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12Courses")
    public JAXBElement<K12CourseCollectionType> createK12Courses(K12CourseCollectionType value) {
        return new JAXBElement<K12CourseCollectionType>(_K12Courses_QNAME, K12CourseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentGuardianCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "parentGuardianCEDS")
    public JAXBElement<ParentGuardianCEDSType> createParentGuardianCEDS(ParentGuardianCEDSType value) {
        return new JAXBElement<ParentGuardianCEDSType>(_ParentGuardianCEDS_QNAME, ParentGuardianCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "program")
    public JAXBElement<ProgramType> createProgram(ProgramType value) {
        return new JAXBElement<ProgramType>(_Program_QNAME, ProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsApplicantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psApplicant")
    public JAXBElement<PsApplicantType> createPsApplicant(PsApplicantType value) {
        return new JAXBElement<PsApplicantType>(_PsApplicant_QNAME, PsApplicantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "leaCEDS")
    public JAXBElement<LeaCEDSType> createLeaCEDS(LeaCEDSType value) {
        return new JAXBElement<LeaCEDSType>(_LeaCEDS_QNAME, LeaCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentRubrics")
    public JAXBElement<AssessmentRubricCollectionType> createAssessmentRubrics(AssessmentRubricCollectionType value) {
        return new JAXBElement<AssessmentRubricCollectionType>(_AssessmentRubrics_QNAME, AssessmentRubricCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubtestCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSubtestCEDS")
    public JAXBElement<AssessmentSubtestCEDSType> createAssessmentSubtestCEDS(AssessmentSubtestCEDSType value) {
        return new JAXBElement<AssessmentSubtestCEDSType>(_AssessmentSubtestCEDS_QNAME, AssessmentSubtestCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authorizations")
    public JAXBElement<AuthorizationCollectionType> createAuthorizations(AuthorizationCollectionType value) {
        return new JAXBElement<AuthorizationCollectionType>(_Authorizations_QNAME, AuthorizationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSubTestCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSubTests")
    public JAXBElement<AssessmentSubTestCollectionType> createAssessmentSubTests(AssessmentSubTestCollectionType value) {
        return new JAXBElement<AssessmentSubTestCollectionType>(_AssessmentSubTests_QNAME, AssessmentSubTestCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreSetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentScoreSets")
    public JAXBElement<AssessmentScoreSetCollectionType> createAssessmentScoreSets(AssessmentScoreSetCollectionType value) {
        return new JAXBElement<AssessmentScoreSetCollectionType>(_AssessmentScoreSets_QNAME, AssessmentScoreSetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSessionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSession")
    public JAXBElement<AssessmentSessionType> createAssessmentSession(AssessmentSessionType value) {
        return new JAXBElement<AssessmentSessionType>(_AssessmentSession_QNAME, AssessmentSessionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteSection")
    public JAXBElement<CteSectionType> createCteSection(CteSectionType value) {
        return new JAXBElement<CteSectionType>(_CteSection_QNAME, CteSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "familyCEDS")
    public JAXBElement<FamilyCEDSType> createFamilyCEDS(FamilyCEDSType value) {
        return new JAXBElement<FamilyCEDSType>(_FamilyCEDS_QNAME, FamilyCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentSchoolAssociations")
    public JAXBElement<StudentSchoolAssociationCollectionType> createStudentSchoolAssociations(StudentSchoolAssociationCollectionType value) {
        return new JAXBElement<StudentSchoolAssociationCollectionType>(_StudentSchoolAssociations_QNAME, StudentSchoolAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsAssessmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "psAssessments")
    public JAXBElement<PsAssessmentCollectionType> createPsAssessments(PsAssessmentCollectionType value) {
        return new JAXBElement<PsAssessmentCollectionType>(_PsAssessments_QNAME, PsAssessmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSection")
    public JAXBElement<AssessmentSectionType> createAssessmentSection(AssessmentSectionType value) {
        return new JAXBElement<AssessmentSectionType>(_AssessmentSection_QNAME, AssessmentSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentProgramAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "studentProgramAssociation")
    public JAXBElement<StudentProgramAssociationType> createStudentProgramAssociation(StudentProgramAssociationType value) {
        return new JAXBElement<StudentProgramAssociationType>(_StudentProgramAssociation_QNAME, StudentProgramAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "courses")
    public JAXBElement<CourseCollectionType> createCourses(CourseCollectionType value) {
        return new JAXBElement<CourseCollectionType>(_Courses_QNAME, CourseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAddressAssociationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "partyAddressAssociations")
    public JAXBElement<PartyAddressAssociationCollectionType> createPartyAddressAssociations(PartyAddressAssociationCollectionType value) {
        return new JAXBElement<PartyAddressAssociationCollectionType>(_PartyAddressAssociations_QNAME, PartyAddressAssociationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfQuarterlyEmploymentRecordCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "wfQuarterlyEmploymentRecords")
    public JAXBElement<WfQuarterlyEmploymentRecordCollectionType> createWfQuarterlyEmploymentRecords(WfQuarterlyEmploymentRecordCollectionType value) {
        return new JAXBElement<WfQuarterlyEmploymentRecordCollectionType>(_WfQuarterlyEmploymentRecords_QNAME, WfQuarterlyEmploymentRecordCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WfQuarterlyEmploymentRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "wfQuarterlyEmploymentRecord")
    public JAXBElement<WfQuarterlyEmploymentRecordType> createWfQuarterlyEmploymentRecord(WfQuarterlyEmploymentRecordType value) {
        return new JAXBElement<WfQuarterlyEmploymentRecordType>(_WfQuarterlyEmploymentRecord_QNAME, WfQuarterlyEmploymentRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrisisIncidentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "crisisIncidents")
    public JAXBElement<CrisisIncidentCollectionType> createCrisisIncidents(CrisisIncidentCollectionType value) {
        return new JAXBElement<CrisisIncidentCollectionType>(_CrisisIncidents_QNAME, CrisisIncidentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "group")
    public JAXBElement<GroupType> createGroup(GroupType value) {
        return new JAXBElement<GroupType>(_Group_QNAME, GroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationOrganizationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "organizationOrganizationAssociation")
    public JAXBElement<OrganizationOrganizationAssociationType> createOrganizationOrganizationAssociation(OrganizationOrganizationAssociationType value) {
        return new JAXBElement<OrganizationOrganizationAssociationType>(_OrganizationOrganizationAssociation_QNAME, OrganizationOrganizationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "authorizationApplication")
    public JAXBElement<AuthorizationApplicationType> createAuthorizationApplication(AuthorizationApplicationType value) {
        return new JAXBElement<AuthorizationApplicationType>(_AuthorizationApplication_QNAME, AuthorizationApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteCourseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteCourse")
    public JAXBElement<CteCourseType> createCteCourse(CteCourseType value) {
        return new JAXBElement<CteCourseType>(_CteCourse_QNAME, CteCourseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "term")
    public JAXBElement<TermType> createTerm(TermType value) {
        return new JAXBElement<TermType>(_Term_QNAME, TermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "address")
    public JAXBElement<GAddressType> createAddress(GAddressType value) {
        return new JAXBElement<GAddressType>(_Address_QNAME, GAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearnerActionCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "learnerActionCEDS")
    public JAXBElement<LearnerActionCEDSType> createLearnerActionCEDS(LearnerActionCEDSType value) {
        return new JAXBElement<LearnerActionCEDSType>(_LearnerActionCEDS_QNAME, LearnerActionCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "staffPersonAssignment")
    public JAXBElement<StaffPersonAssignmentType> createStaffPersonAssignment(StaffPersonAssignmentType value) {
        return new JAXBElement<StaffPersonAssignmentType>(_StaffPersonAssignment_QNAME, StaffPersonAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "section")
    public JAXBElement<SectionType> createSection(SectionType value) {
        return new JAXBElement<SectionType>(_Section_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaCEDSCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "seaCEDSs")
    public JAXBElement<SeaCEDSCollectionType> createSeaCEDSs(SeaCEDSCollectionType value) {
        return new JAXBElement<SeaCEDSCollectionType>(_SeaCEDSs_QNAME, SeaCEDSCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link K12SchoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "k12School")
    public JAXBElement<K12SchoolType> createK12School(K12SchoolType value) {
        return new JAXBElement<K12SchoolType>(_K12School_QNAME, K12SchoolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "students")
    public JAXBElement<StudentCollectionType> createStudents(StudentCollectionType value) {
        return new JAXBElement<StudentCollectionType>(_Students_QNAME, StudentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarCEDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "calendarCEDS")
    public JAXBElement<CalendarCEDSType> createCalendarCEDS(CalendarCEDSType value) {
        return new JAXBElement<CalendarCEDSType>(_CalendarCEDS_QNAME, CalendarCEDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "application")
    public JAXBElement<GApplicationType> createApplication(GApplicationType value) {
        return new JAXBElement<GApplicationType>(_Application_QNAME, GApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CteStaffCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "cteStaffs")
    public JAXBElement<CteStaffCollectionType> createCteStaffs(CteStaffCollectionType value) {
        return new JAXBElement<CteStaffCollectionType>(_CteStaffs_QNAME, CteStaffCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoreList", scope = AssessmentRubricType.class)
    public JAXBElement<AssessmentRubricType.ScoreList> createAssessmentRubricTypeScoreList(AssessmentRubricType.ScoreList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList>(_AssessmentRubricTypeScoreList_QNAME, AssessmentRubricType.ScoreList.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoringGuideReference", scope = AssessmentRubricType.class)
    public JAXBElement<String> createAssessmentRubricTypeScoringGuideReference(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoringGuideReference_QNAME, String.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "rubricPublishDate", scope = AssessmentRubricType.class)
    public JAXBElement<XMLGregorianCalendar> createAssessmentRubricTypeRubricPublishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssessmentRubricTypeRubricPublishDate_QNAME, XMLGregorianCalendar.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.RubricIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "rubricIdentifierList", scope = AssessmentRubricType.class)
    public JAXBElement<AssessmentRubricType.RubricIdentifierList> createAssessmentRubricTypeRubricIdentifierList(AssessmentRubricType.RubricIdentifierList value) {
        return new JAXBElement<AssessmentRubricType.RubricIdentifierList>(_AssessmentRubricTypeRubricIdentifierList_QNAME, AssessmentRubricType.RubricIdentifierList.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "rubricVersion", scope = AssessmentRubricType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentRubricTypeRubricVersion(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeRubricVersion_QNAME, String.class, AssessmentRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "description", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackDescription(String value) {
        return new JAXBElement<String>(_AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackDescription_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "source", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource(String value) {
        return new JAXBElement<String>(_AssessmentScoreTableTypeScoreValueListScoreValueFeedbackListFeedbackSource_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.Feedback.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "feedbackList", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.class)
    public JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList> createAssessmentScoreTableTypeScoreValueListScoreValueFeedbackList(AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList value) {
        return new JAXBElement<AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList>(_AssessmentScoreTableTypeScoreValueListScoreValueFeedbackList_QNAME, AssessmentScoreTableType.ScoreValueList.ScoreValue.FeedbackList.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "passFailIndicator", scope = AssessmentScoreTableType.ScoreValueList.ScoreValue.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator(String value) {
        return new JAXBElement<String>(_AssessmentScoreTableTypeScoreValueListScoreValuePassFailIndicator_QNAME, String.class, AssessmentScoreTableType.ScoreValueList.ScoreValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "endDate", scope = LearningStandardAssociationType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardAssociationTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardAssociationTypeEndDate_QNAME, XMLGregorianCalendar.class, LearningStandardAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "refURI", scope = LearningStandardAssociationType.class)
    public JAXBElement<String> createLearningStandardAssociationTypeRefURI(String value) {
        return new JAXBElement<String>(_LearningStandardAssociationTypeRefURI_QNAME, String.class, LearningStandardAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "associationStrength", scope = LearningStandardAssociationType.TargetObjectList.TargetObject.class)
    public JAXBElement<BigDecimal> createLearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationStrength_QNAME, BigDecimal.class, LearningStandardAssociationType.TargetObjectList.TargetObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "associationType", scope = LearningStandardAssociationType.TargetObjectList.TargetObject.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType(String value) {
        return new JAXBElement<String>(_LearningStandardAssociationTypeTargetObjectListTargetObjectAssociationType_QNAME, String.class, LearningStandardAssociationType.TargetObjectList.TargetObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "reference", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.Reference> createGAbstractContentElementTypeReference(GAbstractContentElementType.Reference value) {
        return new JAXBElement<GAbstractContentElementType.Reference>(_GAbstractContentElementTypeReference_QNAME, GAbstractContentElementType.Reference.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.TextData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "textData", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.TextData> createGAbstractContentElementTypeTextData(GAbstractContentElementType.TextData value) {
        return new JAXBElement<GAbstractContentElementType.TextData>(_GAbstractContentElementTypeTextData_QNAME, GAbstractContentElementType.TextData.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "binaryData", scope = GAbstractContentElementType.class)
    public JAXBElement<byte[]> createGAbstractContentElementTypeBinaryData(byte[] value) {
        return new JAXBElement<byte[]>(_GAbstractContentElementTypeBinaryData_QNAME, byte[].class, GAbstractContentElementType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAbstractContentElementType.XmlData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "xmlData", scope = GAbstractContentElementType.class)
    public JAXBElement<GAbstractContentElementType.XmlData> createGAbstractContentElementTypeXmlData(GAbstractContentElementType.XmlData value) {
        return new JAXBElement<GAbstractContentElementType.XmlData>(_GAbstractContentElementTypeXmlData_QNAME, GAbstractContentElementType.XmlData.class, GAbstractContentElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreDescriptionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoreDescriptionList", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList> createAssessmentRubricTypeScoreListScoreScoreDescriptionList(AssessmentRubricType.ScoreList.Score.ScoreDescriptionList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreDescriptionList>(_AssessmentRubricTypeScoreListScoreScoreDescriptionList_QNAME, AssessmentRubricType.ScoreList.Score.ScoreDescriptionList.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoreCode", scope = AssessmentRubricType.ScoreList.Score.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssessmentRubricTypeScoreListScoreScoreCode(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoreListScoreScoreCode_QNAME, String.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoreCodeDefinition", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<String> createAssessmentRubricTypeScoreListScoreScoreCodeDefinition(String value) {
        return new JAXBElement<String>(_AssessmentRubricTypeScoreListScoreScoreCodeDefinition_QNAME, String.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRubricType.ScoreList.Score.ScoreCommentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "scoreCommentList", scope = AssessmentRubricType.ScoreList.Score.class)
    public JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList> createAssessmentRubricTypeScoreListScoreScoreCommentList(AssessmentRubricType.ScoreList.Score.ScoreCommentList value) {
        return new JAXBElement<AssessmentRubricType.ScoreList.Score.ScoreCommentList>(_AssessmentRubricTypeScoreListScoreScoreCommentList_QNAME, AssessmentRubricType.ScoreList.Score.ScoreCommentList.class, AssessmentRubricType.ScoreList.Score.class, value);
    }

}
