
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentParticipationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentParticipationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgramType" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramTypeType"/>
 *         &lt;element name="LEAInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}LEAInfoSummaryCleanType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolInfoMediumSummaryType"/>
 *         &lt;element name="ReferralDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ProgramStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramStatusType" minOccurs="0"/>
 *         &lt;element name="EvaluationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ReevaluationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ExceptionalityCategories" type="{http://www.sifassociation.org/datamodel/na/4.x}ExceptionalityCategoryListType" minOccurs="0"/>
 *         &lt;element name="ProgramPlanDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ProgramPlanEffectiveDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="PlannedAssessmentParticipation" type="{http://www.sifassociation.org/datamodel/na/4.x}SourcedCodesetType" minOccurs="0"/>
 *         &lt;element name="StudentSpecialEducationFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "StudentParticipationDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "programType",
    "leaInfoData",
    "schoolInfoData",
    "referralDate",
    "programStatus",
    "evaluationDate",
    "reevaluationDate",
    "exceptionalityCategories",
    "programPlanDate",
    "programPlanEffectiveDate",
    "plannedAssessmentParticipation",
    "studentSpecialEducationFTE"
})
public class StudentParticipationDataType {

    @XmlElement(name = "ProgramType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ProgramTypeType programType;
    @XmlElement(name = "LEAInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LEAInfoSummaryCleanType leaInfoData;
    @XmlElement(name = "SchoolInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SchoolInfoMediumSummaryType schoolInfoData;
    @XmlElement(name = "ReferralDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String referralDate;
    @XmlElement(name = "ProgramStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramStatusType programStatus;
    @XmlElement(name = "EvaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String evaluationDate;
    @XmlElement(name = "ReevaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String reevaluationDate;
    @XmlElement(name = "ExceptionalityCategories", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ExceptionalityCategoryListType exceptionalityCategories;
    @XmlElement(name = "ProgramPlanDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String programPlanDate;
    @XmlElement(name = "ProgramPlanEffectiveDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String programPlanEffectiveDate;
    @XmlElement(name = "PlannedAssessmentParticipation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourcedCodesetType plannedAssessmentParticipation;
    @XmlElement(name = "StudentSpecialEducationFTE", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal studentSpecialEducationFTE;

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramTypeType }
     *     
     */
    public ProgramTypeType getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramTypeType }
     *     
     */
    public void setProgramType(ProgramTypeType value) {
        this.programType = value;
    }

    /**
     * Gets the value of the leaInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link LEAInfoSummaryCleanType }
     *     
     */
    public LEAInfoSummaryCleanType getLEAInfoData() {
        return leaInfoData;
    }

    /**
     * Sets the value of the leaInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEAInfoSummaryCleanType }
     *     
     */
    public void setLEAInfoData(LEAInfoSummaryCleanType value) {
        this.leaInfoData = value;
    }

    /**
     * Gets the value of the schoolInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoMediumSummaryType }
     *     
     */
    public SchoolInfoMediumSummaryType getSchoolInfoData() {
        return schoolInfoData;
    }

    /**
     * Sets the value of the schoolInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoMediumSummaryType }
     *     
     */
    public void setSchoolInfoData(SchoolInfoMediumSummaryType value) {
        this.schoolInfoData = value;
    }

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
     * Gets the value of the programStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramStatusType }
     *     
     */
    public ProgramStatusType getProgramStatus() {
        return programStatus;
    }

    /**
     * Sets the value of the programStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramStatusType }
     *     
     */
    public void setProgramStatus(ProgramStatusType value) {
        this.programStatus = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationDate(String value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the reevaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReevaluationDate() {
        return reevaluationDate;
    }

    /**
     * Sets the value of the reevaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReevaluationDate(String value) {
        this.reevaluationDate = value;
    }

    /**
     * Gets the value of the exceptionalityCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionalityCategoryListType }
     *     
     */
    public ExceptionalityCategoryListType getExceptionalityCategories() {
        return exceptionalityCategories;
    }

    /**
     * Sets the value of the exceptionalityCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionalityCategoryListType }
     *     
     */
    public void setExceptionalityCategories(ExceptionalityCategoryListType value) {
        this.exceptionalityCategories = value;
    }

    /**
     * Gets the value of the programPlanDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramPlanDate() {
        return programPlanDate;
    }

    /**
     * Sets the value of the programPlanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramPlanDate(String value) {
        this.programPlanDate = value;
    }

    /**
     * Gets the value of the programPlanEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramPlanEffectiveDate() {
        return programPlanEffectiveDate;
    }

    /**
     * Sets the value of the programPlanEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramPlanEffectiveDate(String value) {
        this.programPlanEffectiveDate = value;
    }

    /**
     * Gets the value of the plannedAssessmentParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link SourcedCodesetType }
     *     
     */
    public SourcedCodesetType getPlannedAssessmentParticipation() {
        return plannedAssessmentParticipation;
    }

    /**
     * Sets the value of the plannedAssessmentParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcedCodesetType }
     *     
     */
    public void setPlannedAssessmentParticipation(SourcedCodesetType value) {
        this.plannedAssessmentParticipation = value;
    }

    /**
     * Gets the value of the studentSpecialEducationFTE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentSpecialEducationFTE() {
        return studentSpecialEducationFTE;
    }

    /**
     * Sets the value of the studentSpecialEducationFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentSpecialEducationFTE(BigDecimal value) {
        this.studentSpecialEducationFTE = value;
    }

}
