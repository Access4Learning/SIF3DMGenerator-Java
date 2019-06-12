
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentSpecialEducationSummaryStudentParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSpecialEducationSummaryStudentParticipationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgramType" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramTypeType"/>
 *         &lt;element name="ProgramFundingSources" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementProgramFundingSourceListType" minOccurs="0"/>
 *         &lt;element name="ManagingPublicAgency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="LEAInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManagingSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReferralDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramStatusType" minOccurs="0"/>
 *         &lt;element name="GiftedEligibilityCriteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EvaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExceptionalityCategories" type="{http://www.sifassociation.org/datamodel/na/4.x}ExceptionalityCategoryListType" minOccurs="0"/>
 *         &lt;element name="ProgramPlanDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlanEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedAssessmentParticipation" type="{http://www.sifassociation.org/datamodel/na/4.x}SourcedCodesetType" minOccurs="0"/>
 *         &lt;element name="DaysInParticipation" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSpecialEducationSummaryStudentParticipationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "programType",
    "programFundingSources",
    "managingPublicAgency",
    "managingSchool",
    "referralDate",
    "programStatus",
    "giftedEligibilityCriteria",
    "evaluationDate",
    "reevaluationDate",
    "exceptionalityCategories",
    "programPlanDate",
    "programPlanEffectiveDate",
    "plannedAssessmentParticipation",
    "daysInParticipation"
})
public class StudentSpecialEducationSummaryStudentParticipationType {

    @XmlElement(name = "ProgramType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ProgramTypeType programType;
    @XmlElement(name = "ProgramFundingSources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementProgramFundingSourceListType programFundingSources;
    @XmlElement(name = "ManagingPublicAgency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentParticipationType.ManagingPublicAgency managingPublicAgency;
    @XmlElement(name = "ManagingSchool", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentParticipationType.ManagingSchool managingSchool;
    @XmlElement(name = "ReferralDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referralDate;
    @XmlElement(name = "ProgramStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramStatusType programStatus;
    @XmlElement(name = "GiftedEligibilityCriteria", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentParticipationType.GiftedEligibilityCriteria giftedEligibilityCriteria;
    @XmlElement(name = "EvaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationDate;
    @XmlElement(name = "ReevaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reevaluationDate;
    @XmlElement(name = "ExceptionalityCategories", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ExceptionalityCategoryListType exceptionalityCategories;
    @XmlElement(name = "ProgramPlanDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programPlanDate;
    @XmlElement(name = "ProgramPlanEffectiveDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programPlanEffectiveDate;
    @XmlElement(name = "PlannedAssessmentParticipation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourcedCodesetType plannedAssessmentParticipation;
    @XmlElement(name = "DaysInParticipation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long daysInParticipation;

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
     * Gets the value of the programFundingSources property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementProgramFundingSourceListType }
     *     
     */
    public StudentPlacementProgramFundingSourceListType getProgramFundingSources() {
        return programFundingSources;
    }

    /**
     * Sets the value of the programFundingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementProgramFundingSourceListType }
     *     
     */
    public void setProgramFundingSources(StudentPlacementProgramFundingSourceListType value) {
        this.programFundingSources = value;
    }

    /**
     * Gets the value of the managingPublicAgency property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.ManagingPublicAgency }
     *     
     */
    public StudentSpecialEducationSummaryStudentParticipationType.ManagingPublicAgency getManagingPublicAgency() {
        return managingPublicAgency;
    }

    /**
     * Sets the value of the managingPublicAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.ManagingPublicAgency }
     *     
     */
    public void setManagingPublicAgency(StudentSpecialEducationSummaryStudentParticipationType.ManagingPublicAgency value) {
        this.managingPublicAgency = value;
    }

    /**
     * Gets the value of the managingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.ManagingSchool }
     *     
     */
    public StudentSpecialEducationSummaryStudentParticipationType.ManagingSchool getManagingSchool() {
        return managingSchool;
    }

    /**
     * Sets the value of the managingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.ManagingSchool }
     *     
     */
    public void setManagingSchool(StudentSpecialEducationSummaryStudentParticipationType.ManagingSchool value) {
        this.managingSchool = value;
    }

    /**
     * Gets the value of the referralDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferralDate() {
        return referralDate;
    }

    /**
     * Sets the value of the referralDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferralDate(XMLGregorianCalendar value) {
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
     * Gets the value of the giftedEligibilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.GiftedEligibilityCriteria }
     *     
     */
    public StudentSpecialEducationSummaryStudentParticipationType.GiftedEligibilityCriteria getGiftedEligibilityCriteria() {
        return giftedEligibilityCriteria;
    }

    /**
     * Sets the value of the giftedEligibilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationType.GiftedEligibilityCriteria }
     *     
     */
    public void setGiftedEligibilityCriteria(StudentSpecialEducationSummaryStudentParticipationType.GiftedEligibilityCriteria value) {
        this.giftedEligibilityCriteria = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationDate(XMLGregorianCalendar value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the reevaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReevaluationDate() {
        return reevaluationDate;
    }

    /**
     * Sets the value of the reevaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReevaluationDate(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramPlanDate() {
        return programPlanDate;
    }

    /**
     * Sets the value of the programPlanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramPlanDate(XMLGregorianCalendar value) {
        this.programPlanDate = value;
    }

    /**
     * Gets the value of the programPlanEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramPlanEffectiveDate() {
        return programPlanEffectiveDate;
    }

    /**
     * Sets the value of the programPlanEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramPlanEffectiveDate(XMLGregorianCalendar value) {
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
     * Gets the value of the daysInParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysInParticipation() {
        return daysInParticipation;
    }

    /**
     * Sets the value of the daysInParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysInParticipation(Long value) {
        this.daysInParticipation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class GiftedEligibilityCriteria {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="LEAInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ManagingPublicAgency {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ManagingSchool {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }

}
