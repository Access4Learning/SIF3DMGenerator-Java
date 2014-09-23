
package sif.dd.us32.model.report;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sif.dd.us32.model.report package. 
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

    private final static QName _Sre_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sre");
    private final static QName _SectionRosterReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "sectionRosterReport");
    private final static QName _AssessmentSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "assessmentSummary");
    private final static QName _FinancialReport_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "financialReport");
    private final static QName _GAbstractContentElementTypeReference_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "reference");
    private final static QName _GAbstractContentElementTypeTextData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "textData");
    private final static QName _GAbstractContentElementTypeBinaryData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "binaryData");
    private final static QName _GAbstractContentElementTypeXmlData_QNAME = new QName("http://www.sifassociation.org/datamodel/na/3.2", "xmlData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sif.dd.us32.model.report
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GSchoolType }
     * 
     */
    public GSchoolType createGSchoolType() {
        return new GSchoolType();
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
     * Create an instance of {@link GDemographicsType }
     * 
     */
    public GDemographicsType createGDemographicsType() {
        return new GDemographicsType();
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
     * Create an instance of {@link GBellScheduleType }
     * 
     */
    public GBellScheduleType createGBellScheduleType() {
        return new GBellScheduleType();
    }

    /**
     * Create an instance of {@link GCourseType }
     * 
     */
    public GCourseType createGCourseType() {
        return new GCourseType();
    }

    /**
     * Create an instance of {@link GAbstractContentElementType }
     * 
     */
    public GAbstractContentElementType createGAbstractContentElementType() {
        return new GAbstractContentElementType();
    }

    /**
     * Create an instance of {@link GSessionScheduleType }
     * 
     */
    public GSessionScheduleType createGSessionScheduleType() {
        return new GSessionScheduleType();
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
     * Create an instance of {@link GLEAType }
     * 
     */
    public GLEAType createGLEAType() {
        return new GLEAType();
    }

    /**
     * Create an instance of {@link GLearningStandardDocumentType }
     * 
     */
    public GLearningStandardDocumentType createGLearningStandardDocumentType() {
        return new GLearningStandardDocumentType();
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
     * Create an instance of {@link GStaffPersonType }
     * 
     */
    public GStaffPersonType createGStaffPersonType() {
        return new GStaffPersonType();
    }

    /**
     * Create an instance of {@link GTimetableDayList }
     * 
     */
    public GTimetableDayList createGTimetableDayList() {
        return new GTimetableDayList();
    }

    /**
     * Create an instance of {@link GEthnicityList }
     * 
     */
    public GEthnicityList createGEthnicityList() {
        return new GEthnicityList();
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
     * Create an instance of {@link GRelatedLearningStandardItemList }
     * 
     */
    public GRelatedLearningStandardItemList createGRelatedLearningStandardItemList() {
        return new GRelatedLearningStandardItemList();
    }

    /**
     * Create an instance of {@link GOperationalStatusType }
     * 
     */
    public GOperationalStatusType createGOperationalStatusType() {
        return new GOperationalStatusType();
    }

    /**
     * Create an instance of {@link GOrganizationAssociationType }
     * 
     */
    public GOrganizationAssociationType createGOrganizationAssociationType() {
        return new GOrganizationAssociationType();
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
     * Create an instance of {@link GPlaceType }
     * 
     */
    public GPlaceType createGPlaceType() {
        return new GPlaceType();
    }

    /**
     * Create an instance of {@link GServiceProviderType }
     * 
     */
    public GServiceProviderType createGServiceProviderType() {
        return new GServiceProviderType();
    }

    /**
     * Create an instance of {@link GSchoolCalendarType }
     * 
     */
    public GSchoolCalendarType createGSchoolCalendarType() {
        return new GSchoolCalendarType();
    }

    /**
     * Create an instance of {@link GOrganizationType }
     * 
     */
    public GOrganizationType createGOrganizationType() {
        return new GOrganizationType();
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
     * Create an instance of {@link GElectronicIdTypeType }
     * 
     */
    public GElectronicIdTypeType createGElectronicIdTypeType() {
        return new GElectronicIdTypeType();
    }

    /**
     * Create an instance of {@link GSessionTypeType }
     * 
     */
    public GSessionTypeType createGSessionTypeType() {
        return new GSessionTypeType();
    }

    /**
     * Create an instance of {@link GAlertMessageType }
     * 
     */
    public GAlertMessageType createGAlertMessageType() {
        return new GAlertMessageType();
    }

    /**
     * Create an instance of {@link GClientType }
     * 
     */
    public GClientType createGClientType() {
        return new GClientType();
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
     * Create an instance of {@link GEthnicityType }
     * 
     */
    public GEthnicityType createGEthnicityType() {
        return new GEthnicityType();
    }

    /**
     * Create an instance of {@link GSchoolFocusList }
     * 
     */
    public GSchoolFocusList createGSchoolFocusList() {
        return new GSchoolFocusList();
    }

    /**
     * Create an instance of {@link GExternalIdList }
     * 
     */
    public GExternalIdList createGExternalIdList() {
        return new GExternalIdList();
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
     * Create an instance of {@link GStudentSchoolEnrollmentType }
     * 
     */
    public GStudentSchoolEnrollmentType createGStudentSchoolEnrollmentType() {
        return new GStudentSchoolEnrollmentType();
    }

    /**
     * Create an instance of {@link GCountryType }
     * 
     */
    public GCountryType createGCountryType() {
        return new GCountryType();
    }

    /**
     * Create an instance of {@link GElectronicIdList }
     * 
     */
    public GElectronicIdList createGElectronicIdList() {
        return new GElectronicIdList();
    }

    /**
     * Create an instance of {@link GBellPeriodType }
     * 
     */
    public GBellPeriodType createGBellPeriodType() {
        return new GBellPeriodType();
    }

    /**
     * Create an instance of {@link GDiscreteEventType }
     * 
     */
    public GDiscreteEventType createGDiscreteEventType() {
        return new GDiscreteEventType();
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
     * Create an instance of {@link GCreatorList }
     * 
     */
    public GCreatorList createGCreatorList() {
        return new GCreatorList();
    }

    /**
     * Create an instance of {@link GBaseNameType }
     * 
     */
    public GBaseNameType createGBaseNameType() {
        return new GBaseNameType();
    }

    /**
     * Create an instance of {@link GNameOfRecordType }
     * 
     */
    public GNameOfRecordType createGNameOfRecordType() {
        return new GNameOfRecordType();
    }

    /**
     * Create an instance of {@link GCredentialType }
     * 
     */
    public GCredentialType createGCredentialType() {
        return new GCredentialType();
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
     * Create an instance of {@link GBellScheduleDayType }
     * 
     */
    public GBellScheduleDayType createGBellScheduleDayType() {
        return new GBellScheduleDayType();
    }

    /**
     * Create an instance of {@link GStaffSectionAssociationType }
     * 
     */
    public GStaffSectionAssociationType createGStaffSectionAssociationType() {
        return new GStaffSectionAssociationType();
    }

    /**
     * Create an instance of {@link GOtherNameListType }
     * 
     */
    public GOtherNameListType createGOtherNameListType() {
        return new GOtherNameListType();
    }

    /**
     * Create an instance of {@link GOtherIdType }
     * 
     */
    public GOtherIdType createGOtherIdType() {
        return new GOtherIdType();
    }

    /**
     * Create an instance of {@link GEmailTypeType }
     * 
     */
    public GEmailTypeType createGEmailTypeType() {
        return new GEmailTypeType();
    }

    /**
     * Create an instance of {@link GModifiedType }
     * 
     */
    public GModifiedType createGModifiedType() {
        return new GModifiedType();
    }

    /**
     * Create an instance of {@link GOrganizationUserType }
     * 
     */
    public GOrganizationUserType createGOrganizationUserType() {
        return new GOrganizationUserType();
    }

    /**
     * Create an instance of {@link GPartyOrganizationAssociationType }
     * 
     */
    public GPartyOrganizationAssociationType createGPartyOrganizationAssociationType() {
        return new GPartyOrganizationAssociationType();
    }

    /**
     * Create an instance of {@link GPartyAddressRelationType }
     * 
     */
    public GPartyAddressRelationType createGPartyAddressRelationType() {
        return new GPartyAddressRelationType();
    }

    /**
     * Create an instance of {@link GPhoneNumberType }
     * 
     */
    public GPhoneNumberType createGPhoneNumberType() {
        return new GPhoneNumberType();
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
     * Create an instance of {@link GEventType }
     * 
     */
    public GEventType createGEventType() {
        return new GEventType();
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
     * Create an instance of {@link GTimeElementList }
     * 
     */
    public GTimeElementList createGTimeElementList() {
        return new GTimeElementList();
    }

    /**
     * Create an instance of {@link GOtherSIFType }
     * 
     */
    public GOtherSIFType createGOtherSIFType() {
        return new GOtherSIFType();
    }

    /**
     * Create an instance of {@link GMedicalAlertMessageType }
     * 
     */
    public GMedicalAlertMessageType createGMedicalAlertMessageType() {
        return new GMedicalAlertMessageType();
    }

    /**
     * Create an instance of {@link GLearnerType }
     * 
     */
    public GLearnerType createGLearnerType() {
        return new GLearnerType();
    }

    /**
     * Create an instance of {@link GEntryTypeType }
     * 
     */
    public GEntryTypeType createGEntryTypeType() {
        return new GEntryTypeType();
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
     * Create an instance of {@link GEmailList }
     * 
     */
    public GEmailList createGEmailList() {
        return new GEmailList();
    }

    /**
     * Create an instance of {@link GLanguageList }
     * 
     */
    public GLanguageList createGLanguageList() {
        return new GLanguageList();
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
     * Create an instance of {@link GModificationHistoryType }
     * 
     */
    public GModificationHistoryType createGModificationHistoryType() {
        return new GModificationHistoryType();
    }

    /**
     * Create an instance of {@link GCredentialList }
     * 
     */
    public GCredentialList createGCredentialList() {
        return new GCredentialList();
    }

    /**
     * Create an instance of {@link GAddressType }
     * 
     */
    public GAddressType createGAddressType() {
        return new GAddressType();
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
     * Create an instance of {@link GExitTypeType }
     * 
     */
    public GExitTypeType createGExitTypeType() {
        return new GExitTypeType();
    }

    /**
     * Create an instance of {@link GLocalIdType }
     * 
     */
    public GLocalIdType createGLocalIdType() {
        return new GLocalIdType();
    }

    /**
     * Create an instance of {@link GExitStatusType }
     * 
     */
    public GExitStatusType createGExitStatusType() {
        return new GExitStatusType();
    }

    /**
     * Create an instance of {@link GGroupType }
     * 
     */
    public GGroupType createGGroupType() {
        return new GGroupType();
    }

    /**
     * Create an instance of {@link GSpanGapList }
     * 
     */
    public GSpanGapList createGSpanGapList() {
        return new GSpanGapList();
    }

    /**
     * Create an instance of {@link GElectronicIdType }
     * 
     */
    public GElectronicIdType createGElectronicIdType() {
        return new GElectronicIdType();
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
     * Create an instance of {@link GEducationOrganizationType }
     * 
     */
    public GEducationOrganizationType createGEducationOrganizationType() {
        return new GEducationOrganizationType();
    }

    /**
     * Create an instance of {@link GSectionTeacherType }
     * 
     */
    public GSectionTeacherType createGSectionTeacherType() {
        return new GSectionTeacherType();
    }

    /**
     * Create an instance of {@link GSIFEntityType }
     * 
     */
    public GSIFEntityType createGSIFEntityType() {
        return new GSIFEntityType();
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
     * Create an instance of {@link GTimetablePeriodType }
     * 
     */
    public GTimetablePeriodType createGTimetablePeriodType() {
        return new GTimetablePeriodType();
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
     * Create an instance of {@link GPhoneNumberList }
     * 
     */
    public GPhoneNumberList createGPhoneNumberList() {
        return new GPhoneNumberList();
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
     * Create an instance of {@link GMeetingTimeType }
     * 
     */
    public GMeetingTimeType createGMeetingTimeType() {
        return new GMeetingTimeType();
    }

    /**
     * Create an instance of {@link GLocationType }
     * 
     */
    public GLocationType createGLocationType() {
        return new GLocationType();
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
     * Create an instance of {@link GEmailType }
     * 
     */
    public GEmailType createGEmailType() {
        return new GEmailType();
    }

    /**
     * Create an instance of {@link GCountryList }
     * 
     */
    public GCountryList createGCountryList() {
        return new GCountryList();
    }

    /**
     * Create an instance of {@link GRelatedLearningStandardItemType }
     * 
     */
    public GRelatedLearningStandardItemType createGRelatedLearningStandardItemType() {
        return new GRelatedLearningStandardItemType();
    }

    /**
     * Create an instance of {@link GPlanType }
     * 
     */
    public GPlanType createGPlanType() {
        return new GPlanType();
    }

    /**
     * Create an instance of {@link GMeetingTimeList }
     * 
     */
    public GMeetingTimeList createGMeetingTimeList() {
        return new GMeetingTimeList();
    }

    /**
     * Create an instance of {@link GPersonAssociationType }
     * 
     */
    public GPersonAssociationType createGPersonAssociationType() {
        return new GPersonAssociationType();
    }

    /**
     * Create an instance of {@link GSIFCompositeType }
     * 
     */
    public GSIFCompositeType createGSIFCompositeType() {
        return new GSIFCompositeType();
    }

    /**
     * Create an instance of {@link GPersonRoleAssociationType }
     * 
     */
    public GPersonRoleAssociationType createGPersonRoleAssociationType() {
        return new GPersonRoleAssociationType();
    }

    /**
     * Create an instance of {@link GOtherNameType }
     * 
     */
    public GOtherNameType createGOtherNameType() {
        return new GOtherNameType();
    }

    /**
     * Create an instance of {@link GSchoolType.SchoolContactList }
     * 
     */
    public GSchoolType.SchoolContactList createGSchoolTypeSchoolContactList() {
        return new GSchoolType.SchoolContactList();
    }

    /**
     * Create an instance of {@link GLaxCodedElementType.OtherCodeList.OtherCode }
     * 
     */
    public GLaxCodedElementType.OtherCodeList.OtherCode createGLaxCodedElementTypeOtherCodeListOtherCode() {
        return new GLaxCodedElementType.OtherCodeList.OtherCode();
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
     * Create an instance of {@link GDemographicsType.CountryOfCitizenshipList }
     * 
     */
    public GDemographicsType.CountryOfCitizenshipList createGDemographicsTypeCountryOfCitizenshipList() {
        return new GDemographicsType.CountryOfCitizenshipList();
    }

    /**
     * Create an instance of {@link GPersonType.AddressRefIdList.AddressRefId }
     * 
     */
    public GPersonType.AddressRefIdList.AddressRefId createGPersonTypeAddressRefIdListAddressRefId() {
        return new GPersonType.AddressRefIdList.AddressRefId();
    }

    /**
     * Create an instance of {@link GBellScheduleType.BellPeriodList }
     * 
     */
    public GBellScheduleType.BellPeriodList createGBellScheduleTypeBellPeriodList() {
        return new GBellScheduleType.BellPeriodList();
    }

    /**
     * Create an instance of {@link GCourseType.SubjectAreaList }
     * 
     */
    public GCourseType.SubjectAreaList createGCourseTypeSubjectAreaList() {
        return new GCourseType.SubjectAreaList();
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
     * Create an instance of {@link GSessionScheduleType.SectionTeacherList }
     * 
     */
    public GSessionScheduleType.SectionTeacherList createGSessionScheduleTypeSectionTeacherList() {
        return new GSessionScheduleType.SectionTeacherList();
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
     * Create an instance of {@link GLEAType.LeaContactList }
     * 
     */
    public GLEAType.LeaContactList createGLEATypeLeaContactList() {
        return new GLEAType.LeaContactList();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "sre")
    public JAXBElement<SreType> createSre(SreType value) {
        return new JAXBElement<SreType>(_Sre_QNAME, SreType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/na/3.2", name = "assessmentSummary")
    public JAXBElement<AssessmentSummaryType> createAssessmentSummary(AssessmentSummaryType value) {
        return new JAXBElement<AssessmentSummaryType>(_AssessmentSummary_QNAME, AssessmentSummaryType.class, null, value);
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

}
