
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * generated in the sif.dd.au30.model package. 
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

    private final static QName _AggregateStatisticFacts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateStatisticFacts");
    private final static QName _AGStatusReports_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGStatusReports");
    private final static QName _FinancialAccounts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialAccounts");
    private final static QName _ScheduledActivitys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScheduledActivitys");
    private final static QName _SchoolPrograms_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolPrograms");
    private final static QName _WellbeingResponse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponse");
    private final static QName _ResourceUsages_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResourceUsages");
    private final static QName _StudentActivityInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentActivityInfos");
    private final static QName _PersonalisedPlan_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlan");
    private final static QName _StudentAttendanceSummarys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentAttendanceSummarys");
    private final static QName _StudentContactRelationship_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentContactRelationship");
    private final static QName _CalendarSummarys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarSummarys");
    private final static QName _TimeTableCell_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableCell");
    private final static QName _NAPCodeFrames_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPCodeFrames");
    private final static QName _StudentAttendanceTimeLists_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentAttendanceTimeLists");
    private final static QName _Identitys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Identitys");
    private final static QName _StudentSectionEnrollments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSectionEnrollments");
    private final static QName _RoomInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomInfo");
    private final static QName _SchoolCourseInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCourseInfo");
    private final static QName _Invoices_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Invoices");
    private final static QName _StudentContactPersonals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentContactPersonals");
    private final static QName _RoomInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomInfos");
    private final static QName _NAPTestItem_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestItem");
    private final static QName _PersonPicture_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonPicture");
    private final static QName _PaymentReceipts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PaymentReceipts");
    private final static QName _WellbeingAlerts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAlerts");
    private final static QName _NAPTestItems_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestItems");
    private final static QName _CalendarDates_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarDates");
    private final static QName _StudentContactRelationships_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentContactRelationships");
    private final static QName _GradingAssignmentScore_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingAssignmentScore");
    private final static QName _PurchaseOrders_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PurchaseOrders");
    private final static QName _LearningStandardItems_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardItems");
    private final static QName _PersonPictures_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonPictures");
    private final static QName _NAPTestScoreSummarys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestScoreSummarys");
    private final static QName _TimeTableSubject_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableSubject");
    private final static QName _NAPTestScoreSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestScoreSummary");
    private final static QName _FinancialQuestionnaireSubmission_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialQuestionnaireSubmission");
    private final static QName _AggregateStatisticFact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateStatisticFact");
    private final static QName _WellbeingAppeals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAppeals");
    private final static QName _LearningResourcePackage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningResourcePackage");
    private final static QName _SchoolProgramss_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolProgramss");
    private final static QName _AGStatusReport_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGStatusReport");
    private final static QName _StudentActivityParticipation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentActivityParticipation");
    private final static QName _SectionInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SectionInfo");
    private final static QName _WellbeingEvents_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEvents");
    private final static QName _TeachingGroups_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroups");
    private final static QName _StaffAssignment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffAssignment");
    private final static QName _SystemRoles_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SystemRoles");
    private final static QName _Activitys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Activitys");
    private final static QName _StudentPersonal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPersonal");
    private final static QName _NAPTest_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTest");
    private final static QName _Journal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Journal");
    private final static QName _StudentGrades_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentGrades");
    private final static QName _StudentDailyAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentDailyAttendance");
    private final static QName _CalendarDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarDate");
    private final static QName _GradingAssignmentScores_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingAssignmentScores");
    private final static QName _LearningResources_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningResources");
    private final static QName _SectionInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SectionInfos");
    private final static QName _StudentPeriodAttendances_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPeriodAttendances");
    private final static QName _ResourceUsage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResourceUsage");
    private final static QName _AggregateCharacteristicInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateCharacteristicInfos");
    private final static QName _LearningResource_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningResource");
    private final static QName _StudentPersonals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPersonals");
    private final static QName _StudentContactPersonal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentContactPersonal");
    private final static QName _ScheduledActivity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScheduledActivity");
    private final static QName _NAPStudentResponseSet_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPStudentResponseSet");
    private final static QName _AggregateStatisticInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateStatisticInfo");
    private final static QName _LEAInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LEAInfos");
    private final static QName _SchoolInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolInfo");
    private final static QName _GradingAssignments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingAssignments");
    private final static QName _LearningResourcePackages_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningResourcePackages");
    private final static QName _LearningStandardItem_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardItem");
    private final static QName _NAPEventStudentLinks_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPEventStudentLinks");
    private final static QName _EquipmentInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EquipmentInfo");
    private final static QName _StudentAttendanceSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentAttendanceSummary");
    private final static QName _NAPEventStudentLink_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPEventStudentLink");
    private final static QName _WellbeingCharacteristic_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristic");
    private final static QName _EquipmentInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EquipmentInfos");
    private final static QName _PurchaseOrder_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PurchaseOrder");
    private final static QName _LEAInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LEAInfo");
    private final static QName _StudentSchoolEnrollments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSchoolEnrollments");
    private final static QName _StudentActivityParticipations_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentActivityParticipations");
    private final static QName _NAPTests_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTests");
    private final static QName _SystemRole_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SystemRole");
    private final static QName _Debtors_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Debtors");
    private final static QName _ChargedLocationInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ChargedLocationInfo");
    private final static QName _VendorInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VendorInfos");
    private final static QName _LearningStandardDocuments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardDocuments");
    private final static QName _StaffPersonal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffPersonal");
    private final static QName _AggregateCharacteristicInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateCharacteristicInfo");
    private final static QName _PersonalisedPlans_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlans");
    private final static QName _WellbeingCharacteristics_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristics");
    private final static QName _StudentParticipation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentParticipation");
    private final static QName _SessionInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SessionInfo");
    private final static QName _StudentScoreJudgementAgainstStandards_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentScoreJudgementAgainstStandards");
    private final static QName _GradingAssignment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingAssignment");
    private final static QName _WellbeingResponses_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponses");
    private final static QName _TermInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TermInfos");
    private final static QName _LearningStandardDocument_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardDocument");
    private final static QName _StudentPeriodAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPeriodAttendance");
    private final static QName _MarkValueInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MarkValueInfo");
    private final static QName _StudentGrade_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentGrade");
    private final static QName _NAPTestlets_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestlets");
    private final static QName _WellbeingAlert_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAlert");
    private final static QName _WellbeingEvent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEvent");
    private final static QName _StudentSectionEnrollment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSectionEnrollment");
    private final static QName _StudentSchoolEnrollment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSchoolEnrollment");
    private final static QName _FinancialQuestionnaireSubmissions_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialQuestionnaireSubmissions");
    private final static QName _Journals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Journals");
    private final static QName _FinancialAccount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialAccount");
    private final static QName _AggregateStatisticInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AggregateStatisticInfos");
    private final static QName _NAPStudentResponseSets_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPStudentResponseSets");
    private final static QName _SchoolCourseInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCourseInfos");
    private final static QName _TermInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TermInfo");
    private final static QName _SessionInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SessionInfos");
    private final static QName _TimeTableSubjects_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableSubjects");
    private final static QName _TimeTableCells_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableCells");
    private final static QName _StudentScoreJudgementAgainstStandard_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentScoreJudgementAgainstStandard");
    private final static QName _Invoice_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Invoice");
    private final static QName _SchoolInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolInfos");
    private final static QName _ResourceBookings_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResourceBookings");
    private final static QName _PaymentReceipt_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PaymentReceipt");
    private final static QName _NAPTestlet_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestlet");
    private final static QName _StaffAssignments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffAssignments");
    private final static QName _ResourceBooking_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResourceBooking");
    private final static QName _TimeTables_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTables");
    private final static QName _WellbeingAppeal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAppeal");
    private final static QName _Activity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Activity");
    private final static QName _TeachingGroup_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroup");
    private final static QName _StudentAttendanceTimeList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentAttendanceTimeList");
    private final static QName _NAPCodeFrame_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPCodeFrame");
    private final static QName _StaffPersonals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffPersonals");
    private final static QName _StudentActivityInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentActivityInfo");
    private final static QName _StudentParticipations_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentParticipations");
    private final static QName _Debtor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Debtor");
    private final static QName _MarkValueInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MarkValueInfos");
    private final static QName _CalendarSummary_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarSummary");
    private final static QName _ChargedLocationInfos_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ChargedLocationInfos");
    private final static QName _Identity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Identity");
    private final static QName _TimeTable_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTable");
    private final static QName _StudentDailyAttendances_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentDailyAttendances");
    private final static QName _VendorInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VendorInfo");
    private final static QName _AwardContainerTypeAwardNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AwardNotes");
    private final static QName _AwardContainerTypeStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Status");
    private final static QName _AwardContainerTypeAwardDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AwardDescription");
    private final static QName _AwardContainerTypeAwardType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AwardType");
    private final static QName _AwardContainerTypeAwardDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AwardDate");
    private final static QName _SectionInfoTypeCountForAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CountForAttendance");
    private final static QName _SectionInfoTypeCourseSectionCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseSectionCode");
    private final static QName _SectionInfoTypeDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Description");
    private final static QName _SectionInfoTypeSIFExtendedElements_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SIF_ExtendedElements");
    private final static QName _SectionInfoTypeSIFMetadata_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SIF_Metadata");
    private final static QName _SectionInfoTypeMediumOfInstruction_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MediumOfInstruction");
    private final static QName _SectionInfoTypeSummerSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SummerSchool");
    private final static QName _SectionInfoTypeSchoolYear_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolYear");
    private final static QName _SectionInfoTypeLocationOfInstruction_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocationOfInstruction");
    private final static QName _SectionInfoTypeSectionCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SectionCode");
    private final static QName _SectionInfoTypeSchoolCourseInfoOverride_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCourseInfoOverride");
    private final static QName _SectionInfoTypeLanguageOfInstruction_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LanguageOfInstruction");
    private final static QName _SectionInfoTypeTermInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TermInfoRefId");
    private final static QName _ResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ColumnDescription");
    private final static QName _ResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDelimiter_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ColumnDelimiter");
    private final static QName _InvoiceTypeItemDetail_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ItemDetail");
    private final static QName _InvoiceTypeAccountingPeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AccountingPeriod");
    private final static QName _InvoiceTypeFormNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FormNumber");
    private final static QName _InvoiceTypeCreatedBy_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CreatedBy");
    private final static QName _InvoiceTypeVoluntary_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Voluntary");
    private final static QName _InvoiceTypeNetAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NetAmount");
    private final static QName _InvoiceTypeFinancialAccountRefIdList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialAccountRefIdList");
    private final static QName _InvoiceTypeApprovedBy_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApprovedBy");
    private final static QName _InvoiceTypeTaxType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TaxType");
    private final static QName _InvoiceTypeChargedLocationInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ChargedLocationInfoRefId");
    private final static QName _InvoiceTypeTaxAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TaxAmount");
    private final static QName _InvoiceTypeRelatedPurchaseOrderRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RelatedPurchaseOrderRefId");
    private final static QName _InvoiceTypeDueDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DueDate");
    private final static QName _InvoiceTypePurchasingItems_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PurchasingItems");
    private final static QName _InvoiceTypeTaxRate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TaxRate");
    private final static QName _MediumOfInstructionTypeOtherCodeList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherCodeList");
    private final static QName _SessionInfoTypeFinishTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinishTime");
    private final static QName _SessionInfoTypeStaffPersonalLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffPersonalLocalId");
    private final static QName _SessionInfoTypeRoomNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomNumber");
    private final static QName _SessionInfoTypeSchoolLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolLocalId");
    private final static QName _SessionInfoTypeStartTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StartTime");
    private final static QName _SessionInfoTypeRollMarked_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RollMarked");
    private final static QName _NAPTestletTypeNAPTestRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestRefId");
    private final static QName _StaffPersonalTypeStateProvinceId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StateProvinceId");
    private final static QName _StaffPersonalTypeMostRecent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MostRecent");
    private final static QName _StaffPersonalTypeOtherIdList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherIdList");
    private final static QName _StaffPersonalTypeTitle_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Title");
    private final static QName _StaffPersonalTypeEmploymentStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmploymentStatus");
    private final static QName _StaffPersonalTypeElectronicIdList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ElectronicIdList");
    private final static QName _ComponentTypeStrategies_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Strategies");
    private final static QName _ComponentTypeAssociatedObjects_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssociatedObjects");
    private final static QName _JournalTypeApprovedDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApprovedDate");
    private final static QName _JournalTypeGSTCodeReplacement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GSTCodeReplacement");
    private final static QName _JournalTypeNote_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Note");
    private final static QName _JournalTypeOriginatingTransactionRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OriginatingTransactionRefId");
    private final static QName _JournalTypeGSTCodeOriginal_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GSTCodeOriginal");
    private final static QName _JournalTypeCreatedDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CreatedDate");
    private final static QName _AGStatusReportTypeAGCollection_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGCollection");
    private final static QName _AGStatusReportTypeReportingAuthoritySystem_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingAuthoritySystem");
    private final static QName _AGStatusReportTypeSubmissionTimestamp_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubmissionTimestamp");
    private final static QName _AGStatusReportTypeSubmittedBy_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubmittedBy");
    private final static QName _AGStatusReportTypeAGReportingObjectResponseList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGReportingObjectResponseList");
    private final static QName _AGStatusReportTypeReportingAuthorityCommonwealthId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingAuthorityCommonwealthId");
    private final static QName _NAPTestScoreSummaryTypeDomainNationalAverage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainNationalAverage");
    private final static QName _NAPTestScoreSummaryTypeDomainTopNational60Percent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainTopNational60Percent");
    private final static QName _NAPTestScoreSummaryTypeDomainJurisdictionAverage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainJurisdictionAverage");
    private final static QName _NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolInfoRefId");
    private final static QName _NAPTestScoreSummaryTypeDomainSchoolAverage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainSchoolAverage");
    private final static QName _NAPTestScoreSummaryTypeDomainBottomNational60Percent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainBottomNational60Percent");
    private final static QName _StaffMostRecentContainerTypeHomeGroup_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HomeGroup");
    private final static QName _StaffMostRecentContainerTypeNAPLANClassList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPLANClassList");
    private final static QName _StaffMostRecentContainerTypeSchoolACARAId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolACARAId");
    private final static QName _StaffMostRecentContainerTypeLocalCampusId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalCampusId");
    private final static QName _EvaluationTypeName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Name");
    private final static QName _EvaluationTypeDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Date");
    private final static QName _NAPEventStudentLinkTypeAdjustment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Adjustment");
    private final static QName _NAPEventStudentLinkTypeDevice_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Device");
    private final static QName _NAPEventStudentLinkTypePersonalDetailsChanged_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalDetailsChanged");
    private final static QName _NAPEventStudentLinkTypeSystem_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "System");
    private final static QName _NAPEventStudentLinkTypeDOBRange_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DOBRange");
    private final static QName _NAPEventStudentLinkTypePossibleDuplicate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PossibleDuplicate");
    private final static QName _NAPEventStudentLinkTypeTestDisruptionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TestDisruptionList");
    private final static QName _NAPEventStudentLinkTypeNAPJurisdiction_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPJurisdiction");
    private final static QName _NAPEventStudentLinkTypeExemptionReason_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExemptionReason");
    private final static QName _NAPEventStudentLinkTypeSchoolGeolocation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolGeolocation");
    private final static QName _NAPEventStudentLinkTypeReportingSchoolName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingSchoolName");
    private final static QName _NAPEventStudentLinkTypeStudentPersonalRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPersonalRefId");
    private final static QName _NAPEventStudentLinkTypeLapsedTimeTest_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LapsedTimeTest");
    private final static QName _NAPEventStudentLinkTypePSIOtherIdMatch_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PSIOtherIdMatch");
    private final static QName _TimeElementTypeSpanGapsSpanGapEndDateTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EndDateTime");
    private final static QName _TimeElementTypeSpanGapsSpanGapStartDateTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StartDateTime");
    private final static QName _HouseholdContactInfoTypeHouseholdContactId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HouseholdContactId");
    private final static QName _HouseholdContactInfoTypePhoneNumberList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PhoneNumberList");
    private final static QName _HouseholdContactInfoTypeAddressList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AddressList");
    private final static QName _HouseholdContactInfoTypeEmailList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmailList");
    private final static QName _HouseholdContactInfoTypeHouseholdSalutation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HouseholdSalutation");
    private final static QName _ActivityTimeTypeStartDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StartDate");
    private final static QName _ActivityTimeTypeFinishDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinishDate");
    private final static QName _ActivityTimeTypeDuration_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Duration");
    private final static QName _FinancialQuestionnaireSubmissionTypeFQReportComments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FQReportComments");
    private final static QName _FinancialQuestionnaireSubmissionTypeSystemSubmission_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SystemSubmission");
    private final static QName _FinancialQuestionnaireSubmissionTypeFQReportingList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FQReportingList");
    private final static QName _FinancialQuestionnaireSubmissionTypeReportingAuthority_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingAuthority");
    private final static QName _StudentSubjectChoiceTypeOtherSchoolLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherSchoolLocalId");
    private final static QName _StudentSubjectChoiceTypePreferenceNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreferenceNumber");
    private final static QName _StudentSubjectChoiceTypeStudyDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudyDescription");
    private final static QName _PhoneNumberTypePreference_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Preference");
    private final static QName _PhoneNumberTypeExtension_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Extension");
    private final static QName _PhoneNumberTypeListedStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ListedStatus");
    private final static QName _FinancialAccountTypeParentAccountRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParentAccountRefId");
    private final static QName _StudentGradeTypeMarkers_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Markers");
    private final static QName _StudentGradeTypeHomegroup_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Homegroup");
    private final static QName _StudentGradeTypeYearLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "YearLevel");
    private final static QName _StudentGradeTypeLearningStandardList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardList");
    private final static QName _StudentGradeTypeTeachingGroupRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroupRefId");
    private final static QName _StudentGradeTypeGrade_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Grade");
    private final static QName _StudentGradeTypeStaffPersonalRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffPersonalRefId");
    private final static QName _StudentGradeTypeTeacherJudgement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeacherJudgement");
    private final static QName _StudentGradeTypeLearningArea_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningArea");
    private final static QName _StudentGradeTypeGradingScoreList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingScoreList");
    private final static QName _StudentGradeTypeTeachingGroupShortName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroupShortName");
    private final static QName _PromotionInfoTypePromotionStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PromotionStatus");
    private final static QName _LearningStandardDocumentTypeAuthors_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Authors");
    private final static QName _LearningStandardDocumentTypeRepositoryDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RepositoryDate");
    private final static QName _LearningStandardDocumentTypeLocalAdoptionDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalAdoptionDate");
    private final static QName _LearningStandardDocumentTypeRichDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RichDescription");
    private final static QName _LearningStandardDocumentTypeOrganizationContactPoint_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OrganizationContactPoint");
    private final static QName _LearningStandardDocumentTypeCopyright_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Copyright");
    private final static QName _LearningStandardDocumentTypeEndOfLifeDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EndOfLifeDate");
    private final static QName _LearningStandardDocumentTypeDocumentDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DocumentDate");
    private final static QName _LearningStandardDocumentTypeRelatedLearningStandards_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RelatedLearningStandards");
    private final static QName _LearningStandardDocumentTypeLocalArchiveDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalArchiveDate");
    private final static QName _LearningStandardDocumentTypeYearLevels_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "YearLevels");
    private final static QName _ContactFlagsTypeDisciplinaryContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DisciplinaryContact");
    private final static QName _ContactFlagsTypeHasCustody_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HasCustody");
    private final static QName _ContactFlagsTypeEmergencyContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmergencyContact");
    private final static QName _ContactFlagsTypeLivesWith_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LivesWith");
    private final static QName _ContactFlagsTypeReceivesAssessmentReport_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReceivesAssessmentReport");
    private final static QName _ContactFlagsTypeAccessToRecords_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AccessToRecords");
    private final static QName _ContactFlagsTypePrimaryCareProvider_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PrimaryCareProvider");
    private final static QName _ContactFlagsTypePickupRights_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PickupRights");
    private final static QName _ContactFlagsTypeFeesAccess_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FeesAccess");
    private final static QName _ContactFlagsTypeInterventionOrder_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "InterventionOrder");
    private final static QName _ContactFlagsTypeFamilyMail_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FamilyMail");
    private final static QName _ContactFlagsTypeAttendanceContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AttendanceContact");
    private final static QName _ContactFlagsTypeParentLegalGuardian_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParentLegalGuardian");
    private final static QName _ContactFlagsTypeFeesBilling_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FeesBilling");
    private final static QName _ExpenseAccountTypeFinancialAccountRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FinancialAccountRefId");
    private final static QName _NAPTestletCodeFrameTypeNAPTestletRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestletRefId");
    private final static QName _BaseNameTypeFamilyName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FamilyName");
    private final static QName _BaseNameTypeFullName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FullName");
    private final static QName _BaseNameTypePreferredGivenName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreferredGivenName");
    private final static QName _BaseNameTypeSuffix_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Suffix");
    private final static QName _BaseNameTypeMiddleName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MiddleName");
    private final static QName _BaseNameTypePreferredFamilyName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreferredFamilyName");
    private final static QName _BaseNameTypePreferredFamilyNameFirst_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreferredFamilyNameFirst");
    private final static QName _BaseNameTypeGivenName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GivenName");
    private final static QName _BaseNameTypeFamilyNameFirst_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FamilyNameFirst");
    private final static QName _AGReportingObjectResponseTypeHTTPStatusCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HTTPStatusCode");
    private final static QName _AGReportingObjectResponseTypeEntityName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EntityName");
    private final static QName _AGReportingObjectResponseTypeSubmittedRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubmittedRefId");
    private final static QName _AGReportingObjectResponseTypeSIFRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SIFRefId");
    private final static QName _AGReportingObjectResponseTypeErrorText_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ErrorText");
    private final static QName _AGReportingObjectResponseTypeAGRuleList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGRuleList");
    private final static QName _LEAInfoTypeEducationAgencyType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EducationAgencyType");
    private final static QName _LEAInfoTypeCommonwealthId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CommonwealthId");
    private final static QName _LEAInfoTypeLEAURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LEAURL");
    private final static QName _LEAInfoTypeOperationalStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OperationalStatus");
    private final static QName _LEAInfoTypeLEAContactList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LEAContactList");
    private final static QName _LEAInfoTypeSLA_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SLA");
    private final static QName _LEAInfoTypeJurisdictionLowerHouse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "JurisdictionLowerHouse");
    private final static QName _NAPWritingRubricTypeDescriptor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Descriptor");
    private final static QName _StaffAssignmentTypeJobFunction_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "JobFunction");
    private final static QName _StaffAssignmentTypeStaffSubjectList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffSubjectList");
    private final static QName _StaffAssignmentTypeStaffActivity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffActivity");
    private final static QName _StaffAssignmentTypePreviousSchoolName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreviousSchoolName");
    private final static QName _StaffAssignmentTypeJobFTE_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "JobFTE");
    private final static QName _StaffAssignmentTypeHouse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "House");
    private final static QName _StaffAssignmentTypeCalendarSummaryList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarSummaryList");
    private final static QName _StaffAssignmentTypeCasualReliefTeacher_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CasualReliefTeacher");
    private final static QName _StaffAssignmentTypeJobStartDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "JobStartDate");
    private final static QName _StaffAssignmentTypeJobEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "JobEndDate");
    private final static QName _SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoleScopeName");
    private final static QName _SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoleScopeRefId");
    private final static QName _LearningStandardItemTypeLevel5_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Level5");
    private final static QName _LearningStandardItemTypeLevel4_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Level4");
    private final static QName _LearningStandardItemTypePredecessorItems_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PredecessorItems");
    private final static QName _LearningStandardItemTypeStandardIdentifier_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StandardIdentifier");
    private final static QName _LearningStandardItemTypeStandardSettingBody_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StandardSettingBody");
    private final static QName _LearningStandardItemTypeStatementCodes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StatementCodes");
    private final static QName _LearningStandardItemTypeACStrandSubjectArea_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ACStrandSubjectArea");
    private final static QName _LearningStandardItemTypeResources_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Resources");
    private final static QName _LearningStandardItemTypeStatements_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Statements");
    private final static QName _LearningStandardItemTypeRelatedLearningStandardItems_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RelatedLearningStandardItems");
    private final static QName _MedicationTypeAdministrationInformation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AdministrationInformation");
    private final static QName _MedicationTypeDosage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Dosage");
    private final static QName _MedicationTypeFrequency_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Frequency");
    private final static QName _MedicationTypeMedicationName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MedicationName");
    private final static QName _MedicationTypeMethod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Method");
    private final static QName _TeachingGroupTypeSemester_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Semester");
    private final static QName _TeachingGroupTypeTimeTableSubjectRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableSubjectRefId");
    private final static QName _TeachingGroupTypeSet_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Set");
    private final static QName _TeachingGroupTypeStudentList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentList");
    private final static QName _TeachingGroupTypeTeachingGroupPeriodList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroupPeriodList");
    private final static QName _TeachingGroupTypeMinClassSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MinClassSize");
    private final static QName _TeachingGroupTypeSchoolCourseInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCourseInfoRefId");
    private final static QName _TeachingGroupTypeLongName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LongName");
    private final static QName _TeachingGroupTypeSchoolCourseLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCourseLocalId");
    private final static QName _TeachingGroupTypeGroupType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GroupType");
    private final static QName _TeachingGroupTypeMaxClassSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MaxClassSize");
    private final static QName _TeachingGroupTypeTeacherList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeacherList");
    private final static QName _TeachingGroupTypeTimeTableSubjectLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableSubjectLocalId");
    private final static QName _TeachingGroupTypeBlock_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Block");
    private final static QName _TeachingGroupTypeCurriculumLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CurriculumLevel");
    private final static QName _DetentionContainerTypeDetentionLocation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DetentionLocation");
    private final static QName _DetentionContainerTypeDetentionNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DetentionNotes");
    private final static QName _DetentionContainerTypeDetentionDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DetentionDate");
    private final static QName _EquipmentInfoTypeSIFRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SIF_RefId");
    private final static QName _EquipmentInfoTypeInvoiceRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "InvoiceRefId");
    private final static QName _EquipmentInfoTypeAssetNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssetNumber");
    private final static QName _EquipmentInfoTypeEquipmentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EquipmentType");
    private final static QName _EquipmentInfoTypePurchaseOrderRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PurchaseOrderRefId");
    private final static QName _StudentAttendanceTimeListTypePeriodAttendances_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PeriodAttendances");
    private final static QName _StudentScoreJudgementAgainstStandardTypeCurriculumCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CurriculumCode");
    private final static QName _StudentScoreJudgementAgainstStandardTypeSchoolCommonwealthId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCommonwealthId");
    private final static QName _StudentScoreJudgementAgainstStandardTypeStudentStateProvinceId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentStateProvinceId");
    private final static QName _StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffLocalId");
    private final static QName _StudentScoreJudgementAgainstStandardTypeCurriculumNodeCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CurriculumNodeCode");
    private final static QName _StudentScoreJudgementAgainstStandardTypeLocalTermCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalTermCode");
    private final static QName _StudentScoreJudgementAgainstStandardTypeStudentLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentLocalId");
    private final static QName _StudentScoreJudgementAgainstStandardTypeSpecialCircumstanceLocalCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SpecialCircumstanceLocalCode");
    private final static QName _StudentScoreJudgementAgainstStandardTypeManagedPathwayLocalCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ManagedPathwayLocalCode");
    private final static QName _StudentScoreJudgementAgainstStandardTypeClassLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ClassLocalId");
    private final static QName _StudentContactPersonalTypeNonSchoolEducation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NonSchoolEducation");
    private final static QName _StudentContactPersonalTypeLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalId");
    private final static QName _StudentContactPersonalTypeEmploymentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmploymentType");
    private final static QName _StudentContactPersonalTypeSchoolEducationalLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolEducationalLevel");
    private final static QName _SchoolContactTypePublishInDirectory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PublishInDirectory");
    private final static QName _ResourceUsageTypeResourceUsageContentTypeLocalDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalDescription");
    private final static QName _AggregateStatisticInfoTypeExpirationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExpirationDate");
    private final static QName _AggregateStatisticInfoTypeExclusionRules_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExclusionRules");
    private final static QName _AggregateStatisticInfoTypeCalculationRule_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalculationRule");
    private final static QName _AggregateStatisticInfoTypeApprovalDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApprovalDate");
    private final static QName _AggregateStatisticInfoTypeEffectiveDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EffectiveDate");
    private final static QName _AggregateStatisticInfoTypeLocation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Location");
    private final static QName _AggregateStatisticInfoTypeSource_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Source");
    private final static QName _AggregateStatisticInfoTypeMeasure_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Measure");
    private final static QName _AggregateStatisticInfoTypeDiscontinueDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DiscontinueDate");
    private final static QName _ContactTypeAddress_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Address");
    private final static QName _ContactTypeEmail_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Email");
    private final static QName _ContactTypePhoneNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PhoneNumber");
    private final static QName _MarkValueInfoTypeNumericPrecision_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericPrecision");
    private final static QName _MarkValueInfoTypeNumericPassingGrade_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericPassingGrade");
    private final static QName _MarkValueInfoTypePercentageMaximum_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PercentageMaximum");
    private final static QName _MarkValueInfoTypeNarrativeMaximumSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NarrativeMaximumSize");
    private final static QName _MarkValueInfoTypeNumericHigh_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericHigh");
    private final static QName _MarkValueInfoTypePercentageMinimum_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PercentageMinimum");
    private final static QName _MarkValueInfoTypeValidLetterMarkList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ValidLetterMarkList");
    private final static QName _MarkValueInfoTypeNumericScale_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericScale");
    private final static QName _MarkValueInfoTypeNumericLow_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericLow");
    private final static QName _MarkValueInfoTypePercentagePassingGrade_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PercentagePassingGrade");
    private final static QName _MarkerTypeRole_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Role");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicCategory");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicEndDate");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicNotes");
    private final static QName _WellbeingCharacteristicTypeConfidentialFlag_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ConfidentialFlag");
    private final static QName _WellbeingCharacteristicTypeDocumentList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DocumentList");
    private final static QName _WellbeingCharacteristicTypeMedicationList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MedicationList");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicReviewDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicReviewDate");
    private final static QName _WellbeingCharacteristicTypeCharacteristicSeverity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CharacteristicSeverity");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicSubCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicSubCategory");
    private final static QName _WellbeingCharacteristicTypeTrigger_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Trigger");
    private final static QName _WellbeingCharacteristicTypeDailyManagement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DailyManagement");
    private final static QName _WellbeingCharacteristicTypeEmergencyManagement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmergencyManagement");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicClassification_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicClassification");
    private final static QName _WellbeingCharacteristicTypeEmergencyResponsePlan_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmergencyResponsePlan");
    private final static QName _WellbeingCharacteristicTypeLocalCharacteristicCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalCharacteristicCode");
    private final static QName _WellbeingCharacteristicTypeWellbeingCharacteristicStartDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingCharacteristicStartDate");
    private final static QName _WellbeingCharacteristicTypeAlert_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Alert");
    private final static QName _PurchaseOrderTypeCreationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CreationDate");
    private final static QName _PurchaseOrderTypeUpdateDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "UpdateDate");
    private final static QName _PurchaseOrderTypeFullyDelivered_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FullyDelivered");
    private final static QName _PurchaseOrderTypeEmployeePersonalRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EmployeePersonalRefId");
    private final static QName _PurchaseOrderTypeOriginalPurchaseOrderRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OriginalPurchaseOrderRefId");
    private final static QName _PurchaseOrderTypeTotalAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TotalAmount");
    private final static QName _WellbeingEventCategoryTypeWellbeingEventSubCategoryList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventSubCategoryList");
    private final static QName _WellbeingPlanTypePersonalisedPlanRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlanRefId");
    private final static QName _WellbeingPlanTypePlanNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PlanNotes");
    private final static QName _TermInfoTypeRelativeDuration_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RelativeDuration");
    private final static QName _TermInfoTypeSchedulingTerm_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchedulingTerm");
    private final static QName _TermInfoTypeTermSpan_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TermSpan");
    private final static QName _TermInfoTypeAttendanceTerm_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AttendanceTerm");
    private final static QName _TermInfoTypeTrack_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Track");
    private final static QName _TermInfoTypeTermCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TermCode");
    private final static QName _TermInfoTypeMarkingTerm_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MarkingTerm");
    private final static QName _StudentSectionEnrollmentTypeExitDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExitDate");
    private final static QName _StudentSectionEnrollmentTypeEntryDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EntryDate");
    private final static QName _ValidLetterMarkTypeNumericEquivalent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NumericEquivalent");
    private final static QName _ChargedLocationInfoTypeParentChargedLocationInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParentChargedLocationInfoRefId");
    private final static QName _GradingAssignmentScoreTypeScorePercent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScorePercent");
    private final static QName _GradingAssignmentScoreTypeExpectedScore_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExpectedScore");
    private final static QName _GradingAssignmentScoreTypeSubscoreList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubscoreList");
    private final static QName _GradingAssignmentScoreTypeMarkInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MarkInfoRefId");
    private final static QName _GradingAssignmentScoreTypeScoreDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScoreDescription");
    private final static QName _GradingAssignmentScoreTypeAssignmentScoreIteration_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssignmentScoreIteration");
    private final static QName _GradingAssignmentScoreTypeScorePoints_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScorePoints");
    private final static QName _GradingAssignmentScoreTypeDateGraded_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DateGraded");
    private final static QName _GradingAssignmentScoreTypeScoreLetter_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScoreLetter");
    private final static QName _StudentParticipationTypeStudentSpecialEducationFTE_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSpecialEducationFTE");
    private final static QName _StudentParticipationTypeGiftedEligibilityCriteria_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GiftedEligibilityCriteria");
    private final static QName _StudentParticipationTypeReferralSource_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReferralSource");
    private final static QName _StudentParticipationTypeEvaluationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EvaluationDate");
    private final static QName _StudentParticipationTypeProgramAvailability_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramAvailability");
    private final static QName _StudentParticipationTypeEvaluationExtensionDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EvaluationExtensionDate");
    private final static QName _StudentParticipationTypeProgramEligibilityDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramEligibilityDate");
    private final static QName _StudentParticipationTypeProgramFundingSources_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramFundingSources");
    private final static QName _StudentParticipationTypeNOREPDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NOREPDate");
    private final static QName _StudentParticipationTypePlacementParentalConsentDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PlacementParentalConsentDate");
    private final static QName _StudentParticipationTypeProgramStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramStatus");
    private final static QName _StudentParticipationTypeExtendedDay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExtendedDay");
    private final static QName _StudentParticipationTypeReferralDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReferralDate");
    private final static QName _StudentParticipationTypeParticipationContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParticipationContact");
    private final static QName _StudentParticipationTypeReevaluationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReevaluationDate");
    private final static QName _StudentParticipationTypeExtendedSchoolYear_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExtendedSchoolYear");
    private final static QName _StudentParticipationTypeEvaluationParentalConsentDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EvaluationParentalConsentDate");
    private final static QName _StudentParticipationTypeEntryPerson_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EntryPerson");
    private final static QName _StudentParticipationTypeExtensionComments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExtensionComments");
    private final static QName _StudentParticipationTypeProgramPlacementDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramPlacementDate");
    private final static QName _StudentParticipationTypeProgramPlanEffectiveDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramPlanEffectiveDate");
    private final static QName _StudentParticipationTypeProgramType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramType");
    private final static QName _StudentParticipationTypeProgramPlanDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProgramPlanDate");
    private final static QName _LearningStandardTypeLearningStandardURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardURL");
    private final static QName _LearningStandardTypeLearningStandardItemRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardItemRefId");
    private final static QName _LearningStandardTypeLearningStandardLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandardLocalId");
    private final static QName _NAPTestItemContentTypeExemplarURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExemplarURL");
    private final static QName _NAPTestItemContentTypeItemProficiencyLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ItemProficiencyLevel");
    private final static QName _NAPTestItemContentTypeItemSubstitutedForList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ItemSubstitutedForList");
    private final static QName _NAPTestItemContentTypeContentDescriptionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContentDescriptionList");
    private final static QName _NAPTestItemContentTypeMultipleChoiceOptionCount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MultipleChoiceOptionCount");
    private final static QName _NAPTestItemContentTypeNAPWritingRubricList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPWritingRubricList");
    private final static QName _NAPTestItemContentTypeStimulusList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StimulusList");
    private final static QName _NAPTestItemContentTypeWritingGenre_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WritingGenre");
    private final static QName _NAPTestItemContentTypeCorrectAnswer_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CorrectAnswer");
    private final static QName _SubstituteItemTypeSubstituteItemLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubstituteItemLocalId");
    private final static QName _FollowUpActionTypeFollowUpActionCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FollowUpActionCategory");
    private final static QName _FollowUpActionTypeWellbeingResponseRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponseRefId");
    private final static QName _FollowUpActionTypeFollowUpDetails_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FollowUpDetails");
    private final static QName _ACStrandSubjectAreaTypeSubjectArea_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectArea");
    private final static QName _SystemRoleTypeSystemContextListSystemContextRoleList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoleList");
    private final static QName _ScheduledActivityTypeTimeTableRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableRefId");
    private final static QName _ScheduledActivityTypeActivityName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ActivityName");
    private final static QName _ScheduledActivityTypeActivityType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ActivityType");
    private final static QName _ScheduledActivityTypePeriodId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PeriodId");
    private final static QName _ScheduledActivityTypeCellType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CellType");
    private final static QName _ScheduledActivityTypeTeachingGroupList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroupList");
    private final static QName _ScheduledActivityTypeOverride_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Override");
    private final static QName _ScheduledActivityTypeTimeTableCellRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableCellRefId");
    private final static QName _ScheduledActivityTypeActivityComment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ActivityComment");
    private final static QName _ScheduledActivityTypeDayId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DayId");
    private final static QName _ScheduledActivityTypeRoomList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomList");
    private final static QName _PersonPictureTypeOKToPublish_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OKToPublish");
    private final static QName _PersonPictureTypePublishingPermissionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PublishingPermissionList");
    private final static QName _LifeCycleTypeCreatedCreators_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Creators");
    private final static QName _TimeTableSubjectTypeAcademicYear_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AcademicYear");
    private final static QName _TimeTableSubjectTypeProposedMinClassSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProposedMinClassSize");
    private final static QName _TimeTableSubjectTypeFaculty_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Faculty");
    private final static QName _TimeTableSubjectTypeSubjectShortName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectShortName");
    private final static QName _TimeTableSubjectTypeCourseLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseLocalId");
    private final static QName _TimeTableSubjectTypeAcademicYearRange_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AcademicYearRange");
    private final static QName _TimeTableSubjectTypeSubjectType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectType");
    private final static QName _TimeTableSubjectTypeProposedMaxClassSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProposedMaxClassSize");
    private final static QName _StimulusTypeTextGenre_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TextGenre");
    private final static QName _StimulusTypeWordCount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WordCount");
    private final static QName _StimulusTypeTextType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TextType");
    private final static QName _StimulusTypeTextDescriptor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TextDescriptor");
    private final static QName _StudentActivityInfoTypeCurricularStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CurricularStatus");
    private final static QName _StudentActivityInfoTypeStudentActivityLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentActivityLevel");
    private final static QName _StudentMostRecentContainerTypeParent2SchoolEducationLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent2SchoolEducationLevel");
    private final static QName _StudentMostRecentContainerTypeParent1EmploymentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent1EmploymentType");
    private final static QName _StudentMostRecentContainerTypeParent2Language_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent2Language");
    private final static QName _StudentMostRecentContainerTypeParent1Language_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent1Language");
    private final static QName _StudentMostRecentContainerTypeHomeroomLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HomeroomLocalId");
    private final static QName _StudentMostRecentContainerTypeFFPOS_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FFPOS");
    private final static QName _StudentMostRecentContainerTypeParent2EmploymentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent2EmploymentType");
    private final static QName _StudentMostRecentContainerTypeParent1NonSchoolEducation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent1NonSchoolEducation");
    private final static QName _StudentMostRecentContainerTypeMembershipType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MembershipType");
    private final static QName _StudentMostRecentContainerTypeOtherEnrollmentSchoolACARAId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherEnrollmentSchoolACARAId");
    private final static QName _StudentMostRecentContainerTypeFTE_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FTE");
    private final static QName _StudentMostRecentContainerTypeReportingSchoolId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingSchoolId");
    private final static QName _StudentMostRecentContainerTypeParent1SchoolEducationLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent1SchoolEducationLevel");
    private final static QName _StudentMostRecentContainerTypeClassCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ClassCode");
    private final static QName _StudentMostRecentContainerTypeParent2NonSchoolEducation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Parent2NonSchoolEducation");
    private final static QName _StudentMostRecentContainerTypeTestLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TestLevel");
    private final static QName _StudentPeriodAttendanceTypeScheduledActivityRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ScheduledActivityRefId");
    private final static QName _StudentPeriodAttendanceTypeTimeOut_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeOut");
    private final static QName _StudentPeriodAttendanceTypeSessionInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SessionInfoRefId");
    private final static QName _StudentPeriodAttendanceTypeTimeIn_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeIn");
    private final static QName _StudentPeriodAttendanceTypeAuditInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AuditInfo");
    private final static QName _StudentPeriodAttendanceTypeAttendanceComment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AttendanceComment");
    private final static QName _StudentPeriodAttendanceTypeTimetablePeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimetablePeriod");
    private final static QName _AddressStreetTypeStreetPrefix_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StreetPrefix");
    private final static QName _AddressStreetTypeApartmentNumberSuffix_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApartmentNumberSuffix");
    private final static QName _AddressStreetTypeStreetName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StreetName");
    private final static QName _AddressStreetTypeApartmentNumberPrefix_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApartmentNumberPrefix");
    private final static QName _AddressStreetTypeStreetType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StreetType");
    private final static QName _AddressStreetTypeApartmentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApartmentType");
    private final static QName _AddressStreetTypeApartmentNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ApartmentNumber");
    private final static QName _AddressStreetTypeLine3_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Line3");
    private final static QName _AddressStreetTypeComplex_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Complex");
    private final static QName _AddressStreetTypeLine2_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Line2");
    private final static QName _AddressStreetTypeStreetSuffix_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StreetSuffix");
    private final static QName _AddressStreetTypeStreetNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StreetNumber");
    private final static QName _SuspensionContainerTypeWithdrawalTimeList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WithdrawalTimeList");
    private final static QName _SuspensionContainerTypeAdvisementDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AdvisementDate");
    private final static QName _SuspensionContainerTypeEarlyReturnDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EarlyReturnDate");
    private final static QName _SuspensionContainerTypeResolutionMeetingTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResolutionMeetingTime");
    private final static QName _SuspensionContainerTypeResolutionNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResolutionNotes");
    private final static QName _OtherWellbeingResponseContainerTypeOtherResponseNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherResponseNotes");
    private final static QName _OtherWellbeingResponseContainerTypeOtherResponseDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherResponseDate");
    private final static QName _OtherWellbeingResponseContainerTypeOtherResponseType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherResponseType");
    private final static QName _OtherWellbeingResponseContainerTypeOtherResponseDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherResponseDescription");
    private final static QName _PlanRequiredContainerTypePlanRequiredList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PlanRequiredList");
    private final static QName _StudentPersonalTypeOnTimeGraduationYear_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OnTimeGraduationYear");
    private final static QName _StudentPersonalTypeHomeSchooledStudent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HomeSchooledStudent");
    private final static QName _StudentPersonalTypeESLDateAssessed_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ESLDateAssessed");
    private final static QName _StudentPersonalTypeESLSupport_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ESLSupport");
    private final static QName _StudentPersonalTypePrePrimaryEducation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PrePrimaryEducation");
    private final static QName _StudentPersonalTypeMedicalAlertMessages_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MedicalAlertMessages");
    private final static QName _StudentPersonalTypeYoungCarersRole_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "YoungCarersRole");
    private final static QName _StudentPersonalTypeAcceptableUsePolicy_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AcceptableUsePolicy");
    private final static QName _StudentPersonalTypeIntegrationAide_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IntegrationAide");
    private final static QName _StudentPersonalTypeEconomicDisadvantage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EconomicDisadvantage");
    private final static QName _StudentPersonalTypeGiftedTalented_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GiftedTalented");
    private final static QName _StudentPersonalTypeFirstAUSchoolEnrollment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FirstAUSchoolEnrollment");
    private final static QName _StudentPersonalTypeDisability_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Disability");
    private final static QName _StudentPersonalTypeEducationSupport_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EducationSupport");
    private final static QName _StudentPersonalTypeGraduationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GraduationDate");
    private final static QName _StudentPersonalTypeOfflineDelivery_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OfflineDelivery");
    private final static QName _StudentPersonalTypeAlertMessages_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AlertMessages");
    private final static QName _StudentPersonalTypeESL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ESL");
    private final static QName _StudentPersonalTypeSensitive_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Sensitive");
    private final static QName _StudentPersonalTypeProjectedGraduationYear_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ProjectedGraduationYear");
    private final static QName _EntityContactInfoTypePositionTitle_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PositionTitle");
    private final static QName _EntityContactInfoTypeRegistrationDetails_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RegistrationDetails");
    private final static QName _EntityContactInfoTypeQualifications_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Qualifications");
    private final static QName _LifeCycleTypeTimeElements_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeElements");
    private final static QName _LifeCycleTypeModificationHistory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ModificationHistory");
    private final static QName _LifeCycleTypeCreated_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Created");
    private final static QName _CopyRightContainerTypeHolder_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Holder");
    private final static QName _PersonInvolvementTypePersonRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonRefId");
    private final static QName _PersonInvolvementTypeHowInvolved_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HowInvolved");
    private final static QName _PersonInvolvementTypeShortName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ShortName");
    private final static QName _GradeTypePercentage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Percentage");
    private final static QName _GradeTypeNarrative_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Narrative");
    private final static QName _GradeTypeNumeric_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Numeric");
    private final static QName _GradeTypeLetter_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Letter");
    private final static QName _SchoolCourseInfoTypeCoreAcademicCourse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CoreAcademicCourse");
    private final static QName _SchoolCourseInfoTypeDistrictCourseCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DistrictCourseCode");
    private final static QName _SchoolCourseInfoTypeSubjectAreaList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectAreaList");
    private final static QName _SchoolCourseInfoTypeCourseCredits_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseCredits");
    private final static QName _SchoolCourseInfoTypeCourseContent_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseContent");
    private final static QName _SchoolCourseInfoTypeDepartment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Department");
    private final static QName _SchoolCourseInfoTypeInstructionalLevel_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "InstructionalLevel");
    private final static QName _SchoolCourseInfoTypeGraduationRequirement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GraduationRequirement");
    private final static QName _SchoolCourseInfoTypeStateCourseCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StateCourseCode");
    private final static QName _NAPStudentResponseSetTypePathTakenForDomain_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PathTakenForDomain");
    private final static QName _NAPStudentResponseSetTypeCalibrationSampleFlag_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalibrationSampleFlag");
    private final static QName _NAPStudentResponseSetTypeTestletList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TestletList");
    private final static QName _NAPStudentResponseSetTypeDomainScore_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DomainScore");
    private final static QName _NAPStudentResponseSetTypeParallelTest_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParallelTest");
    private final static QName _NAPStudentResponseSetTypeEquatingSampleFlag_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EquatingSampleFlag");
    private final static QName _AGRuleTypeAGRuleResponse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGRuleResponse");
    private final static QName _AGRuleTypeAGRuleComment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGRuleComment");
    private final static QName _AGRuleTypeAGRuleStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGRuleStatus");
    private final static QName _AGRuleTypeAGRuleCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AGRuleCode");
    private final static QName _WellbeingResponseTypeWellbeingResponseCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponseCategory");
    private final static QName _WellbeingResponseTypeDetention_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Detention");
    private final static QName _WellbeingResponseTypePersonInvolvementList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonInvolvementList");
    private final static QName _WellbeingResponseTypeAward_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Award");
    private final static QName _WellbeingResponseTypeWellbeingResponseEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponseEndDate");
    private final static QName _WellbeingResponseTypePlanRequired_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PlanRequired");
    private final static QName _WellbeingResponseTypeWellbeingResponseNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingResponseNotes");
    private final static QName _WellbeingResponseTypeSuspension_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Suspension");
    private final static QName _WellbeingResponseTypeOtherResponse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherResponse");
    private final static QName _FQItemTypeTuitionAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TuitionAmount");
    private final static QName _FQItemTypeFQComments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FQComments");
    private final static QName _FQItemTypeDioceseAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DioceseAmount");
    private final static QName _FQItemTypeBoardingAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BoardingAmount");
    private final static QName _FQItemTypeSystemAmount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SystemAmount");
    private final static QName _StudentSchoolEnrollmentTypeCalendar_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Calendar");
    private final static QName _StudentSchoolEnrollmentTypeDestinationSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DestinationSchool");
    private final static QName _StudentSchoolEnrollmentTypeIndividualLearningPlan_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IndividualLearningPlan");
    private final static QName _StudentSchoolEnrollmentTypeAdvisor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Advisor");
    private final static QName _StudentSchoolEnrollmentTypePromotionInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PromotionInfo");
    private final static QName _StudentSchoolEnrollmentTypeRecordClosureReason_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RecordClosureReason");
    private final static QName _StudentSchoolEnrollmentTypeHomeroom_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Homeroom");
    private final static QName _StudentSchoolEnrollmentTypeCatchmentStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CatchmentStatus");
    private final static QName _StudentSchoolEnrollmentTypeEntryType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EntryType");
    private final static QName _StudentSchoolEnrollmentTypePreviousSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PreviousSchool");
    private final static QName _StudentSchoolEnrollmentTypeCounselor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Counselor");
    private final static QName _StudentSchoolEnrollmentTypeStartedAtSchoolDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StartedAtSchoolDate");
    private final static QName _StudentSchoolEnrollmentTypeFTPTStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FTPTStatus");
    private final static QName _StudentSchoolEnrollmentTypeStudentSubjectChoiceList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentSubjectChoiceList");
    private final static QName _StudentSchoolEnrollmentTypeExitType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExitType");
    private final static QName _StudentSchoolEnrollmentTypeStudentGroupList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentGroupList");
    private final static QName _StudentSchoolEnrollmentTypeDestinationSchoolName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DestinationSchoolName");
    private final static QName _StudentSchoolEnrollmentTypeACARASchoolId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ACARASchoolId");
    private final static QName _StudentSchoolEnrollmentTypeExitStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExitStatus");
    private final static QName _StudentSchoolEnrollmentTypeReportingSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingSchool");
    private final static QName _StaffSubjectTypeSubjectLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectLocalId");
    private final static QName _PersonInfoTypeOtherNames_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherNames");
    private final static QName _PersonInfoTypeDemographics_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Demographics");
    private final static QName _PersonInfoTypeHouseholdContactInfoList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HouseholdContactInfoList");
    private final static QName _SchoolProgramsTypeSchoolProgramList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolProgramList");
    private final static QName _ResourceBookingTypeResourceRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ResourceRefId");
    private final static QName _ResourceBookingTypeToPeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ToPeriod");
    private final static QName _ResourceBookingTypeKeepOld_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "KeepOld");
    private final static QName _ResourceBookingTypeReason_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Reason");
    private final static QName _ResourceBookingTypeFromPeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FromPeriod");
    private final static QName _LocationTypeLocationRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocationRefId");
    private final static QName _LocationTypeLocationName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocationName");
    private final static QName _TeacherCoverTypeCredit_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Credit");
    private final static QName _TeacherCoverTypeWeighting_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Weighting");
    private final static QName _TeacherCoverTypeSupervision_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Supervision");
    private final static QName _DebtorTypeBillingName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BillingName");
    private final static QName _DebtorTypeDiscount_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Discount");
    private final static QName _DebtorTypeBillingNote_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BillingNote");
    private final static QName _TotalEnrollmentsTypeGirls_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Girls");
    private final static QName _TotalEnrollmentsTypeBoys_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Boys");
    private final static QName _TotalEnrollmentsTypeTotalStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TotalStudents");
    private final static QName _TechnicalRequirementsTypeTechnicalRequirement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TechnicalRequirement");
    private final static QName _VendorInfoTypeBSB_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BSB");
    private final static QName _VendorInfoTypeABN_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ABN");
    private final static QName _VendorInfoTypeAccountNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AccountNumber");
    private final static QName _VendorInfoTypeAccountName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AccountName");
    private final static QName _VendorInfoTypeRegisteredForGST_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RegisteredForGST");
    private final static QName _VendorInfoTypeBPay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BPay");
    private final static QName _VendorInfoTypeCustomerId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CustomerId");
    private final static QName _VendorInfoTypePaymentTerms_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PaymentTerms");
    private final static QName _VendorInfoTypeContactInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContactInfo");
    private final static QName _GradingAssignmentTypeMaxAttemptsAllowed_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MaxAttemptsAllowed");
    private final static QName _GradingAssignmentTypeSubAssignmentList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubAssignmentList");
    private final static QName _GradingAssignmentTypeCreateDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CreateDate");
    private final static QName _GradingAssignmentTypeWeight_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Weight");
    private final static QName _GradingAssignmentTypeStudentPersonalRefIdList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentPersonalRefIdList");
    private final static QName _GradingAssignmentTypeRubricScoringGuide_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RubricScoringGuide");
    private final static QName _GradingAssignmentTypeAssignmentPurpose_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssignmentPurpose");
    private final static QName _GradingAssignmentTypeDetailedDescriptionURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DetailedDescriptionURL");
    private final static QName _GradingAssignmentTypeLevelAssessed_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LevelAssessed");
    private final static QName _GradingAssignmentTypePrerequisiteList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PrerequisiteList");
    private final static QName _GradingAssignmentTypeGradingCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingCategory");
    private final static QName _GradingAssignmentTypeAssessmentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssessmentType");
    private final static QName _GradingAssignmentTypeDetailedDescriptionBinary_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DetailedDescriptionBinary");
    private final static QName _PurchasingItemTypeQuantityDelivered_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "QuantityDelivered");
    private final static QName _PurchasingItemTypeUnitCost_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "UnitCost");
    private final static QName _PurchasingItemTypeTotalCost_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TotalCost");
    private final static QName _PurchasingItemTypeItemNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ItemNumber");
    private final static QName _PurchasingItemTypeExpenseAccounts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ExpenseAccounts");
    private final static QName _PurchasingItemTypeQuantity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Quantity");
    private final static QName _PurchasingItemTypeCancelledOrder_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CancelledOrder");
    private final static QName _SIFMetadataTypeLifeCycle_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LifeCycle");
    private final static QName _SIFMetadataTypeEducationFilter_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EducationFilter");
    private final static QName _SoftwareRequirementTypeVersion_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Version");
    private final static QName _SoftwareRequirementTypeOS_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OS");
    private final static QName _SoftwareRequirementTypeVendor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Vendor");
    private final static QName _LearningResourceTypeAgreementDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AgreementDate");
    private final static QName _LearningResourceTypeLearningStandards_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningStandards");
    private final static QName _LearningResourceTypeMediaTypes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MediaTypes");
    private final static QName _LearningResourceTypeUseAgreement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "UseAgreement");
    private final static QName _LearningResourceTypeApprovals_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Approvals");
    private final static QName _LearningResourceTypeEvaluations_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Evaluations");
    private final static QName _LearningResourceTypeContacts_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Contacts");
    private final static QName _LearningResourceTypeSubjectAreas_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SubjectAreas");
    private final static QName _LearningResourceTypeLearningResourcePackageRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningResourcePackageRefId");
    private final static QName _LearningResourceTypeAuthor_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Author");
    private final static QName _WithdrawalTypeWithdrawalEndTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WithdrawalEndTime");
    private final static QName _WithdrawalTypeWithdrawalStartTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WithdrawalStartTime");
    private final static QName _AdjustmentContainerTypeBookletType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BookletType");
    private final static QName _FQReportingTypeFQContextualQuestionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FQContextualQuestionList");
    private final static QName _FQReportingTypeFQRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FQRefId");
    private final static QName _FQReportingTypeACARAId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ACARAId");
    private final static QName _LanguageBaseTypeLanguageType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LanguageType");
    private final static QName _LanguageBaseTypeDialect_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Dialect");
    private final static QName _StudentActivityParticipationTypeRecognitionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RecognitionList");
    private final static QName _StudentActivityParticipationTypeEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EndDate");
    private final static QName _StudentActivityParticipationTypeParticipationComment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParticipationComment");
    private final static QName _PersonalisedPlanTypePersonalisedPlanEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlanEndDate");
    private final static QName _PersonalisedPlanTypePersonalisedPlanNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlanNotes");
    private final static QName _PersonalisedPlanTypeAssociatedAttachment_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssociatedAttachment");
    private final static QName _PersonalisedPlanTypePersonalisedPlanReviewDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PersonalisedPlanReviewDate");
    private final static QName _CalendarSummaryTypeInstructionalMinutes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "InstructionalMinutes");
    private final static QName _CalendarSummaryTypeMinutesPerDay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MinutesPerDay");
    private final static QName _CalendarSummaryTypeLastInstructionDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LastInstructionDate");
    private final static QName _CalendarSummaryTypeFirstInstructionDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FirstInstructionDate");
    private final static QName _VisaSubClassTypeVisaExpiryDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VisaExpiryDate");
    private final static QName _VisaSubClassTypeATEExpiryDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ATEExpiryDate");
    private final static QName _VisaSubClassTypeVisaStatisticalCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VisaStatisticalCode");
    private final static QName _VisaSubClassTypeATEStartDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ATEStartDate");
    private final static QName _AggregateStatisticFactTypeExcluded_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Excluded");
    private final static QName _NAPTestletResponseItemTypeResponse_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Response");
    private final static QName _NAPTestletResponseItemTypeScore_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Score");
    private final static QName _NAPTestletResponseItemTypeLapsedTimeItem_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LapsedTimeItem");
    private final static QName _NAPTestletResponseItemTypeNAPTestItemRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NAPTestItemRefId");
    private final static QName _AssignmentScoreTypeGradingAssignmentScoreRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GradingAssignmentScoreRefId");
    private final static QName _PrincipalInfoTypeContactTitle_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContactTitle");
    private final static QName _DomainScoreTypeStudentProficiency_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentProficiency");
    private final static QName _TimeTablePeriodTypeEndTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EndTime");
    private final static QName _TimeTablePeriodTypeBellPeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BellPeriod");
    private final static QName _TimeTablePeriodTypeRegularSchoolPeriod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RegularSchoolPeriod");
    private final static QName _TimeTablePeriodTypeUseInAttendanceCalculations_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "UseInAttendanceCalculations");
    private final static QName _RoomInfoTypeHomeroomNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HomeroomNumber");
    private final static QName _RoomInfoTypeCapacity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Capacity");
    private final static QName _RoomInfoTypeSize_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Size");
    private final static QName _RoomInfoTypeBuilding_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Building");
    private final static QName _RoomInfoTypeRoomType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomType");
    private final static QName _RoomInfoTypeStaffList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StaffList");
    private final static QName _SchoolProgramTypeCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Category");
    private final static QName _SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoleScopeList");
    private final static QName _TimeElementTypeSpanGaps_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SpanGaps");
    private final static QName _WellbeingEventTypeWellbeingEventCategoryList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventCategoryList");
    private final static QName _WellbeingEventTypeReportingStaffRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReportingStaffRefId");
    private final static QName _WellbeingEventTypeWellbeingEventLocationDetails_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventLocationDetails");
    private final static QName _WellbeingEventTypeFollowUpActionList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FollowUpActionList");
    private final static QName _WellbeingEventTypeWellbeingEventNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventNotes");
    private final static QName _WellbeingEventTypeWellbeingEventCreationTimeStamp_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventCreationTimeStamp");
    private final static QName _WellbeingEventTypeWellbeingEventTime_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventTime");
    private final static QName _WellbeingEventTypeWellbeingEventDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingEventDescription");
    private final static QName _WellbeingEventTypeEventId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EventId");
    private final static QName _IdentityTypeIdentityAssertions_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IdentityAssertions");
    private final static QName _IdentityTypePasswordList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PasswordList");
    private final static QName _IdentityTypeAuthenticationSourceGlobalUID_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AuthenticationSourceGlobalUID");
    private final static QName _NAPTestletResponseTypeTestletSubScore_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TestletSubScore");
    private final static QName _PeriodAttendanceTypeAttendanceNote_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AttendanceNote");
    private final static QName _PeriodAttendanceTypeAttendanceType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AttendanceType");
    private final static QName _StudentGroupTypeGroupDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GroupDescription");
    private final static QName _AttendanceTimeTypeDurationValue_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DurationValue");
    private final static QName _AddressTypeAddressGlobalUID_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AddressGlobalUID");
    private final static QName _AddressTypeEffectiveFromDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EffectiveFromDate");
    private final static QName _AddressTypeRadioContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RadioContact");
    private final static QName _AddressTypeStateProvince_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StateProvince");
    private final static QName _AddressTypeStatisticalAreas_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StatisticalAreas");
    private final static QName _AddressTypeCommunity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Community");
    private final static QName _AddressTypeCountry_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Country");
    private final static QName _AddressTypeEffectiveToDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EffectiveToDate");
    private final static QName _AddressTypeGridLocation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "GridLocation");
    private final static QName _AddressTypeMapReference_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MapReference");
    private final static QName _StudentContactRelationshipTypeContactFlags_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContactFlags");
    private final static QName _StudentContactRelationshipTypeParentRelationshipStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParentRelationshipStatus");
    private final static QName _StudentContactRelationshipTypeMainlySpeaksEnglishAtHome_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MainlySpeaksEnglishAtHome");
    private final static QName _StudentContactRelationshipTypeContactSequenceSource_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContactSequenceSource");
    private final static QName _StudentContactRelationshipTypeHouseholdList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "HouseholdList");
    private final static QName _StudentContactRelationshipTypeContactSequence_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ContactSequence");
    private final static QName _CalendarDateCalendarDateNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarDateNumber");
    private final static QName _CalendarDateStudentAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StudentAttendance");
    private final static QName _CalendarDateCalendarSummaryRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CalendarSummaryRefId");
    private final static QName _CalendarDateTeacherAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeacherAttendance");
    private final static QName _CalendarDateAdministratorAttendance_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AdministratorAttendance");
    private final static QName _ActivityTypeTechnicalRequirements_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TechnicalRequirements");
    private final static QName _ActivityTypeEvaluation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Evaluation");
    private final static QName _ActivityTypeActivityWeight_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ActivityWeight");
    private final static QName _ActivityTypeSourceObjects_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SourceObjects");
    private final static QName _ActivityTypePreamble_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Preamble");
    private final static QName _ActivityTypeStudents_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Students");
    private final static QName _ActivityTypeEssentialMaterials_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EssentialMaterials");
    private final static QName _ActivityTypePrerequisites_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Prerequisites");
    private final static QName _ActivityTypePoints_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Points");
    private final static QName _ActivityTypeAssessmentRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AssessmentRefId");
    private final static QName _ActivityTypeSoftwareRequirementList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SoftwareRequirementList");
    private final static QName _ActivityTypeLearningObjectives_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LearningObjectives");
    private final static QName _PaymentReceiptTypeTransactionDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TransactionDescription");
    private final static QName _PaymentReceiptTypeTransactionMethod_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TransactionMethod");
    private final static QName _PaymentReceiptTypeTransactionNote_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TransactionNote");
    private final static QName _PaymentReceiptTypeChequeNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ChequeNumber");
    private final static QName _PaymentReceiptTypeDebtorRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DebtorRefId");
    private final static QName _PaymentReceiptTypeVendorInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VendorInfoRefId");
    private final static QName _WellbeingEventLocationDetailsTypeFurtherLocationNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FurtherLocationNotes");
    private final static QName _WellbeingEventLocationDetailsTypeClass_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Class");
    private final static QName _DemographicsTypeReligiousEventList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReligiousEventList");
    private final static QName _DemographicsTypeVisaSubClass_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VisaSubClass");
    private final static QName _DemographicsTypeIndigenousStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IndigenousStatus");
    private final static QName _DemographicsTypeStateOfBirth_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StateOfBirth");
    private final static QName _DemographicsTypeInterpreterRequired_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "InterpreterRequired");
    private final static QName _DemographicsTypeLanguageList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LanguageList");
    private final static QName _DemographicsTypeDwellingArrangement_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DwellingArrangement");
    private final static QName _DemographicsTypeReligion_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Religion");
    private final static QName _DemographicsTypeEnglishProficiency_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EnglishProficiency");
    private final static QName _DemographicsTypeMaritalStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MaritalStatus");
    private final static QName _DemographicsTypeCountriesOfCitizenship_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CountriesOfCitizenship");
    private final static QName _DemographicsTypeMedicareNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "MedicareNumber");
    private final static QName _DemographicsTypeBirthDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BirthDate");
    private final static QName _DemographicsTypeCountryOfBirth_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CountryOfBirth");
    private final static QName _DemographicsTypeImmunisationCertificateStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ImmunisationCertificateStatus");
    private final static QName _DemographicsTypeLBOTE_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LBOTE");
    private final static QName _DemographicsTypeSex_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Sex");
    private final static QName _DemographicsTypeCulturalBackground_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CulturalBackground");
    private final static QName _DemographicsTypeCountriesOfResidency_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CountriesOfResidency");
    private final static QName _DemographicsTypeAustralianCitizenshipStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AustralianCitizenshipStatus");
    private final static QName _DemographicsTypePlaceOfBirth_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PlaceOfBirth");
    private final static QName _DemographicsTypePermanentResident_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PermanentResident");
    private final static QName _DemographicsTypeVisaSubClassList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "VisaSubClassList");
    private final static QName _DemographicsTypeReligiousRegion_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReligiousRegion");
    private final static QName _DemographicsTypeBirthDateVerification_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BirthDateVerification");
    private final static QName _DemographicsTypeCountryArrivalDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CountryArrivalDate");
    private final static QName _DemographicsTypeDateOfDeath_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DateOfDeath");
    private final static QName _SchoolCourseInfoOverrideTypeCourseCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseCode");
    private final static QName _SchoolCourseInfoOverrideTypeCourseTitle_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CourseTitle");
    private final static QName _CampusContainerTypeParentSchoolId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ParentSchoolId");
    private final static QName _CampusContainerTypeCampusType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "CampusType");
    private final static QName _NAPTestletContentTypeNode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Node");
    private final static QName _NAPTestletContentTypeLocationInStage_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocationInStage");
    private final static QName _NAPTestletContentTypeTestletName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TestletName");
    private final static QName _SchoolInfoTypeIndependentSchool_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IndependentSchool");
    private final static QName _SchoolInfoTypeSchoolTimeZone_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolTimeZone");
    private final static QName _SchoolInfoTypeCampus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Campus");
    private final static QName _SchoolInfoTypeSchoolGeographicLocation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolGeographicLocation");
    private final static QName _SchoolInfoTypeTotalEnrollments_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TotalEnrollments");
    private final static QName _SchoolInfoTypeSchoolType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolType");
    private final static QName _SchoolInfoTypeSchoolDistrict_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolDistrict");
    private final static QName _SchoolInfoTypeYearLevelEnrollmentList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "YearLevelEnrollmentList");
    private final static QName _SchoolInfoTypeOtherLEA_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "OtherLEA");
    private final static QName _SchoolInfoTypeSchoolFocusList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolFocusList");
    private final static QName _SchoolInfoTypeSchoolURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolURL");
    private final static QName _SchoolInfoTypeSchoolCoEdStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolCoEdStatus");
    private final static QName _SchoolInfoTypeEntityClose_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Entity_Close");
    private final static QName _SchoolInfoTypeSchoolEmailList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolEmailList");
    private final static QName _SchoolInfoTypeBoardingSchoolStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "BoardingSchoolStatus");
    private final static QName _SchoolInfoTypeSessionType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SessionType");
    private final static QName _SchoolInfoTypePrincipalInfo_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "PrincipalInfo");
    private final static QName _SchoolInfoTypeSchoolDistrictLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolDistrictLocalId");
    private final static QName _SchoolInfoTypeReligiousAffiliation_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ReligiousAffiliation");
    private final static QName _SchoolInfoTypeSchoolContactList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolContactList");
    private final static QName _SchoolInfoTypeNonGovSystemicStatus_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "NonGovSystemicStatus");
    private final static QName _SchoolInfoTypeARIA_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ARIA");
    private final static QName _SchoolInfoTypeSchoolGroupList_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolGroupList");
    private final static QName _SchoolInfoTypeLocalGovernmentArea_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalGovernmentArea");
    private final static QName _SchoolInfoTypeLEAInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LEAInfoRefId");
    private final static QName _SchoolInfoTypeEntityOpen_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Entity_Open");
    private final static QName _SchoolInfoTypeFederalElectorate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "FederalElectorate");
    private final static QName _StandardIdentifierTypeAlternateIdentificationCodes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AlternateIdentificationCodes");
    private final static QName _StandardIdentifierTypeIndicatorNumber_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "IndicatorNumber");
    private final static QName _StandardIdentifierTypeBenchmark_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Benchmark");
    private final static QName _StudentAttendanceSummaryTypeStartDay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "StartDay");
    private final static QName _StudentAttendanceSummaryTypeDaysTardy_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DaysTardy");
    private final static QName _StudentAttendanceSummaryTypeEndDay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EndDay");
    private final static QName _WellbeingAlertTypeWellbeingAlertCategory_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAlertCategory");
    private final static QName _WellbeingAlertTypeAlertSeverity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AlertSeverity");
    private final static QName _WellbeingAlertTypeWellbeingAlertEndDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAlertEndDate");
    private final static QName _WellbeingAlertTypeWellbeingAlertDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "WellbeingAlertDescription");
    private final static QName _WellbeingAlertTypeAlertAudience_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AlertAudience");
    private final static QName _WellbeingAlertTypeEnrolmentRestricted_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "EnrolmentRestricted");
    private final static QName _WellbeingAlertTypeAlertKeyContact_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AlertKeyContact");
    private final static QName _WellbeingAppealTypeAppealOutcome_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AppealOutcome");
    private final static QName _WellbeingAppealTypeLocalAppealId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "LocalAppealId");
    private final static QName _WellbeingAppealTypeAppealStatusCode_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AppealStatusCode");
    private final static QName _WellbeingAppealTypeAppealNotes_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AppealNotes");
    private final static QName _AggregateCharacteristicInfoTypeElementName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "ElementName");
    private final static QName _TimeTableTypeTimeTableCreationDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableCreationDate");
    private final static QName _TimeTableTypeTeachingPeriodsPerDay_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingPeriodsPerDay");
    private final static QName _TimeTableTypeSchoolName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SchoolName");
    private final static QName _StudentDailyAttendanceTypeDayValue_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DayValue");
    private final static QName _StudentDailyAttendanceTypeAbsenceValue_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "AbsenceValue");
    private final static QName _WellbeingDocumentTypeDocumentDescription_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DocumentDescription");
    private final static QName _WellbeingDocumentTypeSensitivity_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "Sensitivity");
    private final static QName _WellbeingDocumentTypeDocumentReviewDate_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DocumentReviewDate");
    private final static QName _WellbeingDocumentTypeURL_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "URL");
    private final static QName _WellbeingDocumentTypeDocumentType_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "DocumentType");
    private final static QName _StandardsSettingBodyTypeSettingBodyName_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "SettingBodyName");
    private final static QName _TimeTableCellTypeTeachingGroupLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TeachingGroupLocalId");
    private final static QName _TimeTableCellTypeTimeTableLocalId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "TimeTableLocalId");
    private final static QName _TimeTableCellTypeRoomInfoRefId_QNAME = new QName("http://www.sifassociation.org/datamodel/au/3.4", "RoomInfoRefId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sif.dd.au30.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdentityAssertionsType }
     * 
     */
    public IdentityAssertionsType createIdentityAssertionsType() {
        return new IdentityAssertionsType();
    }

    /**
     * Create an instance of {@link PasswordListType }
     * 
     */
    public PasswordListType createPasswordListType() {
        return new PasswordListType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link ActivityTimeType }
     * 
     */
    public ActivityTimeType createActivityTimeType() {
        return new ActivityTimeType();
    }

    /**
     * Create an instance of {@link SourceObjectsType }
     * 
     */
    public SourceObjectsType createSourceObjectsType() {
        return new SourceObjectsType();
    }

    /**
     * Create an instance of {@link AbstractContentPackageType }
     * 
     */
    public AbstractContentPackageType createAbstractContentPackageType() {
        return new AbstractContentPackageType();
    }

    /**
     * Create an instance of {@link OtherCodeListType }
     * 
     */
    public OtherCodeListType createOtherCodeListType() {
        return new OtherCodeListType();
    }

    /**
     * Create an instance of {@link SIFMetadataType }
     * 
     */
    public SIFMetadataType createSIFMetadataType() {
        return new SIFMetadataType();
    }

    /**
     * Create an instance of {@link PersonInvolvementType }
     * 
     */
    public PersonInvolvementType createPersonInvolvementType() {
        return new PersonInvolvementType();
    }

    /**
     * Create an instance of {@link TimeElementType }
     * 
     */
    public TimeElementType createTimeElementType() {
        return new TimeElementType();
    }

    /**
     * Create an instance of {@link TimeElementType.SpanGaps }
     * 
     */
    public TimeElementType.SpanGaps createTimeElementTypeSpanGaps() {
        return new TimeElementType.SpanGaps();
    }

    /**
     * Create an instance of {@link AbstractContentElementType }
     * 
     */
    public AbstractContentElementType createAbstractContentElementType() {
        return new AbstractContentElementType();
    }

    /**
     * Create an instance of {@link LifeCycleType }
     * 
     */
    public LifeCycleType createLifeCycleType() {
        return new LifeCycleType();
    }

    /**
     * Create an instance of {@link LifeCycleType.ModificationHistory }
     * 
     */
    public LifeCycleType.ModificationHistory createLifeCycleTypeModificationHistory() {
        return new LifeCycleType.ModificationHistory();
    }

    /**
     * Create an instance of {@link LifeCycleType.Created }
     * 
     */
    public LifeCycleType.Created createLifeCycleTypeCreated() {
        return new LifeCycleType.Created();
    }

    /**
     * Create an instance of {@link LifeCycleType.Created.Creators }
     * 
     */
    public LifeCycleType.Created.Creators createLifeCycleTypeCreatedCreators() {
        return new LifeCycleType.Created.Creators();
    }

    /**
     * Create an instance of {@link SIFExtendedElementsType }
     * 
     */
    public SIFExtendedElementsType createSIFExtendedElementsType() {
        return new SIFExtendedElementsType();
    }

    /**
     * Create an instance of {@link AssociatedObjectsType }
     * 
     */
    public AssociatedObjectsType createAssociatedObjectsType() {
        return new AssociatedObjectsType();
    }

    /**
     * Create an instance of {@link PersonPictureType }
     * 
     */
    public PersonPictureType createPersonPictureType() {
        return new PersonPictureType();
    }

    /**
     * Create an instance of {@link JournalType }
     * 
     */
    public JournalType createJournalType() {
        return new JournalType();
    }

    /**
     * Create an instance of {@link EquipmentInfoType }
     * 
     */
    public EquipmentInfoType createEquipmentInfoType() {
        return new EquipmentInfoType();
    }

    /**
     * Create an instance of {@link AggregateStatisticInfoType }
     * 
     */
    public AggregateStatisticInfoType createAggregateStatisticInfoType() {
        return new AggregateStatisticInfoType();
    }

    /**
     * Create an instance of {@link SchoolInfoType }
     * 
     */
    public SchoolInfoType createSchoolInfoType() {
        return new SchoolInfoType();
    }

    /**
     * Create an instance of {@link LearningResourceType }
     * 
     */
    public LearningResourceType createLearningResourceType() {
        return new LearningResourceType();
    }

    /**
     * Create an instance of {@link ResourceUsageType }
     * 
     */
    public ResourceUsageType createResourceUsageType() {
        return new ResourceUsageType();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceReportLineList }
     * 
     */
    public ResourceUsageType.ResourceReportLineList createResourceUsageTypeResourceReportLineList() {
        return new ResourceUsageType.ResourceReportLineList();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceReportLineList.ResourceReportLine }
     * 
     */
    public ResourceUsageType.ResourceReportLineList.ResourceReportLine createResourceUsageTypeResourceReportLineListResourceReportLine() {
        return new ResourceUsageType.ResourceReportLineList.ResourceReportLine();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceReportColumnList }
     * 
     */
    public ResourceUsageType.ResourceReportColumnList createResourceUsageTypeResourceReportColumnList() {
        return new ResourceUsageType.ResourceReportColumnList();
    }

    /**
     * Create an instance of {@link StudentParticipationType }
     * 
     */
    public StudentParticipationType createStudentParticipationType() {
        return new StudentParticipationType();
    }

    /**
     * Create an instance of {@link SystemRoleType }
     * 
     */
    public SystemRoleType createSystemRoleType() {
        return new SystemRoleType();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList }
     * 
     */
    public SystemRoleType.SystemContextList createSystemRoleTypeSystemContextList() {
        return new SystemRoleType.SystemContextList();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext createSystemRoleTypeSystemContextListSystemContext() {
        return new SystemRoleType.SystemContextList.SystemContext();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext.RoleList }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext.RoleList createSystemRoleTypeSystemContextListSystemContextRoleList() {
        return new SystemRoleType.SystemContextList.SystemContext.RoleList();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext.RoleList.Role createSystemRoleTypeSystemContextListSystemContextRoleListRole() {
        return new SystemRoleType.SystemContextList.SystemContext.RoleList.Role();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeList() {
        return new SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScope() {
        return new SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentType }
     * 
     */
    public StudentSchoolEnrollmentType createStudentSchoolEnrollmentType() {
        return new StudentSchoolEnrollmentType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link DebtorType }
     * 
     */
    public DebtorType createDebtorType() {
        return new DebtorType();
    }

    /**
     * Create an instance of {@link ResourceBookingType }
     * 
     */
    public ResourceBookingType createResourceBookingType() {
        return new ResourceBookingType();
    }

    /**
     * Create an instance of {@link ActivityType }
     * 
     */
    public ActivityType createActivityType() {
        return new ActivityType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link SchoolInfoCollectionType }
     * 
     */
    public SchoolInfoCollectionType createSchoolInfoCollectionType() {
        return new SchoolInfoCollectionType();
    }

    /**
     * Create an instance of {@link ResourceBookingCollectionType }
     * 
     */
    public ResourceBookingCollectionType createResourceBookingCollectionType() {
        return new ResourceBookingCollectionType();
    }

    /**
     * Create an instance of {@link PaymentReceiptType }
     * 
     */
    public PaymentReceiptType createPaymentReceiptType() {
        return new PaymentReceiptType();
    }

    /**
     * Create an instance of {@link NAPTestletType }
     * 
     */
    public NAPTestletType createNAPTestletType() {
        return new NAPTestletType();
    }

    /**
     * Create an instance of {@link SessionInfoCollectionType }
     * 
     */
    public SessionInfoCollectionType createSessionInfoCollectionType() {
        return new SessionInfoCollectionType();
    }

    /**
     * Create an instance of {@link TimeTableSubjectCollectionType }
     * 
     */
    public TimeTableSubjectCollectionType createTimeTableSubjectCollectionType() {
        return new TimeTableSubjectCollectionType();
    }

    /**
     * Create an instance of {@link TimeTableCellCollectionType }
     * 
     */
    public TimeTableCellCollectionType createTimeTableCellCollectionType() {
        return new TimeTableCellCollectionType();
    }

    /**
     * Create an instance of {@link StudentScoreJudgementAgainstStandardType }
     * 
     */
    public StudentScoreJudgementAgainstStandardType createStudentScoreJudgementAgainstStandardType() {
        return new StudentScoreJudgementAgainstStandardType();
    }

    /**
     * Create an instance of {@link TeachingGroupType }
     * 
     */
    public TeachingGroupType createTeachingGroupType() {
        return new TeachingGroupType();
    }

    /**
     * Create an instance of {@link StudentAttendanceTimeListType }
     * 
     */
    public StudentAttendanceTimeListType createStudentAttendanceTimeListType() {
        return new StudentAttendanceTimeListType();
    }

    /**
     * Create an instance of {@link NAPCodeFrameType }
     * 
     */
    public NAPCodeFrameType createNAPCodeFrameType() {
        return new NAPCodeFrameType();
    }

    /**
     * Create an instance of {@link StaffAssignmentCollectionType }
     * 
     */
    public StaffAssignmentCollectionType createStaffAssignmentCollectionType() {
        return new StaffAssignmentCollectionType();
    }

    /**
     * Create an instance of {@link TimeTableCollectionType }
     * 
     */
    public TimeTableCollectionType createTimeTableCollectionType() {
        return new TimeTableCollectionType();
    }

    /**
     * Create an instance of {@link WellbeingAppealType }
     * 
     */
    public WellbeingAppealType createWellbeingAppealType() {
        return new WellbeingAppealType();
    }

    /**
     * Create an instance of {@link MarkValueInfoCollectionType }
     * 
     */
    public MarkValueInfoCollectionType createMarkValueInfoCollectionType() {
        return new MarkValueInfoCollectionType();
    }

    /**
     * Create an instance of {@link StudentParticipationCollectionType }
     * 
     */
    public StudentParticipationCollectionType createStudentParticipationCollectionType() {
        return new StudentParticipationCollectionType();
    }

    /**
     * Create an instance of {@link ChargedLocationInfoCollectionType }
     * 
     */
    public ChargedLocationInfoCollectionType createChargedLocationInfoCollectionType() {
        return new ChargedLocationInfoCollectionType();
    }

    /**
     * Create an instance of {@link CalendarSummaryType }
     * 
     */
    public CalendarSummaryType createCalendarSummaryType() {
        return new CalendarSummaryType();
    }

    /**
     * Create an instance of {@link StaffPersonalCollectionType }
     * 
     */
    public StaffPersonalCollectionType createStaffPersonalCollectionType() {
        return new StaffPersonalCollectionType();
    }

    /**
     * Create an instance of {@link StudentActivityInfoType }
     * 
     */
    public StudentActivityInfoType createStudentActivityInfoType() {
        return new StudentActivityInfoType();
    }

    /**
     * Create an instance of {@link VendorInfoType }
     * 
     */
    public VendorInfoType createVendorInfoType() {
        return new VendorInfoType();
    }

    /**
     * Create an instance of {@link TimeTableType }
     * 
     */
    public TimeTableType createTimeTableType() {
        return new TimeTableType();
    }

    /**
     * Create an instance of {@link StudentDailyAttendanceCollectionType }
     * 
     */
    public StudentDailyAttendanceCollectionType createStudentDailyAttendanceCollectionType() {
        return new StudentDailyAttendanceCollectionType();
    }

    /**
     * Create an instance of {@link WellbeingEventType }
     * 
     */
    public WellbeingEventType createWellbeingEventType() {
        return new WellbeingEventType();
    }

    /**
     * Create an instance of {@link StudentGradeType }
     * 
     */
    public StudentGradeType createStudentGradeType() {
        return new StudentGradeType();
    }

    /**
     * Create an instance of {@link NAPTestletCollectionType }
     * 
     */
    public NAPTestletCollectionType createNAPTestletCollectionType() {
        return new NAPTestletCollectionType();
    }

    /**
     * Create an instance of {@link WellbeingAlertType }
     * 
     */
    public WellbeingAlertType createWellbeingAlertType() {
        return new WellbeingAlertType();
    }

    /**
     * Create an instance of {@link FinancialQuestionnaireSubmissionCollectionType }
     * 
     */
    public FinancialQuestionnaireSubmissionCollectionType createFinancialQuestionnaireSubmissionCollectionType() {
        return new FinancialQuestionnaireSubmissionCollectionType();
    }

    /**
     * Create an instance of {@link StudentSectionEnrollmentType }
     * 
     */
    public StudentSectionEnrollmentType createStudentSectionEnrollmentType() {
        return new StudentSectionEnrollmentType();
    }

    /**
     * Create an instance of {@link AggregateStatisticInfoCollectionType }
     * 
     */
    public AggregateStatisticInfoCollectionType createAggregateStatisticInfoCollectionType() {
        return new AggregateStatisticInfoCollectionType();
    }

    /**
     * Create an instance of {@link FinancialAccountType }
     * 
     */
    public FinancialAccountType createFinancialAccountType() {
        return new FinancialAccountType();
    }

    /**
     * Create an instance of {@link JournalCollectionType }
     * 
     */
    public JournalCollectionType createJournalCollectionType() {
        return new JournalCollectionType();
    }

    /**
     * Create an instance of {@link TermInfoType }
     * 
     */
    public TermInfoType createTermInfoType() {
        return new TermInfoType();
    }

    /**
     * Create an instance of {@link NAPStudentResponseSetCollectionType }
     * 
     */
    public NAPStudentResponseSetCollectionType createNAPStudentResponseSetCollectionType() {
        return new NAPStudentResponseSetCollectionType();
    }

    /**
     * Create an instance of {@link SchoolCourseInfoCollectionType }
     * 
     */
    public SchoolCourseInfoCollectionType createSchoolCourseInfoCollectionType() {
        return new SchoolCourseInfoCollectionType();
    }

    /**
     * Create an instance of {@link DebtorCollectionType }
     * 
     */
    public DebtorCollectionType createDebtorCollectionType() {
        return new DebtorCollectionType();
    }

    /**
     * Create an instance of {@link ChargedLocationInfoType }
     * 
     */
    public ChargedLocationInfoType createChargedLocationInfoType() {
        return new ChargedLocationInfoType();
    }

    /**
     * Create an instance of {@link VendorInfoCollectionType }
     * 
     */
    public VendorInfoCollectionType createVendorInfoCollectionType() {
        return new VendorInfoCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardDocumentCollectionType }
     * 
     */
    public LearningStandardDocumentCollectionType createLearningStandardDocumentCollectionType() {
        return new LearningStandardDocumentCollectionType();
    }

    /**
     * Create an instance of {@link NAPTestCollectionType }
     * 
     */
    public NAPTestCollectionType createNAPTestCollectionType() {
        return new NAPTestCollectionType();
    }

    /**
     * Create an instance of {@link SessionInfoType }
     * 
     */
    public SessionInfoType createSessionInfoType() {
        return new SessionInfoType();
    }

    /**
     * Create an instance of {@link StudentScoreJudgementAgainstStandardCollectionType }
     * 
     */
    public StudentScoreJudgementAgainstStandardCollectionType createStudentScoreJudgementAgainstStandardCollectionType() {
        return new StudentScoreJudgementAgainstStandardCollectionType();
    }

    /**
     * Create an instance of {@link GradingAssignmentType }
     * 
     */
    public GradingAssignmentType createGradingAssignmentType() {
        return new GradingAssignmentType();
    }

    /**
     * Create an instance of {@link AggregateCharacteristicInfoType }
     * 
     */
    public AggregateCharacteristicInfoType createAggregateCharacteristicInfoType() {
        return new AggregateCharacteristicInfoType();
    }

    /**
     * Create an instance of {@link PersonalisedPlanCollectionType }
     * 
     */
    public PersonalisedPlanCollectionType createPersonalisedPlanCollectionType() {
        return new PersonalisedPlanCollectionType();
    }

    /**
     * Create an instance of {@link StaffPersonalType }
     * 
     */
    public StaffPersonalType createStaffPersonalType() {
        return new StaffPersonalType();
    }

    /**
     * Create an instance of {@link WellbeingCharacteristicCollectionType }
     * 
     */
    public WellbeingCharacteristicCollectionType createWellbeingCharacteristicCollectionType() {
        return new WellbeingCharacteristicCollectionType();
    }

    /**
     * Create an instance of {@link TermInfoCollectionType }
     * 
     */
    public TermInfoCollectionType createTermInfoCollectionType() {
        return new TermInfoCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardDocumentType }
     * 
     */
    public LearningStandardDocumentType createLearningStandardDocumentType() {
        return new LearningStandardDocumentType();
    }

    /**
     * Create an instance of {@link WellbeingResponseCollectionType }
     * 
     */
    public WellbeingResponseCollectionType createWellbeingResponseCollectionType() {
        return new WellbeingResponseCollectionType();
    }

    /**
     * Create an instance of {@link MarkValueInfoType }
     * 
     */
    public MarkValueInfoType createMarkValueInfoType() {
        return new MarkValueInfoType();
    }

    /**
     * Create an instance of {@link StudentPeriodAttendanceType }
     * 
     */
    public StudentPeriodAttendanceType createStudentPeriodAttendanceType() {
        return new StudentPeriodAttendanceType();
    }

    /**
     * Create an instance of {@link AggregateCharacteristicInfoCollectionType }
     * 
     */
    public AggregateCharacteristicInfoCollectionType createAggregateCharacteristicInfoCollectionType() {
        return new AggregateCharacteristicInfoCollectionType();
    }

    /**
     * Create an instance of {@link StudentPersonalCollectionType }
     * 
     */
    public StudentPersonalCollectionType createStudentPersonalCollectionType() {
        return new StudentPersonalCollectionType();
    }

    /**
     * Create an instance of {@link StudentContactPersonalType }
     * 
     */
    public StudentContactPersonalType createStudentContactPersonalType() {
        return new StudentContactPersonalType();
    }

    /**
     * Create an instance of {@link ScheduledActivityType }
     * 
     */
    public ScheduledActivityType createScheduledActivityType() {
        return new ScheduledActivityType();
    }

    /**
     * Create an instance of {@link NAPStudentResponseSetType }
     * 
     */
    public NAPStudentResponseSetType createNAPStudentResponseSetType() {
        return new NAPStudentResponseSetType();
    }

    /**
     * Create an instance of {@link GradingAssignmentCollectionType }
     * 
     */
    public GradingAssignmentCollectionType createGradingAssignmentCollectionType() {
        return new GradingAssignmentCollectionType();
    }

    /**
     * Create an instance of {@link LearningResourcePackageCollectionType }
     * 
     */
    public LearningResourcePackageCollectionType createLearningResourcePackageCollectionType() {
        return new LearningResourcePackageCollectionType();
    }

    /**
     * Create an instance of {@link LEAInfoCollectionType }
     * 
     */
    public LEAInfoCollectionType createLEAInfoCollectionType() {
        return new LEAInfoCollectionType();
    }

    /**
     * Create an instance of {@link LEAInfoType }
     * 
     */
    public LEAInfoType createLEAInfoType() {
        return new LEAInfoType();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentCollectionType }
     * 
     */
    public StudentSchoolEnrollmentCollectionType createStudentSchoolEnrollmentCollectionType() {
        return new StudentSchoolEnrollmentCollectionType();
    }

    /**
     * Create an instance of {@link StudentActivityParticipationCollectionType }
     * 
     */
    public StudentActivityParticipationCollectionType createStudentActivityParticipationCollectionType() {
        return new StudentActivityParticipationCollectionType();
    }

    /**
     * Create an instance of {@link EquipmentInfoCollectionType }
     * 
     */
    public EquipmentInfoCollectionType createEquipmentInfoCollectionType() {
        return new EquipmentInfoCollectionType();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

    /**
     * Create an instance of {@link StudentAttendanceSummaryType }
     * 
     */
    public StudentAttendanceSummaryType createStudentAttendanceSummaryType() {
        return new StudentAttendanceSummaryType();
    }

    /**
     * Create an instance of {@link NAPEventStudentLinkType }
     * 
     */
    public NAPEventStudentLinkType createNAPEventStudentLinkType() {
        return new NAPEventStudentLinkType();
    }

    /**
     * Create an instance of {@link WellbeingCharacteristicType }
     * 
     */
    public WellbeingCharacteristicType createWellbeingCharacteristicType() {
        return new WellbeingCharacteristicType();
    }

    /**
     * Create an instance of {@link LearningStandardItemType }
     * 
     */
    public LearningStandardItemType createLearningStandardItemType() {
        return new LearningStandardItemType();
    }

    /**
     * Create an instance of {@link NAPEventStudentLinkCollectionType }
     * 
     */
    public NAPEventStudentLinkCollectionType createNAPEventStudentLinkCollectionType() {
        return new NAPEventStudentLinkCollectionType();
    }

    /**
     * Create an instance of {@link ActivityCollectionType }
     * 
     */
    public ActivityCollectionType createActivityCollectionType() {
        return new ActivityCollectionType();
    }

    /**
     * Create an instance of {@link StaffAssignmentType }
     * 
     */
    public StaffAssignmentType createStaffAssignmentType() {
        return new StaffAssignmentType();
    }

    /**
     * Create an instance of {@link SystemRoleCollectionType }
     * 
     */
    public SystemRoleCollectionType createSystemRoleCollectionType() {
        return new SystemRoleCollectionType();
    }

    /**
     * Create an instance of {@link StudentPersonalType }
     * 
     */
    public StudentPersonalType createStudentPersonalType() {
        return new StudentPersonalType();
    }

    /**
     * Create an instance of {@link TeachingGroupCollectionType }
     * 
     */
    public TeachingGroupCollectionType createTeachingGroupCollectionType() {
        return new TeachingGroupCollectionType();
    }

    /**
     * Create an instance of {@link NAPTestType }
     * 
     */
    public NAPTestType createNAPTestType() {
        return new NAPTestType();
    }

    /**
     * Create an instance of {@link StudentDailyAttendanceType }
     * 
     */
    public StudentDailyAttendanceType createStudentDailyAttendanceType() {
        return new StudentDailyAttendanceType();
    }

    /**
     * Create an instance of {@link CalendarDate }
     * 
     */
    public CalendarDate createCalendarDate() {
        return new CalendarDate();
    }

    /**
     * Create an instance of {@link StudentGradeCollectionType }
     * 
     */
    public StudentGradeCollectionType createStudentGradeCollectionType() {
        return new StudentGradeCollectionType();
    }

    /**
     * Create an instance of {@link SectionInfoCollectionType }
     * 
     */
    public SectionInfoCollectionType createSectionInfoCollectionType() {
        return new SectionInfoCollectionType();
    }

    /**
     * Create an instance of {@link StudentPeriodAttendanceCollectionType }
     * 
     */
    public StudentPeriodAttendanceCollectionType createStudentPeriodAttendanceCollectionType() {
        return new StudentPeriodAttendanceCollectionType();
    }

    /**
     * Create an instance of {@link LearningResourceCollectionType }
     * 
     */
    public LearningResourceCollectionType createLearningResourceCollectionType() {
        return new LearningResourceCollectionType();
    }

    /**
     * Create an instance of {@link GradingAssignmentScoreCollectionType }
     * 
     */
    public GradingAssignmentScoreCollectionType createGradingAssignmentScoreCollectionType() {
        return new GradingAssignmentScoreCollectionType();
    }

    /**
     * Create an instance of {@link PurchaseOrderCollectionType }
     * 
     */
    public PurchaseOrderCollectionType createPurchaseOrderCollectionType() {
        return new PurchaseOrderCollectionType();
    }

    /**
     * Create an instance of {@link LearningStandardItemCollectionType }
     * 
     */
    public LearningStandardItemCollectionType createLearningStandardItemCollectionType() {
        return new LearningStandardItemCollectionType();
    }

    /**
     * Create an instance of {@link StudentContactRelationshipCollectionType }
     * 
     */
    public StudentContactRelationshipCollectionType createStudentContactRelationshipCollectionType() {
        return new StudentContactRelationshipCollectionType();
    }

    /**
     * Create an instance of {@link GradingAssignmentScoreType }
     * 
     */
    public GradingAssignmentScoreType createGradingAssignmentScoreType() {
        return new GradingAssignmentScoreType();
    }

    /**
     * Create an instance of {@link NAPTestScoreSummaryCollectionType }
     * 
     */
    public NAPTestScoreSummaryCollectionType createNAPTestScoreSummaryCollectionType() {
        return new NAPTestScoreSummaryCollectionType();
    }

    /**
     * Create an instance of {@link PersonPictureCollectionType }
     * 
     */
    public PersonPictureCollectionType createPersonPictureCollectionType() {
        return new PersonPictureCollectionType();
    }

    /**
     * Create an instance of {@link TimeTableSubjectType }
     * 
     */
    public TimeTableSubjectType createTimeTableSubjectType() {
        return new TimeTableSubjectType();
    }

    /**
     * Create an instance of {@link NAPTestScoreSummaryType }
     * 
     */
    public NAPTestScoreSummaryType createNAPTestScoreSummaryType() {
        return new NAPTestScoreSummaryType();
    }

    /**
     * Create an instance of {@link FinancialQuestionnaireSubmissionType }
     * 
     */
    public FinancialQuestionnaireSubmissionType createFinancialQuestionnaireSubmissionType() {
        return new FinancialQuestionnaireSubmissionType();
    }

    /**
     * Create an instance of {@link SchoolProgramsCollectionType }
     * 
     */
    public SchoolProgramsCollectionType createSchoolProgramsCollectionType() {
        return new SchoolProgramsCollectionType();
    }

    /**
     * Create an instance of {@link AGStatusReportType }
     * 
     */
    public AGStatusReportType createAGStatusReportType() {
        return new AGStatusReportType();
    }

    /**
     * Create an instance of {@link LearningResourcePackageType }
     * 
     */
    public LearningResourcePackageType createLearningResourcePackageType() {
        return new LearningResourcePackageType();
    }

    /**
     * Create an instance of {@link AggregateStatisticFactType }
     * 
     */
    public AggregateStatisticFactType createAggregateStatisticFactType() {
        return new AggregateStatisticFactType();
    }

    /**
     * Create an instance of {@link WellbeingAppealCollectionType }
     * 
     */
    public WellbeingAppealCollectionType createWellbeingAppealCollectionType() {
        return new WellbeingAppealCollectionType();
    }

    /**
     * Create an instance of {@link StudentActivityParticipationType }
     * 
     */
    public StudentActivityParticipationType createStudentActivityParticipationType() {
        return new StudentActivityParticipationType();
    }

    /**
     * Create an instance of {@link SectionInfoType }
     * 
     */
    public SectionInfoType createSectionInfoType() {
        return new SectionInfoType();
    }

    /**
     * Create an instance of {@link WellbeingEventCollectionType }
     * 
     */
    public WellbeingEventCollectionType createWellbeingEventCollectionType() {
        return new WellbeingEventCollectionType();
    }

    /**
     * Create an instance of {@link IdentityCollectionType }
     * 
     */
    public IdentityCollectionType createIdentityCollectionType() {
        return new IdentityCollectionType();
    }

    /**
     * Create an instance of {@link NAPCodeFrameCollectionType }
     * 
     */
    public NAPCodeFrameCollectionType createNAPCodeFrameCollectionType() {
        return new NAPCodeFrameCollectionType();
    }

    /**
     * Create an instance of {@link StudentAttendanceTimeListCollectionType }
     * 
     */
    public StudentAttendanceTimeListCollectionType createStudentAttendanceTimeListCollectionType() {
        return new StudentAttendanceTimeListCollectionType();
    }

    /**
     * Create an instance of {@link RoomInfoType }
     * 
     */
    public RoomInfoType createRoomInfoType() {
        return new RoomInfoType();
    }

    /**
     * Create an instance of {@link SchoolCourseInfoType }
     * 
     */
    public SchoolCourseInfoType createSchoolCourseInfoType() {
        return new SchoolCourseInfoType();
    }

    /**
     * Create an instance of {@link InvoiceCollectionType }
     * 
     */
    public InvoiceCollectionType createInvoiceCollectionType() {
        return new InvoiceCollectionType();
    }

    /**
     * Create an instance of {@link StudentSectionEnrollmentCollectionType }
     * 
     */
    public StudentSectionEnrollmentCollectionType createStudentSectionEnrollmentCollectionType() {
        return new StudentSectionEnrollmentCollectionType();
    }

    /**
     * Create an instance of {@link StudentContactPersonalCollectionType }
     * 
     */
    public StudentContactPersonalCollectionType createStudentContactPersonalCollectionType() {
        return new StudentContactPersonalCollectionType();
    }

    /**
     * Create an instance of {@link RoomInfoCollectionType }
     * 
     */
    public RoomInfoCollectionType createRoomInfoCollectionType() {
        return new RoomInfoCollectionType();
    }

    /**
     * Create an instance of {@link NAPTestItemType }
     * 
     */
    public NAPTestItemType createNAPTestItemType() {
        return new NAPTestItemType();
    }

    /**
     * Create an instance of {@link NAPTestItemCollectionType }
     * 
     */
    public NAPTestItemCollectionType createNAPTestItemCollectionType() {
        return new NAPTestItemCollectionType();
    }

    /**
     * Create an instance of {@link WellbeingAlertCollectionType }
     * 
     */
    public WellbeingAlertCollectionType createWellbeingAlertCollectionType() {
        return new WellbeingAlertCollectionType();
    }

    /**
     * Create an instance of {@link CalendarDateCollectionType }
     * 
     */
    public CalendarDateCollectionType createCalendarDateCollectionType() {
        return new CalendarDateCollectionType();
    }

    /**
     * Create an instance of {@link PaymentReceiptCollectionType }
     * 
     */
    public PaymentReceiptCollectionType createPaymentReceiptCollectionType() {
        return new PaymentReceiptCollectionType();
    }

    /**
     * Create an instance of {@link FinancialAccountCollectionType }
     * 
     */
    public FinancialAccountCollectionType createFinancialAccountCollectionType() {
        return new FinancialAccountCollectionType();
    }

    /**
     * Create an instance of {@link AggregateStatisticFactCollectionType }
     * 
     */
    public AggregateStatisticFactCollectionType createAggregateStatisticFactCollectionType() {
        return new AggregateStatisticFactCollectionType();
    }

    /**
     * Create an instance of {@link AGStatusReportCollectionType }
     * 
     */
    public AGStatusReportCollectionType createAGStatusReportCollectionType() {
        return new AGStatusReportCollectionType();
    }

    /**
     * Create an instance of {@link ScheduledActivityCollectionType }
     * 
     */
    public ScheduledActivityCollectionType createScheduledActivityCollectionType() {
        return new ScheduledActivityCollectionType();
    }

    /**
     * Create an instance of {@link SchoolProgramsType }
     * 
     */
    public SchoolProgramsType createSchoolProgramsType() {
        return new SchoolProgramsType();
    }

    /**
     * Create an instance of {@link WellbeingResponseType }
     * 
     */
    public WellbeingResponseType createWellbeingResponseType() {
        return new WellbeingResponseType();
    }

    /**
     * Create an instance of {@link StudentActivityInfoCollectionType }
     * 
     */
    public StudentActivityInfoCollectionType createStudentActivityInfoCollectionType() {
        return new StudentActivityInfoCollectionType();
    }

    /**
     * Create an instance of {@link ResourceUsageCollectionType }
     * 
     */
    public ResourceUsageCollectionType createResourceUsageCollectionType() {
        return new ResourceUsageCollectionType();
    }

    /**
     * Create an instance of {@link StudentContactRelationshipType }
     * 
     */
    public StudentContactRelationshipType createStudentContactRelationshipType() {
        return new StudentContactRelationshipType();
    }

    /**
     * Create an instance of {@link CalendarSummaryCollectionType }
     * 
     */
    public CalendarSummaryCollectionType createCalendarSummaryCollectionType() {
        return new CalendarSummaryCollectionType();
    }

    /**
     * Create an instance of {@link StudentAttendanceSummaryCollectionType }
     * 
     */
    public StudentAttendanceSummaryCollectionType createStudentAttendanceSummaryCollectionType() {
        return new StudentAttendanceSummaryCollectionType();
    }

    /**
     * Create an instance of {@link TimeTableCellType }
     * 
     */
    public TimeTableCellType createTimeTableCellType() {
        return new TimeTableCellType();
    }

    /**
     * Create an instance of {@link PersonalisedPlanType }
     * 
     */
    public PersonalisedPlanType createPersonalisedPlanType() {
        return new PersonalisedPlanType();
    }

    /**
     * Create an instance of {@link RoomListType }
     * 
     */
    public RoomListType createRoomListType() {
        return new RoomListType();
    }

    /**
     * Create an instance of {@link WithdrawalType }
     * 
     */
    public WithdrawalType createWithdrawalType() {
        return new WithdrawalType();
    }

    /**
     * Create an instance of {@link LearningStandardsType }
     * 
     */
    public LearningStandardsType createLearningStandardsType() {
        return new LearningStandardsType();
    }

    /**
     * Create an instance of {@link DemographicsType }
     * 
     */
    public DemographicsType createDemographicsType() {
        return new DemographicsType();
    }

    /**
     * Create an instance of {@link FQItemListType }
     * 
     */
    public FQItemListType createFQItemListType() {
        return new FQItemListType();
    }

    /**
     * Create an instance of {@link StimulusType }
     * 
     */
    public StimulusType createStimulusType() {
        return new StimulusType();
    }

    /**
     * Create an instance of {@link PublishingPermissionType }
     * 
     */
    public PublishingPermissionType createPublishingPermissionType() {
        return new PublishingPermissionType();
    }

    /**
     * Create an instance of {@link SubstituteItemType }
     * 
     */
    public SubstituteItemType createSubstituteItemType() {
        return new SubstituteItemType();
    }

    /**
     * Create an instance of {@link MediaTypesType }
     * 
     */
    public MediaTypesType createMediaTypesType() {
        return new MediaTypesType();
    }

    /**
     * Create an instance of {@link SelectedContentType }
     * 
     */
    public SelectedContentType createSelectedContentType() {
        return new SelectedContentType();
    }

    /**
     * Create an instance of {@link ExpenseAccountsType }
     * 
     */
    public ExpenseAccountsType createExpenseAccountsType() {
        return new ExpenseAccountsType();
    }

    /**
     * Create an instance of {@link AssignmentScoreType }
     * 
     */
    public AssignmentScoreType createAssignmentScoreType() {
        return new AssignmentScoreType();
    }

    /**
     * Create an instance of {@link NAPWritingRubricType }
     * 
     */
    public NAPWritingRubricType createNAPWritingRubricType() {
        return new NAPWritingRubricType();
    }

    /**
     * Create an instance of {@link TeacherCoverType }
     * 
     */
    public TeacherCoverType createTeacherCoverType() {
        return new TeacherCoverType();
    }

    /**
     * Create an instance of {@link AttendanceTimesType }
     * 
     */
    public AttendanceTimesType createAttendanceTimesType() {
        return new AttendanceTimesType();
    }

    /**
     * Create an instance of {@link PNPCodeListType }
     * 
     */
    public PNPCodeListType createPNPCodeListType() {
        return new PNPCodeListType();
    }

    /**
     * Create an instance of {@link LearningResourcesType }
     * 
     */
    public LearningResourcesType createLearningResourcesType() {
        return new LearningResourcesType();
    }

    /**
     * Create an instance of {@link AgencyType }
     * 
     */
    public AgencyType createAgencyType() {
        return new AgencyType();
    }

    /**
     * Create an instance of {@link LearningStandardType }
     * 
     */
    public LearningStandardType createLearningStandardType() {
        return new LearningStandardType();
    }

    /**
     * Create an instance of {@link TimeTableDayListType }
     * 
     */
    public TimeTableDayListType createTimeTableDayListType() {
        return new TimeTableDayListType();
    }

    /**
     * Create an instance of {@link RecognitionListType }
     * 
     */
    public RecognitionListType createRecognitionListType() {
        return new RecognitionListType();
    }

    /**
     * Create an instance of {@link AlertMessageType }
     * 
     */
    public AlertMessageType createAlertMessageType() {
        return new AlertMessageType();
    }

    /**
     * Create an instance of {@link SchoolContactListType }
     * 
     */
    public SchoolContactListType createSchoolContactListType() {
        return new SchoolContactListType();
    }

    /**
     * Create an instance of {@link MapReferenceType }
     * 
     */
    public MapReferenceType createMapReferenceType() {
        return new MapReferenceType();
    }

    /**
     * Create an instance of {@link AGRuleType }
     * 
     */
    public AGRuleType createAGRuleType() {
        return new AGRuleType();
    }

    /**
     * Create an instance of {@link WellbeingEventLocationDetailsType }
     * 
     */
    public WellbeingEventLocationDetailsType createWellbeingEventLocationDetailsType() {
        return new WellbeingEventLocationDetailsType();
    }

    /**
     * Create an instance of {@link WellbeingPlanType }
     * 
     */
    public WellbeingPlanType createWellbeingPlanType() {
        return new WellbeingPlanType();
    }

    /**
     * Create an instance of {@link ProgramFundingSourcesType }
     * 
     */
    public ProgramFundingSourcesType createProgramFundingSourcesType() {
        return new ProgramFundingSourcesType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link MediumOfInstructionType }
     * 
     */
    public MediumOfInstructionType createMediumOfInstructionType() {
        return new MediumOfInstructionType();
    }

    /**
     * Create an instance of {@link GradingScoreListType }
     * 
     */
    public GradingScoreListType createGradingScoreListType() {
        return new GradingScoreListType();
    }

    /**
     * Create an instance of {@link MedicalAlertMessageType }
     * 
     */
    public MedicalAlertMessageType createMedicalAlertMessageType() {
        return new MedicalAlertMessageType();
    }

    /**
     * Create an instance of {@link SubstituteItemListType }
     * 
     */
    public SubstituteItemListType createSubstituteItemListType() {
        return new SubstituteItemListType();
    }

    /**
     * Create an instance of {@link StudentGroupType }
     * 
     */
    public StudentGroupType createStudentGroupType() {
        return new StudentGroupType();
    }

    /**
     * Create an instance of {@link AlertMessagesType }
     * 
     */
    public AlertMessagesType createAlertMessagesType() {
        return new AlertMessagesType();
    }

    /**
     * Create an instance of {@link ScoreListType }
     * 
     */
    public ScoreListType createScoreListType() {
        return new ScoreListType();
    }

    /**
     * Create an instance of {@link StaffSubjectType }
     * 
     */
    public StaffSubjectType createStaffSubjectType() {
        return new StaffSubjectType();
    }

    /**
     * Create an instance of {@link TeacherListType }
     * 
     */
    public TeacherListType createTeacherListType() {
        return new TeacherListType();
    }

    /**
     * Create an instance of {@link YearRangeType }
     * 
     */
    public YearRangeType createYearRangeType() {
        return new YearRangeType();
    }

    /**
     * Create an instance of {@link StudentsType }
     * 
     */
    public StudentsType createStudentsType() {
        return new StudentsType();
    }

    /**
     * Create an instance of {@link AttendanceCodeType }
     * 
     */
    public AttendanceCodeType createAttendanceCodeType() {
        return new AttendanceCodeType();
    }

    /**
     * Create an instance of {@link CodeFrameTestItemListType }
     * 
     */
    public CodeFrameTestItemListType createCodeFrameTestItemListType() {
        return new CodeFrameTestItemListType();
    }

    /**
     * Create an instance of {@link StudentExitStatusContainerType }
     * 
     */
    public StudentExitStatusContainerType createStudentExitStatusContainerType() {
        return new StudentExitStatusContainerType();
    }

    /**
     * Create an instance of {@link CalendarSummaryListType }
     * 
     */
    public CalendarSummaryListType createCalendarSummaryListType() {
        return new CalendarSummaryListType();
    }

    /**
     * Create an instance of {@link PromotionInfoType }
     * 
     */
    public PromotionInfoType createPromotionInfoType() {
        return new PromotionInfoType();
    }

    /**
     * Create an instance of {@link PeriodAttendancesType }
     * 
     */
    public PeriodAttendancesType createPeriodAttendancesType() {
        return new PeriodAttendancesType();
    }

    /**
     * Create an instance of {@link ComponentType }
     * 
     */
    public ComponentType createComponentType() {
        return new ComponentType();
    }

    /**
     * Create an instance of {@link LearningStandardsDocumentType }
     * 
     */
    public LearningStandardsDocumentType createLearningStandardsDocumentType() {
        return new LearningStandardsDocumentType();
    }

    /**
     * Create an instance of {@link TimeTablePeriodType }
     * 
     */
    public TimeTablePeriodType createTimeTablePeriodType() {
        return new TimeTablePeriodType();
    }

    /**
     * Create an instance of {@link StandardsSettingBodyType }
     * 
     */
    public StandardsSettingBodyType createStandardsSettingBodyType() {
        return new StandardsSettingBodyType();
    }

    /**
     * Create an instance of {@link ScheduledTeacherListType }
     * 
     */
    public ScheduledTeacherListType createScheduledTeacherListType() {
        return new ScheduledTeacherListType();
    }

    /**
     * Create an instance of {@link LearningStandardListType }
     * 
     */
    public LearningStandardListType createLearningStandardListType() {
        return new LearningStandardListType();
    }

    /**
     * Create an instance of {@link NAPTestletItemResponseListType }
     * 
     */
    public NAPTestletItemResponseListType createNAPTestletItemResponseListType() {
        return new NAPTestletItemResponseListType();
    }

    /**
     * Create an instance of {@link ElectronicIdType }
     * 
     */
    public ElectronicIdType createElectronicIdType() {
        return new ElectronicIdType();
    }

    /**
     * Create an instance of {@link TeachingGroupPeriodType }
     * 
     */
    public TeachingGroupPeriodType createTeachingGroupPeriodType() {
        return new TeachingGroupPeriodType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link WithdrawalTimeListType }
     * 
     */
    public WithdrawalTimeListType createWithdrawalTimeListType() {
        return new WithdrawalTimeListType();
    }

    /**
     * Create an instance of {@link FollowUpActionType }
     * 
     */
    public FollowUpActionType createFollowUpActionType() {
        return new FollowUpActionType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link FQReportingListType }
     * 
     */
    public FQReportingListType createFQReportingListType() {
        return new FQReportingListType();
    }

    /**
     * Create an instance of {@link FinancialAccountRefIdListType }
     * 
     */
    public FinancialAccountRefIdListType createFinancialAccountRefIdListType() {
        return new FinancialAccountRefIdListType();
    }

    /**
     * Create an instance of {@link PersonInfoType }
     * 
     */
    public PersonInfoType createPersonInfoType() {
        return new PersonInfoType();
    }

    /**
     * Create an instance of {@link NAPTestItemListType }
     * 
     */
    public NAPTestItemListType createNAPTestItemListType() {
        return new NAPTestItemListType();
    }

    /**
     * Create an instance of {@link FQItemType }
     * 
     */
    public FQItemType createFQItemType() {
        return new FQItemType();
    }

    /**
     * Create an instance of {@link SchoolContactType }
     * 
     */
    public SchoolContactType createSchoolContactType() {
        return new SchoolContactType();
    }

    /**
     * Create an instance of {@link StudentMostRecentContainerType }
     * 
     */
    public StudentMostRecentContainerType createStudentMostRecentContainerType() {
        return new StudentMostRecentContainerType();
    }

    /**
     * Create an instance of {@link NAPTestItem2Type }
     * 
     */
    public NAPTestItem2Type createNAPTestItem2Type() {
        return new NAPTestItem2Type();
    }

    /**
     * Create an instance of {@link ExtendedContentType }
     * 
     */
    public ExtendedContentType createExtendedContentType() {
        return new ExtendedContentType();
    }

    /**
     * Create an instance of {@link SchoolProgramListType }
     * 
     */
    public SchoolProgramListType createSchoolProgramListType() {
        return new SchoolProgramListType();
    }

    /**
     * Create an instance of {@link EmailListType }
     * 
     */
    public EmailListType createEmailListType() {
        return new EmailListType();
    }

    /**
     * Create an instance of {@link AddressListType }
     * 
     */
    public AddressListType createAddressListType() {
        return new AddressListType();
    }

    /**
     * Create an instance of {@link CreationUserType }
     * 
     */
    public CreationUserType createCreationUserType() {
        return new CreationUserType();
    }

    /**
     * Create an instance of {@link ContactsType }
     * 
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link HouseholdContactInfoListType }
     * 
     */
    public HouseholdContactInfoListType createHouseholdContactInfoListType() {
        return new HouseholdContactInfoListType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link WellbeingDocumentListType }
     * 
     */
    public WellbeingDocumentListType createWellbeingDocumentListType() {
        return new WellbeingDocumentListType();
    }

    /**
     * Create an instance of {@link DomainScoreType }
     * 
     */
    public DomainScoreType createDomainScoreType() {
        return new DomainScoreType();
    }

    /**
     * Create an instance of {@link OtherIdListType }
     * 
     */
    public OtherIdListType createOtherIdListType() {
        return new OtherIdListType();
    }

    /**
     * Create an instance of {@link LanguageBaseType }
     * 
     */
    public LanguageBaseType createLanguageBaseType() {
        return new LanguageBaseType();
    }

    /**
     * Create an instance of {@link LanguageOfInstructionType }
     * 
     */
    public LanguageOfInstructionType createLanguageOfInstructionType() {
        return new LanguageOfInstructionType();
    }

    /**
     * Create an instance of {@link PublishingPermissionListType }
     * 
     */
    public PublishingPermissionListType createPublishingPermissionListType() {
        return new PublishingPermissionListType();
    }

    /**
     * Create an instance of {@link StrategiesType }
     * 
     */
    public StrategiesType createStrategiesType() {
        return new StrategiesType();
    }

    /**
     * Create an instance of {@link LocationOfInstructionType }
     * 
     */
    public LocationOfInstructionType createLocationOfInstructionType() {
        return new LocationOfInstructionType();
    }

    /**
     * Create an instance of {@link HouseholdListType }
     * 
     */
    public HouseholdListType createHouseholdListType() {
        return new HouseholdListType();
    }

    /**
     * Create an instance of {@link ComponentsType }
     * 
     */
    public ComponentsType createComponentsType() {
        return new ComponentsType();
    }

    /**
     * Create an instance of {@link LEAContactType }
     * 
     */
    public LEAContactType createLEAContactType() {
        return new LEAContactType();
    }

    /**
     * Create an instance of {@link NAPTestletCodeFrameType }
     * 
     */
    public NAPTestletCodeFrameType createNAPTestletCodeFrameType() {
        return new NAPTestletCodeFrameType();
    }

    /**
     * Create an instance of {@link NAPSubscoreType }
     * 
     */
    public NAPSubscoreType createNAPSubscoreType() {
        return new NAPSubscoreType();
    }

    /**
     * Create an instance of {@link ContactFlagsType }
     * 
     */
    public ContactFlagsType createContactFlagsType() {
        return new ContactFlagsType();
    }

    /**
     * Create an instance of {@link AuthorsType }
     * 
     */
    public AuthorsType createAuthorsType() {
        return new AuthorsType();
    }

    /**
     * Create an instance of {@link NAPSubscoreListType }
     * 
     */
    public NAPSubscoreListType createNAPSubscoreListType() {
        return new NAPSubscoreListType();
    }

    /**
     * Create an instance of {@link StudentSubjectChoiceListType }
     * 
     */
    public StudentSubjectChoiceListType createStudentSubjectChoiceListType() {
        return new StudentSubjectChoiceListType();
    }

    /**
     * Create an instance of {@link AuditInfoType }
     * 
     */
    public AuditInfoType createAuditInfoType() {
        return new AuditInfoType();
    }

    /**
     * Create an instance of {@link PurchasingItemsType }
     * 
     */
    public PurchasingItemsType createPurchasingItemsType() {
        return new PurchasingItemsType();
    }

    /**
     * Create an instance of {@link StandardHierarchyLevelType }
     * 
     */
    public StandardHierarchyLevelType createStandardHierarchyLevelType() {
        return new StandardHierarchyLevelType();
    }

    /**
     * Create an instance of {@link ScheduledActivityOverrideType }
     * 
     */
    public ScheduledActivityOverrideType createScheduledActivityOverrideType() {
        return new ScheduledActivityOverrideType();
    }

    /**
     * Create an instance of {@link NAPTestletContentType }
     * 
     */
    public NAPTestletContentType createNAPTestletContentType() {
        return new NAPTestletContentType();
    }

    /**
     * Create an instance of {@link TotalEnrollmentsType }
     * 
     */
    public TotalEnrollmentsType createTotalEnrollmentsType() {
        return new TotalEnrollmentsType();
    }

    /**
     * Create an instance of {@link TeachingGroupListType }
     * 
     */
    public TeachingGroupListType createTeachingGroupListType() {
        return new TeachingGroupListType();
    }

    /**
     * Create an instance of {@link StatisticalAreasType }
     * 
     */
    public StatisticalAreasType createStatisticalAreasType() {
        return new StatisticalAreasType();
    }

    /**
     * Create an instance of {@link AttendanceInfoType }
     * 
     */
    public AttendanceInfoType createAttendanceInfoType() {
        return new AttendanceInfoType();
    }

    /**
     * Create an instance of {@link YearLevelsType }
     * 
     */
    public YearLevelsType createYearLevelsType() {
        return new YearLevelsType();
    }

    /**
     * Create an instance of {@link NAPTestItemContentType }
     * 
     */
    public NAPTestItemContentType createNAPTestItemContentType() {
        return new NAPTestItemContentType();
    }

    /**
     * Create an instance of {@link NAPWritingRubricListType }
     * 
     */
    public NAPWritingRubricListType createNAPWritingRubricListType() {
        return new NAPWritingRubricListType();
    }

    /**
     * Create an instance of {@link YearLevelType }
     * 
     */
    public YearLevelType createYearLevelType() {
        return new YearLevelType();
    }

    /**
     * Create an instance of {@link ReligiousEventListType }
     * 
     */
    public ReligiousEventListType createReligiousEventListType() {
        return new ReligiousEventListType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link StaffActivityExtensionType }
     * 
     */
    public StaffActivityExtensionType createStaffActivityExtensionType() {
        return new StaffActivityExtensionType();
    }

    /**
     * Create an instance of {@link MedicationType }
     * 
     */
    public MedicationType createMedicationType() {
        return new MedicationType();
    }

    /**
     * Create an instance of {@link ResourcesType }
     * 
     */
    public ResourcesType createResourcesType() {
        return new ResourcesType();
    }

    /**
     * Create an instance of {@link OrganizationsType }
     * 
     */
    public OrganizationsType createOrganizationsType() {
        return new OrganizationsType();
    }

    /**
     * Create an instance of {@link YearLevelEnrollmentType }
     * 
     */
    public YearLevelEnrollmentType createYearLevelEnrollmentType() {
        return new YearLevelEnrollmentType();
    }

    /**
     * Create an instance of {@link ProgramStatusType }
     * 
     */
    public ProgramStatusType createProgramStatusType() {
        return new ProgramStatusType();
    }

    /**
     * Create an instance of {@link ElectronicIdListType }
     * 
     */
    public ElectronicIdListType createElectronicIdListType() {
        return new ElectronicIdListType();
    }

    /**
     * Create an instance of {@link CatchmentStatusContainerType }
     * 
     */
    public CatchmentStatusContainerType createCatchmentStatusContainerType() {
        return new CatchmentStatusContainerType();
    }

    /**
     * Create an instance of {@link MedicalAlertMessagesType }
     * 
     */
    public MedicalAlertMessagesType createMedicalAlertMessagesType() {
        return new MedicalAlertMessagesType();
    }

    /**
     * Create an instance of {@link SoftwareRequirementListType }
     * 
     */
    public SoftwareRequirementListType createSoftwareRequirementListType() {
        return new SoftwareRequirementListType();
    }

    /**
     * Create an instance of {@link AGReportingObjectResponseListType }
     * 
     */
    public AGReportingObjectResponseListType createAGReportingObjectResponseListType() {
        return new AGReportingObjectResponseListType();
    }

    /**
     * Create an instance of {@link AttendanceTimeType }
     * 
     */
    public AttendanceTimeType createAttendanceTimeType() {
        return new AttendanceTimeType();
    }

    /**
     * Create an instance of {@link ACStrandAreaListType }
     * 
     */
    public ACStrandAreaListType createACStrandAreaListType() {
        return new ACStrandAreaListType();
    }

    /**
     * Create an instance of {@link ReligionType }
     * 
     */
    public ReligionType createReligionType() {
        return new ReligionType();
    }

    /**
     * Create an instance of {@link NAPCodeFrameTestletListType }
     * 
     */
    public NAPCodeFrameTestletListType createNAPCodeFrameTestletListType() {
        return new NAPCodeFrameTestletListType();
    }

    /**
     * Create an instance of {@link ReligiousEventType }
     * 
     */
    public ReligiousEventType createReligiousEventType() {
        return new ReligiousEventType();
    }

    /**
     * Create an instance of {@link CountryListType }
     * 
     */
    public CountryListType createCountryListType() {
        return new CountryListType();
    }

    /**
     * Create an instance of {@link TeachingGroupTeacherType }
     * 
     */
    public TeachingGroupTeacherType createTeachingGroupTeacherType() {
        return new TeachingGroupTeacherType();
    }

    /**
     * Create an instance of {@link ReportPackageType }
     * 
     */
    public ReportPackageType createReportPackageType() {
        return new ReportPackageType();
    }

    /**
     * Create an instance of {@link StimulusLocalIdListType }
     * 
     */
    public StimulusLocalIdListType createStimulusLocalIdListType() {
        return new StimulusLocalIdListType();
    }

    /**
     * Create an instance of {@link TestDisruptionListType }
     * 
     */
    public TestDisruptionListType createTestDisruptionListType() {
        return new TestDisruptionListType();
    }

    /**
     * Create an instance of {@link LearningObjectivesType }
     * 
     */
    public LearningObjectivesType createLearningObjectivesType() {
        return new LearningObjectivesType();
    }

    /**
     * Create an instance of {@link OtherIdType }
     * 
     */
    public OtherIdType createOtherIdType() {
        return new OtherIdType();
    }

    /**
     * Create an instance of {@link EnglishProficiencyType }
     * 
     */
    public EnglishProficiencyType createEnglishProficiencyType() {
        return new EnglishProficiencyType();
    }

    /**
     * Create an instance of {@link AGRuleListType }
     * 
     */
    public AGRuleListType createAGRuleListType() {
        return new AGRuleListType();
    }

    /**
     * Create an instance of {@link TestDisruptionType }
     * 
     */
    public TestDisruptionType createTestDisruptionType() {
        return new TestDisruptionType();
    }

    /**
     * Create an instance of {@link ExclusionRulesType }
     * 
     */
    public ExclusionRulesType createExclusionRulesType() {
        return new ExclusionRulesType();
    }

    /**
     * Create an instance of {@link WellbeingEventCategoryType }
     * 
     */
    public WellbeingEventCategoryType createWellbeingEventCategoryType() {
        return new WellbeingEventCategoryType();
    }

    /**
     * Create an instance of {@link FQContextualQuestionType }
     * 
     */
    public FQContextualQuestionType createFQContextualQuestionType() {
        return new FQContextualQuestionType();
    }

    /**
     * Create an instance of {@link PrerequisitesType }
     * 
     */
    public PrerequisitesType createPrerequisitesType() {
        return new PrerequisitesType();
    }

    /**
     * Create an instance of {@link PlanRequiredContainerType }
     * 
     */
    public PlanRequiredContainerType createPlanRequiredContainerType() {
        return new PlanRequiredContainerType();
    }

    /**
     * Create an instance of {@link DomainBandsContainerType }
     * 
     */
    public DomainBandsContainerType createDomainBandsContainerType() {
        return new DomainBandsContainerType();
    }

    /**
     * Create an instance of {@link OtherNamesType }
     * 
     */
    public OtherNamesType createOtherNamesType() {
        return new OtherNamesType();
    }

    /**
     * Create an instance of {@link PlanRequiredListType }
     * 
     */
    public PlanRequiredListType createPlanRequiredListType() {
        return new PlanRequiredListType();
    }

    /**
     * Create an instance of {@link AddressStreetType }
     * 
     */
    public AddressStreetType createAddressStreetType() {
        return new AddressStreetType();
    }

    /**
     * Create an instance of {@link BaseNameType }
     * 
     */
    public BaseNameType createBaseNameType() {
        return new BaseNameType();
    }

    /**
     * Create an instance of {@link RelatedLearningStandardItemRefIdType }
     * 
     */
    public RelatedLearningStandardItemRefIdType createRelatedLearningStandardItemRefIdType() {
        return new RelatedLearningStandardItemRefIdType();
    }

    /**
     * Create an instance of {@link DetentionContainerType }
     * 
     */
    public DetentionContainerType createDetentionContainerType() {
        return new DetentionContainerType();
    }

    /**
     * Create an instance of {@link LanguageListType }
     * 
     */
    public LanguageListType createLanguageListType() {
        return new LanguageListType();
    }

    /**
     * Create an instance of {@link ReferralSourceType }
     * 
     */
    public ReferralSourceType createReferralSourceType() {
        return new ReferralSourceType();
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     */
    public MonetaryAmountType createMonetaryAmountType() {
        return new MonetaryAmountType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link StudentExitContainerType }
     * 
     */
    public StudentExitContainerType createStudentExitContainerType() {
        return new StudentExitContainerType();
    }

    /**
     * Create an instance of {@link StandardIdentifierType }
     * 
     */
    public StandardIdentifierType createStandardIdentifierType() {
        return new StandardIdentifierType();
    }

    /**
     * Create an instance of {@link ScoreDescriptionListType }
     * 
     */
    public ScoreDescriptionListType createScoreDescriptionListType() {
        return new ScoreDescriptionListType();
    }

    /**
     * Create an instance of {@link CalendarDateInfoType }
     * 
     */
    public CalendarDateInfoType createCalendarDateInfoType() {
        return new CalendarDateInfoType();
    }

    /**
     * Create an instance of {@link ExclusionRuleType }
     * 
     */
    public ExclusionRuleType createExclusionRuleType() {
        return new ExclusionRuleType();
    }

    /**
     * Create an instance of {@link SchoolCourseInfoOverrideType }
     * 
     */
    public SchoolCourseInfoOverrideType createSchoolCourseInfoOverrideType() {
        return new SchoolCourseInfoOverrideType();
    }

    /**
     * Create an instance of {@link ScoreType }
     * 
     */
    public ScoreType createScoreType() {
        return new ScoreType();
    }

    /**
     * Create an instance of {@link TeachingGroupStudentType }
     * 
     */
    public TeachingGroupStudentType createTeachingGroupStudentType() {
        return new TeachingGroupStudentType();
    }

    /**
     * Create an instance of {@link SchoolGroupListType }
     * 
     */
    public SchoolGroupListType createSchoolGroupListType() {
        return new SchoolGroupListType();
    }

    /**
     * Create an instance of {@link StudentEntryContainerType }
     * 
     */
    public StudentEntryContainerType createStudentEntryContainerType() {
        return new StudentEntryContainerType();
    }

    /**
     * Create an instance of {@link StudentActivityType }
     * 
     */
    public StudentActivityType createStudentActivityType() {
        return new StudentActivityType();
    }

    /**
     * Create an instance of {@link ValidLetterMarkType }
     * 
     */
    public ValidLetterMarkType createValidLetterMarkType() {
        return new ValidLetterMarkType();
    }

    /**
     * Create an instance of {@link StatisticalAreaType }
     * 
     */
    public StatisticalAreaType createStatisticalAreaType() {
        return new StatisticalAreaType();
    }

    /**
     * Create an instance of {@link AGReportingObjectResponseType }
     * 
     */
    public AGReportingObjectResponseType createAGReportingObjectResponseType() {
        return new AGReportingObjectResponseType();
    }

    /**
     * Create an instance of {@link ACStrandSubjectAreaType }
     * 
     */
    public ACStrandSubjectAreaType createACStrandSubjectAreaType() {
        return new ACStrandSubjectAreaType();
    }

    /**
     * Create an instance of {@link YearLevelEnrollmentListType }
     * 
     */
    public YearLevelEnrollmentListType createYearLevelEnrollmentListType() {
        return new YearLevelEnrollmentListType();
    }

    /**
     * Create an instance of {@link NAPStudentResponseTestletListType }
     * 
     */
    public NAPStudentResponseTestletListType createNAPStudentResponseTestletListType() {
        return new NAPStudentResponseTestletListType();
    }

    /**
     * Create an instance of {@link StaffSubjectListType }
     * 
     */
    public StaffSubjectListType createStaffSubjectListType() {
        return new StaffSubjectListType();
    }

    /**
     * Create an instance of {@link SoftwareVendorInfoContainerType }
     * 
     */
    public SoftwareVendorInfoContainerType createSoftwareVendorInfoContainerType() {
        return new SoftwareVendorInfoContainerType();
    }

    /**
     * Create an instance of {@link OtherWellbeingResponseContainerType }
     * 
     */
    public OtherWellbeingResponseContainerType createOtherWellbeingResponseContainerType() {
        return new OtherWellbeingResponseContainerType();
    }

    /**
     * Create an instance of {@link DebitOrCreditAmountType }
     * 
     */
    public DebitOrCreditAmountType createDebitOrCreditAmountType() {
        return new DebitOrCreditAmountType();
    }

    /**
     * Create an instance of {@link ReportDataObjectType }
     * 
     */
    public ReportDataObjectType createReportDataObjectType() {
        return new ReportDataObjectType();
    }

    /**
     * Create an instance of {@link ApprovalsType }
     * 
     */
    public ApprovalsType createApprovalsType() {
        return new ApprovalsType();
    }

    /**
     * Create an instance of {@link WellbeingDocumentType }
     * 
     */
    public WellbeingDocumentType createWellbeingDocumentType() {
        return new WellbeingDocumentType();
    }

    /**
     * Create an instance of {@link LResourcesType }
     * 
     */
    public LResourcesType createLResourcesType() {
        return new LResourcesType();
    }

    /**
     * Create an instance of {@link SubjectAreaType }
     * 
     */
    public SubjectAreaType createSubjectAreaType() {
        return new SubjectAreaType();
    }

    /**
     * Create an instance of {@link DwellingArrangementType }
     * 
     */
    public DwellingArrangementType createDwellingArrangementType() {
        return new DwellingArrangementType();
    }

    /**
     * Create an instance of {@link StudentListType }
     * 
     */
    public StudentListType createStudentListType() {
        return new StudentListType();
    }

    /**
     * Create an instance of {@link PeriodAttendanceType }
     * 
     */
    public PeriodAttendanceType createPeriodAttendanceType() {
        return new PeriodAttendanceType();
    }

    /**
     * Create an instance of {@link SchoolFocusListType }
     * 
     */
    public SchoolFocusListType createSchoolFocusListType() {
        return new SchoolFocusListType();
    }

    /**
     * Create an instance of {@link FollowUpActionListType }
     * 
     */
    public FollowUpActionListType createFollowUpActionListType() {
        return new FollowUpActionListType();
    }

    /**
     * Create an instance of {@link WellbeingEventSubCategoryListType }
     * 
     */
    public WellbeingEventSubCategoryListType createWellbeingEventSubCategoryListType() {
        return new WellbeingEventSubCategoryListType();
    }

    /**
     * Create an instance of {@link StudentGroupListType }
     * 
     */
    public StudentGroupListType createStudentGroupListType() {
        return new StudentGroupListType();
    }

    /**
     * Create an instance of {@link ContentDescriptionListType }
     * 
     */
    public ContentDescriptionListType createContentDescriptionListType() {
        return new ContentDescriptionListType();
    }

    /**
     * Create an instance of {@link VisaSubClassType }
     * 
     */
    public VisaSubClassType createVisaSubClassType() {
        return new VisaSubClassType();
    }

    /**
     * Create an instance of {@link ApprovalType }
     * 
     */
    public ApprovalType createApprovalType() {
        return new ApprovalType();
    }

    /**
     * Create an instance of {@link SoftwareRequirementType }
     * 
     */
    public SoftwareRequirementType createSoftwareRequirementType() {
        return new SoftwareRequirementType();
    }

    /**
     * Create an instance of {@link DomainProficiencyContainerType }
     * 
     */
    public DomainProficiencyContainerType createDomainProficiencyContainerType() {
        return new DomainProficiencyContainerType();
    }

    /**
     * Create an instance of {@link CountryList2Type }
     * 
     */
    public CountryList2Type createCountryList2Type() {
        return new CountryList2Type();
    }

    /**
     * Create an instance of {@link PrincipalInfoType }
     * 
     */
    public PrincipalInfoType createPrincipalInfoType() {
        return new PrincipalInfoType();
    }

    /**
     * Create an instance of {@link SubjectAreaListType }
     * 
     */
    public SubjectAreaListType createSubjectAreaListType() {
        return new SubjectAreaListType();
    }

    /**
     * Create an instance of {@link PurchasingItemType }
     * 
     */
    public PurchasingItemType createPurchasingItemType() {
        return new PurchasingItemType();
    }

    /**
     * Create an instance of {@link CopyRightContainerType }
     * 
     */
    public CopyRightContainerType createCopyRightContainerType() {
        return new CopyRightContainerType();
    }

    /**
     * Create an instance of {@link HouseholdContactInfoType }
     * 
     */
    public HouseholdContactInfoType createHouseholdContactInfoType() {
        return new HouseholdContactInfoType();
    }

    /**
     * Create an instance of {@link ExpenseAccountType }
     * 
     */
    public ExpenseAccountType createExpenseAccountType() {
        return new ExpenseAccountType();
    }

    /**
     * Create an instance of {@link RelatedLearningStandardItemRefIdListType }
     * 
     */
    public RelatedLearningStandardItemRefIdListType createRelatedLearningStandardItemRefIdListType() {
        return new RelatedLearningStandardItemRefIdListType();
    }

    /**
     * Create an instance of {@link WellbeingEventCategoryListType }
     * 
     */
    public WellbeingEventCategoryListType createWellbeingEventCategoryListType() {
        return new WellbeingEventCategoryListType();
    }

    /**
     * Create an instance of {@link EvaluationType }
     * 
     */
    public EvaluationType createEvaluationType() {
        return new EvaluationType();
    }

    /**
     * Create an instance of {@link ProgramFundingSourceType }
     * 
     */
    public ProgramFundingSourceType createProgramFundingSourceType() {
        return new ProgramFundingSourceType();
    }

    /**
     * Create an instance of {@link GradeType }
     * 
     */
    public GradeType createGradeType() {
        return new GradeType();
    }

    /**
     * Create an instance of {@link CharacteristicsType }
     * 
     */
    public CharacteristicsType createCharacteristicsType() {
        return new CharacteristicsType();
    }

    /**
     * Create an instance of {@link SuspensionContainerType }
     * 
     */
    public SuspensionContainerType createSuspensionContainerType() {
        return new SuspensionContainerType();
    }

    /**
     * Create an instance of {@link CampusContainerType }
     * 
     */
    public CampusContainerType createCampusContainerType() {
        return new CampusContainerType();
    }

    /**
     * Create an instance of {@link ProgramAvailabilityType }
     * 
     */
    public ProgramAvailabilityType createProgramAvailabilityType() {
        return new ProgramAvailabilityType();
    }

    /**
     * Create an instance of {@link FQContextualQuestionListType }
     * 
     */
    public FQContextualQuestionListType createFQContextualQuestionListType() {
        return new FQContextualQuestionListType();
    }

    /**
     * Create an instance of {@link StudentGradeMarkersListType }
     * 
     */
    public StudentGradeMarkersListType createStudentGradeMarkersListType() {
        return new StudentGradeMarkersListType();
    }

    /**
     * Create an instance of {@link AwardContainerType }
     * 
     */
    public AwardContainerType createAwardContainerType() {
        return new AwardContainerType();
    }

    /**
     * Create an instance of {@link EntityContactInfoType }
     * 
     */
    public EntityContactInfoType createEntityContactInfoType() {
        return new EntityContactInfoType();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link GenericRubricType }
     * 
     */
    public GenericRubricType createGenericRubricType() {
        return new GenericRubricType();
    }

    /**
     * Create an instance of {@link PersonInvolvementListType }
     * 
     */
    public PersonInvolvementListType createPersonInvolvementListType() {
        return new PersonInvolvementListType();
    }

    /**
     * Create an instance of {@link AdjustmentContainerType }
     * 
     */
    public AdjustmentContainerType createAdjustmentContainerType() {
        return new AdjustmentContainerType();
    }

    /**
     * Create an instance of {@link RelationshipType }
     * 
     */
    public RelationshipType createRelationshipType() {
        return new RelationshipType();
    }

    /**
     * Create an instance of {@link LEAContactListType }
     * 
     */
    public LEAContactListType createLEAContactListType() {
        return new LEAContactListType();
    }

    /**
     * Create an instance of {@link CodeFrameTestItemType }
     * 
     */
    public CodeFrameTestItemType createCodeFrameTestItemType() {
        return new CodeFrameTestItemType();
    }

    /**
     * Create an instance of {@link SchoolProgramType }
     * 
     */
    public SchoolProgramType createSchoolProgramType() {
        return new SchoolProgramType();
    }

    /**
     * Create an instance of {@link NAPTestContentType }
     * 
     */
    public NAPTestContentType createNAPTestContentType() {
        return new NAPTestContentType();
    }

    /**
     * Create an instance of {@link ScoreDescriptionType }
     * 
     */
    public ScoreDescriptionType createScoreDescriptionType() {
        return new ScoreDescriptionType();
    }

    /**
     * Create an instance of {@link TeachingGroupPeriodListType }
     * 
     */
    public TeachingGroupPeriodListType createTeachingGroupPeriodListType() {
        return new TeachingGroupPeriodListType();
    }

    /**
     * Create an instance of {@link EducationFilterType }
     * 
     */
    public EducationFilterType createEducationFilterType() {
        return new EducationFilterType();
    }

    /**
     * Create an instance of {@link OtherNameType }
     * 
     */
    public OtherNameType createOtherNameType() {
        return new OtherNameType();
    }

    /**
     * Create an instance of {@link GridLocationType }
     * 
     */
    public GridLocationType createGridLocationType() {
        return new GridLocationType();
    }

    /**
     * Create an instance of {@link TechnicalRequirementsType }
     * 
     */
    public TechnicalRequirementsType createTechnicalRequirementsType() {
        return new TechnicalRequirementsType();
    }

    /**
     * Create an instance of {@link StudentSubjectChoiceType }
     * 
     */
    public StudentSubjectChoiceType createStudentSubjectChoiceType() {
        return new StudentSubjectChoiceType();
    }

    /**
     * Create an instance of {@link PhoneNumberListType }
     * 
     */
    public PhoneNumberListType createPhoneNumberListType() {
        return new PhoneNumberListType();
    }

    /**
     * Create an instance of {@link StatementCodesType }
     * 
     */
    public StatementCodesType createStatementCodesType() {
        return new StatementCodesType();
    }

    /**
     * Create an instance of {@link EvaluationsType }
     * 
     */
    public EvaluationsType createEvaluationsType() {
        return new EvaluationsType();
    }

    /**
     * Create an instance of {@link NAPLANClassListType }
     * 
     */
    public NAPLANClassListType createNAPLANClassListType() {
        return new NAPLANClassListType();
    }

    /**
     * Create an instance of {@link AlternateIdentificationCodeListType }
     * 
     */
    public AlternateIdentificationCodeListType createAlternateIdentificationCodeListType() {
        return new AlternateIdentificationCodeListType();
    }

    /**
     * Create an instance of {@link NAPTestletResponseType }
     * 
     */
    public NAPTestletResponseType createNAPTestletResponseType() {
        return new NAPTestletResponseType();
    }

    /**
     * Create an instance of {@link ValidLetterMarkListType }
     * 
     */
    public ValidLetterMarkListType createValidLetterMarkListType() {
        return new ValidLetterMarkListType();
    }

    /**
     * Create an instance of {@link StatementsType }
     * 
     */
    public StatementsType createStatementsType() {
        return new StatementsType();
    }

    /**
     * Create an instance of {@link PlausibleScaledValueListType }
     * 
     */
    public PlausibleScaledValueListType createPlausibleScaledValueListType() {
        return new PlausibleScaledValueListType();
    }

    /**
     * Create an instance of {@link AssignmentListType }
     * 
     */
    public AssignmentListType createAssignmentListType() {
        return new AssignmentListType();
    }

    /**
     * Create an instance of {@link StaffListType }
     * 
     */
    public StaffListType createStaffListType() {
        return new StaffListType();
    }

    /**
     * Create an instance of {@link MedicationListType }
     * 
     */
    public MedicationListType createMedicationListType() {
        return new MedicationListType();
    }

    /**
     * Create an instance of {@link FQReportingType }
     * 
     */
    public FQReportingType createFQReportingType() {
        return new FQReportingType();
    }

    /**
     * Create an instance of {@link TimeTableDayType }
     * 
     */
    public TimeTableDayType createTimeTableDayType() {
        return new TimeTableDayType();
    }

    /**
     * Create an instance of {@link NameOfRecordType }
     * 
     */
    public NameOfRecordType createNameOfRecordType() {
        return new NameOfRecordType();
    }

    /**
     * Create an instance of {@link TimeTablePeriodListType }
     * 
     */
    public TimeTablePeriodListType createTimeTablePeriodListType() {
        return new TimeTablePeriodListType();
    }

    /**
     * Create an instance of {@link StimulusListType }
     * 
     */
    public StimulusListType createStimulusListType() {
        return new StimulusListType();
    }

    /**
     * Create an instance of {@link EssentialMaterialsType }
     * 
     */
    public EssentialMaterialsType createEssentialMaterialsType() {
        return new EssentialMaterialsType();
    }

    /**
     * Create an instance of {@link StaffMostRecentContainerType }
     * 
     */
    public StaffMostRecentContainerType createStaffMostRecentContainerType() {
        return new StaffMostRecentContainerType();
    }

    /**
     * Create an instance of {@link MarkerType }
     * 
     */
    public MarkerType createMarkerType() {
        return new MarkerType();
    }

    /**
     * Create an instance of {@link NAPTestletResponseItemType }
     * 
     */
    public NAPTestletResponseItemType createNAPTestletResponseItemType() {
        return new NAPTestletResponseItemType();
    }

    /**
     * Create an instance of {@link VisaSubClassListType }
     * 
     */
    public VisaSubClassListType createVisaSubClassListType() {
        return new VisaSubClassListType();
    }

    /**
     * Create an instance of {@link IdentityAssertionsType.IdentityAssertion }
     * 
     */
    public IdentityAssertionsType.IdentityAssertion createIdentityAssertionsTypeIdentityAssertion() {
        return new IdentityAssertionsType.IdentityAssertion();
    }

    /**
     * Create an instance of {@link PasswordListType.Password }
     * 
     */
    public PasswordListType.Password createPasswordListTypePassword() {
        return new PasswordListType.Password();
    }

    /**
     * Create an instance of {@link LocationType.LocationRefId }
     * 
     */
    public LocationType.LocationRefId createLocationTypeLocationRefId() {
        return new LocationType.LocationRefId();
    }

    /**
     * Create an instance of {@link ActivityTimeType.Duration }
     * 
     */
    public ActivityTimeType.Duration createActivityTimeTypeDuration() {
        return new ActivityTimeType.Duration();
    }

    /**
     * Create an instance of {@link SourceObjectsType.SourceObject }
     * 
     */
    public SourceObjectsType.SourceObject createSourceObjectsTypeSourceObject() {
        return new SourceObjectsType.SourceObject();
    }

    /**
     * Create an instance of {@link AbstractContentPackageType.XMLData }
     * 
     */
    public AbstractContentPackageType.XMLData createAbstractContentPackageTypeXMLData() {
        return new AbstractContentPackageType.XMLData();
    }

    /**
     * Create an instance of {@link AbstractContentPackageType.TextData }
     * 
     */
    public AbstractContentPackageType.TextData createAbstractContentPackageTypeTextData() {
        return new AbstractContentPackageType.TextData();
    }

    /**
     * Create an instance of {@link AbstractContentPackageType.BinaryData }
     * 
     */
    public AbstractContentPackageType.BinaryData createAbstractContentPackageTypeBinaryData() {
        return new AbstractContentPackageType.BinaryData();
    }

    /**
     * Create an instance of {@link AbstractContentPackageType.Reference }
     * 
     */
    public AbstractContentPackageType.Reference createAbstractContentPackageTypeReference() {
        return new AbstractContentPackageType.Reference();
    }

    /**
     * Create an instance of {@link OtherCodeListType.OtherCode }
     * 
     */
    public OtherCodeListType.OtherCode createOtherCodeListTypeOtherCode() {
        return new OtherCodeListType.OtherCode();
    }

    /**
     * Create an instance of {@link SIFMetadataType.TimeElements }
     * 
     */
    public SIFMetadataType.TimeElements createSIFMetadataTypeTimeElements() {
        return new SIFMetadataType.TimeElements();
    }

    /**
     * Create an instance of {@link PersonInvolvementType.PersonRefId }
     * 
     */
    public PersonInvolvementType.PersonRefId createPersonInvolvementTypePersonRefId() {
        return new PersonInvolvementType.PersonRefId();
    }

    /**
     * Create an instance of {@link TimeElementType.SpanGaps.SpanGap }
     * 
     */
    public TimeElementType.SpanGaps.SpanGap createTimeElementTypeSpanGapsSpanGap() {
        return new TimeElementType.SpanGaps.SpanGap();
    }

    /**
     * Create an instance of {@link AbstractContentElementType.XMLData }
     * 
     */
    public AbstractContentElementType.XMLData createAbstractContentElementTypeXMLData() {
        return new AbstractContentElementType.XMLData();
    }

    /**
     * Create an instance of {@link AbstractContentElementType.TextData }
     * 
     */
    public AbstractContentElementType.TextData createAbstractContentElementTypeTextData() {
        return new AbstractContentElementType.TextData();
    }

    /**
     * Create an instance of {@link AbstractContentElementType.BinaryData }
     * 
     */
    public AbstractContentElementType.BinaryData createAbstractContentElementTypeBinaryData() {
        return new AbstractContentElementType.BinaryData();
    }

    /**
     * Create an instance of {@link AbstractContentElementType.Reference }
     * 
     */
    public AbstractContentElementType.Reference createAbstractContentElementTypeReference() {
        return new AbstractContentElementType.Reference();
    }

    /**
     * Create an instance of {@link LifeCycleType.TimeElements }
     * 
     */
    public LifeCycleType.TimeElements createLifeCycleTypeTimeElements() {
        return new LifeCycleType.TimeElements();
    }

    /**
     * Create an instance of {@link LifeCycleType.ModificationHistory.Modified }
     * 
     */
    public LifeCycleType.ModificationHistory.Modified createLifeCycleTypeModificationHistoryModified() {
        return new LifeCycleType.ModificationHistory.Modified();
    }

    /**
     * Create an instance of {@link LifeCycleType.Created.Creators.Creator }
     * 
     */
    public LifeCycleType.Created.Creators.Creator createLifeCycleTypeCreatedCreatorsCreator() {
        return new LifeCycleType.Created.Creators.Creator();
    }

    /**
     * Create an instance of {@link SIFExtendedElementsType.SIFExtendedElement }
     * 
     */
    public SIFExtendedElementsType.SIFExtendedElement createSIFExtendedElementsTypeSIFExtendedElement() {
        return new SIFExtendedElementsType.SIFExtendedElement();
    }

    /**
     * Create an instance of {@link AssociatedObjectsType.AssociatedObject }
     * 
     */
    public AssociatedObjectsType.AssociatedObject createAssociatedObjectsTypeAssociatedObject() {
        return new AssociatedObjectsType.AssociatedObject();
    }

    /**
     * Create an instance of {@link PersonPictureType.ParentObjectRefId }
     * 
     */
    public PersonPictureType.ParentObjectRefId createPersonPictureTypeParentObjectRefId() {
        return new PersonPictureType.ParentObjectRefId();
    }

    /**
     * Create an instance of {@link PersonPictureType.PictureSource }
     * 
     */
    public PersonPictureType.PictureSource createPersonPictureTypePictureSource() {
        return new PersonPictureType.PictureSource();
    }

    /**
     * Create an instance of {@link JournalType.OriginatingTransactionRefId }
     * 
     */
    public JournalType.OriginatingTransactionRefId createJournalTypeOriginatingTransactionRefId() {
        return new JournalType.OriginatingTransactionRefId();
    }

    /**
     * Create an instance of {@link EquipmentInfoType.SIFRefId }
     * 
     */
    public EquipmentInfoType.SIFRefId createEquipmentInfoTypeSIFRefId() {
        return new EquipmentInfoType.SIFRefId();
    }

    /**
     * Create an instance of {@link AggregateStatisticInfoType.CalculationRule }
     * 
     */
    public AggregateStatisticInfoType.CalculationRule createAggregateStatisticInfoTypeCalculationRule() {
        return new AggregateStatisticInfoType.CalculationRule();
    }

    /**
     * Create an instance of {@link SchoolInfoType.OtherLEA }
     * 
     */
    public SchoolInfoType.OtherLEA createSchoolInfoTypeOtherLEA() {
        return new SchoolInfoType.OtherLEA();
    }

    /**
     * Create an instance of {@link LearningResourceType.Location }
     * 
     */
    public LearningResourceType.Location createLearningResourceTypeLocation() {
        return new LearningResourceType.Location();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceUsageContentType }
     * 
     */
    public ResourceUsageType.ResourceUsageContentType createResourceUsageTypeResourceUsageContentType() {
        return new ResourceUsageType.ResourceUsageContentType();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId }
     * 
     */
    public ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId createResourceUsageTypeResourceReportLineListResourceReportLineSIFRefId() {
        return new ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId();
    }

    /**
     * Create an instance of {@link ResourceUsageType.ResourceReportColumnList.ResourceReportColumn }
     * 
     */
    public ResourceUsageType.ResourceReportColumnList.ResourceReportColumn createResourceUsageTypeResourceReportColumnListResourceReportColumn() {
        return new ResourceUsageType.ResourceReportColumnList.ResourceReportColumn();
    }

    /**
     * Create an instance of {@link StudentParticipationType.ManagingSchool }
     * 
     */
    public StudentParticipationType.ManagingSchool createStudentParticipationTypeManagingSchool() {
        return new StudentParticipationType.ManagingSchool();
    }

    /**
     * Create an instance of {@link SystemRoleType.SIFRefId }
     * 
     */
    public SystemRoleType.SIFRefId createSystemRoleTypeSIFRefId() {
        return new SystemRoleType.SIFRefId();
    }

    /**
     * Create an instance of {@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId }
     * 
     */
    public SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeRefId() {
        return new SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentType.Homeroom }
     * 
     */
    public StudentSchoolEnrollmentType.Homeroom createStudentSchoolEnrollmentTypeHomeroom() {
        return new StudentSchoolEnrollmentType.Homeroom();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentType.Advisor }
     * 
     */
    public StudentSchoolEnrollmentType.Advisor createStudentSchoolEnrollmentTypeAdvisor() {
        return new StudentSchoolEnrollmentType.Advisor();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentType.Counselor }
     * 
     */
    public StudentSchoolEnrollmentType.Counselor createStudentSchoolEnrollmentTypeCounselor() {
        return new StudentSchoolEnrollmentType.Counselor();
    }

    /**
     * Create an instance of {@link StudentSchoolEnrollmentType.Calendar }
     * 
     */
    public StudentSchoolEnrollmentType.Calendar createStudentSchoolEnrollmentTypeCalendar() {
        return new StudentSchoolEnrollmentType.Calendar();
    }

    /**
     * Create an instance of {@link IdentityType.SIFRefId }
     * 
     */
    public IdentityType.SIFRefId createIdentityTypeSIFRefId() {
        return new IdentityType.SIFRefId();
    }

    /**
     * Create an instance of {@link DebtorType.BilledEntity }
     * 
     */
    public DebtorType.BilledEntity createDebtorTypeBilledEntity() {
        return new DebtorType.BilledEntity();
    }

    /**
     * Create an instance of {@link ResourceBookingType.ResourceRefId }
     * 
     */
    public ResourceBookingType.ResourceRefId createResourceBookingTypeResourceRefId() {
        return new ResourceBookingType.ResourceRefId();
    }

    /**
     * Create an instance of {@link ActivityType.Evaluation }
     * 
     */
    public ActivityType.Evaluation createActivityTypeEvaluation() {
        return new ActivityType.Evaluation();
    }

    /**
     * Create an instance of {@link InvoiceType.InvoicedEntity }
     * 
     */
    public InvoiceType.InvoicedEntity createInvoiceTypeInvoicedEntity() {
        return new InvoiceType.InvoicedEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateStatisticFactCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateStatisticFacts")
    public JAXBElement<AggregateStatisticFactCollectionType> createAggregateStatisticFacts(AggregateStatisticFactCollectionType value) {
        return new JAXBElement<AggregateStatisticFactCollectionType>(_AggregateStatisticFacts_QNAME, AggregateStatisticFactCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGStatusReportCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGStatusReports")
    public JAXBElement<AGStatusReportCollectionType> createAGStatusReports(AGStatusReportCollectionType value) {
        return new JAXBElement<AGStatusReportCollectionType>(_AGStatusReports_QNAME, AGStatusReportCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialAccounts")
    public JAXBElement<FinancialAccountCollectionType> createFinancialAccounts(FinancialAccountCollectionType value) {
        return new JAXBElement<FinancialAccountCollectionType>(_FinancialAccounts_QNAME, FinancialAccountCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledActivityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivitys")
    public JAXBElement<ScheduledActivityCollectionType> createScheduledActivitys(ScheduledActivityCollectionType value) {
        return new JAXBElement<ScheduledActivityCollectionType>(_ScheduledActivitys_QNAME, ScheduledActivityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolProgramsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolPrograms")
    public JAXBElement<SchoolProgramsType> createSchoolPrograms(SchoolProgramsType value) {
        return new JAXBElement<SchoolProgramsType>(_SchoolPrograms_QNAME, SchoolProgramsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponse")
    public JAXBElement<WellbeingResponseType> createWellbeingResponse(WellbeingResponseType value) {
        return new JAXBElement<WellbeingResponseType>(_WellbeingResponse_QNAME, WellbeingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUsageCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResourceUsages")
    public JAXBElement<ResourceUsageCollectionType> createResourceUsages(ResourceUsageCollectionType value) {
        return new JAXBElement<ResourceUsageCollectionType>(_ResourceUsages_QNAME, ResourceUsageCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentActivityInfos")
    public JAXBElement<StudentActivityInfoCollectionType> createStudentActivityInfos(StudentActivityInfoCollectionType value) {
        return new JAXBElement<StudentActivityInfoCollectionType>(_StudentActivityInfos_QNAME, StudentActivityInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalisedPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlan")
    public JAXBElement<PersonalisedPlanType> createPersonalisedPlan(PersonalisedPlanType value) {
        return new JAXBElement<PersonalisedPlanType>(_PersonalisedPlan_QNAME, PersonalisedPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAttendanceSummaryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentAttendanceSummarys")
    public JAXBElement<StudentAttendanceSummaryCollectionType> createStudentAttendanceSummarys(StudentAttendanceSummaryCollectionType value) {
        return new JAXBElement<StudentAttendanceSummaryCollectionType>(_StudentAttendanceSummarys_QNAME, StudentAttendanceSummaryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentContactRelationshipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentContactRelationship")
    public JAXBElement<StudentContactRelationshipType> createStudentContactRelationship(StudentContactRelationshipType value) {
        return new JAXBElement<StudentContactRelationshipType>(_StudentContactRelationship_QNAME, StudentContactRelationshipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarSummaryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarSummarys")
    public JAXBElement<CalendarSummaryCollectionType> createCalendarSummarys(CalendarSummaryCollectionType value) {
        return new JAXBElement<CalendarSummaryCollectionType>(_CalendarSummarys_QNAME, CalendarSummaryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableCellType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCell")
    public JAXBElement<TimeTableCellType> createTimeTableCell(TimeTableCellType value) {
        return new JAXBElement<TimeTableCellType>(_TimeTableCell_QNAME, TimeTableCellType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPCodeFrameCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPCodeFrames")
    public JAXBElement<NAPCodeFrameCollectionType> createNAPCodeFrames(NAPCodeFrameCollectionType value) {
        return new JAXBElement<NAPCodeFrameCollectionType>(_NAPCodeFrames_QNAME, NAPCodeFrameCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAttendanceTimeListCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentAttendanceTimeLists")
    public JAXBElement<StudentAttendanceTimeListCollectionType> createStudentAttendanceTimeLists(StudentAttendanceTimeListCollectionType value) {
        return new JAXBElement<StudentAttendanceTimeListCollectionType>(_StudentAttendanceTimeLists_QNAME, StudentAttendanceTimeListCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Identitys")
    public JAXBElement<IdentityCollectionType> createIdentitys(IdentityCollectionType value) {
        return new JAXBElement<IdentityCollectionType>(_Identitys_QNAME, IdentityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionEnrollmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSectionEnrollments")
    public JAXBElement<StudentSectionEnrollmentCollectionType> createStudentSectionEnrollments(StudentSectionEnrollmentCollectionType value) {
        return new JAXBElement<StudentSectionEnrollmentCollectionType>(_StudentSectionEnrollments_QNAME, StudentSectionEnrollmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomInfo")
    public JAXBElement<RoomInfoType> createRoomInfo(RoomInfoType value) {
        return new JAXBElement<RoomInfoType>(_RoomInfo_QNAME, RoomInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCourseInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseInfo")
    public JAXBElement<SchoolCourseInfoType> createSchoolCourseInfo(SchoolCourseInfoType value) {
        return new JAXBElement<SchoolCourseInfoType>(_SchoolCourseInfo_QNAME, SchoolCourseInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Invoices")
    public JAXBElement<InvoiceCollectionType> createInvoices(InvoiceCollectionType value) {
        return new JAXBElement<InvoiceCollectionType>(_Invoices_QNAME, InvoiceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentContactPersonalCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentContactPersonals")
    public JAXBElement<StudentContactPersonalCollectionType> createStudentContactPersonals(StudentContactPersonalCollectionType value) {
        return new JAXBElement<StudentContactPersonalCollectionType>(_StudentContactPersonals_QNAME, StudentContactPersonalCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomInfos")
    public JAXBElement<RoomInfoCollectionType> createRoomInfos(RoomInfoCollectionType value) {
        return new JAXBElement<RoomInfoCollectionType>(_RoomInfos_QNAME, RoomInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestItem")
    public JAXBElement<NAPTestItemType> createNAPTestItem(NAPTestItemType value) {
        return new JAXBElement<NAPTestItemType>(_NAPTestItem_QNAME, NAPTestItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPictureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonPicture")
    public JAXBElement<PersonPictureType> createPersonPicture(PersonPictureType value) {
        return new JAXBElement<PersonPictureType>(_PersonPicture_QNAME, PersonPictureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentReceiptCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PaymentReceipts")
    public JAXBElement<PaymentReceiptCollectionType> createPaymentReceipts(PaymentReceiptCollectionType value) {
        return new JAXBElement<PaymentReceiptCollectionType>(_PaymentReceipts_QNAME, PaymentReceiptCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingAlertCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAlerts")
    public JAXBElement<WellbeingAlertCollectionType> createWellbeingAlerts(WellbeingAlertCollectionType value) {
        return new JAXBElement<WellbeingAlertCollectionType>(_WellbeingAlerts_QNAME, WellbeingAlertCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestItems")
    public JAXBElement<NAPTestItemCollectionType> createNAPTestItems(NAPTestItemCollectionType value) {
        return new JAXBElement<NAPTestItemCollectionType>(_NAPTestItems_QNAME, NAPTestItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarDateCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarDates")
    public JAXBElement<CalendarDateCollectionType> createCalendarDates(CalendarDateCollectionType value) {
        return new JAXBElement<CalendarDateCollectionType>(_CalendarDates_QNAME, CalendarDateCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentContactRelationshipCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentContactRelationships")
    public JAXBElement<StudentContactRelationshipCollectionType> createStudentContactRelationships(StudentContactRelationshipCollectionType value) {
        return new JAXBElement<StudentContactRelationshipCollectionType>(_StudentContactRelationships_QNAME, StudentContactRelationshipCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradingAssignmentScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingAssignmentScore")
    public JAXBElement<GradingAssignmentScoreType> createGradingAssignmentScore(GradingAssignmentScoreType value) {
        return new JAXBElement<GradingAssignmentScoreType>(_GradingAssignmentScore_QNAME, GradingAssignmentScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PurchaseOrders")
    public JAXBElement<PurchaseOrderCollectionType> createPurchaseOrders(PurchaseOrderCollectionType value) {
        return new JAXBElement<PurchaseOrderCollectionType>(_PurchaseOrders_QNAME, PurchaseOrderCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardItems")
    public JAXBElement<LearningStandardItemCollectionType> createLearningStandardItems(LearningStandardItemCollectionType value) {
        return new JAXBElement<LearningStandardItemCollectionType>(_LearningStandardItems_QNAME, LearningStandardItemCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPictureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonPictures")
    public JAXBElement<PersonPictureCollectionType> createPersonPictures(PersonPictureCollectionType value) {
        return new JAXBElement<PersonPictureCollectionType>(_PersonPictures_QNAME, PersonPictureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestScoreSummaryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestScoreSummarys")
    public JAXBElement<NAPTestScoreSummaryCollectionType> createNAPTestScoreSummarys(NAPTestScoreSummaryCollectionType value) {
        return new JAXBElement<NAPTestScoreSummaryCollectionType>(_NAPTestScoreSummarys_QNAME, NAPTestScoreSummaryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableSubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubject")
    public JAXBElement<TimeTableSubjectType> createTimeTableSubject(TimeTableSubjectType value) {
        return new JAXBElement<TimeTableSubjectType>(_TimeTableSubject_QNAME, TimeTableSubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestScoreSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestScoreSummary")
    public JAXBElement<NAPTestScoreSummaryType> createNAPTestScoreSummary(NAPTestScoreSummaryType value) {
        return new JAXBElement<NAPTestScoreSummaryType>(_NAPTestScoreSummary_QNAME, NAPTestScoreSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialQuestionnaireSubmissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialQuestionnaireSubmission")
    public JAXBElement<FinancialQuestionnaireSubmissionType> createFinancialQuestionnaireSubmission(FinancialQuestionnaireSubmissionType value) {
        return new JAXBElement<FinancialQuestionnaireSubmissionType>(_FinancialQuestionnaireSubmission_QNAME, FinancialQuestionnaireSubmissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateStatisticFactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateStatisticFact")
    public JAXBElement<AggregateStatisticFactType> createAggregateStatisticFact(AggregateStatisticFactType value) {
        return new JAXBElement<AggregateStatisticFactType>(_AggregateStatisticFact_QNAME, AggregateStatisticFactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingAppealCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAppeals")
    public JAXBElement<WellbeingAppealCollectionType> createWellbeingAppeals(WellbeingAppealCollectionType value) {
        return new JAXBElement<WellbeingAppealCollectionType>(_WellbeingAppeals_QNAME, WellbeingAppealCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourcePackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResourcePackage")
    public JAXBElement<LearningResourcePackageType> createLearningResourcePackage(LearningResourcePackageType value) {
        return new JAXBElement<LearningResourcePackageType>(_LearningResourcePackage_QNAME, LearningResourcePackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolProgramsCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolProgramss")
    public JAXBElement<SchoolProgramsCollectionType> createSchoolProgramss(SchoolProgramsCollectionType value) {
        return new JAXBElement<SchoolProgramsCollectionType>(_SchoolProgramss_QNAME, SchoolProgramsCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGStatusReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGStatusReport")
    public JAXBElement<AGStatusReportType> createAGStatusReport(AGStatusReportType value) {
        return new JAXBElement<AGStatusReportType>(_AGStatusReport_QNAME, AGStatusReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityParticipationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentActivityParticipation")
    public JAXBElement<StudentActivityParticipationType> createStudentActivityParticipation(StudentActivityParticipationType value) {
        return new JAXBElement<StudentActivityParticipationType>(_StudentActivityParticipation_QNAME, StudentActivityParticipationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SectionInfo")
    public JAXBElement<SectionInfoType> createSectionInfo(SectionInfoType value) {
        return new JAXBElement<SectionInfoType>(_SectionInfo_QNAME, SectionInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingEventCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEvents")
    public JAXBElement<WellbeingEventCollectionType> createWellbeingEvents(WellbeingEventCollectionType value) {
        return new JAXBElement<WellbeingEventCollectionType>(_WellbeingEvents_QNAME, WellbeingEventCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeachingGroupCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroups")
    public JAXBElement<TeachingGroupCollectionType> createTeachingGroups(TeachingGroupCollectionType value) {
        return new JAXBElement<TeachingGroupCollectionType>(_TeachingGroups_QNAME, TeachingGroupCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffAssignment")
    public JAXBElement<StaffAssignmentType> createStaffAssignment(StaffAssignmentType value) {
        return new JAXBElement<StaffAssignmentType>(_StaffAssignment_QNAME, StaffAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRoleCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SystemRoles")
    public JAXBElement<SystemRoleCollectionType> createSystemRoles(SystemRoleCollectionType value) {
        return new JAXBElement<SystemRoleCollectionType>(_SystemRoles_QNAME, SystemRoleCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Activitys")
    public JAXBElement<ActivityCollectionType> createActivitys(ActivityCollectionType value) {
        return new JAXBElement<ActivityCollectionType>(_Activitys_QNAME, ActivityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentPersonalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonal")
    public JAXBElement<StudentPersonalType> createStudentPersonal(StudentPersonalType value) {
        return new JAXBElement<StudentPersonalType>(_StudentPersonal_QNAME, StudentPersonalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTest")
    public JAXBElement<NAPTestType> createNAPTest(NAPTestType value) {
        return new JAXBElement<NAPTestType>(_NAPTest_QNAME, NAPTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Journal")
    public JAXBElement<JournalType> createJournal(JournalType value) {
        return new JAXBElement<JournalType>(_Journal_QNAME, JournalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentGradeCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentGrades")
    public JAXBElement<StudentGradeCollectionType> createStudentGrades(StudentGradeCollectionType value) {
        return new JAXBElement<StudentGradeCollectionType>(_StudentGrades_QNAME, StudentGradeCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDailyAttendanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentDailyAttendance")
    public JAXBElement<StudentDailyAttendanceType> createStudentDailyAttendance(StudentDailyAttendanceType value) {
        return new JAXBElement<StudentDailyAttendanceType>(_StudentDailyAttendance_QNAME, StudentDailyAttendanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarDate")
    public JAXBElement<CalendarDate> createCalendarDate(CalendarDate value) {
        return new JAXBElement<CalendarDate>(_CalendarDate_QNAME, CalendarDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradingAssignmentScoreCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingAssignmentScores")
    public JAXBElement<GradingAssignmentScoreCollectionType> createGradingAssignmentScores(GradingAssignmentScoreCollectionType value) {
        return new JAXBElement<GradingAssignmentScoreCollectionType>(_GradingAssignmentScores_QNAME, GradingAssignmentScoreCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResources")
    public JAXBElement<LearningResourceCollectionType> createLearningResources(LearningResourceCollectionType value) {
        return new JAXBElement<LearningResourceCollectionType>(_LearningResources_QNAME, LearningResourceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SectionInfos")
    public JAXBElement<SectionInfoCollectionType> createSectionInfos(SectionInfoCollectionType value) {
        return new JAXBElement<SectionInfoCollectionType>(_SectionInfos_QNAME, SectionInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentPeriodAttendanceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPeriodAttendances")
    public JAXBElement<StudentPeriodAttendanceCollectionType> createStudentPeriodAttendances(StudentPeriodAttendanceCollectionType value) {
        return new JAXBElement<StudentPeriodAttendanceCollectionType>(_StudentPeriodAttendances_QNAME, StudentPeriodAttendanceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResourceUsage")
    public JAXBElement<ResourceUsageType> createResourceUsage(ResourceUsageType value) {
        return new JAXBElement<ResourceUsageType>(_ResourceUsage_QNAME, ResourceUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateCharacteristicInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateCharacteristicInfos")
    public JAXBElement<AggregateCharacteristicInfoCollectionType> createAggregateCharacteristicInfos(AggregateCharacteristicInfoCollectionType value) {
        return new JAXBElement<AggregateCharacteristicInfoCollectionType>(_AggregateCharacteristicInfos_QNAME, AggregateCharacteristicInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResource")
    public JAXBElement<LearningResourceType> createLearningResource(LearningResourceType value) {
        return new JAXBElement<LearningResourceType>(_LearningResource_QNAME, LearningResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentPersonalCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonals")
    public JAXBElement<StudentPersonalCollectionType> createStudentPersonals(StudentPersonalCollectionType value) {
        return new JAXBElement<StudentPersonalCollectionType>(_StudentPersonals_QNAME, StudentPersonalCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentContactPersonalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentContactPersonal")
    public JAXBElement<StudentContactPersonalType> createStudentContactPersonal(StudentContactPersonalType value) {
        return new JAXBElement<StudentContactPersonalType>(_StudentContactPersonal_QNAME, StudentContactPersonalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivity")
    public JAXBElement<ScheduledActivityType> createScheduledActivity(ScheduledActivityType value) {
        return new JAXBElement<ScheduledActivityType>(_ScheduledActivity_QNAME, ScheduledActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPStudentResponseSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPStudentResponseSet")
    public JAXBElement<NAPStudentResponseSetType> createNAPStudentResponseSet(NAPStudentResponseSetType value) {
        return new JAXBElement<NAPStudentResponseSetType>(_NAPStudentResponseSet_QNAME, NAPStudentResponseSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateStatisticInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateStatisticInfo")
    public JAXBElement<AggregateStatisticInfoType> createAggregateStatisticInfo(AggregateStatisticInfoType value) {
        return new JAXBElement<AggregateStatisticInfoType>(_AggregateStatisticInfo_QNAME, AggregateStatisticInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEAInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LEAInfos")
    public JAXBElement<LEAInfoCollectionType> createLEAInfos(LEAInfoCollectionType value) {
        return new JAXBElement<LEAInfoCollectionType>(_LEAInfos_QNAME, LEAInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfo")
    public JAXBElement<SchoolInfoType> createSchoolInfo(SchoolInfoType value) {
        return new JAXBElement<SchoolInfoType>(_SchoolInfo_QNAME, SchoolInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradingAssignmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingAssignments")
    public JAXBElement<GradingAssignmentCollectionType> createGradingAssignments(GradingAssignmentCollectionType value) {
        return new JAXBElement<GradingAssignmentCollectionType>(_GradingAssignments_QNAME, GradingAssignmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourcePackageCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResourcePackages")
    public JAXBElement<LearningResourcePackageCollectionType> createLearningResourcePackages(LearningResourcePackageCollectionType value) {
        return new JAXBElement<LearningResourcePackageCollectionType>(_LearningResourcePackages_QNAME, LearningResourcePackageCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardItem")
    public JAXBElement<LearningStandardItemType> createLearningStandardItem(LearningStandardItemType value) {
        return new JAXBElement<LearningStandardItemType>(_LearningStandardItem_QNAME, LearningStandardItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPEventStudentLinkCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPEventStudentLinks")
    public JAXBElement<NAPEventStudentLinkCollectionType> createNAPEventStudentLinks(NAPEventStudentLinkCollectionType value) {
        return new JAXBElement<NAPEventStudentLinkCollectionType>(_NAPEventStudentLinks_QNAME, NAPEventStudentLinkCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EquipmentInfo")
    public JAXBElement<EquipmentInfoType> createEquipmentInfo(EquipmentInfoType value) {
        return new JAXBElement<EquipmentInfoType>(_EquipmentInfo_QNAME, EquipmentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAttendanceSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentAttendanceSummary")
    public JAXBElement<StudentAttendanceSummaryType> createStudentAttendanceSummary(StudentAttendanceSummaryType value) {
        return new JAXBElement<StudentAttendanceSummaryType>(_StudentAttendanceSummary_QNAME, StudentAttendanceSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPEventStudentLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPEventStudentLink")
    public JAXBElement<NAPEventStudentLinkType> createNAPEventStudentLink(NAPEventStudentLinkType value) {
        return new JAXBElement<NAPEventStudentLinkType>(_NAPEventStudentLink_QNAME, NAPEventStudentLinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingCharacteristicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristic")
    public JAXBElement<WellbeingCharacteristicType> createWellbeingCharacteristic(WellbeingCharacteristicType value) {
        return new JAXBElement<WellbeingCharacteristicType>(_WellbeingCharacteristic_QNAME, WellbeingCharacteristicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EquipmentInfos")
    public JAXBElement<EquipmentInfoCollectionType> createEquipmentInfos(EquipmentInfoCollectionType value) {
        return new JAXBElement<EquipmentInfoCollectionType>(_EquipmentInfos_QNAME, EquipmentInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PurchaseOrder")
    public JAXBElement<PurchaseOrderType> createPurchaseOrder(PurchaseOrderType value) {
        return new JAXBElement<PurchaseOrderType>(_PurchaseOrder_QNAME, PurchaseOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEAInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LEAInfo")
    public JAXBElement<LEAInfoType> createLEAInfo(LEAInfoType value) {
        return new JAXBElement<LEAInfoType>(_LEAInfo_QNAME, LEAInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSchoolEnrollments")
    public JAXBElement<StudentSchoolEnrollmentCollectionType> createStudentSchoolEnrollments(StudentSchoolEnrollmentCollectionType value) {
        return new JAXBElement<StudentSchoolEnrollmentCollectionType>(_StudentSchoolEnrollments_QNAME, StudentSchoolEnrollmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityParticipationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentActivityParticipations")
    public JAXBElement<StudentActivityParticipationCollectionType> createStudentActivityParticipations(StudentActivityParticipationCollectionType value) {
        return new JAXBElement<StudentActivityParticipationCollectionType>(_StudentActivityParticipations_QNAME, StudentActivityParticipationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTests")
    public JAXBElement<NAPTestCollectionType> createNAPTests(NAPTestCollectionType value) {
        return new JAXBElement<NAPTestCollectionType>(_NAPTests_QNAME, NAPTestCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SystemRole")
    public JAXBElement<SystemRoleType> createSystemRole(SystemRoleType value) {
        return new JAXBElement<SystemRoleType>(_SystemRole_QNAME, SystemRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebtorCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Debtors")
    public JAXBElement<DebtorCollectionType> createDebtors(DebtorCollectionType value) {
        return new JAXBElement<DebtorCollectionType>(_Debtors_QNAME, DebtorCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargedLocationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfo")
    public JAXBElement<ChargedLocationInfoType> createChargedLocationInfo(ChargedLocationInfoType value) {
        return new JAXBElement<ChargedLocationInfoType>(_ChargedLocationInfo_QNAME, ChargedLocationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VendorInfos")
    public JAXBElement<VendorInfoCollectionType> createVendorInfos(VendorInfoCollectionType value) {
        return new JAXBElement<VendorInfoCollectionType>(_VendorInfos_QNAME, VendorInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardDocuments")
    public JAXBElement<LearningStandardDocumentCollectionType> createLearningStandardDocuments(LearningStandardDocumentCollectionType value) {
        return new JAXBElement<LearningStandardDocumentCollectionType>(_LearningStandardDocuments_QNAME, LearningStandardDocumentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonal")
    public JAXBElement<StaffPersonalType> createStaffPersonal(StaffPersonalType value) {
        return new JAXBElement<StaffPersonalType>(_StaffPersonal_QNAME, StaffPersonalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateCharacteristicInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateCharacteristicInfo")
    public JAXBElement<AggregateCharacteristicInfoType> createAggregateCharacteristicInfo(AggregateCharacteristicInfoType value) {
        return new JAXBElement<AggregateCharacteristicInfoType>(_AggregateCharacteristicInfo_QNAME, AggregateCharacteristicInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalisedPlanCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlans")
    public JAXBElement<PersonalisedPlanCollectionType> createPersonalisedPlans(PersonalisedPlanCollectionType value) {
        return new JAXBElement<PersonalisedPlanCollectionType>(_PersonalisedPlans_QNAME, PersonalisedPlanCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingCharacteristicCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristics")
    public JAXBElement<WellbeingCharacteristicCollectionType> createWellbeingCharacteristics(WellbeingCharacteristicCollectionType value) {
        return new JAXBElement<WellbeingCharacteristicCollectionType>(_WellbeingCharacteristics_QNAME, WellbeingCharacteristicCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentParticipationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentParticipation")
    public JAXBElement<StudentParticipationType> createStudentParticipation(StudentParticipationType value) {
        return new JAXBElement<StudentParticipationType>(_StudentParticipation_QNAME, StudentParticipationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SessionInfo")
    public JAXBElement<SessionInfoType> createSessionInfo(SessionInfoType value) {
        return new JAXBElement<SessionInfoType>(_SessionInfo_QNAME, SessionInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentScoreJudgementAgainstStandardCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentScoreJudgementAgainstStandards")
    public JAXBElement<StudentScoreJudgementAgainstStandardCollectionType> createStudentScoreJudgementAgainstStandards(StudentScoreJudgementAgainstStandardCollectionType value) {
        return new JAXBElement<StudentScoreJudgementAgainstStandardCollectionType>(_StudentScoreJudgementAgainstStandards_QNAME, StudentScoreJudgementAgainstStandardCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradingAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingAssignment")
    public JAXBElement<GradingAssignmentType> createGradingAssignment(GradingAssignmentType value) {
        return new JAXBElement<GradingAssignmentType>(_GradingAssignment_QNAME, GradingAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingResponseCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponses")
    public JAXBElement<WellbeingResponseCollectionType> createWellbeingResponses(WellbeingResponseCollectionType value) {
        return new JAXBElement<WellbeingResponseCollectionType>(_WellbeingResponses_QNAME, WellbeingResponseCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfos")
    public JAXBElement<TermInfoCollectionType> createTermInfos(TermInfoCollectionType value) {
        return new JAXBElement<TermInfoCollectionType>(_TermInfos_QNAME, TermInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardDocument")
    public JAXBElement<LearningStandardDocumentType> createLearningStandardDocument(LearningStandardDocumentType value) {
        return new JAXBElement<LearningStandardDocumentType>(_LearningStandardDocument_QNAME, LearningStandardDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentPeriodAttendanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPeriodAttendance")
    public JAXBElement<StudentPeriodAttendanceType> createStudentPeriodAttendance(StudentPeriodAttendanceType value) {
        return new JAXBElement<StudentPeriodAttendanceType>(_StudentPeriodAttendance_QNAME, StudentPeriodAttendanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkValueInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MarkValueInfo")
    public JAXBElement<MarkValueInfoType> createMarkValueInfo(MarkValueInfoType value) {
        return new JAXBElement<MarkValueInfoType>(_MarkValueInfo_QNAME, MarkValueInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentGradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentGrade")
    public JAXBElement<StudentGradeType> createStudentGrade(StudentGradeType value) {
        return new JAXBElement<StudentGradeType>(_StudentGrade_QNAME, StudentGradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestletCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestlets")
    public JAXBElement<NAPTestletCollectionType> createNAPTestlets(NAPTestletCollectionType value) {
        return new JAXBElement<NAPTestletCollectionType>(_NAPTestlets_QNAME, NAPTestletCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingAlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAlert")
    public JAXBElement<WellbeingAlertType> createWellbeingAlert(WellbeingAlertType value) {
        return new JAXBElement<WellbeingAlertType>(_WellbeingAlert_QNAME, WellbeingAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEvent")
    public JAXBElement<WellbeingEventType> createWellbeingEvent(WellbeingEventType value) {
        return new JAXBElement<WellbeingEventType>(_WellbeingEvent_QNAME, WellbeingEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSectionEnrollmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSectionEnrollment")
    public JAXBElement<StudentSectionEnrollmentType> createStudentSectionEnrollment(StudentSectionEnrollmentType value) {
        return new JAXBElement<StudentSectionEnrollmentType>(_StudentSectionEnrollment_QNAME, StudentSectionEnrollmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSchoolEnrollment")
    public JAXBElement<StudentSchoolEnrollmentType> createStudentSchoolEnrollment(StudentSchoolEnrollmentType value) {
        return new JAXBElement<StudentSchoolEnrollmentType>(_StudentSchoolEnrollment_QNAME, StudentSchoolEnrollmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialQuestionnaireSubmissionCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialQuestionnaireSubmissions")
    public JAXBElement<FinancialQuestionnaireSubmissionCollectionType> createFinancialQuestionnaireSubmissions(FinancialQuestionnaireSubmissionCollectionType value) {
        return new JAXBElement<FinancialQuestionnaireSubmissionCollectionType>(_FinancialQuestionnaireSubmissions_QNAME, FinancialQuestionnaireSubmissionCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Journals")
    public JAXBElement<JournalCollectionType> createJournals(JournalCollectionType value) {
        return new JAXBElement<JournalCollectionType>(_Journals_QNAME, JournalCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialAccount")
    public JAXBElement<FinancialAccountType> createFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_FinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateStatisticInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AggregateStatisticInfos")
    public JAXBElement<AggregateStatisticInfoCollectionType> createAggregateStatisticInfos(AggregateStatisticInfoCollectionType value) {
        return new JAXBElement<AggregateStatisticInfoCollectionType>(_AggregateStatisticInfos_QNAME, AggregateStatisticInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPStudentResponseSetCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPStudentResponseSets")
    public JAXBElement<NAPStudentResponseSetCollectionType> createNAPStudentResponseSets(NAPStudentResponseSetCollectionType value) {
        return new JAXBElement<NAPStudentResponseSetCollectionType>(_NAPStudentResponseSets_QNAME, NAPStudentResponseSetCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCourseInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseInfos")
    public JAXBElement<SchoolCourseInfoCollectionType> createSchoolCourseInfos(SchoolCourseInfoCollectionType value) {
        return new JAXBElement<SchoolCourseInfoCollectionType>(_SchoolCourseInfos_QNAME, SchoolCourseInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfo")
    public JAXBElement<TermInfoType> createTermInfo(TermInfoType value) {
        return new JAXBElement<TermInfoType>(_TermInfo_QNAME, TermInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SessionInfos")
    public JAXBElement<SessionInfoCollectionType> createSessionInfos(SessionInfoCollectionType value) {
        return new JAXBElement<SessionInfoCollectionType>(_SessionInfos_QNAME, SessionInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableSubjectCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjects")
    public JAXBElement<TimeTableSubjectCollectionType> createTimeTableSubjects(TimeTableSubjectCollectionType value) {
        return new JAXBElement<TimeTableSubjectCollectionType>(_TimeTableSubjects_QNAME, TimeTableSubjectCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableCellCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCells")
    public JAXBElement<TimeTableCellCollectionType> createTimeTableCells(TimeTableCellCollectionType value) {
        return new JAXBElement<TimeTableCellCollectionType>(_TimeTableCells_QNAME, TimeTableCellCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentScoreJudgementAgainstStandardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentScoreJudgementAgainstStandard")
    public JAXBElement<StudentScoreJudgementAgainstStandardType> createStudentScoreJudgementAgainstStandard(StudentScoreJudgementAgainstStandardType value) {
        return new JAXBElement<StudentScoreJudgementAgainstStandardType>(_StudentScoreJudgementAgainstStandard_QNAME, StudentScoreJudgementAgainstStandardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Invoice")
    public JAXBElement<InvoiceType> createInvoice(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_Invoice_QNAME, InvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfos")
    public JAXBElement<SchoolInfoCollectionType> createSchoolInfos(SchoolInfoCollectionType value) {
        return new JAXBElement<SchoolInfoCollectionType>(_SchoolInfos_QNAME, SchoolInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceBookingCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResourceBookings")
    public JAXBElement<ResourceBookingCollectionType> createResourceBookings(ResourceBookingCollectionType value) {
        return new JAXBElement<ResourceBookingCollectionType>(_ResourceBookings_QNAME, ResourceBookingCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentReceiptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PaymentReceipt")
    public JAXBElement<PaymentReceiptType> createPaymentReceipt(PaymentReceiptType value) {
        return new JAXBElement<PaymentReceiptType>(_PaymentReceipt_QNAME, PaymentReceiptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPTestletType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestlet")
    public JAXBElement<NAPTestletType> createNAPTestlet(NAPTestletType value) {
        return new JAXBElement<NAPTestletType>(_NAPTestlet_QNAME, NAPTestletType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffAssignmentCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffAssignments")
    public JAXBElement<StaffAssignmentCollectionType> createStaffAssignments(StaffAssignmentCollectionType value) {
        return new JAXBElement<StaffAssignmentCollectionType>(_StaffAssignments_QNAME, StaffAssignmentCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceBookingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResourceBooking")
    public JAXBElement<ResourceBookingType> createResourceBooking(ResourceBookingType value) {
        return new JAXBElement<ResourceBookingType>(_ResourceBooking_QNAME, ResourceBookingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTables")
    public JAXBElement<TimeTableCollectionType> createTimeTables(TimeTableCollectionType value) {
        return new JAXBElement<TimeTableCollectionType>(_TimeTables_QNAME, TimeTableCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingAppealType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAppeal")
    public JAXBElement<WellbeingAppealType> createWellbeingAppeal(WellbeingAppealType value) {
        return new JAXBElement<WellbeingAppealType>(_WellbeingAppeal_QNAME, WellbeingAppealType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Activity")
    public JAXBElement<ActivityType> createActivity(ActivityType value) {
        return new JAXBElement<ActivityType>(_Activity_QNAME, ActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeachingGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroup")
    public JAXBElement<TeachingGroupType> createTeachingGroup(TeachingGroupType value) {
        return new JAXBElement<TeachingGroupType>(_TeachingGroup_QNAME, TeachingGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAttendanceTimeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentAttendanceTimeList")
    public JAXBElement<StudentAttendanceTimeListType> createStudentAttendanceTimeList(StudentAttendanceTimeListType value) {
        return new JAXBElement<StudentAttendanceTimeListType>(_StudentAttendanceTimeList_QNAME, StudentAttendanceTimeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPCodeFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPCodeFrame")
    public JAXBElement<NAPCodeFrameType> createNAPCodeFrame(NAPCodeFrameType value) {
        return new JAXBElement<NAPCodeFrameType>(_NAPCodeFrame_QNAME, NAPCodeFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffPersonalCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonals")
    public JAXBElement<StaffPersonalCollectionType> createStaffPersonals(StaffPersonalCollectionType value) {
        return new JAXBElement<StaffPersonalCollectionType>(_StaffPersonals_QNAME, StaffPersonalCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentActivityInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentActivityInfo")
    public JAXBElement<StudentActivityInfoType> createStudentActivityInfo(StudentActivityInfoType value) {
        return new JAXBElement<StudentActivityInfoType>(_StudentActivityInfo_QNAME, StudentActivityInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentParticipationCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentParticipations")
    public JAXBElement<StudentParticipationCollectionType> createStudentParticipations(StudentParticipationCollectionType value) {
        return new JAXBElement<StudentParticipationCollectionType>(_StudentParticipations_QNAME, StudentParticipationCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebtorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Debtor")
    public JAXBElement<DebtorType> createDebtor(DebtorType value) {
        return new JAXBElement<DebtorType>(_Debtor_QNAME, DebtorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkValueInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MarkValueInfos")
    public JAXBElement<MarkValueInfoCollectionType> createMarkValueInfos(MarkValueInfoCollectionType value) {
        return new JAXBElement<MarkValueInfoCollectionType>(_MarkValueInfos_QNAME, MarkValueInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarSummary")
    public JAXBElement<CalendarSummaryType> createCalendarSummary(CalendarSummaryType value) {
        return new JAXBElement<CalendarSummaryType>(_CalendarSummary_QNAME, CalendarSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargedLocationInfoCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfos")
    public JAXBElement<ChargedLocationInfoCollectionType> createChargedLocationInfos(ChargedLocationInfoCollectionType value) {
        return new JAXBElement<ChargedLocationInfoCollectionType>(_ChargedLocationInfos_QNAME, ChargedLocationInfoCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Identity")
    public JAXBElement<IdentityType> createIdentity(IdentityType value) {
        return new JAXBElement<IdentityType>(_Identity_QNAME, IdentityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTable")
    public JAXBElement<TimeTableType> createTimeTable(TimeTableType value) {
        return new JAXBElement<TimeTableType>(_TimeTable_QNAME, TimeTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDailyAttendanceCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentDailyAttendances")
    public JAXBElement<StudentDailyAttendanceCollectionType> createStudentDailyAttendances(StudentDailyAttendanceCollectionType value) {
        return new JAXBElement<StudentDailyAttendanceCollectionType>(_StudentDailyAttendances_QNAME, StudentDailyAttendanceCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VendorInfo")
    public JAXBElement<VendorInfoType> createVendorInfo(VendorInfoType value) {
        return new JAXBElement<VendorInfoType>(_VendorInfo_QNAME, VendorInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AwardNotes", scope = AwardContainerType.class)
    public JAXBElement<String> createAwardContainerTypeAwardNotes(String value) {
        return new JAXBElement<String>(_AwardContainerTypeAwardNotes_QNAME, String.class, AwardContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = AwardContainerType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createAwardContainerTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, AwardContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AwardDescription", scope = AwardContainerType.class)
    public JAXBElement<String> createAwardContainerTypeAwardDescription(String value) {
        return new JAXBElement<String>(_AwardContainerTypeAwardDescription_QNAME, String.class, AwardContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AwardType", scope = AwardContainerType.class)
    public JAXBElement<String> createAwardContainerTypeAwardType(String value) {
        return new JAXBElement<String>(_AwardContainerTypeAwardType_QNAME, String.class, AwardContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AwardDate", scope = AwardContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createAwardContainerTypeAwardDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AwardContainerTypeAwardDate_QNAME, XMLGregorianCalendar.class, AwardContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CountForAttendance", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeCountForAttendance(String value) {
        return new JAXBElement<String>(_SectionInfoTypeCountForAttendance_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseSectionCode", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeCourseSectionCode(String value) {
        return new JAXBElement<String>(_SectionInfoTypeCourseSectionCode_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SectionInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createSectionInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SectionInfoType.class)
    public JAXBElement<SIFMetadataType> createSectionInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediumOfInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MediumOfInstruction", scope = SectionInfoType.class)
    public JAXBElement<MediumOfInstructionType> createSectionInfoTypeMediumOfInstruction(MediumOfInstructionType value) {
        return new JAXBElement<MediumOfInstructionType>(_SectionInfoTypeMediumOfInstruction_QNAME, MediumOfInstructionType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SummerSchool", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeSummerSchool(String value) {
        return new JAXBElement<String>(_SectionInfoTypeSummerSchool_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = SectionInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSectionInfoTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationOfInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocationOfInstruction", scope = SectionInfoType.class)
    public JAXBElement<LocationOfInstructionType> createSectionInfoTypeLocationOfInstruction(LocationOfInstructionType value) {
        return new JAXBElement<LocationOfInstructionType>(_SectionInfoTypeLocationOfInstruction_QNAME, LocationOfInstructionType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SectionCode", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeSectionCode(String value) {
        return new JAXBElement<String>(_SectionInfoTypeSectionCode_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolCourseInfoOverrideType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseInfoOverride", scope = SectionInfoType.class)
    public JAXBElement<SchoolCourseInfoOverrideType> createSectionInfoTypeSchoolCourseInfoOverride(SchoolCourseInfoOverrideType value) {
        return new JAXBElement<SchoolCourseInfoOverrideType>(_SectionInfoTypeSchoolCourseInfoOverride_QNAME, SchoolCourseInfoOverrideType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageOfInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LanguageOfInstruction", scope = SectionInfoType.class)
    public JAXBElement<LanguageOfInstructionType> createSectionInfoTypeLanguageOfInstruction(LanguageOfInstructionType value) {
        return new JAXBElement<LanguageOfInstructionType>(_SectionInfoTypeLanguageOfInstruction_QNAME, LanguageOfInstructionType.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfoRefId", scope = SectionInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSectionInfoTypeTermInfoRefId(String value) {
        return new JAXBElement<String>(_SectionInfoTypeTermInfoRefId_QNAME, String.class, SectionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ColumnDescription", scope = ResourceUsageType.ResourceReportColumnList.ResourceReportColumn.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDescription(String value) {
        return new JAXBElement<String>(_ResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDescription_QNAME, String.class, ResourceUsageType.ResourceReportColumnList.ResourceReportColumn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ColumnDelimiter", scope = ResourceUsageType.ResourceReportColumnList.ResourceReportColumn.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDelimiter(String value) {
        return new JAXBElement<String>(_ResourceUsageTypeResourceReportColumnListResourceReportColumnColumnDelimiter_QNAME, String.class, ResourceUsageType.ResourceReportColumnList.ResourceReportColumn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ItemDetail", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeItemDetail(String value) {
        return new JAXBElement<String>(_InvoiceTypeItemDetail_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccountingPeriod", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeAccountingPeriod(String value) {
        return new JAXBElement<String>(_InvoiceTypeAccountingPeriod_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FormNumber", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeFormNumber(String value) {
        return new JAXBElement<String>(_InvoiceTypeFormNumber_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CreatedBy", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeCreatedBy(String value) {
        return new JAXBElement<String>(_InvoiceTypeCreatedBy_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = InvoiceType.class)
    public JAXBElement<SIFExtendedElementsType> createInvoiceTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Voluntary", scope = InvoiceType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createInvoiceTypeVoluntary(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_InvoiceTypeVoluntary_QNAME, AUCodeSetsYesOrNoCategoryType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = InvoiceType.class)
    public JAXBElement<SIFMetadataType> createInvoiceTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NetAmount", scope = InvoiceType.class)
    public JAXBElement<MonetaryAmountType> createInvoiceTypeNetAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeNetAmount_QNAME, MonetaryAmountType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountRefIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialAccountRefIdList", scope = InvoiceType.class)
    public JAXBElement<FinancialAccountRefIdListType> createInvoiceTypeFinancialAccountRefIdList(FinancialAccountRefIdListType value) {
        return new JAXBElement<FinancialAccountRefIdListType>(_InvoiceTypeFinancialAccountRefIdList_QNAME, FinancialAccountRefIdListType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApprovedBy", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeApprovedBy(String value) {
        return new JAXBElement<String>(_InvoiceTypeApprovedBy_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxType", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeTaxType(String value) {
        return new JAXBElement<String>(_InvoiceTypeTaxType_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfoRefId", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeChargedLocationInfoRefId(String value) {
        return new JAXBElement<String>(_InvoiceTypeChargedLocationInfoRefId_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxAmount", scope = InvoiceType.class)
    public JAXBElement<MonetaryAmountType> createInvoiceTypeTaxAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeTaxAmount_QNAME, MonetaryAmountType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RelatedPurchaseOrderRefId", scope = InvoiceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvoiceTypeRelatedPurchaseOrderRefId(String value) {
        return new JAXBElement<String>(_InvoiceTypeRelatedPurchaseOrderRefId_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DueDate", scope = InvoiceType.class)
    public JAXBElement<XMLGregorianCalendar> createInvoiceTypeDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceTypeDueDate_QNAME, XMLGregorianCalendar.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchasingItemsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PurchasingItems", scope = InvoiceType.class)
    public JAXBElement<PurchasingItemsType> createInvoiceTypePurchasingItems(PurchasingItemsType value) {
        return new JAXBElement<PurchasingItemsType>(_InvoiceTypePurchasingItems_QNAME, PurchasingItemsType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxRate", scope = InvoiceType.class)
    public JAXBElement<BigDecimal> createInvoiceTypeTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceTypeTaxRate_QNAME, BigDecimal.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = MediumOfInstructionType.class)
    public JAXBElement<OtherCodeListType> createMediumOfInstructionTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, MediumOfInstructionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinishTime", scope = SessionInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSessionInfoTypeFinishTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeFinishTime_QNAME, XMLGregorianCalendar.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalLocalId", scope = SessionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSessionInfoTypeStaffPersonalLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeStaffPersonalLocalId_QNAME, String.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomNumber", scope = SessionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSessionInfoTypeRoomNumber(String value) {
        return new JAXBElement<String>(_SessionInfoTypeRoomNumber_QNAME, String.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SessionInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createSessionInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = SessionInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSessionInfoTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SessionInfoType.class)
    public JAXBElement<SIFMetadataType> createSessionInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = SessionInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSessionInfoTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RollMarked", scope = SessionInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSessionInfoTypeRollMarked(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SessionInfoTypeRollMarked_QNAME, AUCodeSetsYesOrNoCategoryType.class, SessionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = LanguageOfInstructionType.class)
    public JAXBElement<OtherCodeListType> createLanguageOfInstructionTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, LanguageOfInstructionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPTestletType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPTestletTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPTestletType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPTestletType.class)
    public JAXBElement<SIFMetadataType> createNAPTestletTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPTestletType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestRefId", scope = NAPTestletType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestletTypeNAPTestRefId(String value) {
        return new JAXBElement<String>(_NAPTestletTypeNAPTestRefId_QNAME, String.class, NAPTestletType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = StaffPersonalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffPersonalTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffMostRecentContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MostRecent", scope = StaffPersonalType.class)
    public JAXBElement<StaffMostRecentContainerType> createStaffPersonalTypeMostRecent(StaffMostRecentContainerType value) {
        return new JAXBElement<StaffMostRecentContainerType>(_StaffPersonalTypeMostRecent_QNAME, StaffMostRecentContainerType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherIdList", scope = StaffPersonalType.class)
    public JAXBElement<OtherIdListType> createStaffPersonalTypeOtherIdList(OtherIdListType value) {
        return new JAXBElement<OtherIdListType>(_StaffPersonalTypeOtherIdList_QNAME, OtherIdListType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StaffPersonalType.class)
    public JAXBElement<SIFExtendedElementsType> createStaffPersonalTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StaffPersonalType.class)
    public JAXBElement<SIFMetadataType> createStaffPersonalTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Title", scope = StaffPersonalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffPersonalTypeTitle(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeTitle_QNAME, String.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmploymentStatus", scope = StaffPersonalType.class)
    public JAXBElement<AUCodeSetsStaffStatusType> createStaffPersonalTypeEmploymentStatus(AUCodeSetsStaffStatusType value) {
        return new JAXBElement<AUCodeSetsStaffStatusType>(_StaffPersonalTypeEmploymentStatus_QNAME, AUCodeSetsStaffStatusType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ElectronicIdList", scope = StaffPersonalType.class)
    public JAXBElement<ElectronicIdListType> createStaffPersonalTypeElectronicIdList(ElectronicIdListType value) {
        return new JAXBElement<ElectronicIdListType>(_StaffPersonalTypeElectronicIdList_QNAME, ElectronicIdListType.class, StaffPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Strategies", scope = ComponentType.class)
    public JAXBElement<StrategiesType> createComponentTypeStrategies(StrategiesType value) {
        return new JAXBElement<StrategiesType>(_ComponentTypeStrategies_QNAME, StrategiesType.class, ComponentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = ComponentType.class)
    public JAXBElement<String> createComponentTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, ComponentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedObjectsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssociatedObjects", scope = ComponentType.class)
    public JAXBElement<AssociatedObjectsType> createComponentTypeAssociatedObjects(AssociatedObjectsType value) {
        return new JAXBElement<AssociatedObjectsType>(_ComponentTypeAssociatedObjects_QNAME, AssociatedObjectsType.class, ComponentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApprovedDate", scope = JournalType.class)
    public JAXBElement<XMLGregorianCalendar> createJournalTypeApprovedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JournalTypeApprovedDate_QNAME, XMLGregorianCalendar.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GSTCodeReplacement", scope = JournalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createJournalTypeGSTCodeReplacement(String value) {
        return new JAXBElement<String>(_JournalTypeGSTCodeReplacement_QNAME, String.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Note", scope = JournalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createJournalTypeNote(String value) {
        return new JAXBElement<String>(_JournalTypeNote_QNAME, String.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApprovedBy", scope = JournalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createJournalTypeApprovedBy(String value) {
        return new JAXBElement<String>(_InvoiceTypeApprovedBy_QNAME, String.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalType.OriginatingTransactionRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OriginatingTransactionRefId", scope = JournalType.class)
    public JAXBElement<JournalType.OriginatingTransactionRefId> createJournalTypeOriginatingTransactionRefId(JournalType.OriginatingTransactionRefId value) {
        return new JAXBElement<JournalType.OriginatingTransactionRefId>(_JournalTypeOriginatingTransactionRefId_QNAME, JournalType.OriginatingTransactionRefId.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GSTCodeOriginal", scope = JournalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createJournalTypeGSTCodeOriginal(String value) {
        return new JAXBElement<String>(_JournalTypeGSTCodeOriginal_QNAME, String.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CreatedBy", scope = JournalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createJournalTypeCreatedBy(String value) {
        return new JAXBElement<String>(_InvoiceTypeCreatedBy_QNAME, String.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = JournalType.class)
    public JAXBElement<SIFExtendedElementsType> createJournalTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = JournalType.class)
    public JAXBElement<SIFMetadataType> createJournalTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CreatedDate", scope = JournalType.class)
    public JAXBElement<XMLGregorianCalendar> createJournalTypeCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JournalTypeCreatedDate_QNAME, XMLGregorianCalendar.class, JournalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGCollection", scope = AGStatusReportType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGStatusReportTypeAGCollection(String value) {
        return new JAXBElement<String>(_AGStatusReportTypeAGCollection_QNAME, String.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingAuthoritySystem", scope = AGStatusReportType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGStatusReportTypeReportingAuthoritySystem(String value) {
        return new JAXBElement<String>(_AGStatusReportTypeReportingAuthoritySystem_QNAME, String.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubmissionTimestamp", scope = AGStatusReportType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createAGStatusReportTypeSubmissionTimestamp(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_AGStatusReportTypeSubmissionTimestamp_QNAME, java.util.Calendar.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = AGStatusReportType.class)
    public JAXBElement<SIFExtendedElementsType> createAGStatusReportTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = AGStatusReportType.class)
    public JAXBElement<SIFMetadataType> createAGStatusReportTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubmittedBy", scope = AGStatusReportType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGStatusReportTypeSubmittedBy(String value) {
        return new JAXBElement<String>(_AGStatusReportTypeSubmittedBy_QNAME, String.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGReportingObjectResponseListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGReportingObjectResponseList", scope = AGStatusReportType.class)
    public JAXBElement<AGReportingObjectResponseListType> createAGStatusReportTypeAGReportingObjectResponseList(AGReportingObjectResponseListType value) {
        return new JAXBElement<AGReportingObjectResponseListType>(_AGStatusReportTypeAGReportingObjectResponseList_QNAME, AGReportingObjectResponseListType.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingAuthorityCommonwealthId", scope = AGStatusReportType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGStatusReportTypeReportingAuthorityCommonwealthId(String value) {
        return new JAXBElement<String>(_AGStatusReportTypeReportingAuthorityCommonwealthId_QNAME, String.class, AGStatusReportType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainNationalAverage", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<BigDecimal> createNAPTestScoreSummaryTypeDomainNationalAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestScoreSummaryTypeDomainNationalAverage_QNAME, BigDecimal.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainTopNational60Percent", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<BigDecimal> createNAPTestScoreSummaryTypeDomainTopNational60Percent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestScoreSummaryTypeDomainTopNational60Percent_QNAME, BigDecimal.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainJurisdictionAverage", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<BigDecimal> createNAPTestScoreSummaryTypeDomainJurisdictionAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestScoreSummaryTypeDomainJurisdictionAverage_QNAME, BigDecimal.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = NAPTestScoreSummaryType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestScoreSummaryTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainSchoolAverage", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<BigDecimal> createNAPTestScoreSummaryTypeDomainSchoolAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestScoreSummaryTypeDomainSchoolAverage_QNAME, BigDecimal.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPTestScoreSummaryTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainBottomNational60Percent", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<BigDecimal> createNAPTestScoreSummaryTypeDomainBottomNational60Percent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestScoreSummaryTypeDomainBottomNational60Percent_QNAME, BigDecimal.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPTestScoreSummaryType.class)
    public JAXBElement<SIFMetadataType> createNAPTestScoreSummaryTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestRefId", scope = NAPTestScoreSummaryType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestScoreSummaryTypeNAPTestRefId(String value) {
        return new JAXBElement<String>(_NAPTestletTypeNAPTestRefId_QNAME, String.class, NAPTestScoreSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HomeGroup", scope = StaffMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffMostRecentContainerTypeHomeGroup(String value) {
        return new JAXBElement<String>(_StaffMostRecentContainerTypeHomeGroup_QNAME, String.class, StaffMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = StaffMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffMostRecentContainerTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, StaffMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPLANClassListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPLANClassList", scope = StaffMostRecentContainerType.class)
    public JAXBElement<NAPLANClassListType> createStaffMostRecentContainerTypeNAPLANClassList(NAPLANClassListType value) {
        return new JAXBElement<NAPLANClassListType>(_StaffMostRecentContainerTypeNAPLANClassList_QNAME, NAPLANClassListType.class, StaffMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolACARAId", scope = StaffMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffMostRecentContainerTypeSchoolACARAId(String value) {
        return new JAXBElement<String>(_StaffMostRecentContainerTypeSchoolACARAId_QNAME, String.class, StaffMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalCampusId", scope = StaffMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffMostRecentContainerTypeLocalCampusId(String value) {
        return new JAXBElement<String>(_StaffMostRecentContainerTypeLocalCampusId_QNAME, String.class, StaffMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SystemRoleType.class)
    public JAXBElement<SIFExtendedElementsType> createSystemRoleTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SystemRoleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SystemRoleType.class)
    public JAXBElement<SIFMetadataType> createSystemRoleTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SystemRoleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = EvaluationType.class)
    public JAXBElement<String> createEvaluationTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, EvaluationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Name", scope = EvaluationType.class)
    public JAXBElement<NameType> createEvaluationTypeName(NameType value) {
        return new JAXBElement<NameType>(_EvaluationTypeName_QNAME, NameType.class, EvaluationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Date", scope = EvaluationType.class)
    public JAXBElement<XMLGregorianCalendar> createEvaluationTypeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvaluationTypeDate_QNAME, XMLGregorianCalendar.class, EvaluationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Adjustment", scope = NAPEventStudentLinkType.class)
    public JAXBElement<AdjustmentContainerType> createNAPEventStudentLinkTypeAdjustment(AdjustmentContainerType value) {
        return new JAXBElement<AdjustmentContainerType>(_NAPEventStudentLinkTypeAdjustment_QNAME, AdjustmentContainerType.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Device", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeDevice(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeDevice_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPEventStudentLinkType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPEventStudentLinkTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalDetailsChanged", scope = NAPEventStudentLinkType.class)
    public JAXBElement<Boolean> createNAPEventStudentLinkTypePersonalDetailsChanged(Boolean value) {
        return new JAXBElement<Boolean>(_NAPEventStudentLinkTypePersonalDetailsChanged_QNAME, Boolean.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPEventStudentLinkType.class)
    public JAXBElement<SIFMetadataType> createNAPEventStudentLinkTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "System", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeSystem(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeSystem_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Date", scope = NAPEventStudentLinkType.class)
    public JAXBElement<XMLGregorianCalendar> createNAPEventStudentLinkTypeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvaluationTypeDate_QNAME, XMLGregorianCalendar.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = NAPEventStudentLinkType.class)
    public JAXBElement<XMLGregorianCalendar> createNAPEventStudentLinkTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DOBRange", scope = NAPEventStudentLinkType.class)
    public JAXBElement<Boolean> createNAPEventStudentLinkTypeDOBRange(Boolean value) {
        return new JAXBElement<Boolean>(_NAPEventStudentLinkTypeDOBRange_QNAME, Boolean.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PossibleDuplicate", scope = NAPEventStudentLinkType.class)
    public JAXBElement<Boolean> createNAPEventStudentLinkTypePossibleDuplicate(Boolean value) {
        return new JAXBElement<Boolean>(_NAPEventStudentLinkTypePossibleDuplicate_QNAME, Boolean.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestDisruptionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestDisruptionList", scope = NAPEventStudentLinkType.class)
    public JAXBElement<TestDisruptionListType> createNAPEventStudentLinkTypeTestDisruptionList(TestDisruptionListType value) {
        return new JAXBElement<TestDisruptionListType>(_NAPEventStudentLinkTypeTestDisruptionList_QNAME, TestDisruptionListType.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPJurisdiction", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeNAPJurisdiction(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeNAPJurisdiction_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExemptionReason", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeExemptionReason(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeExemptionReason_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolGeolocation", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeSchoolGeolocation(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeSchoolGeolocation_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingSchoolName", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeReportingSchoolName(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeReportingSchoolName_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefId", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeStudentPersonalRefId(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeStudentPersonalRefId_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestRefId", scope = NAPEventStudentLinkType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPEventStudentLinkTypeNAPTestRefId(String value) {
        return new JAXBElement<String>(_NAPTestletTypeNAPTestRefId_QNAME, String.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link javax.xml.datatype.Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LapsedTimeTest", scope = NAPEventStudentLinkType.class)
    public JAXBElement<javax.xml.datatype.Duration> createNAPEventStudentLinkTypeLapsedTimeTest(javax.xml.datatype.Duration value) {
        return new JAXBElement<javax.xml.datatype.Duration>(_NAPEventStudentLinkTypeLapsedTimeTest_QNAME, javax.xml.datatype.Duration.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PSIOtherIdMatch", scope = NAPEventStudentLinkType.class)
    public JAXBElement<Boolean> createNAPEventStudentLinkTypePSIOtherIdMatch(Boolean value) {
        return new JAXBElement<Boolean>(_NAPEventStudentLinkTypePSIOtherIdMatch_QNAME, Boolean.class, NAPEventStudentLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDateTime", scope = TimeElementType.SpanGaps.SpanGap.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createTimeElementTypeSpanGapsSpanGapEndDateTime(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_TimeElementTypeSpanGapsSpanGapEndDateTime_QNAME, java.util.Calendar.class, TimeElementType.SpanGaps.SpanGap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDateTime", scope = TimeElementType.SpanGaps.SpanGap.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createTimeElementTypeSpanGapsSpanGapStartDateTime(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_TimeElementTypeSpanGapsSpanGapStartDateTime_QNAME, java.util.Calendar.class, TimeElementType.SpanGaps.SpanGap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HouseholdContactId", scope = HouseholdContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHouseholdContactInfoTypeHouseholdContactId(String value) {
        return new JAXBElement<String>(_HouseholdContactInfoTypeHouseholdContactId_QNAME, String.class, HouseholdContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = HouseholdContactInfoType.class)
    public JAXBElement<PhoneNumberListType> createHouseholdContactInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, HouseholdContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = HouseholdContactInfoType.class)
    public JAXBElement<AddressListType> createHouseholdContactInfoTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, HouseholdContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmailList", scope = HouseholdContactInfoType.class)
    public JAXBElement<EmailListType> createHouseholdContactInfoTypeEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_HouseholdContactInfoTypeEmailList_QNAME, EmailListType.class, HouseholdContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HouseholdSalutation", scope = HouseholdContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHouseholdContactInfoTypeHouseholdSalutation(String value) {
        return new JAXBElement<String>(_HouseholdContactInfoTypeHouseholdSalutation_QNAME, String.class, HouseholdContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDate", scope = ActivityTimeType.class)
    public JAXBElement<XMLGregorianCalendar> createActivityTimeTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTimeTypeStartDate_QNAME, XMLGregorianCalendar.class, ActivityTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinishDate", scope = ActivityTimeType.class)
    public JAXBElement<XMLGregorianCalendar> createActivityTimeTypeFinishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTimeTypeFinishDate_QNAME, XMLGregorianCalendar.class, ActivityTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DueDate", scope = ActivityTimeType.class)
    public JAXBElement<XMLGregorianCalendar> createActivityTimeTypeDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceTypeDueDate_QNAME, XMLGregorianCalendar.class, ActivityTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityTimeType.Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Duration", scope = ActivityTimeType.class)
    public JAXBElement<ActivityTimeType.Duration> createActivityTimeTypeDuration(ActivityTimeType.Duration value) {
        return new JAXBElement<ActivityTimeType.Duration>(_ActivityTimeTypeDuration_QNAME, ActivityTimeType.Duration.class, ActivityTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FQReportComments", scope = FinancialQuestionnaireSubmissionType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFinancialQuestionnaireSubmissionTypeFQReportComments(String value) {
        return new JAXBElement<String>(_FinancialQuestionnaireSubmissionTypeFQReportComments_QNAME, String.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SystemSubmission", scope = FinancialQuestionnaireSubmissionType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createFinancialQuestionnaireSubmissionTypeSystemSubmission(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_FinancialQuestionnaireSubmissionTypeSystemSubmission_QNAME, AUCodeSetsYesOrNoCategoryType.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQReportingListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FQReportingList", scope = FinancialQuestionnaireSubmissionType.class)
    public JAXBElement<FQReportingListType> createFinancialQuestionnaireSubmissionTypeFQReportingList(FQReportingListType value) {
        return new JAXBElement<FQReportingListType>(_FinancialQuestionnaireSubmissionTypeFQReportingList_QNAME, FQReportingListType.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingAuthoritySystem", scope = FinancialQuestionnaireSubmissionType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFinancialQuestionnaireSubmissionTypeReportingAuthoritySystem(String value) {
        return new JAXBElement<String>(_AGStatusReportTypeReportingAuthoritySystem_QNAME, String.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = FinancialQuestionnaireSubmissionType.class)
    public JAXBElement<SIFExtendedElementsType> createFinancialQuestionnaireSubmissionTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingAuthority", scope = FinancialQuestionnaireSubmissionType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFinancialQuestionnaireSubmissionTypeReportingAuthority(String value) {
        return new JAXBElement<String>(_FinancialQuestionnaireSubmissionTypeReportingAuthority_QNAME, String.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = FinancialQuestionnaireSubmissionType.class)
    public JAXBElement<SIFMetadataType> createFinancialQuestionnaireSubmissionTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, FinancialQuestionnaireSubmissionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherSchoolLocalId", scope = StudentSubjectChoiceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSubjectChoiceTypeOtherSchoolLocalId(String value) {
        return new JAXBElement<String>(_StudentSubjectChoiceTypeOtherSchoolLocalId_QNAME, String.class, StudentSubjectChoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreferenceNumber", scope = StudentSubjectChoiceType.class)
    public JAXBElement<Long> createStudentSubjectChoiceTypePreferenceNumber(Long value) {
        return new JAXBElement<Long>(_StudentSubjectChoiceTypePreferenceNumber_QNAME, Long.class, StudentSubjectChoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudyDescription", scope = StudentSubjectChoiceType.class)
    public JAXBElement<SubjectAreaType> createStudentSubjectChoiceTypeStudyDescription(SubjectAreaType value) {
        return new JAXBElement<SubjectAreaType>(_StudentSubjectChoiceTypeStudyDescription_QNAME, SubjectAreaType.class, StudentSubjectChoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Preference", scope = PhoneNumberType.class)
    public JAXBElement<Long> createPhoneNumberTypePreference(Long value) {
        return new JAXBElement<Long>(_PhoneNumberTypePreference_QNAME, Long.class, PhoneNumberType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Extension", scope = PhoneNumberType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPhoneNumberTypeExtension(String value) {
        return new JAXBElement<String>(_PhoneNumberTypeExtension_QNAME, String.class, PhoneNumberType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ListedStatus", scope = PhoneNumberType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createPhoneNumberTypeListedStatus(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_PhoneNumberTypeListedStatus_QNAME, AUCodeSetsYesOrNoCategoryType.class, PhoneNumberType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfoRefId", scope = FinancialAccountType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFinancialAccountTypeChargedLocationInfoRefId(String value) {
        return new JAXBElement<String>(_InvoiceTypeChargedLocationInfoRefId_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = FinancialAccountType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFinancialAccountTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = FinancialAccountType.class)
    public JAXBElement<SIFExtendedElementsType> createFinancialAccountTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = FinancialAccountType.class)
    public JAXBElement<SIFMetadataType> createFinancialAccountTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParentAccountRefId", scope = FinancialAccountType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFinancialAccountTypeParentAccountRefId(String value) {
        return new JAXBElement<String>(_FinancialAccountTypeParentAccountRefId_QNAME, String.class, FinancialAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentGradeMarkersListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Markers", scope = StudentGradeType.class)
    public JAXBElement<StudentGradeMarkersListType> createStudentGradeTypeMarkers(StudentGradeMarkersListType value) {
        return new JAXBElement<StudentGradeMarkersListType>(_StudentGradeTypeMarkers_QNAME, StudentGradeMarkersListType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Homegroup", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeHomegroup(String value) {
        return new JAXBElement<String>(_StudentGradeTypeHomegroup_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevel", scope = StudentGradeType.class)
    public JAXBElement<YearLevelType> createStudentGradeTypeYearLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentGradeTypeYearLevel_QNAME, YearLevelType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardList", scope = StudentGradeType.class)
    public JAXBElement<LearningStandardListType> createStudentGradeTypeLearningStandardList(LearningStandardListType value) {
        return new JAXBElement<LearningStandardListType>(_StudentGradeTypeLearningStandardList_QNAME, LearningStandardListType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentGradeType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentGradeTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentGradeType.class)
    public JAXBElement<SIFMetadataType> createStudentGradeTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupRefId", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeTeachingGroupRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeachingGroupRefId_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Grade", scope = StudentGradeType.class)
    public JAXBElement<GradeType> createStudentGradeTypeGrade(GradeType value) {
        return new JAXBElement<GradeType>(_StudentGradeTypeGrade_QNAME, GradeType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherJudgement", scope = StudentGradeType.class)
    public JAXBElement<String> createStudentGradeTypeTeacherJudgement(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeacherJudgement_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACStrandSubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningArea", scope = StudentGradeType.class)
    public JAXBElement<ACStrandSubjectAreaType> createStudentGradeTypeLearningArea(ACStrandSubjectAreaType value) {
        return new JAXBElement<ACStrandSubjectAreaType>(_StudentGradeTypeLearningArea_QNAME, ACStrandSubjectAreaType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradingScoreListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingScoreList", scope = StudentGradeType.class)
    public JAXBElement<GradingScoreListType> createStudentGradeTypeGradingScoreList(GradingScoreListType value) {
        return new JAXBElement<GradingScoreListType>(_StudentGradeTypeGradingScoreList_QNAME, GradingScoreListType.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupShortName", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeTeachingGroupShortName(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeachingGroupShortName_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfoRefId", scope = StudentGradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentGradeTypeTermInfoRefId(String value) {
        return new JAXBElement<String>(_SectionInfoTypeTermInfoRefId_QNAME, String.class, StudentGradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PromotionStatus", scope = PromotionInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPromotionInfoTypePromotionStatus(String value) {
        return new JAXBElement<String>(_PromotionInfoTypePromotionStatus_QNAME, String.class, PromotionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Authors", scope = LearningStandardDocumentType.class)
    public JAXBElement<AuthorsType> createLearningStandardDocumentTypeAuthors(AuthorsType value) {
        return new JAXBElement<AuthorsType>(_LearningStandardDocumentTypeAuthors_QNAME, AuthorsType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = LearningStandardDocumentType.class)
    public JAXBElement<String> createLearningStandardDocumentTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RepositoryDate", scope = LearningStandardDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardDocumentTypeRepositoryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardDocumentTypeRepositoryDate_QNAME, XMLGregorianCalendar.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = LearningStandardDocumentType.class)
    public JAXBElement<SIFExtendedElementsType> createLearningStandardDocumentTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = LearningStandardDocumentType.class)
    public JAXBElement<SIFMetadataType> createLearningStandardDocumentTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalAdoptionDate", scope = LearningStandardDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardDocumentTypeLocalAdoptionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardDocumentTypeLocalAdoptionDate_QNAME, XMLGregorianCalendar.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractContentElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RichDescription", scope = LearningStandardDocumentType.class)
    public JAXBElement<AbstractContentElementType> createLearningStandardDocumentTypeRichDescription(AbstractContentElementType value) {
        return new JAXBElement<AbstractContentElementType>(_LearningStandardDocumentTypeRichDescription_QNAME, AbstractContentElementType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OrganizationContactPoint", scope = LearningStandardDocumentType.class)
    public JAXBElement<String> createLearningStandardDocumentTypeOrganizationContactPoint(String value) {
        return new JAXBElement<String>(_LearningStandardDocumentTypeOrganizationContactPoint_QNAME, String.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyRightContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Copyright", scope = LearningStandardDocumentType.class)
    public JAXBElement<CopyRightContainerType> createLearningStandardDocumentTypeCopyright(CopyRightContainerType value) {
        return new JAXBElement<CopyRightContainerType>(_LearningStandardDocumentTypeCopyright_QNAME, CopyRightContainerType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndOfLifeDate", scope = LearningStandardDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardDocumentTypeEndOfLifeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardDocumentTypeEndOfLifeDate_QNAME, XMLGregorianCalendar.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentDate", scope = LearningStandardDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardDocumentTypeDocumentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardDocumentTypeDocumentDate_QNAME, XMLGregorianCalendar.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardsDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RelatedLearningStandards", scope = LearningStandardDocumentType.class)
    public JAXBElement<LearningStandardsDocumentType> createLearningStandardDocumentTypeRelatedLearningStandards(LearningStandardsDocumentType value) {
        return new JAXBElement<LearningStandardsDocumentType>(_LearningStandardDocumentTypeRelatedLearningStandards_QNAME, LearningStandardsDocumentType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalArchiveDate", scope = LearningStandardDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningStandardDocumentTypeLocalArchiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningStandardDocumentTypeLocalArchiveDate_QNAME, XMLGregorianCalendar.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = LearningStandardDocumentType.class)
    public JAXBElement<YearLevelsType> createLearningStandardDocumentTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, LearningStandardDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DisciplinaryContact", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeDisciplinaryContact(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeDisciplinaryContact_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HasCustody", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeHasCustody(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeHasCustody_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmergencyContact", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeEmergencyContact(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeEmergencyContact_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LivesWith", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeLivesWith(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeLivesWith_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReceivesAssessmentReport", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeReceivesAssessmentReport(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeReceivesAssessmentReport_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccessToRecords", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeAccessToRecords(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeAccessToRecords_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PrimaryCareProvider", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypePrimaryCareProvider(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypePrimaryCareProvider_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PickupRights", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypePickupRights(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypePickupRights_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FeesAccess", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeFeesAccess(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeFeesAccess_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InterventionOrder", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeInterventionOrder(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeInterventionOrder_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FamilyMail", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeFamilyMail(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeFamilyMail_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceContact", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeAttendanceContact(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeAttendanceContact_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParentLegalGuardian", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeParentLegalGuardian(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeParentLegalGuardian_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FeesBilling", scope = ContactFlagsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createContactFlagsTypeFeesBilling(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_ContactFlagsTypeFeesBilling_QNAME, AUCodeSetsYesOrNoCategoryType.class, ContactFlagsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccountingPeriod", scope = ExpenseAccountType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createExpenseAccountTypeAccountingPeriod(String value) {
        return new JAXBElement<String>(_InvoiceTypeAccountingPeriod_QNAME, String.class, ExpenseAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialAccountRefId", scope = ExpenseAccountType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExpenseAccountTypeFinancialAccountRefId(String value) {
        return new JAXBElement<String>(_ExpenseAccountTypeFinancialAccountRefId_QNAME, String.class, ExpenseAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestletRefId", scope = NAPTestletCodeFrameType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestletCodeFrameTypeNAPTestletRefId(String value) {
        return new JAXBElement<String>(_NAPTestletCodeFrameTypeNAPTestletRefId_QNAME, String.class, NAPTestletCodeFrameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = StudentEntryContainerType.class)
    public JAXBElement<OtherCodeListType> createStudentEntryContainerTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, StudentEntryContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FamilyName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeFamilyName(String value) {
        return new JAXBElement<String>(_BaseNameTypeFamilyName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FullName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeFullName(String value) {
        return new JAXBElement<String>(_BaseNameTypeFullName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreferredGivenName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypePreferredGivenName(String value) {
        return new JAXBElement<String>(_BaseNameTypePreferredGivenName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Suffix", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeSuffix(String value) {
        return new JAXBElement<String>(_BaseNameTypeSuffix_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MiddleName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeMiddleName(String value) {
        return new JAXBElement<String>(_BaseNameTypeMiddleName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreferredFamilyName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypePreferredFamilyName(String value) {
        return new JAXBElement<String>(_BaseNameTypePreferredFamilyName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreferredFamilyNameFirst", scope = BaseNameType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createBaseNameTypePreferredFamilyNameFirst(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_BaseNameTypePreferredFamilyNameFirst_QNAME, AUCodeSetsYesOrNoCategoryType.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Title", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeTitle(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeTitle_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GivenName", scope = BaseNameType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBaseNameTypeGivenName(String value) {
        return new JAXBElement<String>(_BaseNameTypeGivenName_QNAME, String.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FamilyNameFirst", scope = BaseNameType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createBaseNameTypeFamilyNameFirst(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_BaseNameTypeFamilyNameFirst_QNAME, AUCodeSetsYesOrNoCategoryType.class, BaseNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HTTPStatusCode", scope = AGReportingObjectResponseType.class)
    public JAXBElement<String> createAGReportingObjectResponseTypeHTTPStatusCode(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeHTTPStatusCode_QNAME, String.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EntityName", scope = AGReportingObjectResponseType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGReportingObjectResponseTypeEntityName(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeEntityName_QNAME, String.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubmittedRefId", scope = AGReportingObjectResponseType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAGReportingObjectResponseTypeSubmittedRefId(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeSubmittedRefId_QNAME, String.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIFRefId", scope = AGReportingObjectResponseType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAGReportingObjectResponseTypeSIFRefId(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeSIFRefId_QNAME, String.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ErrorText", scope = AGReportingObjectResponseType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGReportingObjectResponseTypeErrorText(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeErrorText_QNAME, String.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleList", scope = AGReportingObjectResponseType.class)
    public JAXBElement<AGRuleListType> createAGReportingObjectResponseTypeAGRuleList(AGRuleListType value) {
        return new JAXBElement<AGRuleListType>(_AGReportingObjectResponseTypeAGRuleList_QNAME, AGRuleListType.class, AGReportingObjectResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = LEAInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLEAInfoTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EducationAgencyType", scope = LEAInfoType.class)
    public JAXBElement<AgencyType> createLEAInfoTypeEducationAgencyType(AgencyType value) {
        return new JAXBElement<AgencyType>(_LEAInfoTypeEducationAgencyType_QNAME, AgencyType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CommonwealthId", scope = LEAInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLEAInfoTypeCommonwealthId(String value) {
        return new JAXBElement<String>(_LEAInfoTypeCommonwealthId_QNAME, String.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = LEAInfoType.class)
    public JAXBElement<PhoneNumberListType> createLEAInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = LEAInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createLEAInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LEAURL", scope = LEAInfoType.class)
    public JAXBElement<String> createLEAInfoTypeLEAURL(String value) {
        return new JAXBElement<String>(_LEAInfoTypeLEAURL_QNAME, String.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = LEAInfoType.class)
    public JAXBElement<AddressListType> createLEAInfoTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsOperationalStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OperationalStatus", scope = LEAInfoType.class)
    public JAXBElement<AUCodeSetsOperationalStatusType> createLEAInfoTypeOperationalStatus(AUCodeSetsOperationalStatusType value) {
        return new JAXBElement<AUCodeSetsOperationalStatusType>(_LEAInfoTypeOperationalStatus_QNAME, AUCodeSetsOperationalStatusType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEAContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LEAContactList", scope = LEAInfoType.class)
    public JAXBElement<LEAContactListType> createLEAInfoTypeLEAContactList(LEAContactListType value) {
        return new JAXBElement<LEAContactListType>(_LEAInfoTypeLEAContactList_QNAME, LEAContactListType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = LEAInfoType.class)
    public JAXBElement<SIFMetadataType> createLEAInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SLA", scope = LEAInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLEAInfoTypeSLA(String value) {
        return new JAXBElement<String>(_LEAInfoTypeSLA_QNAME, String.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JurisdictionLowerHouse", scope = LEAInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLEAInfoTypeJurisdictionLowerHouse(String value) {
        return new JAXBElement<String>(_LEAInfoTypeJurisdictionLowerHouse_QNAME, String.class, LEAInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Descriptor", scope = NAPWritingRubricType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPWritingRubricTypeDescriptor(String value) {
        return new JAXBElement<String>(_NAPWritingRubricTypeDescriptor_QNAME, String.class, NAPWritingRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JobFunction", scope = StaffAssignmentType.class)
    public JAXBElement<String> createStaffAssignmentTypeJobFunction(String value) {
        return new JAXBElement<String>(_StaffAssignmentTypeJobFunction_QNAME, String.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffSubjectListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffSubjectList", scope = StaffAssignmentType.class)
    public JAXBElement<StaffSubjectListType> createStaffAssignmentTypeStaffSubjectList(StaffSubjectListType value) {
        return new JAXBElement<StaffSubjectListType>(_StaffAssignmentTypeStaffSubjectList_QNAME, StaffSubjectListType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffActivityExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffActivity", scope = StaffAssignmentType.class)
    public JAXBElement<StaffActivityExtensionType> createStaffAssignmentTypeStaffActivity(StaffActivityExtensionType value) {
        return new JAXBElement<StaffActivityExtensionType>(_StaffAssignmentTypeStaffActivity_QNAME, StaffActivityExtensionType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = StaffAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffAssignmentTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Homegroup", scope = StaffAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffAssignmentTypeHomegroup(String value) {
        return new JAXBElement<String>(_StudentGradeTypeHomegroup_QNAME, String.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreviousSchoolName", scope = StaffAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffAssignmentTypePreviousSchoolName(String value) {
        return new JAXBElement<String>(_StaffAssignmentTypePreviousSchoolName_QNAME, String.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StaffAssignmentType.class)
    public JAXBElement<SIFExtendedElementsType> createStaffAssignmentTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StaffAssignmentType.class)
    public JAXBElement<SIFMetadataType> createStaffAssignmentTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmploymentStatus", scope = StaffAssignmentType.class)
    public JAXBElement<AUCodeSetsStaffStatusType> createStaffAssignmentTypeEmploymentStatus(AUCodeSetsStaffStatusType value) {
        return new JAXBElement<AUCodeSetsStaffStatusType>(_StaffPersonalTypeEmploymentStatus_QNAME, AUCodeSetsStaffStatusType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = StaffAssignmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStaffAssignmentTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JobFTE", scope = StaffAssignmentType.class)
    public JAXBElement<BigDecimal> createStaffAssignmentTypeJobFTE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StaffAssignmentTypeJobFTE_QNAME, BigDecimal.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "House", scope = StaffAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffAssignmentTypeHouse(String value) {
        return new JAXBElement<String>(_StaffAssignmentTypeHouse_QNAME, String.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarSummaryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarSummaryList", scope = StaffAssignmentType.class)
    public JAXBElement<CalendarSummaryListType> createStaffAssignmentTypeCalendarSummaryList(CalendarSummaryListType value) {
        return new JAXBElement<CalendarSummaryListType>(_StaffAssignmentTypeCalendarSummaryList_QNAME, CalendarSummaryListType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CasualReliefTeacher", scope = StaffAssignmentType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStaffAssignmentTypeCasualReliefTeacher(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StaffAssignmentTypeCasualReliefTeacher_QNAME, AUCodeSetsYesOrNoCategoryType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JobStartDate", scope = StaffAssignmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStaffAssignmentTypeJobStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StaffAssignmentTypeJobStartDate_QNAME, XMLGregorianCalendar.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JobEndDate", scope = StaffAssignmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStaffAssignmentTypeJobEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StaffAssignmentTypeJobEndDate_QNAME, XMLGregorianCalendar.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = StaffAssignmentType.class)
    public JAXBElement<YearLevelsType> createStaffAssignmentTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, StaffAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoleScopeName", scope = SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeName(String value) {
        return new JAXBElement<String>(_SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeName_QNAME, String.class, SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoleScopeRefId", scope = SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.class)
    public JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId> createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeRefId(SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId value) {
        return new JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId>(_SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeListRoleScopeRoleScopeRefId_QNAME, SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.RoleScopeRefId.class, SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.RoleScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Level5", scope = LearningStandardItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLearningStandardItemTypeLevel5(String value) {
        return new JAXBElement<String>(_LearningStandardItemTypeLevel5_QNAME, String.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Level4", scope = LearningStandardItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLearningStandardItemTypeLevel4(String value) {
        return new JAXBElement<String>(_LearningStandardItemTypeLevel4_QNAME, String.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PredecessorItems", scope = LearningStandardItemType.class)
    public JAXBElement<LearningStandardsType> createLearningStandardItemTypePredecessorItems(LearningStandardsType value) {
        return new JAXBElement<LearningStandardsType>(_LearningStandardItemTypePredecessorItems_QNAME, LearningStandardsType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StandardIdentifier", scope = LearningStandardItemType.class)
    public JAXBElement<StandardIdentifierType> createLearningStandardItemTypeStandardIdentifier(StandardIdentifierType value) {
        return new JAXBElement<StandardIdentifierType>(_LearningStandardItemTypeStandardIdentifier_QNAME, StandardIdentifierType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardsSettingBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StandardSettingBody", scope = LearningStandardItemType.class)
    public JAXBElement<StandardsSettingBodyType> createLearningStandardItemTypeStandardSettingBody(StandardsSettingBodyType value) {
        return new JAXBElement<StandardsSettingBodyType>(_LearningStandardItemTypeStandardSettingBody_QNAME, StandardsSettingBodyType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = LearningStandardItemType.class)
    public JAXBElement<SIFExtendedElementsType> createLearningStandardItemTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = LearningStandardItemType.class)
    public JAXBElement<SIFMetadataType> createLearningStandardItemTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementCodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StatementCodes", scope = LearningStandardItemType.class)
    public JAXBElement<StatementCodesType> createLearningStandardItemTypeStatementCodes(StatementCodesType value) {
        return new JAXBElement<StatementCodesType>(_LearningStandardItemTypeStatementCodes_QNAME, StatementCodesType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACStrandSubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ACStrandSubjectArea", scope = LearningStandardItemType.class)
    public JAXBElement<ACStrandSubjectAreaType> createLearningStandardItemTypeACStrandSubjectArea(ACStrandSubjectAreaType value) {
        return new JAXBElement<ACStrandSubjectAreaType>(_LearningStandardItemTypeACStrandSubjectArea_QNAME, ACStrandSubjectAreaType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LResourcesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Resources", scope = LearningStandardItemType.class)
    public JAXBElement<LResourcesType> createLearningStandardItemTypeResources(LResourcesType value) {
        return new JAXBElement<LResourcesType>(_LearningStandardItemTypeResources_QNAME, LResourcesType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Statements", scope = LearningStandardItemType.class)
    public JAXBElement<StatementsType> createLearningStandardItemTypeStatements(StatementsType value) {
        return new JAXBElement<StatementsType>(_LearningStandardItemTypeStatements_QNAME, StatementsType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedLearningStandardItemRefIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RelatedLearningStandardItems", scope = LearningStandardItemType.class)
    public JAXBElement<RelatedLearningStandardItemRefIdListType> createLearningStandardItemTypeRelatedLearningStandardItems(RelatedLearningStandardItemRefIdListType value) {
        return new JAXBElement<RelatedLearningStandardItemRefIdListType>(_LearningStandardItemTypeRelatedLearningStandardItems_QNAME, RelatedLearningStandardItemRefIdListType.class, LearningStandardItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPTestType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPTestTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPTestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPTestType.class)
    public JAXBElement<SIFMetadataType> createNAPTestTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPTestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = RelationshipType.class)
    public JAXBElement<OtherCodeListType> createRelationshipTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, RelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AdministrationInformation", scope = MedicationType.class)
    public JAXBElement<String> createMedicationTypeAdministrationInformation(String value) {
        return new JAXBElement<String>(_MedicationTypeAdministrationInformation_QNAME, String.class, MedicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Dosage", scope = MedicationType.class)
    public JAXBElement<String> createMedicationTypeDosage(String value) {
        return new JAXBElement<String>(_MedicationTypeDosage_QNAME, String.class, MedicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Frequency", scope = MedicationType.class)
    public JAXBElement<String> createMedicationTypeFrequency(String value) {
        return new JAXBElement<String>(_MedicationTypeFrequency_QNAME, String.class, MedicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MedicationName", scope = MedicationType.class)
    public JAXBElement<String> createMedicationTypeMedicationName(String value) {
        return new JAXBElement<String>(_MedicationTypeMedicationName_QNAME, String.class, MedicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Method", scope = MedicationType.class)
    public JAXBElement<String> createMedicationTypeMethod(String value) {
        return new JAXBElement<String>(_MedicationTypeMethod_QNAME, String.class, MedicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Semester", scope = TeachingGroupType.class)
    public JAXBElement<Long> createTeachingGroupTypeSemester(Long value) {
        return new JAXBElement<Long>(_TeachingGroupTypeSemester_QNAME, Long.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Set", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeSet(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeSet_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentList", scope = TeachingGroupType.class)
    public JAXBElement<StudentListType> createTeachingGroupTypeStudentList(StudentListType value) {
        return new JAXBElement<StudentListType>(_TeachingGroupTypeStudentList_QNAME, StudentListType.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeachingGroupPeriodListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupPeriodList", scope = TeachingGroupType.class)
    public JAXBElement<TeachingGroupPeriodListType> createTeachingGroupTypeTeachingGroupPeriodList(TeachingGroupPeriodListType value) {
        return new JAXBElement<TeachingGroupPeriodListType>(_TeachingGroupTypeTeachingGroupPeriodList_QNAME, TeachingGroupPeriodListType.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = TeachingGroupType.class)
    public JAXBElement<SIFExtendedElementsType> createTeachingGroupTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MinClassSize", scope = TeachingGroupType.class)
    public JAXBElement<BigInteger> createTeachingGroupTypeMinClassSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_TeachingGroupTypeMinClassSize_QNAME, BigInteger.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = TeachingGroupType.class)
    public JAXBElement<SIFMetadataType> createTeachingGroupTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseInfoRefId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeSchoolCourseInfoRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeSchoolCourseInfoRefId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LongName", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeLongName(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeLongName_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseLocalId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeSchoolCourseLocalId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeSchoolCourseLocalId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GroupType", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeGroupType(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeGroupType_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MaxClassSize", scope = TeachingGroupType.class)
    public JAXBElement<BigInteger> createTeachingGroupTypeMaxClassSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_TeachingGroupTypeMaxClassSize_QNAME, BigInteger.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeacherListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherList", scope = TeachingGroupType.class)
    public JAXBElement<TeacherListType> createTeachingGroupTypeTeacherList(TeacherListType value) {
        return new JAXBElement<TeacherListType>(_TeachingGroupTypeTeacherList_QNAME, TeacherListType.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectLocalId", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeTimeTableSubjectLocalId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectLocalId_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Block", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeBlock(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeBlock_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CurriculumLevel", scope = TeachingGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTypeCurriculumLevel(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeCurriculumLevel_QNAME, String.class, TeachingGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = DetentionContainerType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createDetentionContainerTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, DetentionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DetentionLocation", scope = DetentionContainerType.class)
    public JAXBElement<String> createDetentionContainerTypeDetentionLocation(String value) {
        return new JAXBElement<String>(_DetentionContainerTypeDetentionLocation_QNAME, String.class, DetentionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DetentionNotes", scope = DetentionContainerType.class)
    public JAXBElement<String> createDetentionContainerTypeDetentionNotes(String value) {
        return new JAXBElement<String>(_DetentionContainerTypeDetentionNotes_QNAME, String.class, DetentionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DetentionDate", scope = DetentionContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createDetentionContainerTypeDetentionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetentionContainerTypeDetentionDate_QNAME, XMLGregorianCalendar.class, DetentionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = StudentActivityType.class)
    public JAXBElement<OtherCodeListType> createStudentActivityTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, StudentActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentInfoType.SIFRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_RefId", scope = EquipmentInfoType.class)
    public JAXBElement<EquipmentInfoType.SIFRefId> createEquipmentInfoTypeSIFRefId(EquipmentInfoType.SIFRefId value) {
        return new JAXBElement<EquipmentInfoType.SIFRefId>(_EquipmentInfoTypeSIFRefId_QNAME, EquipmentInfoType.SIFRefId.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = EquipmentInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEquipmentInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InvoiceRefId", scope = EquipmentInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentInfoTypeInvoiceRefId(String value) {
        return new JAXBElement<String>(_EquipmentInfoTypeInvoiceRefId_QNAME, String.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssetNumber", scope = EquipmentInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEquipmentInfoTypeAssetNumber(String value) {
        return new JAXBElement<String>(_EquipmentInfoTypeAssetNumber_QNAME, String.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EquipmentType", scope = EquipmentInfoType.class)
    public JAXBElement<String> createEquipmentInfoTypeEquipmentType(String value) {
        return new JAXBElement<String>(_EquipmentInfoTypeEquipmentType_QNAME, String.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = EquipmentInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createEquipmentInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = EquipmentInfoType.class)
    public JAXBElement<SIFMetadataType> createEquipmentInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PurchaseOrderRefId", scope = EquipmentInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentInfoTypePurchaseOrderRefId(String value) {
        return new JAXBElement<String>(_EquipmentInfoTypePurchaseOrderRefId_QNAME, String.class, EquipmentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentAttendanceTimeListType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentAttendanceTimeListTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentAttendanceTimeListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentAttendanceTimeListType.class)
    public JAXBElement<SIFMetadataType> createStudentAttendanceTimeListTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentAttendanceTimeListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodAttendancesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PeriodAttendances", scope = StudentAttendanceTimeListType.class)
    public JAXBElement<PeriodAttendancesType> createStudentAttendanceTimeListTypePeriodAttendances(PeriodAttendancesType value) {
        return new JAXBElement<PeriodAttendancesType>(_StudentAttendanceTimeListTypePeriodAttendances_QNAME, PeriodAttendancesType.class, StudentAttendanceTimeListType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CurriculumCode", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeCurriculumCode(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeCurriculumCode_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCommonwealthId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeSchoolCommonwealthId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeSchoolCommonwealthId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardList", scope = StudentScoreJudgementAgainstStandardType.class)
    public JAXBElement<LearningStandardListType> createStudentScoreJudgementAgainstStandardTypeLearningStandardList(LearningStandardListType value) {
        return new JAXBElement<LearningStandardListType>(_StudentGradeTypeLearningStandardList_QNAME, LearningStandardListType.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentScoreJudgementAgainstStandardType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentScoreJudgementAgainstStandardTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentStateProvinceId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeStudentStateProvinceId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStudentStateProvinceId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentScoreJudgementAgainstStandardType.class)
    public JAXBElement<SIFMetadataType> createStudentScoreJudgementAgainstStandardTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupRefId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeTeachingGroupRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeachingGroupRefId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffLocalId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeStaffLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CurriculumNodeCode", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeCurriculumNodeCode(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeCurriculumNodeCode_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalTermCode", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeLocalTermCode(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeLocalTermCode_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentLocalId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeStudentLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStudentLocalId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SpecialCircumstanceLocalCode", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeSpecialCircumstanceLocalCode(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeSpecialCircumstanceLocalCode_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ManagedPathwayLocalCode", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeManagedPathwayLocalCode(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeManagedPathwayLocalCode_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeStudentPersonalRefId(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeStudentPersonalRefId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ClassLocalId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeClassLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeClassLocalId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfoRefId", scope = StudentScoreJudgementAgainstStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentScoreJudgementAgainstStandardTypeTermInfoRefId(String value) {
        return new JAXBElement<String>(_SectionInfoTypeTermInfoRefId_QNAME, String.class, StudentScoreJudgementAgainstStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NonSchoolEducation", scope = StudentContactPersonalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentContactPersonalTypeNonSchoolEducation(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeNonSchoolEducation_QNAME, String.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = StudentContactPersonalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentContactPersonalTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherIdList", scope = StudentContactPersonalType.class)
    public JAXBElement<OtherIdListType> createStudentContactPersonalTypeOtherIdList(OtherIdListType value) {
        return new JAXBElement<OtherIdListType>(_StaffPersonalTypeOtherIdList_QNAME, OtherIdListType.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentContactPersonalType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentContactPersonalTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmploymentType", scope = StudentContactPersonalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentContactPersonalTypeEmploymentType(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeEmploymentType_QNAME, String.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentContactPersonalType.class)
    public JAXBElement<SIFMetadataType> createStudentContactPersonalTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolEducationalLevel", scope = StudentContactPersonalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentContactPersonalTypeSchoolEducationalLevel(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeSchoolEducationalLevel_QNAME, String.class, StudentContactPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PublishInDirectory", scope = SchoolContactType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSchoolContactTypePublishInDirectory(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolContactTypePublishInDirectory_QNAME, AUCodeSetsYesOrNoCategoryType.class, SchoolContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalDescription", scope = ResourceUsageType.ResourceUsageContentType.class)
    public JAXBElement<String> createResourceUsageTypeResourceUsageContentTypeLocalDescription(String value) {
        return new JAXBElement<String>(_ResourceUsageTypeResourceUsageContentTypeLocalDescription_QNAME, String.class, ResourceUsageType.ResourceUsageContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExpirationDate", scope = AggregateStatisticInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createAggregateStatisticInfoTypeExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AggregateStatisticInfoTypeExpirationDate_QNAME, XMLGregorianCalendar.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionRulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExclusionRules", scope = AggregateStatisticInfoType.class)
    public JAXBElement<ExclusionRulesType> createAggregateStatisticInfoTypeExclusionRules(ExclusionRulesType value) {
        return new JAXBElement<ExclusionRulesType>(_AggregateStatisticInfoTypeExclusionRules_QNAME, ExclusionRulesType.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateStatisticInfoType.CalculationRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalculationRule", scope = AggregateStatisticInfoType.class)
    public JAXBElement<AggregateStatisticInfoType.CalculationRule> createAggregateStatisticInfoTypeCalculationRule(AggregateStatisticInfoType.CalculationRule value) {
        return new JAXBElement<AggregateStatisticInfoType.CalculationRule>(_AggregateStatisticInfoTypeCalculationRule_QNAME, AggregateStatisticInfoType.CalculationRule.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = AggregateStatisticInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createAggregateStatisticInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApprovalDate", scope = AggregateStatisticInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createAggregateStatisticInfoTypeApprovalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AggregateStatisticInfoTypeApprovalDate_QNAME, XMLGregorianCalendar.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EffectiveDate", scope = AggregateStatisticInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createAggregateStatisticInfoTypeEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AggregateStatisticInfoTypeEffectiveDate_QNAME, XMLGregorianCalendar.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Location", scope = AggregateStatisticInfoType.class)
    public JAXBElement<LocationType> createAggregateStatisticInfoTypeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_AggregateStatisticInfoTypeLocation_QNAME, LocationType.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = AggregateStatisticInfoType.class)
    public JAXBElement<SIFMetadataType> createAggregateStatisticInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Source", scope = AggregateStatisticInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAggregateStatisticInfoTypeSource(String value) {
        return new JAXBElement<String>(_AggregateStatisticInfoTypeSource_QNAME, String.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Measure", scope = AggregateStatisticInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAggregateStatisticInfoTypeMeasure(String value) {
        return new JAXBElement<String>(_AggregateStatisticInfoTypeMeasure_QNAME, String.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DiscontinueDate", scope = AggregateStatisticInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createAggregateStatisticInfoTypeDiscontinueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AggregateStatisticInfoTypeDiscontinueDate_QNAME, XMLGregorianCalendar.class, AggregateStatisticInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Address", scope = ContactType.class)
    public JAXBElement<AddressType> createContactTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ContactTypeAddress_QNAME, AddressType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Email", scope = ContactType.class)
    public JAXBElement<EmailType> createContactTypeEmail(EmailType value) {
        return new JAXBElement<EmailType>(_ContactTypeEmail_QNAME, EmailType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Name", scope = ContactType.class)
    public JAXBElement<NameType> createContactTypeName(NameType value) {
        return new JAXBElement<NameType>(_EvaluationTypeName_QNAME, NameType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumber", scope = ContactType.class)
    public JAXBElement<PhoneNumberType> createContactTypePhoneNumber(PhoneNumberType value) {
        return new JAXBElement<PhoneNumberType>(_ContactTypePhoneNumber_QNAME, PhoneNumberType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericPrecision", scope = MarkValueInfoType.class)
    public JAXBElement<Long> createMarkValueInfoTypeNumericPrecision(Long value) {
        return new JAXBElement<Long>(_MarkValueInfoTypeNumericPrecision_QNAME, Long.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = MarkValueInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createMarkValueInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericPassingGrade", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypeNumericPassingGrade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypeNumericPassingGrade_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PercentageMaximum", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypePercentageMaximum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypePercentageMaximum_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NarrativeMaximumSize", scope = MarkValueInfoType.class)
    public JAXBElement<Long> createMarkValueInfoTypeNarrativeMaximumSize(Long value) {
        return new JAXBElement<Long>(_MarkValueInfoTypeNarrativeMaximumSize_QNAME, Long.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = MarkValueInfoType.class)
    public JAXBElement<SIFMetadataType> createMarkValueInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericHigh", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypeNumericHigh(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypeNumericHigh_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PercentageMinimum", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypePercentageMinimum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypePercentageMinimum_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidLetterMarkListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ValidLetterMarkList", scope = MarkValueInfoType.class)
    public JAXBElement<ValidLetterMarkListType> createMarkValueInfoTypeValidLetterMarkList(ValidLetterMarkListType value) {
        return new JAXBElement<ValidLetterMarkListType>(_MarkValueInfoTypeValidLetterMarkList_QNAME, ValidLetterMarkListType.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericScale", scope = MarkValueInfoType.class)
    public JAXBElement<Long> createMarkValueInfoTypeNumericScale(Long value) {
        return new JAXBElement<Long>(_MarkValueInfoTypeNumericScale_QNAME, Long.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericLow", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypeNumericLow(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypeNumericLow_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PercentagePassingGrade", scope = MarkValueInfoType.class)
    public JAXBElement<BigDecimal> createMarkValueInfoTypePercentagePassingGrade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarkValueInfoTypePercentagePassingGrade_QNAME, BigDecimal.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = MarkValueInfoType.class)
    public JAXBElement<YearLevelsType> createMarkValueInfoTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, MarkValueInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = MarkerType.class)
    public JAXBElement<String> createMarkerTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, MarkerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Role", scope = MarkerType.class)
    public JAXBElement<String> createMarkerTypeRole(String value) {
        return new JAXBElement<String>(_MarkerTypeRole_QNAME, String.class, MarkerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicCategory", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeWellbeingCharacteristicCategory(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeWellbeingCharacteristicCategory_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicEndDate", scope = WellbeingCharacteristicType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingCharacteristicTypeWellbeingCharacteristicEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingCharacteristicTypeWellbeingCharacteristicEndDate_QNAME, XMLGregorianCalendar.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicNotes", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeWellbeingCharacteristicNotes(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeWellbeingCharacteristicNotes_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ConfidentialFlag", scope = WellbeingCharacteristicType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createWellbeingCharacteristicTypeConfidentialFlag(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_WellbeingCharacteristicTypeConfidentialFlag_QNAME, AUCodeSetsYesOrNoCategoryType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentList", scope = WellbeingCharacteristicType.class)
    public JAXBElement<WellbeingDocumentListType> createWellbeingCharacteristicTypeDocumentList(WellbeingDocumentListType value) {
        return new JAXBElement<WellbeingDocumentListType>(_WellbeingCharacteristicTypeDocumentList_QNAME, WellbeingDocumentListType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = WellbeingCharacteristicType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MedicationList", scope = WellbeingCharacteristicType.class)
    public JAXBElement<MedicationListType> createWellbeingCharacteristicTypeMedicationList(MedicationListType value) {
        return new JAXBElement<MedicationListType>(_WellbeingCharacteristicTypeMedicationList_QNAME, MedicationListType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = WellbeingCharacteristicType.class)
    public JAXBElement<SIFExtendedElementsType> createWellbeingCharacteristicTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = WellbeingCharacteristicType.class)
    public JAXBElement<SIFMetadataType> createWellbeingCharacteristicTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicReviewDate", scope = WellbeingCharacteristicType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingCharacteristicTypeWellbeingCharacteristicReviewDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingCharacteristicTypeWellbeingCharacteristicReviewDate_QNAME, XMLGregorianCalendar.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CharacteristicSeverity", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeCharacteristicSeverity(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeCharacteristicSeverity_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicSubCategory", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeWellbeingCharacteristicSubCategory(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeWellbeingCharacteristicSubCategory_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Trigger", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeTrigger(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeTrigger_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DailyManagement", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeDailyManagement(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeDailyManagement_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmergencyManagement", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeEmergencyManagement(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeEmergencyManagement_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingCharacteristicClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicClassification", scope = WellbeingCharacteristicType.class)
    public JAXBElement<AUCodeSetsWellbeingCharacteristicClassificationType> createWellbeingCharacteristicTypeWellbeingCharacteristicClassification(AUCodeSetsWellbeingCharacteristicClassificationType value) {
        return new JAXBElement<AUCodeSetsWellbeingCharacteristicClassificationType>(_WellbeingCharacteristicTypeWellbeingCharacteristicClassification_QNAME, AUCodeSetsWellbeingCharacteristicClassificationType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmergencyResponsePlan", scope = WellbeingCharacteristicType.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeEmergencyResponsePlan(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeEmergencyResponsePlan_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalCharacteristicCode", scope = WellbeingCharacteristicType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWellbeingCharacteristicTypeLocalCharacteristicCode(String value) {
        return new JAXBElement<String>(_WellbeingCharacteristicTypeLocalCharacteristicCode_QNAME, String.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingCharacteristicStartDate", scope = WellbeingCharacteristicType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingCharacteristicTypeWellbeingCharacteristicStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingCharacteristicTypeWellbeingCharacteristicStartDate_QNAME, XMLGregorianCalendar.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Alert", scope = WellbeingCharacteristicType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createWellbeingCharacteristicTypeAlert(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_WellbeingCharacteristicTypeAlert_QNAME, AUCodeSetsYesOrNoCategoryType.class, WellbeingCharacteristicType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CreationDate", scope = PurchaseOrderType.class)
    public JAXBElement<XMLGregorianCalendar> createPurchaseOrderTypeCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchaseOrderTypeCreationDate_QNAME, XMLGregorianCalendar.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "UpdateDate", scope = PurchaseOrderType.class)
    public JAXBElement<XMLGregorianCalendar> createPurchaseOrderTypeUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchaseOrderTypeUpdateDate_QNAME, XMLGregorianCalendar.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FullyDelivered", scope = PurchaseOrderType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createPurchaseOrderTypeFullyDelivered(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_PurchaseOrderTypeFullyDelivered_QNAME, AUCodeSetsYesOrNoCategoryType.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfoRefId", scope = PurchaseOrderType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPurchaseOrderTypeChargedLocationInfoRefId(String value) {
        return new JAXBElement<String>(_InvoiceTypeChargedLocationInfoRefId_QNAME, String.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxAmount", scope = PurchaseOrderType.class)
    public JAXBElement<MonetaryAmountType> createPurchaseOrderTypeTaxAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeTaxAmount_QNAME, MonetaryAmountType.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = PurchaseOrderType.class)
    public JAXBElement<SIFExtendedElementsType> createPurchaseOrderTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = PurchaseOrderType.class)
    public JAXBElement<SIFMetadataType> createPurchaseOrderTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmployeePersonalRefId", scope = PurchaseOrderType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPurchaseOrderTypeEmployeePersonalRefId(String value) {
        return new JAXBElement<String>(_PurchaseOrderTypeEmployeePersonalRefId_QNAME, String.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxRate", scope = PurchaseOrderType.class)
    public JAXBElement<BigDecimal> createPurchaseOrderTypeTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceTypeTaxRate_QNAME, BigDecimal.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OriginalPurchaseOrderRefId", scope = PurchaseOrderType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPurchaseOrderTypeOriginalPurchaseOrderRefId(String value) {
        return new JAXBElement<String>(_PurchaseOrderTypeOriginalPurchaseOrderRefId_QNAME, String.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TotalAmount", scope = PurchaseOrderType.class)
    public JAXBElement<MonetaryAmountType> createPurchaseOrderTypeTotalAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_PurchaseOrderTypeTotalAmount_QNAME, MonetaryAmountType.class, PurchaseOrderType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingEventSubCategoryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventSubCategoryList", scope = WellbeingEventCategoryType.class)
    public JAXBElement<WellbeingEventSubCategoryListType> createWellbeingEventCategoryTypeWellbeingEventSubCategoryList(WellbeingEventSubCategoryListType value) {
        return new JAXBElement<WellbeingEventSubCategoryListType>(_WellbeingEventCategoryTypeWellbeingEventSubCategoryList_QNAME, WellbeingEventSubCategoryListType.class, WellbeingEventCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlanRefId", scope = WellbeingPlanType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWellbeingPlanTypePersonalisedPlanRefId(String value) {
        return new JAXBElement<String>(_WellbeingPlanTypePersonalisedPlanRefId_QNAME, String.class, WellbeingPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PlanNotes", scope = WellbeingPlanType.class)
    public JAXBElement<String> createWellbeingPlanTypePlanNotes(String value) {
        return new JAXBElement<String>(_WellbeingPlanTypePlanNotes_QNAME, String.class, WellbeingPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RelativeDuration", scope = TermInfoType.class)
    public JAXBElement<BigDecimal> createTermInfoTypeRelativeDuration(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TermInfoTypeRelativeDuration_QNAME, BigDecimal.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchedulingTerm", scope = TermInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createTermInfoTypeSchedulingTerm(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_TermInfoTypeSchedulingTerm_QNAME, AUCodeSetsYesOrNoCategoryType.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermSpan", scope = TermInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTermInfoTypeTermSpan(String value) {
        return new JAXBElement<String>(_TermInfoTypeTermSpan_QNAME, String.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = TermInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTermInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceTerm", scope = TermInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createTermInfoTypeAttendanceTerm(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_TermInfoTypeAttendanceTerm_QNAME, AUCodeSetsYesOrNoCategoryType.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = TermInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createTermInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = TermInfoType.class)
    public JAXBElement<SIFMetadataType> createTermInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Track", scope = TermInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTermInfoTypeTrack(String value) {
        return new JAXBElement<String>(_TermInfoTypeTrack_QNAME, String.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermCode", scope = TermInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTermInfoTypeTermCode(String value) {
        return new JAXBElement<String>(_TermInfoTypeTermCode_QNAME, String.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MarkingTerm", scope = TermInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createTermInfoTypeMarkingTerm(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_TermInfoTypeMarkingTerm_QNAME, AUCodeSetsYesOrNoCategoryType.class, TermInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExitDate", scope = StudentSectionEnrollmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentSectionEnrollmentTypeExitDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentSectionEnrollmentTypeExitDate_QNAME, XMLGregorianCalendar.class, StudentSectionEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentSectionEnrollmentType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentSectionEnrollmentTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentSectionEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentSectionEnrollmentType.class)
    public JAXBElement<SIFMetadataType> createStudentSectionEnrollmentTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentSectionEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EntryDate", scope = StudentSectionEnrollmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentSectionEnrollmentTypeEntryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentSectionEnrollmentTypeEntryDate_QNAME, XMLGregorianCalendar.class, StudentSectionEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = StudentSectionEnrollmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentSectionEnrollmentTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, StudentSectionEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = ValidLetterMarkType.class)
    public JAXBElement<String> createValidLetterMarkTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, ValidLetterMarkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NumericEquivalent", scope = ValidLetterMarkType.class)
    public JAXBElement<BigDecimal> createValidLetterMarkTypeNumericEquivalent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ValidLetterMarkTypeNumericEquivalent_QNAME, BigDecimal.class, ValidLetterMarkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = ChargedLocationInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createChargedLocationInfoTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = ChargedLocationInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChargedLocationInfoTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = ChargedLocationInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createChargedLocationInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = ChargedLocationInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createChargedLocationInfoTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = ChargedLocationInfoType.class)
    public JAXBElement<PhoneNumberListType> createChargedLocationInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = ChargedLocationInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createChargedLocationInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = ChargedLocationInfoType.class)
    public JAXBElement<AddressListType> createChargedLocationInfoTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = ChargedLocationInfoType.class)
    public JAXBElement<SIFMetadataType> createChargedLocationInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParentChargedLocationInfoRefId", scope = ChargedLocationInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChargedLocationInfoTypeParentChargedLocationInfoRefId(String value) {
        return new JAXBElement<String>(_ChargedLocationInfoTypeParentChargedLocationInfoRefId_QNAME, String.class, ChargedLocationInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScorePercent", scope = GradingAssignmentScoreType.class)
    public JAXBElement<BigDecimal> createGradingAssignmentScoreTypeScorePercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GradingAssignmentScoreTypeScorePercent_QNAME, BigDecimal.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExpectedScore", scope = GradingAssignmentScoreType.class)
    public JAXBElement<Boolean> createGradingAssignmentScoreTypeExpectedScore(Boolean value) {
        return new JAXBElement<Boolean>(_GradingAssignmentScoreTypeExpectedScore_QNAME, Boolean.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPSubscoreListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubscoreList", scope = GradingAssignmentScoreType.class)
    public JAXBElement<NAPSubscoreListType> createGradingAssignmentScoreTypeSubscoreList(NAPSubscoreListType value) {
        return new JAXBElement<NAPSubscoreListType>(_GradingAssignmentScoreTypeSubscoreList_QNAME, NAPSubscoreListType.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = GradingAssignmentScoreType.class)
    public JAXBElement<SIFExtendedElementsType> createGradingAssignmentScoreTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MarkInfoRefId", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeMarkInfoRefId(String value) {
        return new JAXBElement<String>(_GradingAssignmentScoreTypeMarkInfoRefId_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = GradingAssignmentScoreType.class)
    public JAXBElement<SIFMetadataType> createGradingAssignmentScoreTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupRefId", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeTeachingGroupRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeachingGroupRefId_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScoreDescription", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeScoreDescription(String value) {
        return new JAXBElement<String>(_GradingAssignmentScoreTypeScoreDescription_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssignmentScoreIteration", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeAssignmentScoreIteration(String value) {
        return new JAXBElement<String>(_GradingAssignmentScoreTypeAssignmentScoreIteration_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherJudgement", scope = GradingAssignmentScoreType.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeTeacherJudgement(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeacherJudgement_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScorePoints", scope = GradingAssignmentScoreType.class)
    public JAXBElement<Long> createGradingAssignmentScoreTypeScorePoints(Long value) {
        return new JAXBElement<Long>(_GradingAssignmentScoreTypeScorePoints_QNAME, Long.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DateGraded", scope = GradingAssignmentScoreType.class)
    public JAXBElement<XMLGregorianCalendar> createGradingAssignmentScoreTypeDateGraded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GradingAssignmentScoreTypeDateGraded_QNAME, XMLGregorianCalendar.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScoreLetter", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeScoreLetter(String value) {
        return new JAXBElement<String>(_GradingAssignmentScoreTypeScoreLetter_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefId", scope = GradingAssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentScoreTypeStudentPersonalRefId(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeStudentPersonalRefId_QNAME, String.class, GradingAssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = ReligionType.class)
    public JAXBElement<OtherCodeListType> createReligionTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, ReligionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSpecialEducationFTE", scope = StudentParticipationType.class)
    public JAXBElement<BigDecimal> createStudentParticipationTypeStudentSpecialEducationFTE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentParticipationTypeStudentSpecialEducationFTE_QNAME, BigDecimal.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GiftedEligibilityCriteria", scope = StudentParticipationType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentParticipationTypeGiftedEligibilityCriteria(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentParticipationTypeGiftedEligibilityCriteria_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferralSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReferralSource", scope = StudentParticipationType.class)
    public JAXBElement<ReferralSourceType> createStudentParticipationTypeReferralSource(ReferralSourceType value) {
        return new JAXBElement<ReferralSourceType>(_StudentParticipationTypeReferralSource_QNAME, ReferralSourceType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EvaluationDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeEvaluationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeEvaluationDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramAvailabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramAvailability", scope = StudentParticipationType.class)
    public JAXBElement<ProgramAvailabilityType> createStudentParticipationTypeProgramAvailability(ProgramAvailabilityType value) {
        return new JAXBElement<ProgramAvailabilityType>(_StudentParticipationTypeProgramAvailability_QNAME, ProgramAvailabilityType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentParticipationType.class)
    public JAXBElement<SIFMetadataType> createStudentParticipationTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EvaluationExtensionDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeEvaluationExtensionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeEvaluationExtensionDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramEligibilityDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeProgramEligibilityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeProgramEligibilityDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramFundingSourcesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramFundingSources", scope = StudentParticipationType.class)
    public JAXBElement<ProgramFundingSourcesType> createStudentParticipationTypeProgramFundingSources(ProgramFundingSourcesType value) {
        return new JAXBElement<ProgramFundingSourcesType>(_StudentParticipationTypeProgramFundingSources_QNAME, ProgramFundingSourcesType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NOREPDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeNOREPDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeNOREPDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PlacementParentalConsentDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypePlacementParentalConsentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypePlacementParentalConsentDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramStatus", scope = StudentParticipationType.class)
    public JAXBElement<ProgramStatusType> createStudentParticipationTypeProgramStatus(ProgramStatusType value) {
        return new JAXBElement<ProgramStatusType>(_StudentParticipationTypeProgramStatus_QNAME, ProgramStatusType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExtendedDay", scope = StudentParticipationType.class)
    public JAXBElement<Boolean> createStudentParticipationTypeExtendedDay(Boolean value) {
        return new JAXBElement<Boolean>(_StudentParticipationTypeExtendedDay_QNAME, Boolean.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReferralDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeReferralDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeReferralDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentParticipationType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentParticipationTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParticipationContact", scope = StudentParticipationType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentParticipationTypeParticipationContact(String value) {
        return new JAXBElement<String>(_StudentParticipationTypeParticipationContact_QNAME, String.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReevaluationDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeReevaluationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeReevaluationDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExtendedSchoolYear", scope = StudentParticipationType.class)
    public JAXBElement<Boolean> createStudentParticipationTypeExtendedSchoolYear(Boolean value) {
        return new JAXBElement<Boolean>(_StudentParticipationTypeExtendedSchoolYear_QNAME, Boolean.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EvaluationParentalConsentDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeEvaluationParentalConsentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeEvaluationParentalConsentDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EntryPerson", scope = StudentParticipationType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentParticipationTypeEntryPerson(String value) {
        return new JAXBElement<String>(_StudentParticipationTypeEntryPerson_QNAME, String.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExtensionComments", scope = StudentParticipationType.class)
    public JAXBElement<String> createStudentParticipationTypeExtensionComments(String value) {
        return new JAXBElement<String>(_StudentParticipationTypeExtensionComments_QNAME, String.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramPlacementDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeProgramPlacementDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeProgramPlacementDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramPlanEffectiveDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeProgramPlanEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeProgramPlanEffectiveDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramType", scope = StudentParticipationType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentParticipationTypeProgramType(String value) {
        return new JAXBElement<String>(_StudentParticipationTypeProgramType_QNAME, String.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProgramPlanDate", scope = StudentParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentParticipationTypeProgramPlanDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentParticipationTypeProgramPlanDate_QNAME, XMLGregorianCalendar.class, StudentParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardURL", scope = LearningStandardType.class)
    public JAXBElement<String> createLearningStandardTypeLearningStandardURL(String value) {
        return new JAXBElement<String>(_LearningStandardTypeLearningStandardURL_QNAME, String.class, LearningStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardItemRefId", scope = LearningStandardType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLearningStandardTypeLearningStandardItemRefId(String value) {
        return new JAXBElement<String>(_LearningStandardTypeLearningStandardItemRefId_QNAME, String.class, LearningStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardLocalId", scope = LearningStandardType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLearningStandardTypeLearningStandardLocalId(String value) {
        return new JAXBElement<String>(_LearningStandardTypeLearningStandardLocalId_QNAME, String.class, LearningStandardType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExemplarURL", scope = NAPTestItemContentType.class)
    public JAXBElement<String> createNAPTestItemContentTypeExemplarURL(String value) {
        return new JAXBElement<String>(_NAPTestItemContentTypeExemplarURL_QNAME, String.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ItemProficiencyLevel", scope = NAPTestItemContentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPTestItemContentTypeItemProficiencyLevel(String value) {
        return new JAXBElement<String>(_NAPTestItemContentTypeItemProficiencyLevel_QNAME, String.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstituteItemListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ItemSubstitutedForList", scope = NAPTestItemContentType.class)
    public JAXBElement<SubstituteItemListType> createNAPTestItemContentTypeItemSubstitutedForList(SubstituteItemListType value) {
        return new JAXBElement<SubstituteItemListType>(_NAPTestItemContentTypeItemSubstitutedForList_QNAME, SubstituteItemListType.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentDescriptionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContentDescriptionList", scope = NAPTestItemContentType.class)
    public JAXBElement<ContentDescriptionListType> createNAPTestItemContentTypeContentDescriptionList(ContentDescriptionListType value) {
        return new JAXBElement<ContentDescriptionListType>(_NAPTestItemContentTypeContentDescriptionList_QNAME, ContentDescriptionListType.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MultipleChoiceOptionCount", scope = NAPTestItemContentType.class)
    public JAXBElement<Integer> createNAPTestItemContentTypeMultipleChoiceOptionCount(Integer value) {
        return new JAXBElement<Integer>(_NAPTestItemContentTypeMultipleChoiceOptionCount_QNAME, Integer.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPWritingRubricListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPWritingRubricList", scope = NAPTestItemContentType.class)
    public JAXBElement<NAPWritingRubricListType> createNAPTestItemContentTypeNAPWritingRubricList(NAPWritingRubricListType value) {
        return new JAXBElement<NAPWritingRubricListType>(_NAPTestItemContentTypeNAPWritingRubricList_QNAME, NAPWritingRubricListType.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StimulusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StimulusList", scope = NAPTestItemContentType.class)
    public JAXBElement<StimulusListType> createNAPTestItemContentTypeStimulusList(StimulusListType value) {
        return new JAXBElement<StimulusListType>(_NAPTestItemContentTypeStimulusList_QNAME, StimulusListType.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsNAPWritingGenreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WritingGenre", scope = NAPTestItemContentType.class)
    public JAXBElement<AUCodeSetsNAPWritingGenreType> createNAPTestItemContentTypeWritingGenre(AUCodeSetsNAPWritingGenreType value) {
        return new JAXBElement<AUCodeSetsNAPWritingGenreType>(_NAPTestItemContentTypeWritingGenre_QNAME, AUCodeSetsNAPWritingGenreType.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CorrectAnswer", scope = NAPTestItemContentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPTestItemContentTypeCorrectAnswer(String value) {
        return new JAXBElement<String>(_NAPTestItemContentTypeCorrectAnswer_QNAME, String.class, NAPTestItemContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubstituteItemLocalId", scope = SubstituteItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSubstituteItemTypeSubstituteItemLocalId(String value) {
        return new JAXBElement<String>(_SubstituteItemTypeSubstituteItemLocalId_QNAME, String.class, SubstituteItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FollowUpActionCategory", scope = FollowUpActionType.class)
    public JAXBElement<String> createFollowUpActionTypeFollowUpActionCategory(String value) {
        return new JAXBElement<String>(_FollowUpActionTypeFollowUpActionCategory_QNAME, String.class, FollowUpActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponseRefId", scope = FollowUpActionType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFollowUpActionTypeWellbeingResponseRefId(String value) {
        return new JAXBElement<String>(_FollowUpActionTypeWellbeingResponseRefId_QNAME, String.class, FollowUpActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FollowUpDetails", scope = FollowUpActionType.class)
    public JAXBElement<String> createFollowUpActionTypeFollowUpDetails(String value) {
        return new JAXBElement<String>(_FollowUpActionTypeFollowUpDetails_QNAME, String.class, FollowUpActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectArea", scope = ACStrandSubjectAreaType.class)
    public JAXBElement<SubjectAreaType> createACStrandSubjectAreaTypeSubjectArea(SubjectAreaType value) {
        return new JAXBElement<SubjectAreaType>(_ACStrandSubjectAreaTypeSubjectArea_QNAME, SubjectAreaType.class, ACStrandSubjectAreaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRoleType.SystemContextList.SystemContext.RoleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoleList", scope = SystemRoleType.SystemContextList.SystemContext.class)
    public JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList> createSystemRoleTypeSystemContextListSystemContextRoleList(SystemRoleType.SystemContextList.SystemContext.RoleList value) {
        return new JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList>(_SystemRoleTypeSystemContextListSystemContextRoleList_QNAME, SystemRoleType.SystemContextList.SystemContext.RoleList.class, SystemRoleType.SystemContextList.SystemContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableRefId", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeTimeTableRefId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeTimeTableRefId_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ActivityName", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeActivityName(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeActivityName_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentList", scope = ScheduledActivityType.class)
    public JAXBElement<StudentsType> createScheduledActivityTypeStudentList(StudentsType value) {
        return new JAXBElement<StudentsType>(_TeachingGroupTypeStudentList_QNAME, StudentsType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = ScheduledActivityType.class)
    public JAXBElement<SIFExtendedElementsType> createScheduledActivityTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = ScheduledActivityType.class)
    public JAXBElement<SIFMetadataType> createScheduledActivityTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsScheduledActivityTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ActivityType", scope = ScheduledActivityType.class)
    public JAXBElement<AUCodeSetsScheduledActivityTypeType> createScheduledActivityTypeActivityType(AUCodeSetsScheduledActivityTypeType value) {
        return new JAXBElement<AUCodeSetsScheduledActivityTypeType>(_ScheduledActivityTypeActivityType_QNAME, AUCodeSetsScheduledActivityTypeType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PeriodId", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypePeriodId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypePeriodId_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CellType", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeCellType(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeCellType_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeachingGroupListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupList", scope = ScheduledActivityType.class)
    public JAXBElement<TeachingGroupListType> createScheduledActivityTypeTeachingGroupList(TeachingGroupListType value) {
        return new JAXBElement<TeachingGroupListType>(_ScheduledActivityTypeTeachingGroupList_QNAME, TeachingGroupListType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledTeacherListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherList", scope = ScheduledActivityType.class)
    public JAXBElement<ScheduledTeacherListType> createScheduledActivityTypeTeacherList(ScheduledTeacherListType value) {
        return new JAXBElement<ScheduledTeacherListType>(_TeachingGroupTypeTeacherList_QNAME, ScheduledTeacherListType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledActivityOverrideType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Override", scope = ScheduledActivityType.class)
    public JAXBElement<ScheduledActivityOverrideType> createScheduledActivityTypeOverride(ScheduledActivityOverrideType value) {
        return new JAXBElement<ScheduledActivityOverrideType>(_ScheduledActivityTypeOverride_QNAME, ScheduledActivityOverrideType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCellRefId", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeTimeTableCellRefId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeTimeTableCellRefId_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = ScheduledActivityType.class)
    public JAXBElement<AddressListType> createScheduledActivityTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Location", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeLocation(String value) {
        return new JAXBElement<String>(_AggregateStatisticInfoTypeLocation_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ActivityComment", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeActivityComment(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeActivityComment_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DayId", scope = ScheduledActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScheduledActivityTypeDayId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeDayId_QNAME, String.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomList", scope = ScheduledActivityType.class)
    public JAXBElement<RoomListType> createScheduledActivityTypeRoomList(RoomListType value) {
        return new JAXBElement<RoomListType>(_ScheduledActivityTypeRoomList_QNAME, RoomListType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = ScheduledActivityType.class)
    public JAXBElement<YearLevelsType> createScheduledActivityTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, ScheduledActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OKToPublish", scope = PersonPictureType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createPersonPictureTypeOKToPublish(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_PersonPictureTypeOKToPublish_QNAME, AUCodeSetsYesOrNoCategoryType.class, PersonPictureType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = PersonPictureType.class)
    public JAXBElement<SIFExtendedElementsType> createPersonPictureTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, PersonPictureType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = PersonPictureType.class)
    public JAXBElement<SIFMetadataType> createPersonPictureTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, PersonPictureType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishingPermissionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PublishingPermissionList", scope = PersonPictureType.class)
    public JAXBElement<PublishingPermissionListType> createPersonPictureTypePublishingPermissionList(PublishingPermissionListType value) {
        return new JAXBElement<PublishingPermissionListType>(_PersonPictureTypePublishingPermissionList_QNAME, PublishingPermissionListType.class, PersonPictureType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = AgencyType.class)
    public JAXBElement<OtherCodeListType> createAgencyTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, AgencyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = ActivityType.Evaluation.class)
    public JAXBElement<String> createActivityTypeEvaluationDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, ActivityType.Evaluation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Descriptor", scope = GenericRubricType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGenericRubricTypeDescriptor(String value) {
        return new JAXBElement<String>(_NAPWritingRubricTypeDescriptor_QNAME, String.class, GenericRubricType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentLocalId", scope = TeachingGroupStudentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupStudentTypeStudentLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStudentLocalId_QNAME, String.class, TeachingGroupStudentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameOfRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Name", scope = TeachingGroupStudentType.class)
    public JAXBElement<NameOfRecordType> createTeachingGroupStudentTypeName(NameOfRecordType value) {
        return new JAXBElement<NameOfRecordType>(_EvaluationTypeName_QNAME, NameOfRecordType.class, TeachingGroupStudentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefId", scope = TeachingGroupStudentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupStudentTypeStudentPersonalRefId(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeStudentPersonalRefId_QNAME, String.class, TeachingGroupStudentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleType.Created.Creators }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Creators", scope = LifeCycleType.Created.class)
    public JAXBElement<LifeCycleType.Created.Creators> createLifeCycleTypeCreatedCreators(LifeCycleType.Created.Creators value) {
        return new JAXBElement<LifeCycleType.Created.Creators>(_LifeCycleTypeCreatedCreators_QNAME, LifeCycleType.Created.Creators.class, LifeCycleType.Created.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = StudentExitStatusContainerType.class)
    public JAXBElement<OtherCodeListType> createStudentExitStatusContainerTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, StudentExitStatusContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Semester", scope = TimeTableSubjectType.class)
    public JAXBElement<Long> createTimeTableSubjectTypeSemester(Long value) {
        return new JAXBElement<Long>(_TeachingGroupTypeSemester_QNAME, Long.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AcademicYear", scope = TimeTableSubjectType.class)
    public JAXBElement<YearLevelType> createTimeTableSubjectTypeAcademicYear(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_TimeTableSubjectTypeAcademicYear_QNAME, YearLevelType.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProposedMinClassSize", scope = TimeTableSubjectType.class)
    public JAXBElement<BigDecimal> createTimeTableSubjectTypeProposedMinClassSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TimeTableSubjectTypeProposedMinClassSize_QNAME, BigDecimal.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Faculty", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeFaculty(String value) {
        return new JAXBElement<String>(_TimeTableSubjectTypeFaculty_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectShortName", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeSubjectShortName(String value) {
        return new JAXBElement<String>(_TimeTableSubjectTypeSubjectShortName_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = TimeTableSubjectType.class)
    public JAXBElement<SIFExtendedElementsType> createTimeTableSubjectTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseLocalId", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeCourseLocalId(String value) {
        return new JAXBElement<String>(_TimeTableSubjectTypeCourseLocalId_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = TimeTableSubjectType.class)
    public JAXBElement<SIFMetadataType> createTimeTableSubjectTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCourseInfoRefId", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeSchoolCourseInfoRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeSchoolCourseInfoRefId_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AcademicYearRange", scope = TimeTableSubjectType.class)
    public JAXBElement<YearRangeType> createTimeTableSubjectTypeAcademicYearRange(YearRangeType value) {
        return new JAXBElement<YearRangeType>(_TimeTableSubjectTypeAcademicYearRange_QNAME, YearRangeType.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = TimeTableSubjectType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTableSubjectTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectType", scope = TimeTableSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableSubjectTypeSubjectType(String value) {
        return new JAXBElement<String>(_TimeTableSubjectTypeSubjectType_QNAME, String.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProposedMaxClassSize", scope = TimeTableSubjectType.class)
    public JAXBElement<BigDecimal> createTimeTableSubjectTypeProposedMaxClassSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TimeTableSubjectTypeProposedMaxClassSize_QNAME, BigDecimal.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = TimeTableSubjectType.class)
    public JAXBElement<OtherCodeListType> createTimeTableSubjectTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, TimeTableSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TextGenre", scope = StimulusType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStimulusTypeTextGenre(String value) {
        return new JAXBElement<String>(_StimulusTypeTextGenre_QNAME, String.class, StimulusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WordCount", scope = StimulusType.class)
    public JAXBElement<BigInteger> createStimulusTypeWordCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_StimulusTypeWordCount_QNAME, BigInteger.class, StimulusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TextType", scope = StimulusType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStimulusTypeTextType(String value) {
        return new JAXBElement<String>(_StimulusTypeTextType_QNAME, String.class, StimulusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TextDescriptor", scope = StimulusType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStimulusTypeTextDescriptor(String value) {
        return new JAXBElement<String>(_StimulusTypeTextDescriptor_QNAME, String.class, StimulusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = StudentActivityInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentActivityInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentActivityInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CurricularStatus", scope = StudentActivityInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentActivityInfoTypeCurricularStatus(String value) {
        return new JAXBElement<String>(_StudentActivityInfoTypeCurricularStatus_QNAME, String.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Location", scope = StudentActivityInfoType.class)
    public JAXBElement<LocationType> createStudentActivityInfoTypeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_AggregateStatisticInfoTypeLocation_QNAME, LocationType.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentActivityInfoType.class)
    public JAXBElement<SIFMetadataType> createStudentActivityInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentActivityLevel", scope = StudentActivityInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityInfoTypeStudentActivityLevel(String value) {
        return new JAXBElement<String>(_StudentActivityInfoTypeStudentActivityLevel_QNAME, String.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = StudentActivityInfoType.class)
    public JAXBElement<YearLevelsType> createStudentActivityInfoTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, StudentActivityInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPCodeFrameType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPCodeFrameTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPCodeFrameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPCodeFrameType.class)
    public JAXBElement<SIFMetadataType> createNAPCodeFrameTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPCodeFrameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent2SchoolEducationLevel", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent2SchoolEducationLevel(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent2SchoolEducationLevel_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent1EmploymentType", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent1EmploymentType(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent1EmploymentType_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent2Language", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent2Language(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent2Language_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevel", scope = StudentMostRecentContainerType.class)
    public JAXBElement<YearLevelType> createStudentMostRecentContainerTypeYearLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentGradeTypeYearLevel_QNAME, YearLevelType.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent1Language", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent1Language(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent1Language_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Homegroup", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeHomegroup(String value) {
        return new JAXBElement<String>(_StudentGradeTypeHomegroup_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HomeroomLocalId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeHomeroomLocalId(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeHomeroomLocalId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FFPOS", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeFFPOS(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeFFPOS_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent2EmploymentType", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent2EmploymentType(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent2EmploymentType_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent1NonSchoolEducation", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent1NonSchoolEducation(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent1NonSchoolEducation_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolACARAId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeSchoolACARAId(String value) {
        return new JAXBElement<String>(_StaffMostRecentContainerTypeSchoolACARAId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MembershipType", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeMembershipType(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeMembershipType_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherEnrollmentSchoolACARAId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeOtherEnrollmentSchoolACARAId(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeOtherEnrollmentSchoolACARAId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FTE", scope = StudentMostRecentContainerType.class)
    public JAXBElement<BigDecimal> createStudentMostRecentContainerTypeFTE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentMostRecentContainerTypeFTE_QNAME, BigDecimal.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingSchoolId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeReportingSchoolId(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeReportingSchoolId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent1SchoolEducationLevel", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent1SchoolEducationLevel(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent1SchoolEducationLevel_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ClassCode", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeClassCode(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeClassCode_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Parent2NonSchoolEducation", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeParent2NonSchoolEducation(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeParent2NonSchoolEducation_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalCampusId", scope = StudentMostRecentContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentMostRecentContainerTypeLocalCampusId(String value) {
        return new JAXBElement<String>(_StaffMostRecentContainerTypeLocalCampusId_QNAME, String.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestLevel", scope = StudentMostRecentContainerType.class)
    public JAXBElement<YearLevelType> createStudentMostRecentContainerTypeTestLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentMostRecentContainerTypeTestLevel_QNAME, YearLevelType.class, StudentMostRecentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivityRefId", scope = StudentPeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentPeriodAttendanceTypeScheduledActivityRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeScheduledActivityRefId_QNAME, String.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeOut", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPeriodAttendanceTypeTimeOut(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeOut_QNAME, XMLGregorianCalendar.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SessionInfoRefId", scope = StudentPeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentPeriodAttendanceTypeSessionInfoRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeSessionInfoRefId_QNAME, String.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeIn", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPeriodAttendanceTypeTimeIn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeIn_QNAME, XMLGregorianCalendar.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AuditInfo", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<AuditInfoType> createStudentPeriodAttendanceTypeAuditInfo(AuditInfoType value) {
        return new JAXBElement<AuditInfoType>(_StudentPeriodAttendanceTypeAuditInfo_QNAME, AuditInfoType.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentPeriodAttendanceTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceComment", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<String> createStudentPeriodAttendanceTypeAttendanceComment(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeAttendanceComment_QNAME, String.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<SIFMetadataType> createStudentPeriodAttendanceTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimetablePeriod", scope = StudentPeriodAttendanceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentPeriodAttendanceTypeTimetablePeriod(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeTimetablePeriod_QNAME, String.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = StudentPeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPeriodAttendanceTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, StudentPeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StreetPrefix", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeStreetPrefix(String value) {
        return new JAXBElement<String>(_AddressStreetTypeStreetPrefix_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApartmentNumberSuffix", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeApartmentNumberSuffix(String value) {
        return new JAXBElement<String>(_AddressStreetTypeApartmentNumberSuffix_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StreetName", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeStreetName(String value) {
        return new JAXBElement<String>(_AddressStreetTypeStreetName_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApartmentNumberPrefix", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeApartmentNumberPrefix(String value) {
        return new JAXBElement<String>(_AddressStreetTypeApartmentNumberPrefix_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StreetType", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeStreetType(String value) {
        return new JAXBElement<String>(_AddressStreetTypeStreetType_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApartmentType", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeApartmentType(String value) {
        return new JAXBElement<String>(_AddressStreetTypeApartmentType_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ApartmentNumber", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeApartmentNumber(String value) {
        return new JAXBElement<String>(_AddressStreetTypeApartmentNumber_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Line3", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeLine3(String value) {
        return new JAXBElement<String>(_AddressStreetTypeLine3_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Complex", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeComplex(String value) {
        return new JAXBElement<String>(_AddressStreetTypeComplex_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Line2", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeLine2(String value) {
        return new JAXBElement<String>(_AddressStreetTypeLine2_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StreetSuffix", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_AddressStreetTypeStreetSuffix_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StreetNumber", scope = AddressStreetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressStreetTypeStreetNumber(String value) {
        return new JAXBElement<String>(_AddressStreetTypeStreetNumber_QNAME, String.class, AddressStreetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = SuspensionContainerType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createSuspensionContainerTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawalTimeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WithdrawalTimeList", scope = SuspensionContainerType.class)
    public JAXBElement<WithdrawalTimeListType> createSuspensionContainerTypeWithdrawalTimeList(WithdrawalTimeListType value) {
        return new JAXBElement<WithdrawalTimeListType>(_SuspensionContainerTypeWithdrawalTimeList_QNAME, WithdrawalTimeListType.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AdvisementDate", scope = SuspensionContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createSuspensionContainerTypeAdvisementDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SuspensionContainerTypeAdvisementDate_QNAME, XMLGregorianCalendar.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EarlyReturnDate", scope = SuspensionContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createSuspensionContainerTypeEarlyReturnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SuspensionContainerTypeEarlyReturnDate_QNAME, XMLGregorianCalendar.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResolutionMeetingTime", scope = SuspensionContainerType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createSuspensionContainerTypeResolutionMeetingTime(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_SuspensionContainerTypeResolutionMeetingTime_QNAME, java.util.Calendar.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResolutionNotes", scope = SuspensionContainerType.class)
    public JAXBElement<String> createSuspensionContainerTypeResolutionNotes(String value) {
        return new JAXBElement<String>(_SuspensionContainerTypeResolutionNotes_QNAME, String.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Duration", scope = SuspensionContainerType.class)
    public JAXBElement<BigDecimal> createSuspensionContainerTypeDuration(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ActivityTimeTypeDuration_QNAME, BigDecimal.class, SuspensionContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = OtherWellbeingResponseContainerType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createOtherWellbeingResponseContainerTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, OtherWellbeingResponseContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherResponseNotes", scope = OtherWellbeingResponseContainerType.class)
    public JAXBElement<String> createOtherWellbeingResponseContainerTypeOtherResponseNotes(String value) {
        return new JAXBElement<String>(_OtherWellbeingResponseContainerTypeOtherResponseNotes_QNAME, String.class, OtherWellbeingResponseContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherResponseDate", scope = OtherWellbeingResponseContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createOtherWellbeingResponseContainerTypeOtherResponseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OtherWellbeingResponseContainerTypeOtherResponseDate_QNAME, XMLGregorianCalendar.class, OtherWellbeingResponseContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherResponseType", scope = OtherWellbeingResponseContainerType.class)
    public JAXBElement<String> createOtherWellbeingResponseContainerTypeOtherResponseType(String value) {
        return new JAXBElement<String>(_OtherWellbeingResponseContainerTypeOtherResponseType_QNAME, String.class, OtherWellbeingResponseContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherResponseDescription", scope = OtherWellbeingResponseContainerType.class)
    public JAXBElement<String> createOtherWellbeingResponseContainerTypeOtherResponseDescription(String value) {
        return new JAXBElement<String>(_OtherWellbeingResponseContainerTypeOtherResponseDescription_QNAME, String.class, OtherWellbeingResponseContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = ReferralSourceType.class)
    public JAXBElement<OtherCodeListType> createReferralSourceTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, ReferralSourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = TeachingGroupTeacherType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTeacherTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, TeachingGroupTeacherType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameOfRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Name", scope = TeachingGroupTeacherType.class)
    public JAXBElement<NameOfRecordType> createTeachingGroupTeacherTypeName(NameOfRecordType value) {
        return new JAXBElement<NameOfRecordType>(_EvaluationTypeName_QNAME, NameOfRecordType.class, TeachingGroupTeacherType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffLocalId", scope = TeachingGroupTeacherType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupTeacherTypeStaffLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME, String.class, TeachingGroupTeacherType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanRequiredListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PlanRequiredList", scope = PlanRequiredContainerType.class)
    public JAXBElement<PlanRequiredListType> createPlanRequiredContainerTypePlanRequiredList(PlanRequiredListType value) {
        return new JAXBElement<PlanRequiredListType>(_PlanRequiredContainerTypePlanRequiredList_QNAME, PlanRequiredListType.class, PlanRequiredContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = PlanRequiredContainerType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createPlanRequiredContainerTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, PlanRequiredContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = StudentPersonalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentPersonalTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OnTimeGraduationYear", scope = StudentPersonalType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPersonalTypeOnTimeGraduationYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPersonalTypeOnTimeGraduationYear_QNAME, XMLGregorianCalendar.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HomeSchooledStudent", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeHomeSchooledStudent(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeHomeSchooledStudent_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ESLDateAssessed", scope = StudentPersonalType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPersonalTypeESLDateAssessed(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPersonalTypeESLDateAssessed_QNAME, XMLGregorianCalendar.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentPersonalType.class)
    public JAXBElement<SIFMetadataType> createStudentPersonalTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ESLSupport", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeESLSupport(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeESLSupport_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PrePrimaryEducation", scope = StudentPersonalType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentPersonalTypePrePrimaryEducation(String value) {
        return new JAXBElement<String>(_StudentPersonalTypePrePrimaryEducation_QNAME, String.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ElectronicIdList", scope = StudentPersonalType.class)
    public JAXBElement<ElectronicIdListType> createStudentPersonalTypeElectronicIdList(ElectronicIdListType value) {
        return new JAXBElement<ElectronicIdListType>(_StaffPersonalTypeElectronicIdList_QNAME, ElectronicIdListType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicalAlertMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MedicalAlertMessages", scope = StudentPersonalType.class)
    public JAXBElement<MedicalAlertMessagesType> createStudentPersonalTypeMedicalAlertMessages(MedicalAlertMessagesType value) {
        return new JAXBElement<MedicalAlertMessagesType>(_StudentPersonalTypeMedicalAlertMessages_QNAME, MedicalAlertMessagesType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentMostRecentContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MostRecent", scope = StudentPersonalType.class)
    public JAXBElement<StudentMostRecentContainerType> createStudentPersonalTypeMostRecent(StudentMostRecentContainerType value) {
        return new JAXBElement<StudentMostRecentContainerType>(_StaffPersonalTypeMostRecent_QNAME, StudentMostRecentContainerType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YoungCarersRole", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeYoungCarersRole(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeYoungCarersRole_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AcceptableUsePolicy", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeAcceptableUsePolicy(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeAcceptableUsePolicy_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IntegrationAide", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeIntegrationAide(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeIntegrationAide_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentPersonalType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentPersonalTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EconomicDisadvantage", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeEconomicDisadvantage(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeEconomicDisadvantage_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GiftedTalented", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeGiftedTalented(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeGiftedTalented_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FirstAUSchoolEnrollment", scope = StudentPersonalType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPersonalTypeFirstAUSchoolEnrollment(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPersonalTypeFirstAUSchoolEnrollment_QNAME, XMLGregorianCalendar.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Disability", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeDisability(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeDisability_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EducationSupport", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeEducationSupport(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeEducationSupport_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GraduationDate", scope = StudentPersonalType.class)
    public JAXBElement<String> createStudentPersonalTypeGraduationDate(String value) {
        return new JAXBElement<String>(_StudentPersonalTypeGraduationDate_QNAME, String.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherIdList", scope = StudentPersonalType.class)
    public JAXBElement<OtherIdListType> createStudentPersonalTypeOtherIdList(OtherIdListType value) {
        return new JAXBElement<OtherIdListType>(_StaffPersonalTypeOtherIdList_QNAME, OtherIdListType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OfflineDelivery", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeOfflineDelivery(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeOfflineDelivery_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AlertMessages", scope = StudentPersonalType.class)
    public JAXBElement<AlertMessagesType> createStudentPersonalTypeAlertMessages(AlertMessagesType value) {
        return new JAXBElement<AlertMessagesType>(_StudentPersonalTypeAlertMessages_QNAME, AlertMessagesType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ESL", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeESL(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeESL_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Sensitive", scope = StudentPersonalType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentPersonalTypeSensitive(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentPersonalTypeSensitive_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ProjectedGraduationYear", scope = StudentPersonalType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentPersonalTypeProjectedGraduationYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPersonalTypeProjectedGraduationYear_QNAME, XMLGregorianCalendar.class, StudentPersonalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = CalendarDateInfoType.class)
    public JAXBElement<OtherCodeListType> createCalendarDateInfoTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, CalendarDateInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CellType", scope = TeachingGroupPeriodType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupPeriodTypeCellType(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeCellType_QNAME, String.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomNumber", scope = TeachingGroupPeriodType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupPeriodTypeRoomNumber(String value) {
        return new JAXBElement<String>(_SessionInfoTypeRoomNumber_QNAME, String.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCellRefId", scope = TeachingGroupPeriodType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupPeriodTypeTimeTableCellRefId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeTimeTableCellRefId_QNAME, String.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = TeachingGroupPeriodType.class)
    public JAXBElement<XMLGregorianCalendar> createTeachingGroupPeriodTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffLocalId", scope = TeachingGroupPeriodType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupPeriodTypeStaffLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME, String.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PeriodId", scope = TeachingGroupPeriodType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeachingGroupPeriodTypePeriodId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypePeriodId_QNAME, String.class, TeachingGroupPeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Address", scope = EntityContactInfoType.class)
    public JAXBElement<AddressType> createEntityContactInfoTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ContactTypeAddress_QNAME, AddressType.class, EntityContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Role", scope = EntityContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEntityContactInfoTypeRole(String value) {
        return new JAXBElement<String>(_MarkerTypeRole_QNAME, String.class, EntityContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PositionTitle", scope = EntityContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEntityContactInfoTypePositionTitle(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypePositionTitle_QNAME, String.class, EntityContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RegistrationDetails", scope = EntityContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEntityContactInfoTypeRegistrationDetails(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypeRegistrationDetails_QNAME, String.class, EntityContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Qualifications", scope = EntityContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEntityContactInfoTypeQualifications(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypeQualifications_QNAME, String.class, EntityContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleType.TimeElements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeElements", scope = LifeCycleType.class)
    public JAXBElement<LifeCycleType.TimeElements> createLifeCycleTypeTimeElements(LifeCycleType.TimeElements value) {
        return new JAXBElement<LifeCycleType.TimeElements>(_LifeCycleTypeTimeElements_QNAME, LifeCycleType.TimeElements.class, LifeCycleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleType.ModificationHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ModificationHistory", scope = LifeCycleType.class)
    public JAXBElement<LifeCycleType.ModificationHistory> createLifeCycleTypeModificationHistory(LifeCycleType.ModificationHistory value) {
        return new JAXBElement<LifeCycleType.ModificationHistory>(_LifeCycleTypeModificationHistory_QNAME, LifeCycleType.ModificationHistory.class, LifeCycleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleType.Created }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Created", scope = LifeCycleType.class)
    public JAXBElement<LifeCycleType.Created> createLifeCycleTypeCreated(LifeCycleType.Created value) {
        return new JAXBElement<LifeCycleType.Created>(_LifeCycleTypeCreated_QNAME, LifeCycleType.Created.class, LifeCycleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Holder", scope = CopyRightContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCopyRightContainerTypeHolder(String value) {
        return new JAXBElement<String>(_CopyRightContainerTypeHolder_QNAME, String.class, CopyRightContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Date", scope = CopyRightContainerType.class)
    public JAXBElement<XMLGregorianCalendar> createCopyRightContainerTypeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvaluationTypeDate_QNAME, XMLGregorianCalendar.class, CopyRightContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = StaffActivityExtensionType.class)
    public JAXBElement<OtherCodeListType> createStaffActivityExtensionTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, StaffActivityExtensionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInvolvementType.PersonRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonRefId", scope = PersonInvolvementType.class)
    public JAXBElement<PersonInvolvementType.PersonRefId> createPersonInvolvementTypePersonRefId(PersonInvolvementType.PersonRefId value) {
        return new JAXBElement<PersonInvolvementType.PersonRefId>(_PersonInvolvementTypePersonRefId_QNAME, PersonInvolvementType.PersonRefId.class, PersonInvolvementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HowInvolved", scope = PersonInvolvementType.class)
    public JAXBElement<String> createPersonInvolvementTypeHowInvolved(String value) {
        return new JAXBElement<String>(_PersonInvolvementTypeHowInvolved_QNAME, String.class, PersonInvolvementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ShortName", scope = PersonInvolvementType.class)
    public JAXBElement<String> createPersonInvolvementTypeShortName(String value) {
        return new JAXBElement<String>(_PersonInvolvementTypeShortName_QNAME, String.class, PersonInvolvementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Percentage", scope = GradeType.class)
    public JAXBElement<BigDecimal> createGradeTypePercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GradeTypePercentage_QNAME, BigDecimal.class, GradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Narrative", scope = GradeType.class)
    public JAXBElement<String> createGradeTypeNarrative(String value) {
        return new JAXBElement<String>(_GradeTypeNarrative_QNAME, String.class, GradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Numeric", scope = GradeType.class)
    public JAXBElement<BigDecimal> createGradeTypeNumeric(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GradeTypeNumeric_QNAME, BigDecimal.class, GradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Letter", scope = GradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradeTypeLetter(String value) {
        return new JAXBElement<String>(_GradeTypeLetter_QNAME, String.class, GradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MarkInfoRefId", scope = GradeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradeTypeMarkInfoRefId(String value) {
        return new JAXBElement<String>(_GradingAssignmentScoreTypeMarkInfoRefId_QNAME, String.class, GradeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CoreAcademicCourse", scope = SchoolCourseInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSchoolCourseInfoTypeCoreAcademicCourse(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolCourseInfoTypeCoreAcademicCourse_QNAME, AUCodeSetsYesOrNoCategoryType.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DistrictCourseCode", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeDistrictCourseCode(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeDistrictCourseCode_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SchoolCourseInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createSchoolCourseInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SchoolCourseInfoType.class)
    public JAXBElement<SIFMetadataType> createSchoolCourseInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = SchoolCourseInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSchoolCourseInfoTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAreaListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectAreaList", scope = SchoolCourseInfoType.class)
    public JAXBElement<SubjectAreaListType> createSchoolCourseInfoTypeSubjectAreaList(SubjectAreaListType value) {
        return new JAXBElement<SubjectAreaListType>(_SchoolCourseInfoTypeSubjectAreaList_QNAME, SubjectAreaListType.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseCredits", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeCourseCredits(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeCourseCredits_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseContent", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeCourseContent(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeCourseContent_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Department", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeDepartment(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeDepartment_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InstructionalLevel", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeInstructionalLevel(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeInstructionalLevel_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GraduationRequirement", scope = SchoolCourseInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSchoolCourseInfoTypeGraduationRequirement(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolCourseInfoTypeGraduationRequirement_QNAME, AUCodeSetsYesOrNoCategoryType.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TermInfoRefId", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeTermInfoRefId(String value) {
        return new JAXBElement<String>(_SectionInfoTypeTermInfoRefId_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateCourseCode", scope = SchoolCourseInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoTypeStateCourseCode(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeStateCourseCode_QNAME, String.class, SchoolCourseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PathTakenForDomain", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypePathTakenForDomain(String value) {
        return new JAXBElement<String>(_NAPStudentResponseSetTypePathTakenForDomain_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPStudentResponseSetType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPStudentResponseSetTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalibrationSampleFlag", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypeCalibrationSampleFlag(String value) {
        return new JAXBElement<String>(_NAPStudentResponseSetTypeCalibrationSampleFlag_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPStudentResponseTestletListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestletList", scope = NAPStudentResponseSetType.class)
    public JAXBElement<NAPStudentResponseTestletListType> createNAPStudentResponseSetTypeTestletList(NAPStudentResponseTestletListType value) {
        return new JAXBElement<NAPStudentResponseTestletListType>(_NAPStudentResponseSetTypeTestletList_QNAME, NAPStudentResponseTestletListType.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPStudentResponseSetType.class)
    public JAXBElement<SIFMetadataType> createNAPStudentResponseSetTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefId", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypeStudentPersonalRefId(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeStudentPersonalRefId_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestRefId", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypeNAPTestRefId(String value) {
        return new JAXBElement<String>(_NAPTestletTypeNAPTestRefId_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DomainScore", scope = NAPStudentResponseSetType.class)
    public JAXBElement<DomainScoreType> createNAPStudentResponseSetTypeDomainScore(DomainScoreType value) {
        return new JAXBElement<DomainScoreType>(_NAPStudentResponseSetTypeDomainScore_QNAME, DomainScoreType.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParallelTest", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypeParallelTest(String value) {
        return new JAXBElement<String>(_NAPStudentResponseSetTypeParallelTest_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EquatingSampleFlag", scope = NAPStudentResponseSetType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPStudentResponseSetTypeEquatingSampleFlag(String value) {
        return new JAXBElement<String>(_NAPStudentResponseSetTypeEquatingSampleFlag_QNAME, String.class, NAPStudentResponseSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleResponse", scope = AGRuleType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGRuleTypeAGRuleResponse(String value) {
        return new JAXBElement<String>(_AGRuleTypeAGRuleResponse_QNAME, String.class, AGRuleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleComment", scope = AGRuleType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGRuleTypeAGRuleComment(String value) {
        return new JAXBElement<String>(_AGRuleTypeAGRuleComment_QNAME, String.class, AGRuleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleStatus", scope = AGRuleType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGRuleTypeAGRuleStatus(String value) {
        return new JAXBElement<String>(_AGRuleTypeAGRuleStatus_QNAME, String.class, AGRuleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleCode", scope = AGRuleType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAGRuleTypeAGRuleCode(String value) {
        return new JAXBElement<String>(_AGRuleTypeAGRuleCode_QNAME, String.class, AGRuleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingResponseCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponseCategory", scope = WellbeingResponseType.class)
    public JAXBElement<AUCodeSetsWellbeingResponseCategoryType> createWellbeingResponseTypeWellbeingResponseCategory(AUCodeSetsWellbeingResponseCategoryType value) {
        return new JAXBElement<AUCodeSetsWellbeingResponseCategoryType>(_WellbeingResponseTypeWellbeingResponseCategory_QNAME, AUCodeSetsWellbeingResponseCategoryType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetentionContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Detention", scope = WellbeingResponseType.class)
    public JAXBElement<DetentionContainerType> createWellbeingResponseTypeDetention(DetentionContainerType value) {
        return new JAXBElement<DetentionContainerType>(_WellbeingResponseTypeDetention_QNAME, DetentionContainerType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonInvolvementList", scope = WellbeingResponseType.class)
    public JAXBElement<PersonInvolvementListType> createWellbeingResponseTypePersonInvolvementList(PersonInvolvementListType value) {
        return new JAXBElement<PersonInvolvementListType>(_WellbeingResponseTypePersonInvolvementList_QNAME, PersonInvolvementListType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Award", scope = WellbeingResponseType.class)
    public JAXBElement<AwardContainerType> createWellbeingResponseTypeAward(AwardContainerType value) {
        return new JAXBElement<AwardContainerType>(_WellbeingResponseTypeAward_QNAME, AwardContainerType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentList", scope = WellbeingResponseType.class)
    public JAXBElement<WellbeingDocumentListType> createWellbeingResponseTypeDocumentList(WellbeingDocumentListType value) {
        return new JAXBElement<WellbeingDocumentListType>(_WellbeingCharacteristicTypeDocumentList_QNAME, WellbeingDocumentListType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = WellbeingResponseType.class)
    public JAXBElement<SIFExtendedElementsType> createWellbeingResponseTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = WellbeingResponseType.class)
    public JAXBElement<SIFMetadataType> createWellbeingResponseTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponseEndDate", scope = WellbeingResponseType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingResponseTypeWellbeingResponseEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingResponseTypeWellbeingResponseEndDate_QNAME, XMLGregorianCalendar.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanRequiredContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PlanRequired", scope = WellbeingResponseType.class)
    public JAXBElement<PlanRequiredContainerType> createWellbeingResponseTypePlanRequired(PlanRequiredContainerType value) {
        return new JAXBElement<PlanRequiredContainerType>(_WellbeingResponseTypePlanRequired_QNAME, PlanRequiredContainerType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingResponseNotes", scope = WellbeingResponseType.class)
    public JAXBElement<String> createWellbeingResponseTypeWellbeingResponseNotes(String value) {
        return new JAXBElement<String>(_WellbeingResponseTypeWellbeingResponseNotes_QNAME, String.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspensionContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Suspension", scope = WellbeingResponseType.class)
    public JAXBElement<SuspensionContainerType> createWellbeingResponseTypeSuspension(SuspensionContainerType value) {
        return new JAXBElement<SuspensionContainerType>(_WellbeingResponseTypeSuspension_QNAME, SuspensionContainerType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherWellbeingResponseContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherResponse", scope = WellbeingResponseType.class)
    public JAXBElement<OtherWellbeingResponseContainerType> createWellbeingResponseTypeOtherResponse(OtherWellbeingResponseContainerType value) {
        return new JAXBElement<OtherWellbeingResponseContainerType>(_WellbeingResponseTypeOtherResponse_QNAME, OtherWellbeingResponseContainerType.class, WellbeingResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = ResourceUsageType.class)
    public JAXBElement<SIFExtendedElementsType> createResourceUsageTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, ResourceUsageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = ResourceUsageType.class)
    public JAXBElement<SIFMetadataType> createResourceUsageTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, ResourceUsageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TuitionAmount", scope = FQItemType.class)
    public JAXBElement<BigDecimal> createFQItemTypeTuitionAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FQItemTypeTuitionAmount_QNAME, BigDecimal.class, FQItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FQComments", scope = FQItemType.class)
    public JAXBElement<String> createFQItemTypeFQComments(String value) {
        return new JAXBElement<String>(_FQItemTypeFQComments_QNAME, String.class, FQItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DioceseAmount", scope = FQItemType.class)
    public JAXBElement<BigDecimal> createFQItemTypeDioceseAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FQItemTypeDioceseAmount_QNAME, BigDecimal.class, FQItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BoardingAmount", scope = FQItemType.class)
    public JAXBElement<BigDecimal> createFQItemTypeBoardingAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FQItemTypeBoardingAmount_QNAME, BigDecimal.class, FQItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SystemAmount", scope = FQItemType.class)
    public JAXBElement<BigDecimal> createFQItemTypeSystemAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FQItemTypeSystemAmount_QNAME, BigDecimal.class, FQItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Calendar", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentSchoolEnrollmentType.Calendar> createStudentSchoolEnrollmentTypeCalendar(StudentSchoolEnrollmentType.Calendar value) {
        return new JAXBElement<StudentSchoolEnrollmentType.Calendar>(_StudentSchoolEnrollmentTypeCalendar_QNAME, StudentSchoolEnrollmentType.Calendar.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DestinationSchool", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeDestinationSchool(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypeDestinationSchool_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevel", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<YearLevelType> createStudentSchoolEnrollmentTypeYearLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentGradeTypeYearLevel_QNAME, YearLevelType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreviousSchoolName", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypePreviousSchoolName(String value) {
        return new JAXBElement<String>(_StaffAssignmentTypePreviousSchoolName_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IndividualLearningPlan", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentSchoolEnrollmentTypeIndividualLearningPlan(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentSchoolEnrollmentTypeIndividualLearningPlan_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<SIFMetadataType> createStudentSchoolEnrollmentTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Advisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Advisor", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentSchoolEnrollmentType.Advisor> createStudentSchoolEnrollmentTypeAdvisor(StudentSchoolEnrollmentType.Advisor value) {
        return new JAXBElement<StudentSchoolEnrollmentType.Advisor>(_StudentSchoolEnrollmentTypeAdvisor_QNAME, StudentSchoolEnrollmentType.Advisor.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PromotionInfo", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<PromotionInfoType> createStudentSchoolEnrollmentTypePromotionInfo(PromotionInfoType value) {
        return new JAXBElement<PromotionInfoType>(_StudentSchoolEnrollmentTypePromotionInfo_QNAME, PromotionInfoType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "House", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeHouse(String value) {
        return new JAXBElement<String>(_StaffAssignmentTypeHouse_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RecordClosureReason", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeRecordClosureReason(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypeRecordClosureReason_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Homeroom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Homeroom", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentSchoolEnrollmentType.Homeroom> createStudentSchoolEnrollmentTypeHomeroom(StudentSchoolEnrollmentType.Homeroom value) {
        return new JAXBElement<StudentSchoolEnrollmentType.Homeroom>(_StudentSchoolEnrollmentTypeHomeroom_QNAME, StudentSchoolEnrollmentType.Homeroom.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatchmentStatusContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CatchmentStatus", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<CatchmentStatusContainerType> createStudentSchoolEnrollmentTypeCatchmentStatus(CatchmentStatusContainerType value) {
        return new JAXBElement<CatchmentStatusContainerType>(_StudentSchoolEnrollmentTypeCatchmentStatus_QNAME, CatchmentStatusContainerType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FTE", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<BigDecimal> createStudentSchoolEnrollmentTypeFTE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentMostRecentContainerTypeFTE_QNAME, BigDecimal.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentEntryContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EntryType", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentEntryContainerType> createStudentSchoolEnrollmentTypeEntryType(StudentEntryContainerType value) {
        return new JAXBElement<StudentEntryContainerType>(_StudentSchoolEnrollmentTypeEntryType_QNAME, StudentEntryContainerType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ClassCode", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeClassCode(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeClassCode_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PreviousSchool", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypePreviousSchool(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypePreviousSchool_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishingPermissionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PublishingPermissionList", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<PublishingPermissionListType> createStudentSchoolEnrollmentTypePublishingPermissionList(PublishingPermissionListType value) {
        return new JAXBElement<PublishingPermissionListType>(_PersonPictureTypePublishingPermissionList_QNAME, PublishingPermissionListType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestLevel", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<YearLevelType> createStudentSchoolEnrollmentTypeTestLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentMostRecentContainerTypeTestLevel_QNAME, YearLevelType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Counselor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Counselor", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentSchoolEnrollmentType.Counselor> createStudentSchoolEnrollmentTypeCounselor(StudentSchoolEnrollmentType.Counselor value) {
        return new JAXBElement<StudentSchoolEnrollmentType.Counselor>(_StudentSchoolEnrollmentTypeCounselor_QNAME, StudentSchoolEnrollmentType.Counselor.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartedAtSchoolDate", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentSchoolEnrollmentTypeStartedAtSchoolDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentSchoolEnrollmentTypeStartedAtSchoolDate_QNAME, XMLGregorianCalendar.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FTPTStatus", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeFTPTStatus(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypeFTPTStatus_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExitDate", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentSchoolEnrollmentTypeExitDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentSectionEnrollmentTypeExitDate_QNAME, XMLGregorianCalendar.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Homegroup", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeHomegroup(String value) {
        return new JAXBElement<String>(_StudentGradeTypeHomegroup_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentSubjectChoiceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentSubjectChoiceList", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentSubjectChoiceListType> createStudentSchoolEnrollmentTypeStudentSubjectChoiceList(StudentSubjectChoiceListType value) {
        return new JAXBElement<StudentSubjectChoiceListType>(_StudentSchoolEnrollmentTypeStudentSubjectChoiceList_QNAME, StudentSubjectChoiceListType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentSchoolEnrollmentTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentExitContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExitType", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentExitContainerType> createStudentSchoolEnrollmentTypeExitType(StudentExitContainerType value) {
        return new JAXBElement<StudentExitContainerType>(_StudentSchoolEnrollmentTypeExitType_QNAME, StudentExitContainerType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentGroupListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentGroupList", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentGroupListType> createStudentSchoolEnrollmentTypeStudentGroupList(StudentGroupListType value) {
        return new JAXBElement<StudentGroupListType>(_StudentSchoolEnrollmentTypeStudentGroupList_QNAME, StudentGroupListType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FFPOS", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeFFPOS(String value) {
        return new JAXBElement<String>(_StudentMostRecentContainerTypeFFPOS_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DestinationSchoolName", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeDestinationSchoolName(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypeDestinationSchoolName_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ACARASchoolId", scope = StudentSchoolEnrollmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentSchoolEnrollmentTypeACARASchoolId(String value) {
        return new JAXBElement<String>(_StudentSchoolEnrollmentTypeACARASchoolId_QNAME, String.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentExitStatusContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExitStatus", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<StudentExitStatusContainerType> createStudentSchoolEnrollmentTypeExitStatus(StudentExitStatusContainerType value) {
        return new JAXBElement<StudentExitStatusContainerType>(_StudentSchoolEnrollmentTypeExitStatus_QNAME, StudentExitStatusContainerType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingSchool", scope = StudentSchoolEnrollmentType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentSchoolEnrollmentTypeReportingSchool(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentSchoolEnrollmentTypeReportingSchool_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentSchoolEnrollmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = StaffSubjectType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStaffSubjectTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, StaffSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectLocalId", scope = StaffSubjectType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStaffSubjectTypeSubjectLocalId(String value) {
        return new JAXBElement<String>(_StaffSubjectTypeSubjectLocalId_QNAME, String.class, StaffSubjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = ProgramFundingSourceType.class)
    public JAXBElement<OtherCodeListType> createProgramFundingSourceTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, ProgramFundingSourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherNamesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherNames", scope = PersonInfoType.class)
    public JAXBElement<OtherNamesType> createPersonInfoTypeOtherNames(OtherNamesType value) {
        return new JAXBElement<OtherNamesType>(_PersonInfoTypeOtherNames_QNAME, OtherNamesType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemographicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Demographics", scope = PersonInfoType.class)
    public JAXBElement<DemographicsType> createPersonInfoTypeDemographics(DemographicsType value) {
        return new JAXBElement<DemographicsType>(_PersonInfoTypeDemographics_QNAME, DemographicsType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = PersonInfoType.class)
    public JAXBElement<PhoneNumberListType> createPersonInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = PersonInfoType.class)
    public JAXBElement<AddressListType> createPersonInfoTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdContactInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HouseholdContactInfoList", scope = PersonInfoType.class)
    public JAXBElement<HouseholdContactInfoListType> createPersonInfoTypeHouseholdContactInfoList(HouseholdContactInfoListType value) {
        return new JAXBElement<HouseholdContactInfoListType>(_PersonInfoTypeHouseholdContactInfoList_QNAME, HouseholdContactInfoListType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmailList", scope = PersonInfoType.class)
    public JAXBElement<EmailListType> createPersonInfoTypeEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_HouseholdContactInfoTypeEmailList_QNAME, EmailListType.class, PersonInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolProgramListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolProgramList", scope = SchoolProgramsType.class)
    public JAXBElement<SchoolProgramListType> createSchoolProgramsTypeSchoolProgramList(SchoolProgramListType value) {
        return new JAXBElement<SchoolProgramListType>(_SchoolProgramsTypeSchoolProgramList_QNAME, SchoolProgramListType.class, SchoolProgramsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SchoolProgramsType.class)
    public JAXBElement<SIFExtendedElementsType> createSchoolProgramsTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SchoolProgramsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SchoolProgramsType.class)
    public JAXBElement<SIFMetadataType> createSchoolProgramsTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SchoolProgramsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = SchoolProgramsType.class)
    public JAXBElement<XMLGregorianCalendar> createSchoolProgramsTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, SchoolProgramsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceBookingType.ResourceRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ResourceRefId", scope = ResourceBookingType.class)
    public JAXBElement<ResourceBookingType.ResourceRefId> createResourceBookingTypeResourceRefId(ResourceBookingType.ResourceRefId value) {
        return new JAXBElement<ResourceBookingType.ResourceRefId>(_ResourceBookingTypeResourceRefId_QNAME, ResourceBookingType.ResourceRefId.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivityRefId", scope = ResourceBookingType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResourceBookingTypeScheduledActivityRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeScheduledActivityRefId_QNAME, String.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ToPeriod", scope = ResourceBookingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResourceBookingTypeToPeriod(String value) {
        return new JAXBElement<String>(_ResourceBookingTypeToPeriod_QNAME, String.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "KeepOld", scope = ResourceBookingType.class)
    public JAXBElement<Boolean> createResourceBookingTypeKeepOld(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceBookingTypeKeepOld_QNAME, Boolean.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = ResourceBookingType.class)
    public JAXBElement<SIFExtendedElementsType> createResourceBookingTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = ResourceBookingType.class)
    public JAXBElement<SIFMetadataType> createResourceBookingTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Reason", scope = ResourceBookingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResourceBookingTypeReason(String value) {
        return new JAXBElement<String>(_ResourceBookingTypeReason_QNAME, String.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FromPeriod", scope = ResourceBookingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResourceBookingTypeFromPeriod(String value) {
        return new JAXBElement<String>(_ResourceBookingTypeFromPeriod_QNAME, String.class, ResourceBookingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType.LocationRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocationRefId", scope = LocationType.class)
    public JAXBElement<LocationType.LocationRefId> createLocationTypeLocationRefId(LocationType.LocationRefId value) {
        return new JAXBElement<LocationType.LocationRefId>(_LocationTypeLocationRefId_QNAME, LocationType.LocationRefId.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocationName", scope = LocationType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationTypeLocationName(String value) {
        return new JAXBElement<String>(_LocationTypeLocationName_QNAME, String.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinishTime", scope = TeacherCoverType.class)
    public JAXBElement<XMLGregorianCalendar> createTeacherCoverTypeFinishTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeFinishTime_QNAME, XMLGregorianCalendar.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverCreditType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Credit", scope = TeacherCoverType.class)
    public JAXBElement<AUCodeSetsTeacherCoverCreditType> createTeacherCoverTypeCredit(AUCodeSetsTeacherCoverCreditType value) {
        return new JAXBElement<AUCodeSetsTeacherCoverCreditType>(_TeacherCoverTypeCredit_QNAME, AUCodeSetsTeacherCoverCreditType.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Weighting", scope = TeacherCoverType.class)
    public JAXBElement<BigDecimal> createTeacherCoverTypeWeighting(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TeacherCoverTypeWeighting_QNAME, BigDecimal.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsTeacherCoverSupervisionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Supervision", scope = TeacherCoverType.class)
    public JAXBElement<AUCodeSetsTeacherCoverSupervisionType> createTeacherCoverTypeSupervision(AUCodeSetsTeacherCoverSupervisionType value) {
        return new JAXBElement<AUCodeSetsTeacherCoverSupervisionType>(_TeacherCoverTypeSupervision_QNAME, AUCodeSetsTeacherCoverSupervisionType.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = TeacherCoverType.class)
    public JAXBElement<XMLGregorianCalendar> createTeacherCoverTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffLocalId", scope = TeacherCoverType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTeacherCoverTypeStaffLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME, String.class, TeacherCoverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BillingName", scope = DebtorType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDebtorTypeBillingName(String value) {
        return new JAXBElement<String>(_DebtorTypeBillingName_QNAME, String.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Discount", scope = DebtorType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDebtorTypeDiscount(String value) {
        return new JAXBElement<String>(_DebtorTypeDiscount_QNAME, String.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = DebtorType.class)
    public JAXBElement<SIFExtendedElementsType> createDebtorTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = DebtorType.class)
    public JAXBElement<AddressListType> createDebtorTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = DebtorType.class)
    public JAXBElement<SIFMetadataType> createDebtorTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BillingNote", scope = DebtorType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDebtorTypeBillingNote(String value) {
        return new JAXBElement<String>(_DebtorTypeBillingNote_QNAME, String.class, DebtorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Girls", scope = TotalEnrollmentsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTotalEnrollmentsTypeGirls(String value) {
        return new JAXBElement<String>(_TotalEnrollmentsTypeGirls_QNAME, String.class, TotalEnrollmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Boys", scope = TotalEnrollmentsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTotalEnrollmentsTypeBoys(String value) {
        return new JAXBElement<String>(_TotalEnrollmentsTypeBoys_QNAME, String.class, TotalEnrollmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TotalStudents", scope = TotalEnrollmentsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTotalEnrollmentsTypeTotalStudents(String value) {
        return new JAXBElement<String>(_TotalEnrollmentsTypeTotalStudents_QNAME, String.class, TotalEnrollmentsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TechnicalRequirement", scope = TechnicalRequirementsType.class)
    public JAXBElement<String> createTechnicalRequirementsTypeTechnicalRequirement(String value) {
        return new JAXBElement<String>(_TechnicalRequirementsTypeTechnicalRequirement_QNAME, String.class, TechnicalRequirementsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BSB", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeBSB(String value) {
        return new JAXBElement<String>(_VendorInfoTypeBSB_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ABN", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeABN(String value) {
        return new JAXBElement<String>(_VendorInfoTypeABN_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = VendorInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createVendorInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccountNumber", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeAccountNumber(String value) {
        return new JAXBElement<String>(_VendorInfoTypeAccountNumber_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccountName", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeAccountName(String value) {
        return new JAXBElement<String>(_VendorInfoTypeAccountName_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = VendorInfoType.class)
    public JAXBElement<SIFMetadataType> createVendorInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RegisteredForGST", scope = VendorInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createVendorInfoTypeRegisteredForGST(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_VendorInfoTypeRegisteredForGST_QNAME, AUCodeSetsYesOrNoCategoryType.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BPay", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeBPay(String value) {
        return new JAXBElement<String>(_VendorInfoTypeBPay_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CustomerId", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypeCustomerId(String value) {
        return new JAXBElement<String>(_VendorInfoTypeCustomerId_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PaymentTerms", scope = VendorInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVendorInfoTypePaymentTerms(String value) {
        return new JAXBElement<String>(_VendorInfoTypePaymentTerms_QNAME, String.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContactInfo", scope = VendorInfoType.class)
    public JAXBElement<ContactInfoType> createVendorInfoTypeContactInfo(ContactInfoType value) {
        return new JAXBElement<ContactInfoType>(_VendorInfoTypeContactInfo_QNAME, ContactInfoType.class, VendorInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MaxAttemptsAllowed", scope = GradingAssignmentType.class)
    public JAXBElement<BigInteger> createGradingAssignmentTypeMaxAttemptsAllowed(BigInteger value) {
        return new JAXBElement<BigInteger>(_GradingAssignmentTypeMaxAttemptsAllowed_QNAME, BigInteger.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubAssignmentList", scope = GradingAssignmentType.class)
    public JAXBElement<AssignmentListType> createGradingAssignmentTypeSubAssignmentList(AssignmentListType value) {
        return new JAXBElement<AssignmentListType>(_GradingAssignmentTypeSubAssignmentList_QNAME, AssignmentListType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CreateDate", scope = GradingAssignmentType.class)
    public JAXBElement<XMLGregorianCalendar> createGradingAssignmentTypeCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GradingAssignmentTypeCreateDate_QNAME, XMLGregorianCalendar.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardList", scope = GradingAssignmentType.class)
    public JAXBElement<LearningStandardListType> createGradingAssignmentTypeLearningStandardList(LearningStandardListType value) {
        return new JAXBElement<LearningStandardListType>(_StudentGradeTypeLearningStandardList_QNAME, LearningStandardListType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = GradingAssignmentType.class)
    public JAXBElement<SIFExtendedElementsType> createGradingAssignmentTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = GradingAssignmentType.class)
    public JAXBElement<SIFMetadataType> createGradingAssignmentTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Weight", scope = GradingAssignmentType.class)
    public JAXBElement<BigDecimal> createGradingAssignmentTypeWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GradingAssignmentTypeWeight_QNAME, BigDecimal.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentPersonalRefIdList", scope = GradingAssignmentType.class)
    public JAXBElement<StudentsType> createGradingAssignmentTypeStudentPersonalRefIdList(StudentsType value) {
        return new JAXBElement<StudentsType>(_GradingAssignmentTypeStudentPersonalRefIdList_QNAME, StudentsType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericRubricType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RubricScoringGuide", scope = GradingAssignmentType.class)
    public JAXBElement<GenericRubricType> createGradingAssignmentTypeRubricScoringGuide(GenericRubricType value) {
        return new JAXBElement<GenericRubricType>(_GradingAssignmentTypeRubricScoringGuide_QNAME, GenericRubricType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupRefId", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeTeachingGroupRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeTeachingGroupRefId_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssignmentPurpose", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeAssignmentPurpose(String value) {
        return new JAXBElement<String>(_GradingAssignmentTypeAssignmentPurpose_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DetailedDescriptionURL", scope = GradingAssignmentType.class)
    public JAXBElement<String> createGradingAssignmentTypeDetailedDescriptionURL(String value) {
        return new JAXBElement<String>(_GradingAssignmentTypeDetailedDescriptionURL_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LevelAssessed", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeLevelAssessed(String value) {
        return new JAXBElement<String>(_GradingAssignmentTypeLevelAssessed_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DueDate", scope = GradingAssignmentType.class)
    public JAXBElement<XMLGregorianCalendar> createGradingAssignmentTypeDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceTypeDueDate_QNAME, XMLGregorianCalendar.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PrerequisiteList", scope = GradingAssignmentType.class)
    public JAXBElement<PrerequisitesType> createGradingAssignmentTypePrerequisiteList(PrerequisitesType value) {
        return new JAXBElement<PrerequisitesType>(_GradingAssignmentTypePrerequisiteList_QNAME, PrerequisitesType.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingCategory", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeGradingCategory(String value) {
        return new JAXBElement<String>(_GradingAssignmentTypeGradingCategory_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssessmentType", scope = GradingAssignmentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGradingAssignmentTypeAssessmentType(String value) {
        return new JAXBElement<String>(_GradingAssignmentTypeAssessmentType_QNAME, String.class, GradingAssignmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DetailedDescriptionBinary", scope = GradingAssignmentType.class)
    public JAXBElement<byte[]> createGradingAssignmentTypeDetailedDescriptionBinary(byte[] value) {
        return new JAXBElement<byte[]>(_GradingAssignmentTypeDetailedDescriptionBinary_QNAME, byte[].class, GradingAssignmentType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandardItems", scope = EducationFilterType.class)
    public JAXBElement<LearningStandardsType> createEducationFilterTypeLearningStandardItems(LearningStandardsType value) {
        return new JAXBElement<LearningStandardsType>(_LearningStandardItems_QNAME, LearningStandardsType.class, EducationFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Descriptor", scope = ScoreDescriptionType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScoreDescriptionTypeDescriptor(String value) {
        return new JAXBElement<String>(_NAPWritingRubricTypeDescriptor_QNAME, String.class, ScoreDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "QuantityDelivered", scope = PurchasingItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPurchasingItemTypeQuantityDelivered(String value) {
        return new JAXBElement<String>(_PurchasingItemTypeQuantityDelivered_QNAME, String.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "UnitCost", scope = PurchasingItemType.class)
    public JAXBElement<MonetaryAmountType> createPurchasingItemTypeUnitCost(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_PurchasingItemTypeUnitCost_QNAME, MonetaryAmountType.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TotalCost", scope = PurchasingItemType.class)
    public JAXBElement<MonetaryAmountType> createPurchasingItemTypeTotalCost(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_PurchasingItemTypeTotalCost_QNAME, MonetaryAmountType.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ItemNumber", scope = PurchasingItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPurchasingItemTypeItemNumber(String value) {
        return new JAXBElement<String>(_PurchasingItemTypeItemNumber_QNAME, String.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseAccountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ExpenseAccounts", scope = PurchasingItemType.class)
    public JAXBElement<ExpenseAccountsType> createPurchasingItemTypeExpenseAccounts(ExpenseAccountsType value) {
        return new JAXBElement<ExpenseAccountsType>(_PurchasingItemTypeExpenseAccounts_QNAME, ExpenseAccountsType.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Quantity", scope = PurchasingItemType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPurchasingItemTypeQuantity(String value) {
        return new JAXBElement<String>(_PurchasingItemTypeQuantity_QNAME, String.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxRate", scope = PurchasingItemType.class)
    public JAXBElement<BigDecimal> createPurchasingItemTypeTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceTypeTaxRate_QNAME, BigDecimal.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CancelledOrder", scope = PurchasingItemType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createPurchasingItemTypeCancelledOrder(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_PurchasingItemTypeCancelledOrder_QNAME, AUCodeSetsYesOrNoCategoryType.class, PurchasingItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LifeCycle", scope = SIFMetadataType.class)
    public JAXBElement<LifeCycleType> createSIFMetadataTypeLifeCycle(LifeCycleType value) {
        return new JAXBElement<LifeCycleType>(_SIFMetadataTypeLifeCycle_QNAME, LifeCycleType.class, SIFMetadataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType.TimeElements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeElements", scope = SIFMetadataType.class)
    public JAXBElement<SIFMetadataType.TimeElements> createSIFMetadataTypeTimeElements(SIFMetadataType.TimeElements value) {
        return new JAXBElement<SIFMetadataType.TimeElements>(_LifeCycleTypeTimeElements_QNAME, SIFMetadataType.TimeElements.class, SIFMetadataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EducationFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EducationFilter", scope = SIFMetadataType.class)
    public JAXBElement<EducationFilterType> createSIFMetadataTypeEducationFilter(EducationFilterType value) {
        return new JAXBElement<EducationFilterType>(_SIFMetadataTypeEducationFilter_QNAME, EducationFilterType.class, SIFMetadataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Version", scope = SoftwareRequirementType.class)
    public JAXBElement<String> createSoftwareRequirementTypeVersion(String value) {
        return new JAXBElement<String>(_SoftwareRequirementTypeVersion_QNAME, String.class, SoftwareRequirementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OS", scope = SoftwareRequirementType.class)
    public JAXBElement<String> createSoftwareRequirementTypeOS(String value) {
        return new JAXBElement<String>(_SoftwareRequirementTypeOS_QNAME, String.class, SoftwareRequirementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Vendor", scope = SoftwareRequirementType.class)
    public JAXBElement<String> createSoftwareRequirementTypeVendor(String value) {
        return new JAXBElement<String>(_SoftwareRequirementTypeVendor_QNAME, String.class, SoftwareRequirementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AgreementDate", scope = LearningResourceType.class)
    public JAXBElement<XMLGregorianCalendar> createLearningResourceTypeAgreementDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LearningResourceTypeAgreementDate_QNAME, XMLGregorianCalendar.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = LearningResourceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLearningResourceTypeStatus(String value) {
        return new JAXBElement<String>(_AwardContainerTypeStatus_QNAME, String.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = LearningResourceType.class)
    public JAXBElement<String> createLearningResourceTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandards", scope = LearningResourceType.class)
    public JAXBElement<LearningStandardsType> createLearningResourceTypeLearningStandards(LearningStandardsType value) {
        return new JAXBElement<LearningStandardsType>(_LearningResourceTypeLearningStandards_QNAME, LearningStandardsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = LearningResourceType.class)
    public JAXBElement<SIFExtendedElementsType> createLearningResourceTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaTypesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MediaTypes", scope = LearningResourceType.class)
    public JAXBElement<MediaTypesType> createLearningResourceTypeMediaTypes(MediaTypesType value) {
        return new JAXBElement<MediaTypesType>(_LearningResourceTypeMediaTypes_QNAME, MediaTypesType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = LearningResourceType.class)
    public JAXBElement<SIFMetadataType> createLearningResourceTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "UseAgreement", scope = LearningResourceType.class)
    public JAXBElement<String> createLearningResourceTypeUseAgreement(String value) {
        return new JAXBElement<String>(_LearningResourceTypeUseAgreement_QNAME, String.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Approvals", scope = LearningResourceType.class)
    public JAXBElement<ApprovalsType> createLearningResourceTypeApprovals(ApprovalsType value) {
        return new JAXBElement<ApprovalsType>(_LearningResourceTypeApprovals_QNAME, ApprovalsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Evaluations", scope = LearningResourceType.class)
    public JAXBElement<EvaluationsType> createLearningResourceTypeEvaluations(EvaluationsType value) {
        return new JAXBElement<EvaluationsType>(_LearningResourceTypeEvaluations_QNAME, EvaluationsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Contacts", scope = LearningResourceType.class)
    public JAXBElement<ContactsType> createLearningResourceTypeContacts(ContactsType value) {
        return new JAXBElement<ContactsType>(_LearningResourceTypeContacts_QNAME, ContactsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACStrandAreaListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectAreas", scope = LearningResourceType.class)
    public JAXBElement<ACStrandAreaListType> createLearningResourceTypeSubjectAreas(ACStrandAreaListType value) {
        return new JAXBElement<ACStrandAreaListType>(_LearningResourceTypeSubjectAreas_QNAME, ACStrandAreaListType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourceType.Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Location", scope = LearningResourceType.class)
    public JAXBElement<LearningResourceType.Location> createLearningResourceTypeLocation(LearningResourceType.Location value) {
        return new JAXBElement<LearningResourceType.Location>(_AggregateStatisticInfoTypeLocation_QNAME, LearningResourceType.Location.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResourcePackageRefId", scope = LearningResourceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLearningResourceTypeLearningResourcePackageRefId(String value) {
        return new JAXBElement<String>(_LearningResourceTypeLearningResourcePackageRefId_QNAME, String.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Author", scope = LearningResourceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLearningResourceTypeAuthor(String value) {
        return new JAXBElement<String>(_LearningResourceTypeAuthor_QNAME, String.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = LearningResourceType.class)
    public JAXBElement<YearLevelsType> createLearningResourceTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, LearningResourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = WithdrawalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWithdrawalTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, WithdrawalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivityRefId", scope = WithdrawalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWithdrawalTypeScheduledActivityRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeScheduledActivityRefId_QNAME, String.class, WithdrawalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WithdrawalEndTime", scope = WithdrawalType.class)
    public JAXBElement<XMLGregorianCalendar> createWithdrawalTypeWithdrawalEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WithdrawalTypeWithdrawalEndTime_QNAME, XMLGregorianCalendar.class, WithdrawalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCellRefId", scope = WithdrawalType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWithdrawalTypeTimeTableCellRefId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeTimeTableCellRefId_QNAME, String.class, WithdrawalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WithdrawalStartTime", scope = WithdrawalType.class)
    public JAXBElement<XMLGregorianCalendar> createWithdrawalTypeWithdrawalStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WithdrawalTypeWithdrawalStartTime_QNAME, XMLGregorianCalendar.class, WithdrawalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BookletType", scope = AdjustmentContainerType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdjustmentContainerTypeBookletType(String value) {
        return new JAXBElement<String>(_AdjustmentContainerTypeBookletType_QNAME, String.class, AdjustmentContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Address", scope = ContactInfoType.class)
    public JAXBElement<AddressType> createContactInfoTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ContactTypeAddress_QNAME, AddressType.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Role", scope = ContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createContactInfoTypeRole(String value) {
        return new JAXBElement<String>(_MarkerTypeRole_QNAME, String.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PositionTitle", scope = ContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createContactInfoTypePositionTitle(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypePositionTitle_QNAME, String.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = ContactInfoType.class)
    public JAXBElement<PhoneNumberListType> createContactInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RegistrationDetails", scope = ContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createContactInfoTypeRegistrationDetails(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypeRegistrationDetails_QNAME, String.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Qualifications", scope = ContactInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createContactInfoTypeQualifications(String value) {
        return new JAXBElement<String>(_EntityContactInfoTypeQualifications_QNAME, String.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmailList", scope = ContactInfoType.class)
    public JAXBElement<EmailListType> createContactInfoTypeEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_HouseholdContactInfoTypeEmailList_QNAME, EmailListType.class, ContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EntityName", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeEntityName(String value) {
        return new JAXBElement<String>(_AGReportingObjectResponseTypeEntityName_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQContextualQuestionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FQContextualQuestionList", scope = FQReportingType.class)
    public JAXBElement<FQContextualQuestionListType> createFQReportingTypeFQContextualQuestionList(FQContextualQuestionListType value) {
        return new JAXBElement<FQContextualQuestionListType>(_FQReportingTypeFQContextualQuestionList_QNAME, FQContextualQuestionListType.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FQRefId", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeFQRefId(String value) {
        return new JAXBElement<String>(_FQReportingTypeFQRefId_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AGRuleList", scope = FQReportingType.class)
    public JAXBElement<AGRuleListType> createFQReportingTypeAGRuleList(AGRuleListType value) {
        return new JAXBElement<AGRuleListType>(_AGReportingObjectResponseTypeAGRuleList_QNAME, AGRuleListType.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ACARAId", scope = FQReportingType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFQReportingTypeACARAId(String value) {
        return new JAXBElement<String>(_FQReportingTypeACARAId_QNAME, String.class, FQReportingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = LanguageBaseType.class)
    public JAXBElement<OtherCodeListType> createLanguageBaseTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, LanguageBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LanguageType", scope = LanguageBaseType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguageBaseTypeLanguageType(String value) {
        return new JAXBElement<String>(_LanguageBaseTypeLanguageType_QNAME, String.class, LanguageBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Dialect", scope = LanguageBaseType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLanguageBaseTypeDialect(String value) {
        return new JAXBElement<String>(_LanguageBaseTypeDialect_QNAME, String.class, LanguageBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecognitionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RecognitionList", scope = StudentActivityParticipationType.class)
    public JAXBElement<RecognitionListType> createStudentActivityParticipationTypeRecognitionList(RecognitionListType value) {
        return new JAXBElement<RecognitionListType>(_StudentActivityParticipationTypeRecognitionList_QNAME, RecognitionListType.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDate", scope = StudentActivityParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentActivityParticipationTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTimeTypeStartDate_QNAME, XMLGregorianCalendar.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Role", scope = StudentActivityParticipationType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentActivityParticipationTypeRole(String value) {
        return new JAXBElement<String>(_MarkerTypeRole_QNAME, String.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDate", scope = StudentActivityParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentActivityParticipationTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentActivityParticipationType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentActivityParticipationTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentActivityParticipationType.class)
    public JAXBElement<SIFMetadataType> createStudentActivityParticipationTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolYear", scope = StudentActivityParticipationType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentActivityParticipationTypeSchoolYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SectionInfoTypeSchoolYear_QNAME, XMLGregorianCalendar.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParticipationComment", scope = StudentActivityParticipationType.class)
    public JAXBElement<String> createStudentActivityParticipationTypeParticipationComment(String value) {
        return new JAXBElement<String>(_StudentActivityParticipationTypeParticipationComment_QNAME, String.class, StudentActivityParticipationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentList", scope = PersonalisedPlanType.class)
    public JAXBElement<WellbeingDocumentListType> createPersonalisedPlanTypeDocumentList(WellbeingDocumentListType value) {
        return new JAXBElement<WellbeingDocumentListType>(_WellbeingCharacteristicTypeDocumentList_QNAME, WellbeingDocumentListType.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlanEndDate", scope = PersonalisedPlanType.class)
    public JAXBElement<XMLGregorianCalendar> createPersonalisedPlanTypePersonalisedPlanEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonalisedPlanTypePersonalisedPlanEndDate_QNAME, XMLGregorianCalendar.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlanNotes", scope = PersonalisedPlanType.class)
    public JAXBElement<String> createPersonalisedPlanTypePersonalisedPlanNotes(String value) {
        return new JAXBElement<String>(_PersonalisedPlanTypePersonalisedPlanNotes_QNAME, String.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = PersonalisedPlanType.class)
    public JAXBElement<SIFExtendedElementsType> createPersonalisedPlanTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssociatedAttachment", scope = PersonalisedPlanType.class)
    public JAXBElement<String> createPersonalisedPlanTypeAssociatedAttachment(String value) {
        return new JAXBElement<String>(_PersonalisedPlanTypeAssociatedAttachment_QNAME, String.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = PersonalisedPlanType.class)
    public JAXBElement<SIFMetadataType> createPersonalisedPlanTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonalisedPlanReviewDate", scope = PersonalisedPlanType.class)
    public JAXBElement<XMLGregorianCalendar> createPersonalisedPlanTypePersonalisedPlanReviewDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonalisedPlanTypePersonalisedPlanReviewDate_QNAME, XMLGregorianCalendar.class, PersonalisedPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InstructionalMinutes", scope = CalendarSummaryType.class)
    public JAXBElement<Long> createCalendarSummaryTypeInstructionalMinutes(Long value) {
        return new JAXBElement<Long>(_CalendarSummaryTypeInstructionalMinutes_QNAME, Long.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MinutesPerDay", scope = CalendarSummaryType.class)
    public JAXBElement<Long> createCalendarSummaryTypeMinutesPerDay(Long value) {
        return new JAXBElement<Long>(_CalendarSummaryTypeMinutesPerDay_QNAME, Long.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDate", scope = CalendarSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createCalendarSummaryTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTimeTypeStartDate_QNAME, XMLGregorianCalendar.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = CalendarSummaryType.class)
    public JAXBElement<String> createCalendarSummaryTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GraduationDate", scope = CalendarSummaryType.class)
    public JAXBElement<String> createCalendarSummaryTypeGraduationDate(String value) {
        return new JAXBElement<String>(_StudentPersonalTypeGraduationDate_QNAME, String.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDate", scope = CalendarSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createCalendarSummaryTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = CalendarSummaryType.class)
    public JAXBElement<SIFExtendedElementsType> createCalendarSummaryTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LastInstructionDate", scope = CalendarSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createCalendarSummaryTypeLastInstructionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CalendarSummaryTypeLastInstructionDate_QNAME, XMLGregorianCalendar.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = CalendarSummaryType.class)
    public JAXBElement<SIFMetadataType> createCalendarSummaryTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FirstInstructionDate", scope = CalendarSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createCalendarSummaryTypeFirstInstructionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CalendarSummaryTypeFirstInstructionDate_QNAME, XMLGregorianCalendar.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = CalendarSummaryType.class)
    public JAXBElement<YearLevelsType> createCalendarSummaryTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, CalendarSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaExpiryDate", scope = VisaSubClassType.class)
    public JAXBElement<XMLGregorianCalendar> createVisaSubClassTypeVisaExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VisaSubClassTypeVisaExpiryDate_QNAME, XMLGregorianCalendar.class, VisaSubClassType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ATEExpiryDate", scope = VisaSubClassType.class)
    public JAXBElement<XMLGregorianCalendar> createVisaSubClassTypeATEExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VisaSubClassTypeATEExpiryDate_QNAME, XMLGregorianCalendar.class, VisaSubClassType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaStatisticalCode", scope = VisaSubClassType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVisaSubClassTypeVisaStatisticalCode(String value) {
        return new JAXBElement<String>(_VisaSubClassTypeVisaStatisticalCode_QNAME, String.class, VisaSubClassType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ATEStartDate", scope = VisaSubClassType.class)
    public JAXBElement<XMLGregorianCalendar> createVisaSubClassTypeATEStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VisaSubClassTypeATEStartDate_QNAME, XMLGregorianCalendar.class, VisaSubClassType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = LifeCycleType.ModificationHistory.Modified.class)
    public JAXBElement<String> createLifeCycleTypeModificationHistoryModifiedDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, LifeCycleType.ModificationHistory.Modified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = AggregateStatisticFactType.class)
    public JAXBElement<SIFExtendedElementsType> createAggregateStatisticFactTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, AggregateStatisticFactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Excluded", scope = AggregateStatisticFactType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAggregateStatisticFactTypeExcluded(String value) {
        return new JAXBElement<String>(_AggregateStatisticFactTypeExcluded_QNAME, String.class, AggregateStatisticFactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = AggregateStatisticFactType.class)
    public JAXBElement<SIFMetadataType> createAggregateStatisticFactTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, AggregateStatisticFactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Response", scope = NAPTestletResponseItemType.class)
    public JAXBElement<String> createNAPTestletResponseItemTypeResponse(String value) {
        return new JAXBElement<String>(_NAPTestletResponseItemTypeResponse_QNAME, String.class, NAPTestletResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Score", scope = NAPTestletResponseItemType.class)
    public JAXBElement<BigDecimal> createNAPTestletResponseItemTypeScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestletResponseItemTypeScore_QNAME, BigDecimal.class, NAPTestletResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link javax.xml.datatype.Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LapsedTimeItem", scope = NAPTestletResponseItemType.class)
    public JAXBElement<javax.xml.datatype.Duration> createNAPTestletResponseItemTypeLapsedTimeItem(javax.xml.datatype.Duration value) {
        return new JAXBElement<javax.xml.datatype.Duration>(_NAPTestletResponseItemTypeLapsedTimeItem_QNAME, javax.xml.datatype.Duration.class, NAPTestletResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NAPSubscoreListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubscoreList", scope = NAPTestletResponseItemType.class)
    public JAXBElement<NAPSubscoreListType> createNAPTestletResponseItemTypeSubscoreList(NAPSubscoreListType value) {
        return new JAXBElement<NAPSubscoreListType>(_GradingAssignmentScoreTypeSubscoreList_QNAME, NAPSubscoreListType.class, NAPTestletResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestItemRefId", scope = NAPTestletResponseItemType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestletResponseItemTypeNAPTestItemRefId(String value) {
        return new JAXBElement<String>(_NAPTestletResponseItemTypeNAPTestItemRefId_QNAME, String.class, NAPTestletResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = DwellingArrangementType.class)
    public JAXBElement<OtherCodeListType> createDwellingArrangementTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, DwellingArrangementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Weight", scope = AssignmentScoreType.class)
    public JAXBElement<BigDecimal> createAssignmentScoreTypeWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GradingAssignmentTypeWeight_QNAME, BigDecimal.class, AssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GradingAssignmentScoreRefId", scope = AssignmentScoreType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssignmentScoreTypeGradingAssignmentScoreRefId(String value) {
        return new JAXBElement<String>(_AssignmentScoreTypeGradingAssignmentScoreRefId_QNAME, String.class, AssignmentScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = PrincipalInfoType.class)
    public JAXBElement<PhoneNumberListType> createPrincipalInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, PrincipalInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContactTitle", scope = PrincipalInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPrincipalInfoTypeContactTitle(String value) {
        return new JAXBElement<String>(_PrincipalInfoTypeContactTitle_QNAME, String.class, PrincipalInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EmailList", scope = PrincipalInfoType.class)
    public JAXBElement<EmailListType> createPrincipalInfoTypeEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_HouseholdContactInfoTypeEmailList_QNAME, EmailListType.class, PrincipalInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentProficiency", scope = DomainScoreType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDomainScoreTypeStudentProficiency(String value) {
        return new JAXBElement<String>(_DomainScoreTypeStudentProficiency_QNAME, String.class, DomainScoreType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndTime", scope = TimeTablePeriodType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTablePeriodTypeEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeTablePeriodTypeEndTime_QNAME, XMLGregorianCalendar.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InstructionalMinutes", scope = TimeTablePeriodType.class)
    public JAXBElement<Long> createTimeTablePeriodTypeInstructionalMinutes(Long value) {
        return new JAXBElement<Long>(_CalendarSummaryTypeInstructionalMinutes_QNAME, Long.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BellPeriod", scope = TimeTablePeriodType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTablePeriodTypeBellPeriod(String value) {
        return new JAXBElement<String>(_TimeTablePeriodTypeBellPeriod_QNAME, String.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RegularSchoolPeriod", scope = TimeTablePeriodType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTablePeriodTypeRegularSchoolPeriod(String value) {
        return new JAXBElement<String>(_TimeTablePeriodTypeRegularSchoolPeriod_QNAME, String.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "UseInAttendanceCalculations", scope = TimeTablePeriodType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTablePeriodTypeUseInAttendanceCalculations(String value) {
        return new JAXBElement<String>(_TimeTablePeriodTypeUseInAttendanceCalculations_QNAME, String.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = TimeTablePeriodType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTablePeriodTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, TimeTablePeriodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HomeroomNumber", scope = RoomInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoomInfoTypeHomeroomNumber(String value) {
        return new JAXBElement<String>(_RoomInfoTypeHomeroomNumber_QNAME, String.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Capacity", scope = RoomInfoType.class)
    public JAXBElement<Long> createRoomInfoTypeCapacity(Long value) {
        return new JAXBElement<Long>(_RoomInfoTypeCapacity_QNAME, Long.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Size", scope = RoomInfoType.class)
    public JAXBElement<BigDecimal> createRoomInfoTypeSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RoomInfoTypeSize_QNAME, BigDecimal.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Building", scope = RoomInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoomInfoTypeBuilding(String value) {
        return new JAXBElement<String>(_RoomInfoTypeBuilding_QNAME, String.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = RoomInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoomInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomType", scope = RoomInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoomInfoTypeRoomType(String value) {
        return new JAXBElement<String>(_RoomInfoTypeRoomType_QNAME, String.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = RoomInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoomInfoTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = RoomInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createRoomInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = RoomInfoType.class)
    public JAXBElement<SIFMetadataType> createRoomInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumber", scope = RoomInfoType.class)
    public JAXBElement<PhoneNumberType> createRoomInfoTypePhoneNumber(PhoneNumberType value) {
        return new JAXBElement<PhoneNumberType>(_ContactTypePhoneNumber_QNAME, PhoneNumberType.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaffListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffList", scope = RoomInfoType.class)
    public JAXBElement<StaffListType> createRoomInfoTypeStaffList(StaffListType value) {
        return new JAXBElement<StaffListType>(_RoomInfoTypeStaffList_QNAME, StaffListType.class, RoomInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Category", scope = SchoolProgramType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolProgramTypeCategory(String value) {
        return new JAXBElement<String>(_SchoolProgramTypeCategory_QNAME, String.class, SchoolProgramType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = SchoolProgramType.class)
    public JAXBElement<OtherCodeListType> createSchoolProgramTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, SchoolProgramType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoleScopeList", scope = SystemRoleType.SystemContextList.SystemContext.RoleList.Role.class)
    public JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList> createSystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeList(SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList value) {
        return new JAXBElement<SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList>(_SystemRoleTypeSystemContextListSystemContextRoleListRoleRoleScopeList_QNAME, SystemRoleType.SystemContextList.SystemContext.RoleList.Role.RoleScopeList.class, SystemRoleType.SystemContextList.SystemContext.RoleList.Role.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDateTime", scope = TimeElementType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createTimeElementTypeEndDateTime(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_TimeElementTypeSpanGapsSpanGapEndDateTime_QNAME, java.util.Calendar.class, TimeElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeElementType.SpanGaps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SpanGaps", scope = TimeElementType.class)
    public JAXBElement<TimeElementType.SpanGaps> createTimeElementTypeSpanGaps(TimeElementType.SpanGaps value) {
        return new JAXBElement<TimeElementType.SpanGaps>(_TimeElementTypeSpanGaps_QNAME, TimeElementType.SpanGaps.class, TimeElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDateTime", scope = TimeElementType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createTimeElementTypeStartDateTime(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_TimeElementTypeSpanGapsSpanGapStartDateTime_QNAME, java.util.Calendar.class, TimeElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = SubjectAreaType.class)
    public JAXBElement<OtherCodeListType> createSubjectAreaTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, SubjectAreaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = ProgramAvailabilityType.class)
    public JAXBElement<OtherCodeListType> createProgramAvailabilityTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, ProgramAvailabilityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingEventCategoryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventCategoryList", scope = WellbeingEventType.class)
    public JAXBElement<WellbeingEventCategoryListType> createWellbeingEventTypeWellbeingEventCategoryList(WellbeingEventCategoryListType value) {
        return new JAXBElement<WellbeingEventCategoryListType>(_WellbeingEventTypeWellbeingEventCategoryList_QNAME, WellbeingEventCategoryListType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ConfidentialFlag", scope = WellbeingEventType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createWellbeingEventTypeConfidentialFlag(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_WellbeingCharacteristicTypeConfidentialFlag_QNAME, AUCodeSetsYesOrNoCategoryType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentList", scope = WellbeingEventType.class)
    public JAXBElement<WellbeingDocumentListType> createWellbeingEventTypeDocumentList(WellbeingDocumentListType value) {
        return new JAXBElement<WellbeingDocumentListType>(_WellbeingCharacteristicTypeDocumentList_QNAME, WellbeingDocumentListType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Status", scope = WellbeingEventType.class)
    public JAXBElement<AUCodeSetsWellbeingStatusType> createWellbeingEventTypeStatus(AUCodeSetsWellbeingStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingStatusType>(_AwardContainerTypeStatus_QNAME, AUCodeSetsWellbeingStatusType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReportingStaffRefId", scope = WellbeingEventType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWellbeingEventTypeReportingStaffRefId(String value) {
        return new JAXBElement<String>(_WellbeingEventTypeReportingStaffRefId_QNAME, String.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = WellbeingEventType.class)
    public JAXBElement<SIFExtendedElementsType> createWellbeingEventTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingEventLocationDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventLocationDetails", scope = WellbeingEventType.class)
    public JAXBElement<WellbeingEventLocationDetailsType> createWellbeingEventTypeWellbeingEventLocationDetails(WellbeingEventLocationDetailsType value) {
        return new JAXBElement<WellbeingEventLocationDetailsType>(_WellbeingEventTypeWellbeingEventLocationDetails_QNAME, WellbeingEventLocationDetailsType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = WellbeingEventType.class)
    public JAXBElement<SIFMetadataType> createWellbeingEventTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PersonInvolvementList", scope = WellbeingEventType.class)
    public JAXBElement<PersonInvolvementListType> createWellbeingEventTypePersonInvolvementList(PersonInvolvementListType value) {
        return new JAXBElement<PersonInvolvementListType>(_WellbeingResponseTypePersonInvolvementList_QNAME, PersonInvolvementListType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowUpActionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FollowUpActionList", scope = WellbeingEventType.class)
    public JAXBElement<FollowUpActionListType> createWellbeingEventTypeFollowUpActionList(FollowUpActionListType value) {
        return new JAXBElement<FollowUpActionListType>(_WellbeingEventTypeFollowUpActionList_QNAME, FollowUpActionListType.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventNotes", scope = WellbeingEventType.class)
    public JAXBElement<String> createWellbeingEventTypeWellbeingEventNotes(String value) {
        return new JAXBElement<String>(_WellbeingEventTypeWellbeingEventNotes_QNAME, String.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventCreationTimeStamp", scope = WellbeingEventType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<java.util.Calendar> createWellbeingEventTypeWellbeingEventCreationTimeStamp(java.util.Calendar value) {
        return new JAXBElement<java.util.Calendar>(_WellbeingEventTypeWellbeingEventCreationTimeStamp_QNAME, java.util.Calendar.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventTime", scope = WellbeingEventType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingEventTypeWellbeingEventTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingEventTypeWellbeingEventTime_QNAME, XMLGregorianCalendar.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingEventDescription", scope = WellbeingEventType.class)
    public JAXBElement<String> createWellbeingEventTypeWellbeingEventDescription(String value) {
        return new JAXBElement<String>(_WellbeingEventTypeWellbeingEventDescription_QNAME, String.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EventId", scope = WellbeingEventType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWellbeingEventTypeEventId(String value) {
        return new JAXBElement<String>(_WellbeingEventTypeEventId_QNAME, String.class, WellbeingEventType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityAssertionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IdentityAssertions", scope = IdentityType.class)
    public JAXBElement<IdentityAssertionsType> createIdentityTypeIdentityAssertions(IdentityAssertionsType value) {
        return new JAXBElement<IdentityAssertionsType>(_IdentityTypeIdentityAssertions_QNAME, IdentityAssertionsType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PasswordList", scope = IdentityType.class)
    public JAXBElement<PasswordListType> createIdentityTypePasswordList(PasswordListType value) {
        return new JAXBElement<PasswordListType>(_IdentityTypePasswordList_QNAME, PasswordListType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = IdentityType.class)
    public JAXBElement<SIFExtendedElementsType> createIdentityTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = IdentityType.class)
    public JAXBElement<SIFMetadataType> createIdentityTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AuthenticationSourceGlobalUID", scope = IdentityType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentityTypeAuthenticationSourceGlobalUID(String value) {
        return new JAXBElement<String>(_IdentityTypeAuthenticationSourceGlobalUID_QNAME, String.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestletSubScore", scope = NAPTestletResponseType.class)
    public JAXBElement<BigDecimal> createNAPTestletResponseTypeTestletSubScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NAPTestletResponseTypeTestletSubScore_QNAME, BigDecimal.class, NAPTestletResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NAPTestletRefId", scope = NAPTestletResponseType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestletResponseTypeNAPTestletRefId(String value) {
        return new JAXBElement<String>(_NAPTestletCodeFrameTypeNAPTestletRefId_QNAME, String.class, NAPTestletResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndTime", scope = PeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createPeriodAttendanceTypeEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeTablePeriodTypeEndTime_QNAME, XMLGregorianCalendar.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ScheduledActivityRefId", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeScheduledActivityRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeScheduledActivityRefId_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeOut", scope = PeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createPeriodAttendanceTypeTimeOut(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeOut_QNAME, XMLGregorianCalendar.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SessionInfoRefId", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeSessionInfoRefId(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeSessionInfoRefId_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeIn", scope = PeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createPeriodAttendanceTypeTimeIn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeIn_QNAME, XMLGregorianCalendar.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceNote", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeAttendanceNote(String value) {
        return new JAXBElement<String>(_PeriodAttendanceTypeAttendanceNote_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartTime", scope = PeriodAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createPeriodAttendanceTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionInfoTypeStartTime_QNAME, XMLGregorianCalendar.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledTeacherListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherList", scope = PeriodAttendanceType.class)
    public JAXBElement<ScheduledTeacherListType> createPeriodAttendanceTypeTeacherList(ScheduledTeacherListType value) {
        return new JAXBElement<ScheduledTeacherListType>(_TeachingGroupTypeTeacherList_QNAME, ScheduledTeacherListType.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCellRefId", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeTimeTableCellRefId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeTimeTableCellRefId_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimetablePeriod", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeTimetablePeriod(String value) {
        return new JAXBElement<String>(_StudentPeriodAttendanceTypeTimetablePeriod_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DayId", scope = PeriodAttendanceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPeriodAttendanceTypeDayId(String value) {
        return new JAXBElement<String>(_ScheduledActivityTypeDayId_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomList", scope = PeriodAttendanceType.class)
    public JAXBElement<RoomListType> createPeriodAttendanceTypeRoomList(RoomListType value) {
        return new JAXBElement<RoomListType>(_ScheduledActivityTypeRoomList_QNAME, RoomListType.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceType", scope = PeriodAttendanceType.class)
    public JAXBElement<String> createPeriodAttendanceTypeAttendanceType(String value) {
        return new JAXBElement<String>(_PeriodAttendanceTypeAttendanceType_QNAME, String.class, PeriodAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GroupDescription", scope = StudentGroupType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentGroupTypeGroupDescription(String value) {
        return new JAXBElement<String>(_StudentGroupTypeGroupDescription_QNAME, String.class, StudentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DurationValue", scope = AttendanceTimeType.class)
    public JAXBElement<BigDecimal> createAttendanceTimeTypeDurationValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AttendanceTimeTypeDurationValue_QNAME, BigDecimal.class, AttendanceTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = AttendanceTimeType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAttendanceTimeTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, AttendanceTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceNote", scope = AttendanceTimeType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAttendanceTimeTypeAttendanceNote(String value) {
        return new JAXBElement<String>(_PeriodAttendanceTypeAttendanceNote_QNAME, String.class, AttendanceTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceType", scope = AttendanceTimeType.class)
    public JAXBElement<String> createAttendanceTimeTypeAttendanceType(String value) {
        return new JAXBElement<String>(_PeriodAttendanceTypeAttendanceType_QNAME, String.class, AttendanceTimeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressGlobalUID", scope = AddressType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressTypeAddressGlobalUID(String value) {
        return new JAXBElement<String>(_AddressTypeAddressGlobalUID_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EffectiveFromDate", scope = AddressType.class)
    public JAXBElement<XMLGregorianCalendar> createAddressTypeEffectiveFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddressTypeEffectiveFromDate_QNAME, XMLGregorianCalendar.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RadioContact", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeRadioContact(String value) {
        return new JAXBElement<String>(_AddressTypeRadioContact_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvince", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeStateProvince(String value) {
        return new JAXBElement<String>(_AddressTypeStateProvince_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = AddressType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticalAreasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StatisticalAreas", scope = AddressType.class)
    public JAXBElement<StatisticalAreasType> createAddressTypeStatisticalAreas(StatisticalAreasType value) {
        return new JAXBElement<StatisticalAreasType>(_AddressTypeStatisticalAreas_QNAME, StatisticalAreasType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Community", scope = AddressType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAddressTypeCommunity(String value) {
        return new JAXBElement<String>(_AddressTypeCommunity_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Country", scope = AddressType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressTypeCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EffectiveToDate", scope = AddressType.class)
    public JAXBElement<XMLGregorianCalendar> createAddressTypeEffectiveToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddressTypeEffectiveToDate_QNAME, XMLGregorianCalendar.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "GridLocation", scope = AddressType.class)
    public JAXBElement<GridLocationType> createAddressTypeGridLocation(GridLocationType value) {
        return new JAXBElement<GridLocationType>(_AddressTypeGridLocation_QNAME, GridLocationType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MapReference", scope = AddressType.class)
    public JAXBElement<MapReferenceType> createAddressTypeMapReference(MapReferenceType value) {
        return new JAXBElement<MapReferenceType>(_AddressTypeMapReference_QNAME, MapReferenceType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = StudentExitContainerType.class)
    public JAXBElement<OtherCodeListType> createStudentExitContainerTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, StudentExitContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactFlagsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContactFlags", scope = StudentContactRelationshipType.class)
    public JAXBElement<ContactFlagsType> createStudentContactRelationshipTypeContactFlags(ContactFlagsType value) {
        return new JAXBElement<ContactFlagsType>(_StudentContactRelationshipTypeContactFlags_QNAME, ContactFlagsType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParentRelationshipStatus", scope = StudentContactRelationshipType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentContactRelationshipTypeParentRelationshipStatus(String value) {
        return new JAXBElement<String>(_StudentContactRelationshipTypeParentRelationshipStatus_QNAME, String.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = StudentContactRelationshipType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStudentContactRelationshipTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MainlySpeaksEnglishAtHome", scope = StudentContactRelationshipType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createStudentContactRelationshipTypeMainlySpeaksEnglishAtHome(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_StudentContactRelationshipTypeMainlySpeaksEnglishAtHome_QNAME, AUCodeSetsYesOrNoCategoryType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentContactRelationshipType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentContactRelationshipTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsSourceCodeTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContactSequenceSource", scope = StudentContactRelationshipType.class)
    public JAXBElement<AUCodeSetsSourceCodeTypeType> createStudentContactRelationshipTypeContactSequenceSource(AUCodeSetsSourceCodeTypeType value) {
        return new JAXBElement<AUCodeSetsSourceCodeTypeType>(_StudentContactRelationshipTypeContactSequenceSource_QNAME, AUCodeSetsSourceCodeTypeType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "HouseholdList", scope = StudentContactRelationshipType.class)
    public JAXBElement<HouseholdListType> createStudentContactRelationshipTypeHouseholdList(HouseholdListType value) {
        return new JAXBElement<HouseholdListType>(_StudentContactRelationshipTypeHouseholdList_QNAME, HouseholdListType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ContactSequence", scope = StudentContactRelationshipType.class)
    public JAXBElement<Long> createStudentContactRelationshipTypeContactSequence(Long value) {
        return new JAXBElement<Long>(_StudentContactRelationshipTypeContactSequence_QNAME, Long.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentContactRelationshipType.class)
    public JAXBElement<SIFMetadataType> createStudentContactRelationshipTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentContactRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_RefId", scope = ResourceUsageType.ResourceReportLineList.ResourceReportLine.class)
    public JAXBElement<ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId> createResourceUsageTypeResourceReportLineListResourceReportLineSIFRefId(ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId value) {
        return new JAXBElement<ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId>(_EquipmentInfoTypeSIFRefId_QNAME, ResourceUsageType.ResourceReportLineList.ResourceReportLine.SIFRefId.class, ResourceUsageType.ResourceReportLineList.ResourceReportLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDate", scope = ResourceUsageType.ResourceReportLineList.ResourceReportLine.class)
    public JAXBElement<XMLGregorianCalendar> createResourceUsageTypeResourceReportLineListResourceReportLineEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, ResourceUsageType.ResourceReportLineList.ResourceReportLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = AttendanceCodeType.class)
    public JAXBElement<OtherCodeListType> createAttendanceCodeTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, AttendanceCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = NAPTestItemType.class)
    public JAXBElement<SIFExtendedElementsType> createNAPTestItemTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, NAPTestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = NAPTestItemType.class)
    public JAXBElement<SIFMetadataType> createNAPTestItemTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, NAPTestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarDateNumber", scope = CalendarDate.class)
    public JAXBElement<Long> createCalendarDateCalendarDateNumber(Long value) {
        return new JAXBElement<Long>(_CalendarDateCalendarDateNumber_QNAME, Long.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StudentAttendance", scope = CalendarDate.class)
    public JAXBElement<AttendanceInfoType> createCalendarDateStudentAttendance(AttendanceInfoType value) {
        return new JAXBElement<AttendanceInfoType>(_CalendarDateStudentAttendance_QNAME, AttendanceInfoType.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CalendarSummaryRefId", scope = CalendarDate.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCalendarDateCalendarSummaryRefId(String value) {
        return new JAXBElement<String>(_CalendarDateCalendarSummaryRefId_QNAME, String.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = CalendarDate.class)
    public JAXBElement<SIFExtendedElementsType> createCalendarDateSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = CalendarDate.class)
    public JAXBElement<SIFMetadataType> createCalendarDateSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherAttendance", scope = CalendarDate.class)
    public JAXBElement<AttendanceInfoType> createCalendarDateTeacherAttendance(AttendanceInfoType value) {
        return new JAXBElement<AttendanceInfoType>(_CalendarDateTeacherAttendance_QNAME, AttendanceInfoType.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AdministratorAttendance", scope = CalendarDate.class)
    public JAXBElement<AttendanceInfoType> createCalendarDateAdministratorAttendance(AttendanceInfoType value) {
        return new JAXBElement<AttendanceInfoType>(_CalendarDateAdministratorAttendance_QNAME, AttendanceInfoType.class, CalendarDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MaxAttemptsAllowed", scope = ActivityType.class)
    public JAXBElement<Long> createActivityTypeMaxAttemptsAllowed(Long value) {
        return new JAXBElement<Long>(_GradingAssignmentTypeMaxAttemptsAllowed_QNAME, Long.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalRequirementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TechnicalRequirements", scope = ActivityType.class)
    public JAXBElement<TechnicalRequirementsType> createActivityTypeTechnicalRequirements(TechnicalRequirementsType value) {
        return new JAXBElement<TechnicalRequirementsType>(_ActivityTypeTechnicalRequirements_QNAME, TechnicalRequirementsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityType.Evaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Evaluation", scope = ActivityType.class)
    public JAXBElement<ActivityType.Evaluation> createActivityTypeEvaluation(ActivityType.Evaluation value) {
        return new JAXBElement<ActivityType.Evaluation>(_ActivityTypeEvaluation_QNAME, ActivityType.Evaluation.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ActivityWeight", scope = ActivityType.class)
    public JAXBElement<BigDecimal> createActivityTypeActivityWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ActivityTypeActivityWeight_QNAME, BigDecimal.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningStandards", scope = ActivityType.class)
    public JAXBElement<LearningStandardsType> createActivityTypeLearningStandards(LearningStandardsType value) {
        return new JAXBElement<LearningStandardsType>(_LearningResourceTypeLearningStandards_QNAME, LearningStandardsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = ActivityType.class)
    public JAXBElement<SIFExtendedElementsType> createActivityTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceObjectsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SourceObjects", scope = ActivityType.class)
    public JAXBElement<SourceObjectsType> createActivityTypeSourceObjects(SourceObjectsType value) {
        return new JAXBElement<SourceObjectsType>(_ActivityTypeSourceObjects_QNAME, SourceObjectsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = ActivityType.class)
    public JAXBElement<SIFMetadataType> createActivityTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Title", scope = ActivityType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createActivityTypeTitle(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeTitle_QNAME, String.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Preamble", scope = ActivityType.class)
    public JAXBElement<String> createActivityTypePreamble(String value) {
        return new JAXBElement<String>(_ActivityTypePreamble_QNAME, String.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectArea", scope = ActivityType.class)
    public JAXBElement<SubjectAreaType> createActivityTypeSubjectArea(SubjectAreaType value) {
        return new JAXBElement<SubjectAreaType>(_ACStrandSubjectAreaTypeSubjectArea_QNAME, SubjectAreaType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Students", scope = ActivityType.class)
    public JAXBElement<StudentsType> createActivityTypeStudents(StudentsType value) {
        return new JAXBElement<StudentsType>(_ActivityTypeStudents_QNAME, StudentsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EssentialMaterialsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EssentialMaterials", scope = ActivityType.class)
    public JAXBElement<EssentialMaterialsType> createActivityTypeEssentialMaterials(EssentialMaterialsType value) {
        return new JAXBElement<EssentialMaterialsType>(_ActivityTypeEssentialMaterials_QNAME, EssentialMaterialsType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Prerequisites", scope = ActivityType.class)
    public JAXBElement<PrerequisitesType> createActivityTypePrerequisites(PrerequisitesType value) {
        return new JAXBElement<PrerequisitesType>(_ActivityTypePrerequisites_QNAME, PrerequisitesType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Points", scope = ActivityType.class)
    public JAXBElement<Long> createActivityTypePoints(Long value) {
        return new JAXBElement<Long>(_ActivityTypePoints_QNAME, Long.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AssessmentRefId", scope = ActivityType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createActivityTypeAssessmentRefId(String value) {
        return new JAXBElement<String>(_ActivityTypeAssessmentRefId_QNAME, String.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningResourcesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningResources", scope = ActivityType.class)
    public JAXBElement<LearningResourcesType> createActivityTypeLearningResources(LearningResourcesType value) {
        return new JAXBElement<LearningResourcesType>(_LearningResources_QNAME, LearningResourcesType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareRequirementListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SoftwareRequirementList", scope = ActivityType.class)
    public JAXBElement<SoftwareRequirementListType> createActivityTypeSoftwareRequirementList(SoftwareRequirementListType value) {
        return new JAXBElement<SoftwareRequirementListType>(_ActivityTypeSoftwareRequirementList_QNAME, SoftwareRequirementListType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LearningObjectivesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LearningObjectives", scope = ActivityType.class)
    public JAXBElement<LearningObjectivesType> createActivityTypeLearningObjectives(LearningObjectivesType value) {
        return new JAXBElement<LearningObjectivesType>(_ActivityTypeLearningObjectives_QNAME, LearningObjectivesType.class, ActivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AccountingPeriod", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeAccountingPeriod(String value) {
        return new JAXBElement<String>(_InvoiceTypeAccountingPeriod_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TransactionDescription", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeTransactionDescription(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeTransactionDescription_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InvoiceRefId", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeInvoiceRefId(String value) {
        return new JAXBElement<String>(_EquipmentInfoTypeInvoiceRefId_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = PaymentReceiptType.class)
    public JAXBElement<SIFExtendedElementsType> createPaymentReceiptTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = PaymentReceiptType.class)
    public JAXBElement<SIFMetadataType> createPaymentReceiptTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TransactionMethod", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeTransactionMethod(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeTransactionMethod_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TransactionNote", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeTransactionNote(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeTransactionNote_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountRefIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FinancialAccountRefIdList", scope = PaymentReceiptType.class)
    public JAXBElement<FinancialAccountRefIdListType> createPaymentReceiptTypeFinancialAccountRefIdList(FinancialAccountRefIdListType value) {
        return new JAXBElement<FinancialAccountRefIdListType>(_InvoiceTypeFinancialAccountRefIdList_QNAME, FinancialAccountRefIdListType.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChargedLocationInfoRefId", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeChargedLocationInfoRefId(String value) {
        return new JAXBElement<String>(_InvoiceTypeChargedLocationInfoRefId_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxAmount", scope = PaymentReceiptType.class)
    public JAXBElement<MonetaryAmountType> createPaymentReceiptTypeTaxAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeTaxAmount_QNAME, MonetaryAmountType.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TaxRate", scope = PaymentReceiptType.class)
    public JAXBElement<BigDecimal> createPaymentReceiptTypeTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InvoiceTypeTaxRate_QNAME, BigDecimal.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ChequeNumber", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeChequeNumber(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeChequeNumber_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DebtorRefId", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeDebtorRefId(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeDebtorRefId_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VendorInfoRefId", scope = PaymentReceiptType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentReceiptTypeVendorInfoRefId(String value) {
        return new JAXBElement<String>(_PaymentReceiptTypeVendorInfoRefId_QNAME, String.class, PaymentReceiptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FurtherLocationNotes", scope = WellbeingEventLocationDetailsType.class)
    public JAXBElement<String> createWellbeingEventLocationDetailsTypeFurtherLocationNotes(String value) {
        return new JAXBElement<String>(_WellbeingEventLocationDetailsTypeFurtherLocationNotes_QNAME, String.class, WellbeingEventLocationDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Class", scope = WellbeingEventLocationDetailsType.class)
    public JAXBElement<String> createWellbeingEventLocationDetailsTypeClass(String value) {
        return new JAXBElement<String>(_WellbeingEventLocationDetailsTypeClass_QNAME, String.class, WellbeingEventLocationDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReligiousEventListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReligiousEventList", scope = DemographicsType.class)
    public JAXBElement<ReligiousEventListType> createDemographicsTypeReligiousEventList(ReligiousEventListType value) {
        return new JAXBElement<ReligiousEventListType>(_DemographicsTypeReligiousEventList_QNAME, ReligiousEventListType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaSubClass", scope = DemographicsType.class)
    public JAXBElement<String> createDemographicsTypeVisaSubClass(String value) {
        return new JAXBElement<String>(_DemographicsTypeVisaSubClass_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IndigenousStatus", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeIndigenousStatus(String value) {
        return new JAXBElement<String>(_DemographicsTypeIndigenousStatus_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateOfBirth", scope = DemographicsType.class)
    public JAXBElement<String> createDemographicsTypeStateOfBirth(String value) {
        return new JAXBElement<String>(_DemographicsTypeStateOfBirth_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InterpreterRequired", scope = DemographicsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createDemographicsTypeInterpreterRequired(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_DemographicsTypeInterpreterRequired_QNAME, AUCodeSetsYesOrNoCategoryType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LanguageList", scope = DemographicsType.class)
    public JAXBElement<LanguageListType> createDemographicsTypeLanguageList(LanguageListType value) {
        return new JAXBElement<LanguageListType>(_DemographicsTypeLanguageList_QNAME, LanguageListType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DwellingArrangementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DwellingArrangement", scope = DemographicsType.class)
    public JAXBElement<DwellingArrangementType> createDemographicsTypeDwellingArrangement(DwellingArrangementType value) {
        return new JAXBElement<DwellingArrangementType>(_DemographicsTypeDwellingArrangement_QNAME, DwellingArrangementType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReligionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Religion", scope = DemographicsType.class)
    public JAXBElement<ReligionType> createDemographicsTypeReligion(ReligionType value) {
        return new JAXBElement<ReligionType>(_DemographicsTypeReligion_QNAME, ReligionType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnglishProficiencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EnglishProficiency", scope = DemographicsType.class)
    public JAXBElement<EnglishProficiencyType> createDemographicsTypeEnglishProficiency(EnglishProficiencyType value) {
        return new JAXBElement<EnglishProficiencyType>(_DemographicsTypeEnglishProficiency_QNAME, EnglishProficiencyType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MaritalStatus", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeMaritalStatus(String value) {
        return new JAXBElement<String>(_DemographicsTypeMaritalStatus_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CountriesOfCitizenship", scope = DemographicsType.class)
    public JAXBElement<CountryListType> createDemographicsTypeCountriesOfCitizenship(CountryListType value) {
        return new JAXBElement<CountryListType>(_DemographicsTypeCountriesOfCitizenship_QNAME, CountryListType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "MedicareNumber", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeMedicareNumber(String value) {
        return new JAXBElement<String>(_DemographicsTypeMedicareNumber_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BirthDate", scope = DemographicsType.class)
    public JAXBElement<XMLGregorianCalendar> createDemographicsTypeBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DemographicsTypeBirthDate_QNAME, XMLGregorianCalendar.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CountryOfBirth", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeCountryOfBirth(String value) {
        return new JAXBElement<String>(_DemographicsTypeCountryOfBirth_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsImmunisationCertificateStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ImmunisationCertificateStatus", scope = DemographicsType.class)
    public JAXBElement<AUCodeSetsImmunisationCertificateStatusType> createDemographicsTypeImmunisationCertificateStatus(AUCodeSetsImmunisationCertificateStatusType value) {
        return new JAXBElement<AUCodeSetsImmunisationCertificateStatusType>(_DemographicsTypeImmunisationCertificateStatus_QNAME, AUCodeSetsImmunisationCertificateStatusType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LBOTE", scope = DemographicsType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createDemographicsTypeLBOTE(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_DemographicsTypeLBOTE_QNAME, AUCodeSetsYesOrNoCategoryType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Sex", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeSex(String value) {
        return new JAXBElement<String>(_DemographicsTypeSex_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CulturalBackground", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeCulturalBackground(String value) {
        return new JAXBElement<String>(_DemographicsTypeCulturalBackground_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryList2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CountriesOfResidency", scope = DemographicsType.class)
    public JAXBElement<CountryList2Type> createDemographicsTypeCountriesOfResidency(CountryList2Type value) {
        return new JAXBElement<CountryList2Type>(_DemographicsTypeCountriesOfResidency_QNAME, CountryList2Type.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AustralianCitizenshipStatus", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeAustralianCitizenshipStatus(String value) {
        return new JAXBElement<String>(_DemographicsTypeAustralianCitizenshipStatus_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PlaceOfBirth", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypePlaceOfBirth(String value) {
        return new JAXBElement<String>(_DemographicsTypePlaceOfBirth_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PermanentResident", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypePermanentResident(String value) {
        return new JAXBElement<String>(_DemographicsTypePermanentResident_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisaSubClassListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaSubClassList", scope = DemographicsType.class)
    public JAXBElement<VisaSubClassListType> createDemographicsTypeVisaSubClassList(VisaSubClassListType value) {
        return new JAXBElement<VisaSubClassListType>(_DemographicsTypeVisaSubClassList_QNAME, VisaSubClassListType.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaExpiryDate", scope = DemographicsType.class)
    public JAXBElement<XMLGregorianCalendar> createDemographicsTypeVisaExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VisaSubClassTypeVisaExpiryDate_QNAME, XMLGregorianCalendar.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReligiousRegion", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeReligiousRegion(String value) {
        return new JAXBElement<String>(_DemographicsTypeReligiousRegion_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "VisaStatisticalCode", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeVisaStatisticalCode(String value) {
        return new JAXBElement<String>(_VisaSubClassTypeVisaStatisticalCode_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BirthDateVerification", scope = DemographicsType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemographicsTypeBirthDateVerification(String value) {
        return new JAXBElement<String>(_DemographicsTypeBirthDateVerification_QNAME, String.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CountryArrivalDate", scope = DemographicsType.class)
    public JAXBElement<XMLGregorianCalendar> createDemographicsTypeCountryArrivalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DemographicsTypeCountryArrivalDate_QNAME, XMLGregorianCalendar.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DateOfDeath", scope = DemographicsType.class)
    public JAXBElement<XMLGregorianCalendar> createDemographicsTypeDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DemographicsTypeDateOfDeath_QNAME, XMLGregorianCalendar.class, DemographicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectArea", scope = SchoolCourseInfoOverrideType.class)
    public JAXBElement<SubjectAreaType> createSchoolCourseInfoOverrideTypeSubjectArea(SubjectAreaType value) {
        return new JAXBElement<SubjectAreaType>(_ACStrandSubjectAreaTypeSubjectArea_QNAME, SubjectAreaType.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseCredits", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeCourseCredits(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeCourseCredits_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DistrictCourseCode", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeDistrictCourseCode(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeDistrictCourseCode_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "InstructionalLevel", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeInstructionalLevel(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeInstructionalLevel_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseCode", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeCourseCode(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoOverrideTypeCourseCode_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CourseTitle", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeCourseTitle(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoOverrideTypeCourseTitle_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateCourseCode", scope = SchoolCourseInfoOverrideType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolCourseInfoOverrideTypeStateCourseCode(String value) {
        return new JAXBElement<String>(_SchoolCourseInfoTypeStateCourseCode_QNAME, String.class, SchoolCourseInfoOverrideType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ParentSchoolId", scope = CampusContainerType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCampusContainerTypeParentSchoolId(String value) {
        return new JAXBElement<String>(_CampusContainerTypeParentSchoolId_QNAME, String.class, CampusContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsSchoolLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CampusType", scope = CampusContainerType.class)
    public JAXBElement<AUCodeSetsSchoolLevelType> createCampusContainerTypeCampusType(AUCodeSetsSchoolLevelType value) {
        return new JAXBElement<AUCodeSetsSchoolLevelType>(_CampusContainerTypeCampusType_QNAME, AUCodeSetsSchoolLevelType.class, CampusContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Node", scope = NAPTestletContentType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAPTestletContentTypeNode(String value) {
        return new JAXBElement<String>(_NAPTestletContentTypeNode_QNAME, String.class, NAPTestletContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocationInStage", scope = NAPTestletContentType.class)
    public JAXBElement<BigInteger> createNAPTestletContentTypeLocationInStage(BigInteger value) {
        return new JAXBElement<BigInteger>(_NAPTestletContentTypeLocationInStage_QNAME, BigInteger.class, NAPTestletContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TestletName", scope = NAPTestletContentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNAPTestletContentTypeTestletName(String value) {
        return new JAXBElement<String>(_NAPTestletContentTypeTestletName_QNAME, String.class, NAPTestletContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvinceId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeStateProvinceId(String value) {
        return new JAXBElement<String>(_StaffPersonalTypeStateProvinceId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IndependentSchool", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSchoolInfoTypeIndependentSchool(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolInfoTypeIndependentSchool_QNAME, AUCodeSetsYesOrNoCategoryType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsAustralianTimeZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolTimeZone", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsAustralianTimeZoneType> createSchoolInfoTypeSchoolTimeZone(AUCodeSetsAustralianTimeZoneType value) {
        return new JAXBElement<AUCodeSetsAustralianTimeZoneType>(_SchoolInfoTypeSchoolTimeZone_QNAME, AUCodeSetsAustralianTimeZoneType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampusContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Campus", scope = SchoolInfoType.class)
    public JAXBElement<CampusContainerType> createSchoolInfoTypeCampus(CampusContainerType value) {
        return new JAXBElement<CampusContainerType>(_SchoolInfoTypeCampus_QNAME, CampusContainerType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsOperationalStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OperationalStatus", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsOperationalStatusType> createSchoolInfoTypeOperationalStatus(AUCodeSetsOperationalStatusType value) {
        return new JAXBElement<AUCodeSetsOperationalStatusType>(_LEAInfoTypeOperationalStatus_QNAME, AUCodeSetsOperationalStatusType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = SchoolInfoType.class)
    public JAXBElement<SIFMetadataType> createSchoolInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolGeographicLocation", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSchoolGeographicLocation(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeSchoolGeographicLocation_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "JurisdictionLowerHouse", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeJurisdictionLowerHouse(String value) {
        return new JAXBElement<String>(_LEAInfoTypeJurisdictionLowerHouse_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalEnrollmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TotalEnrollments", scope = SchoolInfoType.class)
    public JAXBElement<TotalEnrollmentsType> createSchoolInfoTypeTotalEnrollments(TotalEnrollmentsType value) {
        return new JAXBElement<TotalEnrollmentsType>(_SchoolInfoTypeTotalEnrollments_QNAME, TotalEnrollmentsType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsSchoolLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolType", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsSchoolLevelType> createSchoolInfoTypeSchoolType(AUCodeSetsSchoolLevelType value) {
        return new JAXBElement<AUCodeSetsSchoolLevelType>(_SchoolInfoTypeSchoolType_QNAME, AUCodeSetsSchoolLevelType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolDistrict", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSchoolDistrict(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeSchoolDistrict_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelEnrollmentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevelEnrollmentList", scope = SchoolInfoType.class)
    public JAXBElement<YearLevelEnrollmentListType> createSchoolInfoTypeYearLevelEnrollmentList(YearLevelEnrollmentListType value) {
        return new JAXBElement<YearLevelEnrollmentListType>(_SchoolInfoTypeYearLevelEnrollmentList_QNAME, YearLevelEnrollmentListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolInfoType.OtherLEA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherLEA", scope = SchoolInfoType.class)
    public JAXBElement<SchoolInfoType.OtherLEA> createSchoolInfoTypeOtherLEA(SchoolInfoType.OtherLEA value) {
        return new JAXBElement<SchoolInfoType.OtherLEA>(_SchoolInfoTypeOtherLEA_QNAME, SchoolInfoType.OtherLEA.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolFocusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolFocusList", scope = SchoolInfoType.class)
    public JAXBElement<SchoolFocusListType> createSchoolInfoTypeSchoolFocusList(SchoolFocusListType value) {
        return new JAXBElement<SchoolFocusListType>(_SchoolInfoTypeSchoolFocusList_QNAME, SchoolFocusListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "CommonwealthId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeCommonwealthId(String value) {
        return new JAXBElement<String>(_LEAInfoTypeCommonwealthId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolURL", scope = SchoolInfoType.class)
    public JAXBElement<String> createSchoolInfoTypeSchoolURL(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeSchoolURL_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsSchoolCoEdStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolCoEdStatus", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsSchoolCoEdStatusType> createSchoolInfoTypeSchoolCoEdStatus(AUCodeSetsSchoolCoEdStatusType value) {
        return new JAXBElement<AUCodeSetsSchoolCoEdStatusType>(_SchoolInfoTypeSchoolCoEdStatus_QNAME, AUCodeSetsSchoolCoEdStatusType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevels", scope = SchoolInfoType.class)
    public JAXBElement<YearLevelsType> createSchoolInfoTypeYearLevels(YearLevelsType value) {
        return new JAXBElement<YearLevelsType>(_LearningStandardDocumentTypeYearLevels_QNAME, YearLevelsType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Entity_Close", scope = SchoolInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSchoolInfoTypeEntityClose(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SchoolInfoTypeEntityClose_QNAME, XMLGregorianCalendar.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolEmailList", scope = SchoolInfoType.class)
    public JAXBElement<EmailListType> createSchoolInfoTypeSchoolEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_SchoolInfoTypeSchoolEmailList_QNAME, EmailListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "BoardingSchoolStatus", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createSchoolInfoTypeBoardingSchoolStatus(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolInfoTypeBoardingSchoolStatus_QNAME, AUCodeSetsYesOrNoCategoryType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SessionType", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSessionType(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeSessionType_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PhoneNumberList", scope = SchoolInfoType.class)
    public JAXBElement<PhoneNumberListType> createSchoolInfoTypePhoneNumberList(PhoneNumberListType value) {
        return new JAXBElement<PhoneNumberListType>(_HouseholdContactInfoTypePhoneNumberList_QNAME, PhoneNumberListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = SchoolInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createSchoolInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PrincipalInfo", scope = SchoolInfoType.class)
    public JAXBElement<PrincipalInfoType> createSchoolInfoTypePrincipalInfo(PrincipalInfoType value) {
        return new JAXBElement<PrincipalInfoType>(_SchoolInfoTypePrincipalInfo_QNAME, PrincipalInfoType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "System", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSystem(String value) {
        return new JAXBElement<String>(_NAPEventStudentLinkTypeSystem_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SLA", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSLA(String value) {
        return new JAXBElement<String>(_LEAInfoTypeSLA_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolDistrictLocalId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeSchoolDistrictLocalId(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeSchoolDistrictLocalId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ReligiousAffiliation", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeReligiousAffiliation(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeReligiousAffiliation_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ACARAId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeACARAId(String value) {
        return new JAXBElement<String>(_FQReportingTypeACARAId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolContactList", scope = SchoolInfoType.class)
    public JAXBElement<SchoolContactListType> createSchoolInfoTypeSchoolContactList(SchoolContactListType value) {
        return new JAXBElement<SchoolContactListType>(_SchoolInfoTypeSchoolContactList_QNAME, SchoolContactListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsSystemicStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "NonGovSystemicStatus", scope = SchoolInfoType.class)
    public JAXBElement<AUCodeSetsSystemicStatusType> createSchoolInfoTypeNonGovSystemicStatus(AUCodeSetsSystemicStatusType value) {
        return new JAXBElement<AUCodeSetsSystemicStatusType>(_SchoolInfoTypeNonGovSystemicStatus_QNAME, AUCodeSetsSystemicStatusType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ARIA", scope = SchoolInfoType.class)
    public JAXBElement<BigDecimal> createSchoolInfoTypeARIA(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SchoolInfoTypeARIA_QNAME, BigDecimal.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolGroupListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolGroupList", scope = SchoolInfoType.class)
    public JAXBElement<SchoolGroupListType> createSchoolInfoTypeSchoolGroupList(SchoolGroupListType value) {
        return new JAXBElement<SchoolGroupListType>(_SchoolInfoTypeSchoolGroupList_QNAME, SchoolGroupListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherIdList", scope = SchoolInfoType.class)
    public JAXBElement<OtherIdListType> createSchoolInfoTypeOtherIdList(OtherIdListType value) {
        return new JAXBElement<OtherIdListType>(_StaffPersonalTypeOtherIdList_QNAME, OtherIdListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalGovernmentArea", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeLocalGovernmentArea(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeLocalGovernmentArea_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LEAInfoRefId", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeLEAInfoRefId(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeLEAInfoRefId_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AddressList", scope = SchoolInfoType.class)
    public JAXBElement<AddressListType> createSchoolInfoTypeAddressList(AddressListType value) {
        return new JAXBElement<AddressListType>(_HouseholdContactInfoTypeAddressList_QNAME, AddressListType.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Entity_Open", scope = SchoolInfoType.class)
    public JAXBElement<XMLGregorianCalendar> createSchoolInfoTypeEntityOpen(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SchoolInfoTypeEntityOpen_QNAME, XMLGregorianCalendar.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FederalElectorate", scope = SchoolInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSchoolInfoTypeFederalElectorate(String value) {
        return new JAXBElement<String>(_SchoolInfoTypeFederalElectorate_QNAME, String.class, SchoolInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "YearLevel", scope = StandardIdentifierType.class)
    public JAXBElement<YearLevelType> createStandardIdentifierTypeYearLevel(YearLevelType value) {
        return new JAXBElement<YearLevelType>(_StudentGradeTypeYearLevel_QNAME, YearLevelType.class, StandardIdentifierType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateIdentificationCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AlternateIdentificationCodes", scope = StandardIdentifierType.class)
    public JAXBElement<AlternateIdentificationCodeListType> createStandardIdentifierTypeAlternateIdentificationCodes(AlternateIdentificationCodeListType value) {
        return new JAXBElement<AlternateIdentificationCodeListType>(_StandardIdentifierTypeAlternateIdentificationCodes_QNAME, AlternateIdentificationCodeListType.class, StandardIdentifierType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "IndicatorNumber", scope = StandardIdentifierType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStandardIdentifierTypeIndicatorNumber(String value) {
        return new JAXBElement<String>(_StandardIdentifierTypeIndicatorNumber_QNAME, String.class, StandardIdentifierType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Benchmark", scope = StandardIdentifierType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStandardIdentifierTypeBenchmark(String value) {
        return new JAXBElement<String>(_StandardIdentifierTypeBenchmark_QNAME, String.class, StandardIdentifierType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = EnglishProficiencyType.class)
    public JAXBElement<OtherCodeListType> createEnglishProficiencyTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, EnglishProficiencyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = ProgramStatusType.class)
    public JAXBElement<OtherCodeListType> createProgramStatusTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, ProgramStatusType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = CatchmentStatusContainerType.class)
    public JAXBElement<OtherCodeListType> createCatchmentStatusContainerTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, CatchmentStatusContainerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "FTE", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<BigDecimal> createStudentAttendanceSummaryTypeFTE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentMostRecentContainerTypeFTE_QNAME, BigDecimal.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentAttendanceSummaryTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDay", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<Long> createStudentAttendanceSummaryTypeStartDay(Long value) {
        return new JAXBElement<Long>(_StudentAttendanceSummaryTypeStartDay_QNAME, Long.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DaysTardy", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<BigDecimal> createStudentAttendanceSummaryTypeDaysTardy(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentAttendanceSummaryTypeDaysTardy_QNAME, BigDecimal.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<SIFMetadataType> createStudentAttendanceSummaryTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDay", scope = StudentAttendanceSummaryType.class)
    public JAXBElement<Long> createStudentAttendanceSummaryTypeEndDay(Long value) {
        return new JAXBElement<Long>(_StudentAttendanceSummaryTypeEndDay_QNAME, Long.class, StudentAttendanceSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingAlertCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAlertCategory", scope = WellbeingAlertType.class)
    public JAXBElement<AUCodeSetsWellbeingAlertCategoryType> createWellbeingAlertTypeWellbeingAlertCategory(AUCodeSetsWellbeingAlertCategoryType value) {
        return new JAXBElement<AUCodeSetsWellbeingAlertCategoryType>(_WellbeingAlertTypeWellbeingAlertCategory_QNAME, AUCodeSetsWellbeingAlertCategoryType.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AlertSeverity", scope = WellbeingAlertType.class)
    public JAXBElement<String> createWellbeingAlertTypeAlertSeverity(String value) {
        return new JAXBElement<String>(_WellbeingAlertTypeAlertSeverity_QNAME, String.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAlertEndDate", scope = WellbeingAlertType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingAlertTypeWellbeingAlertEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingAlertTypeWellbeingAlertEndDate_QNAME, XMLGregorianCalendar.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "WellbeingAlertDescription", scope = WellbeingAlertType.class)
    public JAXBElement<String> createWellbeingAlertTypeWellbeingAlertDescription(String value) {
        return new JAXBElement<String>(_WellbeingAlertTypeWellbeingAlertDescription_QNAME, String.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = WellbeingAlertType.class)
    public JAXBElement<SIFExtendedElementsType> createWellbeingAlertTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = WellbeingAlertType.class)
    public JAXBElement<SIFMetadataType> createWellbeingAlertTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AlertAudience", scope = WellbeingAlertType.class)
    public JAXBElement<String> createWellbeingAlertTypeAlertAudience(String value) {
        return new JAXBElement<String>(_WellbeingAlertTypeAlertAudience_QNAME, String.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EnrolmentRestricted", scope = WellbeingAlertType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createWellbeingAlertTypeEnrolmentRestricted(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_WellbeingAlertTypeEnrolmentRestricted_QNAME, AUCodeSetsYesOrNoCategoryType.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AlertKeyContact", scope = WellbeingAlertType.class)
    public JAXBElement<String> createWellbeingAlertTypeAlertKeyContact(String value) {
        return new JAXBElement<String>(_WellbeingAlertTypeAlertKeyContact_QNAME, String.class, WellbeingAlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AppealOutcome", scope = WellbeingAppealType.class)
    public JAXBElement<String> createWellbeingAppealTypeAppealOutcome(String value) {
        return new JAXBElement<String>(_WellbeingAppealTypeAppealOutcome_QNAME, String.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalAppealId", scope = WellbeingAppealType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWellbeingAppealTypeLocalAppealId(String value) {
        return new JAXBElement<String>(_WellbeingAppealTypeLocalAppealId_QNAME, String.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingAppealStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AppealStatusCode", scope = WellbeingAppealType.class)
    public JAXBElement<AUCodeSetsWellbeingAppealStatusType> createWellbeingAppealTypeAppealStatusCode(AUCodeSetsWellbeingAppealStatusType value) {
        return new JAXBElement<AUCodeSetsWellbeingAppealStatusType>(_WellbeingAppealTypeAppealStatusCode_QNAME, AUCodeSetsWellbeingAppealStatusType.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentList", scope = WellbeingAppealType.class)
    public JAXBElement<WellbeingDocumentListType> createWellbeingAppealTypeDocumentList(WellbeingDocumentListType value) {
        return new JAXBElement<WellbeingDocumentListType>(_WellbeingCharacteristicTypeDocumentList_QNAME, WellbeingDocumentListType.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AppealNotes", scope = WellbeingAppealType.class)
    public JAXBElement<String> createWellbeingAppealTypeAppealNotes(String value) {
        return new JAXBElement<String>(_WellbeingAppealTypeAppealNotes_QNAME, String.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = WellbeingAppealType.class)
    public JAXBElement<SIFExtendedElementsType> createWellbeingAppealTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = WellbeingAppealType.class)
    public JAXBElement<SIFMetadataType> createWellbeingAppealTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Date", scope = WellbeingAppealType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingAppealTypeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvaluationTypeDate_QNAME, XMLGregorianCalendar.class, WellbeingAppealType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherCodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "OtherCodeList", scope = LocationOfInstructionType.class)
    public JAXBElement<OtherCodeListType> createLocationOfInstructionTypeOtherCodeList(OtherCodeListType value) {
        return new JAXBElement<OtherCodeListType>(_MediumOfInstructionTypeOtherCodeList_QNAME, OtherCodeListType.class, LocationOfInstructionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "ElementName", scope = AggregateCharacteristicInfoType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAggregateCharacteristicInfoTypeElementName(String value) {
        return new JAXBElement<String>(_AggregateCharacteristicInfoTypeElementName_QNAME, String.class, AggregateCharacteristicInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Description", scope = AggregateCharacteristicInfoType.class)
    public JAXBElement<String> createAggregateCharacteristicInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SectionInfoTypeDescription_QNAME, String.class, AggregateCharacteristicInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = AggregateCharacteristicInfoType.class)
    public JAXBElement<SIFExtendedElementsType> createAggregateCharacteristicInfoTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, AggregateCharacteristicInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = AggregateCharacteristicInfoType.class)
    public JAXBElement<SIFMetadataType> createAggregateCharacteristicInfoTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, AggregateCharacteristicInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableCreationDate", scope = TimeTableType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTableTypeTimeTableCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeTableTypeTimeTableCreationDate_QNAME, XMLGregorianCalendar.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingPeriodsPerDay", scope = TimeTableType.class)
    public JAXBElement<Long> createTimeTableTypeTeachingPeriodsPerDay(Long value) {
        return new JAXBElement<Long>(_TimeTableTypeTeachingPeriodsPerDay_QNAME, Long.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = TimeTableType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StartDate", scope = TimeTableType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTableTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTimeTypeStartDate_QNAME, XMLGregorianCalendar.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "LocalId", scope = TimeTableType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableTypeLocalId(String value) {
        return new JAXBElement<String>(_StudentContactPersonalTypeLocalId_QNAME, String.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "EndDate", scope = TimeTableType.class)
    public JAXBElement<XMLGregorianCalendar> createTimeTableTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentActivityParticipationTypeEndDate_QNAME, XMLGregorianCalendar.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = TimeTableType.class)
    public JAXBElement<SIFExtendedElementsType> createTimeTableTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = TimeTableType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = TimeTableType.class)
    public JAXBElement<SIFMetadataType> createTimeTableTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolName", scope = TimeTableType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableTypeSchoolName(String value) {
        return new JAXBElement<String>(_TimeTableTypeSchoolName_QNAME, String.class, TimeTableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "PublishInDirectory", scope = LEAContactType.class)
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> createLEAContactTypePublishInDirectory(AUCodeSetsYesOrNoCategoryType value) {
        return new JAXBElement<AUCodeSetsYesOrNoCategoryType>(_SchoolContactTypePublishInDirectory_QNAME, AUCodeSetsYesOrNoCategoryType.class, LEAContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUCodeSetsDayValueCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DayValue", scope = StudentDailyAttendanceType.class)
    public JAXBElement<AUCodeSetsDayValueCodeType> createStudentDailyAttendanceTypeDayValue(AUCodeSetsDayValueCodeType value) {
        return new JAXBElement<AUCodeSetsDayValueCodeType>(_StudentDailyAttendanceTypeDayValue_QNAME, AUCodeSetsDayValueCodeType.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeOut", scope = StudentDailyAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentDailyAttendanceTypeTimeOut(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeOut_QNAME, XMLGregorianCalendar.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AbsenceValue", scope = StudentDailyAttendanceType.class)
    public JAXBElement<BigDecimal> createStudentDailyAttendanceTypeAbsenceValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StudentDailyAttendanceTypeAbsenceValue_QNAME, BigDecimal.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeIn", scope = StudentDailyAttendanceType.class)
    public JAXBElement<XMLGregorianCalendar> createStudentDailyAttendanceTypeTimeIn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StudentPeriodAttendanceTypeTimeIn_QNAME, XMLGregorianCalendar.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "AttendanceNote", scope = StudentDailyAttendanceType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStudentDailyAttendanceTypeAttendanceNote(String value) {
        return new JAXBElement<String>(_PeriodAttendanceTypeAttendanceNote_QNAME, String.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = StudentDailyAttendanceType.class)
    public JAXBElement<SIFExtendedElementsType> createStudentDailyAttendanceTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = StudentDailyAttendanceType.class)
    public JAXBElement<SIFMetadataType> createStudentDailyAttendanceTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, StudentDailyAttendanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentDescription", scope = WellbeingDocumentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWellbeingDocumentTypeDocumentDescription(String value) {
        return new JAXBElement<String>(_WellbeingDocumentTypeDocumentDescription_QNAME, String.class, WellbeingDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Sensitivity", scope = WellbeingDocumentType.class)
    public JAXBElement<String> createWellbeingDocumentTypeSensitivity(String value) {
        return new JAXBElement<String>(_WellbeingDocumentTypeSensitivity_QNAME, String.class, WellbeingDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentReviewDate", scope = WellbeingDocumentType.class)
    public JAXBElement<XMLGregorianCalendar> createWellbeingDocumentTypeDocumentReviewDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WellbeingDocumentTypeDocumentReviewDate_QNAME, XMLGregorianCalendar.class, WellbeingDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "URL", scope = WellbeingDocumentType.class)
    public JAXBElement<String> createWellbeingDocumentTypeURL(String value) {
        return new JAXBElement<String>(_WellbeingDocumentTypeURL_QNAME, String.class, WellbeingDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "DocumentType", scope = WellbeingDocumentType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWellbeingDocumentTypeDocumentType(String value) {
        return new JAXBElement<String>(_WellbeingDocumentTypeDocumentType_QNAME, String.class, WellbeingDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SettingBodyName", scope = StandardsSettingBodyType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStandardsSettingBodyTypeSettingBodyName(String value) {
        return new JAXBElement<String>(_StandardsSettingBodyTypeSettingBodyName_QNAME, String.class, StandardsSettingBodyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StateProvince", scope = StandardsSettingBodyType.class)
    public JAXBElement<String> createStandardsSettingBodyTypeStateProvince(String value) {
        return new JAXBElement<String>(_AddressTypeStateProvince_QNAME, String.class, StandardsSettingBodyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "Country", scope = StandardsSettingBodyType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStandardsSettingBodyTypeCountry(String value) {
        return new JAXBElement<String>(_AddressTypeCountry_QNAME, String.class, StandardsSettingBodyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableSubjectRefId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeTimeTableSubjectRefId(String value) {
        return new JAXBElement<String>(_TeachingGroupTypeTimeTableSubjectRefId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeachingGroupLocalId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeTeachingGroupLocalId(String value) {
        return new JAXBElement<String>(_TimeTableCellTypeTeachingGroupLocalId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TimeTableLocalId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeTimeTableLocalId(String value) {
        return new JAXBElement<String>(_TimeTableCellTypeTimeTableLocalId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SubjectLocalId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeSubjectLocalId(String value) {
        return new JAXBElement<String>(_StaffSubjectTypeSubjectLocalId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolInfoRefId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeSchoolInfoRefId(String value) {
        return new JAXBElement<String>(_NAPTestScoreSummaryTypeSchoolInfoRefId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_ExtendedElements", scope = TimeTableCellType.class)
    public JAXBElement<SIFExtendedElementsType> createTimeTableCellTypeSIFExtendedElements(SIFExtendedElementsType value) {
        return new JAXBElement<SIFExtendedElementsType>(_SectionInfoTypeSIFExtendedElements_QNAME, SIFExtendedElementsType.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SchoolLocalId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeSchoolLocalId(String value) {
        return new JAXBElement<String>(_SessionInfoTypeSchoolLocalId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomInfoRefId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeRoomInfoRefId(String value) {
        return new JAXBElement<String>(_TimeTableCellTypeRoomInfoRefId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "SIF_Metadata", scope = TimeTableCellType.class)
    public JAXBElement<SIFMetadataType> createTimeTableCellTypeSIFMetadata(SIFMetadataType value) {
        return new JAXBElement<SIFMetadataType>(_SectionInfoTypeSIFMetadata_QNAME, SIFMetadataType.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffLocalId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeStaffLocalId(String value) {
        return new JAXBElement<String>(_StudentScoreJudgementAgainstStandardTypeStaffLocalId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "StaffPersonalRefId", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeStaffPersonalRefId(String value) {
        return new JAXBElement<String>(_StudentGradeTypeStaffPersonalRefId_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledTeacherListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "TeacherList", scope = TimeTableCellType.class)
    public JAXBElement<ScheduledTeacherListType> createTimeTableCellTypeTeacherList(ScheduledTeacherListType value) {
        return new JAXBElement<ScheduledTeacherListType>(_TeachingGroupTypeTeacherList_QNAME, ScheduledTeacherListType.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomNumber", scope = TimeTableCellType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTimeTableCellTypeRoomNumber(String value) {
        return new JAXBElement<String>(_SessionInfoTypeRoomNumber_QNAME, String.class, TimeTableCellType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sifassociation.org/datamodel/au/3.4", name = "RoomList", scope = TimeTableCellType.class)
    public JAXBElement<RoomListType> createTimeTableCellTypeRoomList(RoomListType value) {
        return new JAXBElement<RoomListType>(_ScheduledActivityTypeRoomList_QNAME, RoomListType.class, TimeTableCellType.class, value);
    }

}
