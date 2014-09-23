
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentFormCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentFormCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormAccommodationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormIntendedAdministrationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormPlatformsSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSecureIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intendedAdministrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningResourcePublishedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentFormSectionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="identificationSystemForAssessmentFormSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionTimeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionSealed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSectionReentry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningResourcePublishedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subtestAssessmentItem" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentFormSubtestItemWeightCorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSubtestItemWeightIncorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormSubtestItemWeightNotAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentFormCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentFormName",
    "assessmentFormNumber",
    "assessmentAcademicSubject",
    "assessmentFormAccommodationList",
    "assessmentFormIntendedAdministrationEndDate",
    "assessmentFormPlatformsSupported",
    "assessmentFormVersion",
    "assessmentLanguage",
    "assessmentSecureIndicator",
    "intendedAdministrationStartDate",
    "learningResourcePublishedDate",
    "subtest",
    "subtestAssessmentItem"
})
public class AssessmentFormCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAcademicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormAccommodationList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormIntendedAdministrationEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormPlatformsSupported;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSecureIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String intendedAdministrationStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningResourcePublishedDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormCEDSType.Subtest subtest;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentFormCEDSType.SubtestAssessmentItem subtestAssessmentItem;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormName() {
        return assessmentFormName;
    }

    /**
     * Sets the value of the assessmentFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormName(String value) {
        this.assessmentFormName = value;
    }

    /**
     * Gets the value of the assessmentFormNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormNumber() {
        return assessmentFormNumber;
    }

    /**
     * Sets the value of the assessmentFormNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormNumber(String value) {
        this.assessmentFormNumber = value;
    }

    /**
     * Gets the value of the assessmentAcademicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAcademicSubject() {
        return assessmentAcademicSubject;
    }

    /**
     * Sets the value of the assessmentAcademicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAcademicSubject(String value) {
        this.assessmentAcademicSubject = value;
    }

    /**
     * Gets the value of the assessmentFormAccommodationList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormAccommodationList() {
        return assessmentFormAccommodationList;
    }

    /**
     * Sets the value of the assessmentFormAccommodationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormAccommodationList(String value) {
        this.assessmentFormAccommodationList = value;
    }

    /**
     * Gets the value of the assessmentFormIntendedAdministrationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormIntendedAdministrationEndDate() {
        return assessmentFormIntendedAdministrationEndDate;
    }

    /**
     * Sets the value of the assessmentFormIntendedAdministrationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormIntendedAdministrationEndDate(String value) {
        this.assessmentFormIntendedAdministrationEndDate = value;
    }

    /**
     * Gets the value of the assessmentFormPlatformsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormPlatformsSupported() {
        return assessmentFormPlatformsSupported;
    }

    /**
     * Sets the value of the assessmentFormPlatformsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormPlatformsSupported(String value) {
        this.assessmentFormPlatformsSupported = value;
    }

    /**
     * Gets the value of the assessmentFormVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormVersion() {
        return assessmentFormVersion;
    }

    /**
     * Sets the value of the assessmentFormVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormVersion(String value) {
        this.assessmentFormVersion = value;
    }

    /**
     * Gets the value of the assessmentLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentLanguage() {
        return assessmentLanguage;
    }

    /**
     * Sets the value of the assessmentLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentLanguage(String value) {
        this.assessmentLanguage = value;
    }

    /**
     * Gets the value of the assessmentSecureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSecureIndicator() {
        return assessmentSecureIndicator;
    }

    /**
     * Sets the value of the assessmentSecureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSecureIndicator(String value) {
        this.assessmentSecureIndicator = value;
    }

    /**
     * Gets the value of the intendedAdministrationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedAdministrationStartDate() {
        return intendedAdministrationStartDate;
    }

    /**
     * Sets the value of the intendedAdministrationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedAdministrationStartDate(String value) {
        this.intendedAdministrationStartDate = value;
    }

    /**
     * Gets the value of the learningResourcePublishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningResourcePublishedDate() {
        return learningResourcePublishedDate;
    }

    /**
     * Sets the value of the learningResourcePublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningResourcePublishedDate(String value) {
        this.learningResourcePublishedDate = value;
    }

    /**
     * Gets the value of the subtest property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormCEDSType.Subtest }
     *     
     */
    public AssessmentFormCEDSType.Subtest getSubtest() {
        return subtest;
    }

    /**
     * Sets the value of the subtest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormCEDSType.Subtest }
     *     
     */
    public void setSubtest(AssessmentFormCEDSType.Subtest value) {
        this.subtest = value;
    }

    /**
     * Gets the value of the subtestAssessmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFormCEDSType.SubtestAssessmentItem }
     *     
     */
    public AssessmentFormCEDSType.SubtestAssessmentItem getSubtestAssessmentItem() {
        return subtestAssessmentItem;
    }

    /**
     * Sets the value of the subtestAssessmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFormCEDSType.SubtestAssessmentItem }
     *     
     */
    public void setSubtestAssessmentItem(AssessmentFormCEDSType.SubtestAssessmentItem value) {
        this.subtestAssessmentItem = value;
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
     *         &lt;element name="assessmentFormSectionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="identificationSystemForAssessmentFormSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionTimeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionSealed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSectionReentry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningResourcePublishedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentFormSectionGUID",
        "assessmentFormSectionIdentifier",
        "assessmentAcademicSubject",
        "assessmentFormSectionSequenceNumber",
        "assessmentFormSectionVersion",
        "identificationSystemForAssessmentFormSection",
        "assessmentFormSectionTimeLimit",
        "assessmentFormSectionSealed",
        "assessmentFormSectionReentry",
        "learningResourcePublishedDate"
    })
    public static class Subtest {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionGUID;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAcademicSubject;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionSequenceNumber;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionVersion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String identificationSystemForAssessmentFormSection;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionTimeLimit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionSealed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSectionReentry;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningResourcePublishedDate;

        /**
         * Gets the value of the assessmentFormSectionGUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionGUID() {
            return assessmentFormSectionGUID;
        }

        /**
         * Sets the value of the assessmentFormSectionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionGUID(String value) {
            this.assessmentFormSectionGUID = value;
        }

        /**
         * Gets the value of the assessmentFormSectionIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionIdentifier() {
            return assessmentFormSectionIdentifier;
        }

        /**
         * Sets the value of the assessmentFormSectionIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionIdentifier(String value) {
            this.assessmentFormSectionIdentifier = value;
        }

        /**
         * Gets the value of the assessmentAcademicSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAcademicSubject() {
            return assessmentAcademicSubject;
        }

        /**
         * Sets the value of the assessmentAcademicSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAcademicSubject(String value) {
            this.assessmentAcademicSubject = value;
        }

        /**
         * Gets the value of the assessmentFormSectionSequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionSequenceNumber() {
            return assessmentFormSectionSequenceNumber;
        }

        /**
         * Sets the value of the assessmentFormSectionSequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionSequenceNumber(String value) {
            this.assessmentFormSectionSequenceNumber = value;
        }

        /**
         * Gets the value of the assessmentFormSectionVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionVersion() {
            return assessmentFormSectionVersion;
        }

        /**
         * Sets the value of the assessmentFormSectionVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionVersion(String value) {
            this.assessmentFormSectionVersion = value;
        }

        /**
         * Gets the value of the identificationSystemForAssessmentFormSection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentificationSystemForAssessmentFormSection() {
            return identificationSystemForAssessmentFormSection;
        }

        /**
         * Sets the value of the identificationSystemForAssessmentFormSection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentificationSystemForAssessmentFormSection(String value) {
            this.identificationSystemForAssessmentFormSection = value;
        }

        /**
         * Gets the value of the assessmentFormSectionTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionTimeLimit() {
            return assessmentFormSectionTimeLimit;
        }

        /**
         * Sets the value of the assessmentFormSectionTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionTimeLimit(String value) {
            this.assessmentFormSectionTimeLimit = value;
        }

        /**
         * Gets the value of the assessmentFormSectionSealed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionSealed() {
            return assessmentFormSectionSealed;
        }

        /**
         * Sets the value of the assessmentFormSectionSealed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionSealed(String value) {
            this.assessmentFormSectionSealed = value;
        }

        /**
         * Gets the value of the assessmentFormSectionReentry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSectionReentry() {
            return assessmentFormSectionReentry;
        }

        /**
         * Sets the value of the assessmentFormSectionReentry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSectionReentry(String value) {
            this.assessmentFormSectionReentry = value;
        }

        /**
         * Gets the value of the learningResourcePublishedDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningResourcePublishedDate() {
            return learningResourcePublishedDate;
        }

        /**
         * Sets the value of the learningResourcePublishedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningResourcePublishedDate(String value) {
            this.learningResourcePublishedDate = value;
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
     *         &lt;element name="assessmentFormSubtestItemWeightCorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSubtestItemWeightIncorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormSubtestItemWeightNotAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentFormSubtestItemWeightCorrect",
        "assessmentFormSubtestItemWeightIncorrect",
        "assessmentFormSubtestItemWeightNotAttempted"
    })
    public static class SubtestAssessmentItem {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSubtestItemWeightCorrect;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSubtestItemWeightIncorrect;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormSubtestItemWeightNotAttempted;

        /**
         * Gets the value of the assessmentFormSubtestItemWeightCorrect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSubtestItemWeightCorrect() {
            return assessmentFormSubtestItemWeightCorrect;
        }

        /**
         * Sets the value of the assessmentFormSubtestItemWeightCorrect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSubtestItemWeightCorrect(String value) {
            this.assessmentFormSubtestItemWeightCorrect = value;
        }

        /**
         * Gets the value of the assessmentFormSubtestItemWeightIncorrect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSubtestItemWeightIncorrect() {
            return assessmentFormSubtestItemWeightIncorrect;
        }

        /**
         * Sets the value of the assessmentFormSubtestItemWeightIncorrect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSubtestItemWeightIncorrect(String value) {
            this.assessmentFormSubtestItemWeightIncorrect = value;
        }

        /**
         * Gets the value of the assessmentFormSubtestItemWeightNotAttempted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormSubtestItemWeightNotAttempted() {
            return assessmentFormSubtestItemWeightNotAttempted;
        }

        /**
         * Sets the value of the assessmentFormSubtestItemWeightNotAttempted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormSubtestItemWeightNotAttempted(String value) {
            this.assessmentFormSubtestItemWeightNotAttempted = value;
        }

    }

}
