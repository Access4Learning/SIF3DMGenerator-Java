
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents the unique set of questions or stimuli that can be given to a set of test takers. A physical correlate of the assessment form is the test booklet given to students during an assessment. For an adaptive test, the form would become a container for the structure and pool of items that are available to be selected by the adaptive algorithm. However, this object does not contain the questions, it only contains elements that describe the form for use in scoring the questions.
 * 
 * <p>Java class for assessmentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentFormType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="assessmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="formVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="formPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="formIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formIdentifier" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="formAccommodationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formAccommodation" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="gradeLevelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentFormSubjectList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentFormSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentFormLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentFormLanguage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="intendedAdministrationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="intendedAdministrationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="assessmentSubTestRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentSectionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentSection" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentSectionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="assessmentSectionSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
 *         &lt;element name="assessmentPlatformList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentPlatform" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentAssetRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentAssetRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "assessmentFormType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentRefId",
    "formName",
    "formVersion",
    "formPublishDate",
    "assessmentType",
    "formIdentifierList",
    "formAccommodationList",
    "level",
    "period",
    "gradeLevelList",
    "assessmentFormSubjectList",
    "assessmentFormLanguageList",
    "intendedAdministrationEndDate",
    "intendedAdministrationStartDate",
    "assessmentSubTestRefIdList",
    "assessmentSectionList",
    "assessmentPlatformList",
    "assessmentAssetRefIdList"
})
public class AssessmentFormType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String formName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String formVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar formPublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assessmentType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.FormIdentifierList formIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.FormAccommodationList formAccommodationList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String level;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String period;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.GradeLevelList gradeLevelList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentFormSubjectList assessmentFormSubjectList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentFormLanguageList assessmentFormLanguageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intendedAdministrationEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intendedAdministrationStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentSubTestRefIdList assessmentSubTestRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentSectionList assessmentSectionList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentPlatformList assessmentPlatformList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormType.AssessmentAssetRefIdList assessmentAssetRefIdList;

    /**
     * Gets the value of the assessmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRefId() {
        return assessmentRefId;
    }

    /**
     * Sets the value of the assessmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRefId(String value) {
        this.assessmentRefId = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the formVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormVersion() {
        return formVersion;
    }

    /**
     * Sets the value of the formVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormVersion(String value) {
        this.formVersion = value;
    }

    /**
     * Gets the value of the formPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormPublishDate() {
        return formPublishDate;
    }

    /**
     * Sets the value of the formPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormPublishDate(XMLGregorianCalendar value) {
        this.formPublishDate = value;
    }

    /**
     * Gets the value of the assessmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentType() {
        return assessmentType;
    }

    /**
     * Sets the value of the assessmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentType(String value) {
        this.assessmentType = value;
    }

    /**
     * Gets the value of the formIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.FormIdentifierList }
     *     
     */
    public AssessmentFormType.FormIdentifierList getFormIdentifierList() {
        return formIdentifierList;
    }

    /**
     * Sets the value of the formIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.FormIdentifierList }
     *     
     */
    public void setFormIdentifierList(AssessmentFormType.FormIdentifierList value) {
        this.formIdentifierList = value;
    }

    /**
     * Gets the value of the formAccommodationList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.FormAccommodationList }
     *     
     */
    public AssessmentFormType.FormAccommodationList getFormAccommodationList() {
        return formAccommodationList;
    }

    /**
     * Sets the value of the formAccommodationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.FormAccommodationList }
     *     
     */
    public void setFormAccommodationList(AssessmentFormType.FormAccommodationList value) {
        this.formAccommodationList = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the gradeLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.GradeLevelList }
     *     
     */
    public AssessmentFormType.GradeLevelList getGradeLevelList() {
        return gradeLevelList;
    }

    /**
     * Sets the value of the gradeLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.GradeLevelList }
     *     
     */
    public void setGradeLevelList(AssessmentFormType.GradeLevelList value) {
        this.gradeLevelList = value;
    }

    /**
     * Gets the value of the assessmentFormSubjectList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentFormSubjectList }
     *     
     */
    public AssessmentFormType.AssessmentFormSubjectList getAssessmentFormSubjectList() {
        return assessmentFormSubjectList;
    }

    /**
     * Sets the value of the assessmentFormSubjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentFormSubjectList }
     *     
     */
    public void setAssessmentFormSubjectList(AssessmentFormType.AssessmentFormSubjectList value) {
        this.assessmentFormSubjectList = value;
    }

    /**
     * Gets the value of the assessmentFormLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentFormLanguageList }
     *     
     */
    public AssessmentFormType.AssessmentFormLanguageList getAssessmentFormLanguageList() {
        return assessmentFormLanguageList;
    }

    /**
     * Sets the value of the assessmentFormLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentFormLanguageList }
     *     
     */
    public void setAssessmentFormLanguageList(AssessmentFormType.AssessmentFormLanguageList value) {
        this.assessmentFormLanguageList = value;
    }

    /**
     * Gets the value of the intendedAdministrationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntendedAdministrationEndDate() {
        return intendedAdministrationEndDate;
    }

    /**
     * Sets the value of the intendedAdministrationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntendedAdministrationEndDate(XMLGregorianCalendar value) {
        this.intendedAdministrationEndDate = value;
    }

    /**
     * Gets the value of the intendedAdministrationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntendedAdministrationStartDate() {
        return intendedAdministrationStartDate;
    }

    /**
     * Sets the value of the intendedAdministrationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntendedAdministrationStartDate(XMLGregorianCalendar value) {
        this.intendedAdministrationStartDate = value;
    }

    /**
     * Gets the value of the assessmentSubTestRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentSubTestRefIdList }
     *     
     */
    public AssessmentFormType.AssessmentSubTestRefIdList getAssessmentSubTestRefIdList() {
        return assessmentSubTestRefIdList;
    }

    /**
     * Sets the value of the assessmentSubTestRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentSubTestRefIdList }
     *     
     */
    public void setAssessmentSubTestRefIdList(AssessmentFormType.AssessmentSubTestRefIdList value) {
        this.assessmentSubTestRefIdList = value;
    }

    /**
     * Gets the value of the assessmentSectionList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentSectionList }
     *     
     */
    public AssessmentFormType.AssessmentSectionList getAssessmentSectionList() {
        return assessmentSectionList;
    }

    /**
     * Sets the value of the assessmentSectionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentSectionList }
     *     
     */
    public void setAssessmentSectionList(AssessmentFormType.AssessmentSectionList value) {
        this.assessmentSectionList = value;
    }

    /**
     * Gets the value of the assessmentPlatformList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentPlatformList }
     *     
     */
    public AssessmentFormType.AssessmentPlatformList getAssessmentPlatformList() {
        return assessmentPlatformList;
    }

    /**
     * Sets the value of the assessmentPlatformList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentPlatformList }
     *     
     */
    public void setAssessmentPlatformList(AssessmentFormType.AssessmentPlatformList value) {
        this.assessmentPlatformList = value;
    }

    /**
     * Gets the value of the assessmentAssetRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormType.AssessmentAssetRefIdList }
     *     
     */
    public AssessmentFormType.AssessmentAssetRefIdList getAssessmentAssetRefIdList() {
        return assessmentAssetRefIdList;
    }

    /**
     * Sets the value of the assessmentAssetRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormType.AssessmentAssetRefIdList }
     *     
     */
    public void setAssessmentAssetRefIdList(AssessmentFormType.AssessmentAssetRefIdList value) {
        this.assessmentAssetRefIdList = value;
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
     *         &lt;element name="assessmentAssetRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentAssetRefId"
    })
    public static class AssessmentAssetRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assessmentAssetRefId;

        /**
         * Gets the value of the assessmentAssetRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentAssetRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentAssetRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentAssetRefId() {
            if (assessmentAssetRefId == null) {
                assessmentAssetRefId = new ArrayList<String>();
            }
            return this.assessmentAssetRefId;
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
     *         &lt;element name="assessmentFormLanguage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentFormLanguage"
    })
    public static class AssessmentFormLanguageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<String> assessmentFormLanguage;

        /**
         * Gets the value of the assessmentFormLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentFormLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentFormLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentFormLanguage() {
            if (assessmentFormLanguage == null) {
                assessmentFormLanguage = new ArrayList<String>();
            }
            return this.assessmentFormLanguage;
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
     *         &lt;element name="assessmentFormSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentFormSubject"
    })
    public static class AssessmentFormSubjectList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> assessmentFormSubject;

        /**
         * Gets the value of the assessmentFormSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentFormSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentFormSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getAssessmentFormSubject() {
            if (assessmentFormSubject == null) {
                assessmentFormSubject = new ArrayList<GSubjectAreaType>();
            }
            return this.assessmentFormSubject;
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
     *         &lt;element name="assessmentPlatform" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentPlatform"
    })
    public static class AssessmentPlatformList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> assessmentPlatform;

        /**
         * Gets the value of the assessmentPlatform property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentPlatform property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentPlatform().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentPlatform() {
            if (assessmentPlatform == null) {
                assessmentPlatform = new ArrayList<String>();
            }
            return this.assessmentPlatform;
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
     *         &lt;element name="assessmentSection" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentSectionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="assessmentSectionSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "assessmentSection"
    })
    public static class AssessmentSectionList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentFormType.AssessmentSectionList.AssessmentSection> assessmentSection;

        /**
         * Gets the value of the assessmentSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentFormType.AssessmentSectionList.AssessmentSection }
         * 
         * 
         */
        public List<AssessmentFormType.AssessmentSectionList.AssessmentSection> getAssessmentSection() {
            if (assessmentSection == null) {
                assessmentSection = new ArrayList<AssessmentFormType.AssessmentSectionList.AssessmentSection>();
            }
            return this.assessmentSection;
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
         *         &lt;element name="assessmentSectionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="assessmentSectionSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "assessmentSectionRefId",
            "assessmentSectionSequence"
        })
        public static class AssessmentSection {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentSectionRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String assessmentSectionSequence;

            /**
             * Gets the value of the assessmentSectionRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentSectionRefId() {
                return assessmentSectionRefId;
            }

            /**
             * Sets the value of the assessmentSectionRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentSectionRefId(String value) {
                this.assessmentSectionRefId = value;
            }

            /**
             * Gets the value of the assessmentSectionSequence property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentSectionSequence() {
                return assessmentSectionSequence;
            }

            /**
             * Sets the value of the assessmentSectionSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentSectionSequence(String value) {
                this.assessmentSectionSequence = value;
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
     *         &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentSubTestRefId"
    })
    public static class AssessmentSubTestRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assessmentSubTestRefId;

        /**
         * Gets the value of the assessmentSubTestRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentSubTestRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentSubTestRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentSubTestRefId() {
            if (assessmentSubTestRefId == null) {
                assessmentSubTestRefId = new ArrayList<String>();
            }
            return this.assessmentSubTestRefId;
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
     *         &lt;element name="formAccommodation" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "formAccommodation"
    })
    public static class FormAccommodationList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> formAccommodation;

        /**
         * Gets the value of the formAccommodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formAccommodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormAccommodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFormAccommodation() {
            if (formAccommodation == null) {
                formAccommodation = new ArrayList<String>();
            }
            return this.formAccommodation;
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
     *         &lt;element name="formIdentifier" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "formIdentifier"
    })
    public static class FormIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GLocalIdType> formIdentifier;

        /**
         * Gets the value of the formIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLocalIdType }
         * 
         * 
         */
        public List<GLocalIdType> getFormIdentifier() {
            if (formIdentifier == null) {
                formIdentifier = new ArrayList<GLocalIdType>();
            }
            return this.formIdentifier;
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
     *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "gradeLevel"
    })
    public static class GradeLevelList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GYearGroupType> gradeLevel;

        /**
         * Gets the value of the gradeLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gradeLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGradeLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GYearGroupType }
         * 
         * 
         */
        public List<GYearGroupType> getGradeLevel() {
            if (gradeLevel == null) {
                gradeLevel = new ArrayList<GYearGroupType>();
            }
            return this.gradeLevel;
        }

    }

}
