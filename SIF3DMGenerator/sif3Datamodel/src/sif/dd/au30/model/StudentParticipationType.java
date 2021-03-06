
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentParticipationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentParticipationAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsStudentFamilyProgramTypeType" minOccurs="0"/>
 *         &lt;element name="ProgramFundingSources" type="{http://www.sifassociation.org/datamodel/au/3.4}ProgramFundingSourcesType" minOccurs="0"/>
 *         &lt;element name="ManagingSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefTypeOrEmpty">
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
 *         &lt;element name="ReferralSource" type="{http://www.sifassociation.org/datamodel/au/3.4}ReferralSourceType" minOccurs="0"/>
 *         &lt;element name="ProgramStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}ProgramStatusType" minOccurs="0"/>
 *         &lt;element name="GiftedEligibilityCriteria" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="EvaluationParentalConsentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationExtensionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExtensionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramEligibilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlanDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlanEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NOREPDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlacementParentalConsentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlacementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExtendedSchoolYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProgramAvailability" type="{http://www.sifassociation.org/datamodel/au/3.4}ProgramAvailabilityType" minOccurs="0"/>
 *         &lt;element name="EntryPerson" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StudentSpecialEducationFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ParticipationContact" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentParticipationType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "studentParticipationAsOfDate",
    "programType",
    "programFundingSources",
    "managingSchool",
    "referralDate",
    "referralSource",
    "programStatus",
    "giftedEligibilityCriteria",
    "evaluationParentalConsentDate",
    "evaluationDate",
    "evaluationExtensionDate",
    "extensionComments",
    "reevaluationDate",
    "programEligibilityDate",
    "programPlanDate",
    "programPlanEffectiveDate",
    "norepDate",
    "placementParentalConsentDate",
    "programPlacementDate",
    "extendedSchoolYear",
    "extendedDay",
    "programAvailability",
    "entryPerson",
    "studentSpecialEducationFTE",
    "participationContact",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentParticipationType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "StudentParticipationAsOfDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentParticipationAsOfDate;
    @XmlElementRef(name = "ProgramType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programType;
    @XmlElementRef(name = "ProgramFundingSources", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramFundingSourcesType> programFundingSources;
    @XmlElement(name = "ManagingSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected StudentParticipationType.ManagingSchool managingSchool;
    @XmlElementRef(name = "ReferralDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> referralDate;
    @XmlElementRef(name = "ReferralSource", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferralSourceType> referralSource;
    @XmlElementRef(name = "ProgramStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramStatusType> programStatus;
    @XmlElementRef(name = "GiftedEligibilityCriteria", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> giftedEligibilityCriteria;
    @XmlElementRef(name = "EvaluationParentalConsentDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evaluationParentalConsentDate;
    @XmlElementRef(name = "EvaluationDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evaluationDate;
    @XmlElementRef(name = "EvaluationExtensionDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evaluationExtensionDate;
    @XmlElementRef(name = "ExtensionComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extensionComments;
    @XmlElementRef(name = "ReevaluationDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reevaluationDate;
    @XmlElementRef(name = "ProgramEligibilityDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> programEligibilityDate;
    @XmlElementRef(name = "ProgramPlanDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> programPlanDate;
    @XmlElementRef(name = "ProgramPlanEffectiveDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> programPlanEffectiveDate;
    @XmlElementRef(name = "NOREPDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> norepDate;
    @XmlElementRef(name = "PlacementParentalConsentDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> placementParentalConsentDate;
    @XmlElementRef(name = "ProgramPlacementDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> programPlacementDate;
    @XmlElementRef(name = "ExtendedSchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extendedSchoolYear;
    @XmlElementRef(name = "ExtendedDay", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extendedDay;
    @XmlElementRef(name = "ProgramAvailability", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramAvailabilityType> programAvailability;
    @XmlElementRef(name = "EntryPerson", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entryPerson;
    @XmlElementRef(name = "StudentSpecialEducationFTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> studentSpecialEducationFTE;
    @XmlElementRef(name = "ParticipationContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> participationContact;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the studentParticipationAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentParticipationAsOfDate() {
        return studentParticipationAsOfDate;
    }

    /**
     * Sets the value of the studentParticipationAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentParticipationAsOfDate(XMLGregorianCalendar value) {
        this.studentParticipationAsOfDate = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramType(JAXBElement<String> value) {
        this.programType = value;
    }

    /**
     * Gets the value of the programFundingSources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramFundingSourcesType }{@code >}
     *     
     */
    public JAXBElement<ProgramFundingSourcesType> getProgramFundingSources() {
        return programFundingSources;
    }

    /**
     * Sets the value of the programFundingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramFundingSourcesType }{@code >}
     *     
     */
    public void setProgramFundingSources(JAXBElement<ProgramFundingSourcesType> value) {
        this.programFundingSources = value;
    }

    /**
     * Gets the value of the managingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link StudentParticipationType.ManagingSchool }
     *     
     */
    public StudentParticipationType.ManagingSchool getManagingSchool() {
        return managingSchool;
    }

    /**
     * Sets the value of the managingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentParticipationType.ManagingSchool }
     *     
     */
    public void setManagingSchool(StudentParticipationType.ManagingSchool value) {
        this.managingSchool = value;
    }

    /**
     * Gets the value of the referralDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReferralDate() {
        return referralDate;
    }

    /**
     * Sets the value of the referralDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReferralDate(JAXBElement<XMLGregorianCalendar> value) {
        this.referralDate = value;
    }

    /**
     * Gets the value of the referralSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferralSourceType }{@code >}
     *     
     */
    public JAXBElement<ReferralSourceType> getReferralSource() {
        return referralSource;
    }

    /**
     * Sets the value of the referralSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferralSourceType }{@code >}
     *     
     */
    public void setReferralSource(JAXBElement<ReferralSourceType> value) {
        this.referralSource = value;
    }

    /**
     * Gets the value of the programStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramStatusType }{@code >}
     *     
     */
    public JAXBElement<ProgramStatusType> getProgramStatus() {
        return programStatus;
    }

    /**
     * Sets the value of the programStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramStatusType }{@code >}
     *     
     */
    public void setProgramStatus(JAXBElement<ProgramStatusType> value) {
        this.programStatus = value;
    }

    /**
     * Gets the value of the giftedEligibilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getGiftedEligibilityCriteria() {
        return giftedEligibilityCriteria;
    }

    /**
     * Sets the value of the giftedEligibilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setGiftedEligibilityCriteria(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.giftedEligibilityCriteria = value;
    }

    /**
     * Gets the value of the evaluationParentalConsentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvaluationParentalConsentDate() {
        return evaluationParentalConsentDate;
    }

    /**
     * Sets the value of the evaluationParentalConsentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvaluationParentalConsentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.evaluationParentalConsentDate = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvaluationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the evaluationExtensionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvaluationExtensionDate() {
        return evaluationExtensionDate;
    }

    /**
     * Sets the value of the evaluationExtensionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvaluationExtensionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.evaluationExtensionDate = value;
    }

    /**
     * Gets the value of the extensionComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtensionComments() {
        return extensionComments;
    }

    /**
     * Sets the value of the extensionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtensionComments(JAXBElement<String> value) {
        this.extensionComments = value;
    }

    /**
     * Gets the value of the reevaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReevaluationDate() {
        return reevaluationDate;
    }

    /**
     * Sets the value of the reevaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReevaluationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reevaluationDate = value;
    }

    /**
     * Gets the value of the programEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProgramEligibilityDate() {
        return programEligibilityDate;
    }

    /**
     * Sets the value of the programEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProgramEligibilityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.programEligibilityDate = value;
    }

    /**
     * Gets the value of the programPlanDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProgramPlanDate() {
        return programPlanDate;
    }

    /**
     * Sets the value of the programPlanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProgramPlanDate(JAXBElement<XMLGregorianCalendar> value) {
        this.programPlanDate = value;
    }

    /**
     * Gets the value of the programPlanEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProgramPlanEffectiveDate() {
        return programPlanEffectiveDate;
    }

    /**
     * Sets the value of the programPlanEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProgramPlanEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.programPlanEffectiveDate = value;
    }

    /**
     * Gets the value of the norepDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNOREPDate() {
        return norepDate;
    }

    /**
     * Sets the value of the norepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNOREPDate(JAXBElement<XMLGregorianCalendar> value) {
        this.norepDate = value;
    }

    /**
     * Gets the value of the placementParentalConsentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlacementParentalConsentDate() {
        return placementParentalConsentDate;
    }

    /**
     * Sets the value of the placementParentalConsentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlacementParentalConsentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.placementParentalConsentDate = value;
    }

    /**
     * Gets the value of the programPlacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProgramPlacementDate() {
        return programPlacementDate;
    }

    /**
     * Sets the value of the programPlacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProgramPlacementDate(JAXBElement<XMLGregorianCalendar> value) {
        this.programPlacementDate = value;
    }

    /**
     * Gets the value of the extendedSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtendedSchoolYear() {
        return extendedSchoolYear;
    }

    /**
     * Sets the value of the extendedSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtendedSchoolYear(JAXBElement<Boolean> value) {
        this.extendedSchoolYear = value;
    }

    /**
     * Gets the value of the extendedDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtendedDay() {
        return extendedDay;
    }

    /**
     * Sets the value of the extendedDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtendedDay(JAXBElement<Boolean> value) {
        this.extendedDay = value;
    }

    /**
     * Gets the value of the programAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramAvailabilityType }{@code >}
     *     
     */
    public JAXBElement<ProgramAvailabilityType> getProgramAvailability() {
        return programAvailability;
    }

    /**
     * Sets the value of the programAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramAvailabilityType }{@code >}
     *     
     */
    public void setProgramAvailability(JAXBElement<ProgramAvailabilityType> value) {
        this.programAvailability = value;
    }

    /**
     * Gets the value of the entryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntryPerson() {
        return entryPerson;
    }

    /**
     * Sets the value of the entryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntryPerson(JAXBElement<String> value) {
        this.entryPerson = value;
    }

    /**
     * Gets the value of the studentSpecialEducationFTE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStudentSpecialEducationFTE() {
        return studentSpecialEducationFTE;
    }

    /**
     * Sets the value of the studentSpecialEducationFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStudentSpecialEducationFTE(JAXBElement<BigDecimal> value) {
        this.studentSpecialEducationFTE = value;
    }

    /**
     * Gets the value of the participationContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParticipationContact() {
        return participationContact;
    }

    /**
     * Sets the value of the participationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParticipationContact(JAXBElement<String> value) {
        this.participationContact = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
        this.sifExtendedElements = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefTypeOrEmpty">
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
