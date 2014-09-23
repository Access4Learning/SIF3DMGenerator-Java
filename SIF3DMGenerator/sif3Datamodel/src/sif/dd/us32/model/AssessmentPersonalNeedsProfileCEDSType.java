
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentPersonalNeedsProfileCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentPersonalNeedsProfileCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentNeedLanguageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentNeedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPersonalNeedsProfileActivateByDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPersonalNeedsProfileAssignedSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileContent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentNeedAlternativeRepresentationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedDirectionsOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedHazardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedItemTranslationDisplayLanguageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedKeywordTranslationLanguageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedSupportToolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedUserSpokenPreferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentNeedTimeMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileDisplay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentNeedBrailleDotPressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedBrailleGradeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedBrailleMarkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedBrailleStatusCellType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedInvertColorChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedLineReaderHighlightColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedLinkIndicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedMagnification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedMaskingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedNumberOfBrailleCells" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedNumberOfBrailleDotsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedPitch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedReadAtStartPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedSigningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedSoundFileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedSpeechRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedSpokenSourcePreferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedTextMessagingString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedUsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="screenEnhancement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentNeedBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedForegroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedIncreasedWhitespacingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentNeedOverlayColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentPersonalNeedsProfileCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentNeedLanguageType",
    "assessmentNeedType",
    "assessmentPersonalNeedsProfileActivateByDefault",
    "assessmentPersonalNeedsProfileAssignedSupport",
    "profileContent",
    "profileControl",
    "profileDisplay",
    "screenEnhancement"
})
public class AssessmentPersonalNeedsProfileCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentNeedLanguageType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentNeedType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPersonalNeedsProfileActivateByDefault;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPersonalNeedsProfileAssignedSupport;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentPersonalNeedsProfileCEDSType.ProfileContent profileContent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentPersonalNeedsProfileCEDSType.ProfileControl profileControl;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay profileDisplay;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement screenEnhancement;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentNeedLanguageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentNeedLanguageType() {
        return assessmentNeedLanguageType;
    }

    /**
     * Sets the value of the assessmentNeedLanguageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentNeedLanguageType(String value) {
        this.assessmentNeedLanguageType = value;
    }

    /**
     * Gets the value of the assessmentNeedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentNeedType() {
        return assessmentNeedType;
    }

    /**
     * Sets the value of the assessmentNeedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentNeedType(String value) {
        this.assessmentNeedType = value;
    }

    /**
     * Gets the value of the assessmentPersonalNeedsProfileActivateByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPersonalNeedsProfileActivateByDefault() {
        return assessmentPersonalNeedsProfileActivateByDefault;
    }

    /**
     * Sets the value of the assessmentPersonalNeedsProfileActivateByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPersonalNeedsProfileActivateByDefault(String value) {
        this.assessmentPersonalNeedsProfileActivateByDefault = value;
    }

    /**
     * Gets the value of the assessmentPersonalNeedsProfileAssignedSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPersonalNeedsProfileAssignedSupport() {
        return assessmentPersonalNeedsProfileAssignedSupport;
    }

    /**
     * Sets the value of the assessmentPersonalNeedsProfileAssignedSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPersonalNeedsProfileAssignedSupport(String value) {
        this.assessmentPersonalNeedsProfileAssignedSupport = value;
    }

    /**
     * Gets the value of the profileContent property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileContent }
     *     
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileContent getProfileContent() {
        return profileContent;
    }

    /**
     * Sets the value of the profileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileContent }
     *     
     */
    public void setProfileContent(AssessmentPersonalNeedsProfileCEDSType.ProfileContent value) {
        this.profileContent = value;
    }

    /**
     * Gets the value of the profileControl property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileControl }
     *     
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileControl getProfileControl() {
        return profileControl;
    }

    /**
     * Sets the value of the profileControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileControl }
     *     
     */
    public void setProfileControl(AssessmentPersonalNeedsProfileCEDSType.ProfileControl value) {
        this.profileControl = value;
    }

    /**
     * Gets the value of the profileDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay }
     *     
     */
    public AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay getProfileDisplay() {
        return profileDisplay;
    }

    /**
     * Sets the value of the profileDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay }
     *     
     */
    public void setProfileDisplay(AssessmentPersonalNeedsProfileCEDSType.ProfileDisplay value) {
        this.profileDisplay = value;
    }

    /**
     * Gets the value of the screenEnhancement property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement }
     *     
     */
    public AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement getScreenEnhancement() {
        return screenEnhancement;
    }

    /**
     * Sets the value of the screenEnhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement }
     *     
     */
    public void setScreenEnhancement(AssessmentPersonalNeedsProfileCEDSType.ScreenEnhancement value) {
        this.screenEnhancement = value;
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
     *         &lt;element name="assessmentNeedAlternativeRepresentationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedDirectionsOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedHazardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedItemTranslationDisplayLanguageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedKeywordTranslationLanguageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedSupportToolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedUserSpokenPreferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentNeedAlternativeRepresentationType",
        "assessmentNeedDirectionsOnly",
        "assessmentNeedHazardType",
        "assessmentNeedItemTranslationDisplayLanguageType",
        "assessmentNeedKeywordTranslationLanguageType",
        "assessmentNeedSupportToolType",
        "assessmentNeedUserSpokenPreferenceType"
    })
    public static class ProfileContent {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedAlternativeRepresentationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedDirectionsOnly;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedHazardType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedItemTranslationDisplayLanguageType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedKeywordTranslationLanguageType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedSupportToolType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedUserSpokenPreferenceType;

        /**
         * Gets the value of the assessmentNeedAlternativeRepresentationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedAlternativeRepresentationType() {
            return assessmentNeedAlternativeRepresentationType;
        }

        /**
         * Sets the value of the assessmentNeedAlternativeRepresentationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedAlternativeRepresentationType(String value) {
            this.assessmentNeedAlternativeRepresentationType = value;
        }

        /**
         * Gets the value of the assessmentNeedDirectionsOnly property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedDirectionsOnly() {
            return assessmentNeedDirectionsOnly;
        }

        /**
         * Sets the value of the assessmentNeedDirectionsOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedDirectionsOnly(String value) {
            this.assessmentNeedDirectionsOnly = value;
        }

        /**
         * Gets the value of the assessmentNeedHazardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedHazardType() {
            return assessmentNeedHazardType;
        }

        /**
         * Sets the value of the assessmentNeedHazardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedHazardType(String value) {
            this.assessmentNeedHazardType = value;
        }

        /**
         * Gets the value of the assessmentNeedItemTranslationDisplayLanguageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedItemTranslationDisplayLanguageType() {
            return assessmentNeedItemTranslationDisplayLanguageType;
        }

        /**
         * Sets the value of the assessmentNeedItemTranslationDisplayLanguageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedItemTranslationDisplayLanguageType(String value) {
            this.assessmentNeedItemTranslationDisplayLanguageType = value;
        }

        /**
         * Gets the value of the assessmentNeedKeywordTranslationLanguageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedKeywordTranslationLanguageType() {
            return assessmentNeedKeywordTranslationLanguageType;
        }

        /**
         * Sets the value of the assessmentNeedKeywordTranslationLanguageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedKeywordTranslationLanguageType(String value) {
            this.assessmentNeedKeywordTranslationLanguageType = value;
        }

        /**
         * Gets the value of the assessmentNeedSupportToolType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedSupportToolType() {
            return assessmentNeedSupportToolType;
        }

        /**
         * Sets the value of the assessmentNeedSupportToolType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedSupportToolType(String value) {
            this.assessmentNeedSupportToolType = value;
        }

        /**
         * Gets the value of the assessmentNeedUserSpokenPreferenceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedUserSpokenPreferenceType() {
            return assessmentNeedUserSpokenPreferenceType;
        }

        /**
         * Sets the value of the assessmentNeedUserSpokenPreferenceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedUserSpokenPreferenceType(String value) {
            this.assessmentNeedUserSpokenPreferenceType = value;
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
     *         &lt;element name="assessmentNeedTimeMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentNeedTimeMultiplier"
    })
    public static class ProfileControl {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedTimeMultiplier;

        /**
         * Gets the value of the assessmentNeedTimeMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedTimeMultiplier() {
            return assessmentNeedTimeMultiplier;
        }

        /**
         * Sets the value of the assessmentNeedTimeMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedTimeMultiplier(String value) {
            this.assessmentNeedTimeMultiplier = value;
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
     *         &lt;element name="assessmentNeedBrailleDotPressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedBrailleGradeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedBrailleMarkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedBrailleStatusCellType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedInvertColorChoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedLineReaderHighlightColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedLinkIndicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedMagnification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedMaskingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedNumberOfBrailleCells" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedNumberOfBrailleDotsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedPitch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedReadAtStartPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedSigningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedSoundFileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedSpeechRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedSpokenSourcePreferenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedTextMessagingString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedUsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentNeedBrailleDotPressure",
        "assessmentNeedBrailleGradeType",
        "assessmentNeedBrailleMarkType",
        "assessmentNeedBrailleStatusCellType",
        "assessmentNeedInvertColorChoice",
        "assessmentNeedLineReaderHighlightColor",
        "assessmentNeedLinkIndicationType",
        "assessmentNeedMagnification",
        "assessmentNeedMaskingType",
        "assessmentNeedNumberOfBrailleCells",
        "assessmentNeedNumberOfBrailleDotsType",
        "assessmentNeedPitch",
        "assessmentNeedReadAtStartPreference",
        "assessmentNeedSigningType",
        "assessmentNeedSoundFileURL",
        "assessmentNeedSpeechRate",
        "assessmentNeedSpokenSourcePreferenceType",
        "assessmentNeedTextMessagingString",
        "assessmentNeedUsageType",
        "assessmentNeedVolume"
    })
    public static class ProfileDisplay {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedBrailleDotPressure;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedBrailleGradeType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedBrailleMarkType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedBrailleStatusCellType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedInvertColorChoice;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedLineReaderHighlightColor;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedLinkIndicationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedMagnification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedMaskingType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedNumberOfBrailleCells;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedNumberOfBrailleDotsType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedPitch;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedReadAtStartPreference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedSigningType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedSoundFileURL;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedSpeechRate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedSpokenSourcePreferenceType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedTextMessagingString;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedUsageType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedVolume;

        /**
         * Gets the value of the assessmentNeedBrailleDotPressure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedBrailleDotPressure() {
            return assessmentNeedBrailleDotPressure;
        }

        /**
         * Sets the value of the assessmentNeedBrailleDotPressure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedBrailleDotPressure(String value) {
            this.assessmentNeedBrailleDotPressure = value;
        }

        /**
         * Gets the value of the assessmentNeedBrailleGradeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedBrailleGradeType() {
            return assessmentNeedBrailleGradeType;
        }

        /**
         * Sets the value of the assessmentNeedBrailleGradeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedBrailleGradeType(String value) {
            this.assessmentNeedBrailleGradeType = value;
        }

        /**
         * Gets the value of the assessmentNeedBrailleMarkType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedBrailleMarkType() {
            return assessmentNeedBrailleMarkType;
        }

        /**
         * Sets the value of the assessmentNeedBrailleMarkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedBrailleMarkType(String value) {
            this.assessmentNeedBrailleMarkType = value;
        }

        /**
         * Gets the value of the assessmentNeedBrailleStatusCellType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedBrailleStatusCellType() {
            return assessmentNeedBrailleStatusCellType;
        }

        /**
         * Sets the value of the assessmentNeedBrailleStatusCellType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedBrailleStatusCellType(String value) {
            this.assessmentNeedBrailleStatusCellType = value;
        }

        /**
         * Gets the value of the assessmentNeedInvertColorChoice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedInvertColorChoice() {
            return assessmentNeedInvertColorChoice;
        }

        /**
         * Sets the value of the assessmentNeedInvertColorChoice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedInvertColorChoice(String value) {
            this.assessmentNeedInvertColorChoice = value;
        }

        /**
         * Gets the value of the assessmentNeedLineReaderHighlightColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedLineReaderHighlightColor() {
            return assessmentNeedLineReaderHighlightColor;
        }

        /**
         * Sets the value of the assessmentNeedLineReaderHighlightColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedLineReaderHighlightColor(String value) {
            this.assessmentNeedLineReaderHighlightColor = value;
        }

        /**
         * Gets the value of the assessmentNeedLinkIndicationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedLinkIndicationType() {
            return assessmentNeedLinkIndicationType;
        }

        /**
         * Sets the value of the assessmentNeedLinkIndicationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedLinkIndicationType(String value) {
            this.assessmentNeedLinkIndicationType = value;
        }

        /**
         * Gets the value of the assessmentNeedMagnification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedMagnification() {
            return assessmentNeedMagnification;
        }

        /**
         * Sets the value of the assessmentNeedMagnification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedMagnification(String value) {
            this.assessmentNeedMagnification = value;
        }

        /**
         * Gets the value of the assessmentNeedMaskingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedMaskingType() {
            return assessmentNeedMaskingType;
        }

        /**
         * Sets the value of the assessmentNeedMaskingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedMaskingType(String value) {
            this.assessmentNeedMaskingType = value;
        }

        /**
         * Gets the value of the assessmentNeedNumberOfBrailleCells property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedNumberOfBrailleCells() {
            return assessmentNeedNumberOfBrailleCells;
        }

        /**
         * Sets the value of the assessmentNeedNumberOfBrailleCells property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedNumberOfBrailleCells(String value) {
            this.assessmentNeedNumberOfBrailleCells = value;
        }

        /**
         * Gets the value of the assessmentNeedNumberOfBrailleDotsType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedNumberOfBrailleDotsType() {
            return assessmentNeedNumberOfBrailleDotsType;
        }

        /**
         * Sets the value of the assessmentNeedNumberOfBrailleDotsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedNumberOfBrailleDotsType(String value) {
            this.assessmentNeedNumberOfBrailleDotsType = value;
        }

        /**
         * Gets the value of the assessmentNeedPitch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedPitch() {
            return assessmentNeedPitch;
        }

        /**
         * Sets the value of the assessmentNeedPitch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedPitch(String value) {
            this.assessmentNeedPitch = value;
        }

        /**
         * Gets the value of the assessmentNeedReadAtStartPreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedReadAtStartPreference() {
            return assessmentNeedReadAtStartPreference;
        }

        /**
         * Sets the value of the assessmentNeedReadAtStartPreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedReadAtStartPreference(String value) {
            this.assessmentNeedReadAtStartPreference = value;
        }

        /**
         * Gets the value of the assessmentNeedSigningType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedSigningType() {
            return assessmentNeedSigningType;
        }

        /**
         * Sets the value of the assessmentNeedSigningType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedSigningType(String value) {
            this.assessmentNeedSigningType = value;
        }

        /**
         * Gets the value of the assessmentNeedSoundFileURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedSoundFileURL() {
            return assessmentNeedSoundFileURL;
        }

        /**
         * Sets the value of the assessmentNeedSoundFileURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedSoundFileURL(String value) {
            this.assessmentNeedSoundFileURL = value;
        }

        /**
         * Gets the value of the assessmentNeedSpeechRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedSpeechRate() {
            return assessmentNeedSpeechRate;
        }

        /**
         * Sets the value of the assessmentNeedSpeechRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedSpeechRate(String value) {
            this.assessmentNeedSpeechRate = value;
        }

        /**
         * Gets the value of the assessmentNeedSpokenSourcePreferenceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedSpokenSourcePreferenceType() {
            return assessmentNeedSpokenSourcePreferenceType;
        }

        /**
         * Sets the value of the assessmentNeedSpokenSourcePreferenceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedSpokenSourcePreferenceType(String value) {
            this.assessmentNeedSpokenSourcePreferenceType = value;
        }

        /**
         * Gets the value of the assessmentNeedTextMessagingString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedTextMessagingString() {
            return assessmentNeedTextMessagingString;
        }

        /**
         * Sets the value of the assessmentNeedTextMessagingString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedTextMessagingString(String value) {
            this.assessmentNeedTextMessagingString = value;
        }

        /**
         * Gets the value of the assessmentNeedUsageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedUsageType() {
            return assessmentNeedUsageType;
        }

        /**
         * Sets the value of the assessmentNeedUsageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedUsageType(String value) {
            this.assessmentNeedUsageType = value;
        }

        /**
         * Gets the value of the assessmentNeedVolume property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedVolume() {
            return assessmentNeedVolume;
        }

        /**
         * Sets the value of the assessmentNeedVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedVolume(String value) {
            this.assessmentNeedVolume = value;
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
     *         &lt;element name="assessmentNeedBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedForegroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedIncreasedWhitespacingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentNeedOverlayColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentNeedBackgroundColor",
        "assessmentNeedForegroundColor",
        "assessmentNeedIncreasedWhitespacingType",
        "assessmentNeedOverlayColor"
    })
    public static class ScreenEnhancement {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedBackgroundColor;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedForegroundColor;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedIncreasedWhitespacingType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentNeedOverlayColor;

        /**
         * Gets the value of the assessmentNeedBackgroundColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedBackgroundColor() {
            return assessmentNeedBackgroundColor;
        }

        /**
         * Sets the value of the assessmentNeedBackgroundColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedBackgroundColor(String value) {
            this.assessmentNeedBackgroundColor = value;
        }

        /**
         * Gets the value of the assessmentNeedForegroundColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedForegroundColor() {
            return assessmentNeedForegroundColor;
        }

        /**
         * Sets the value of the assessmentNeedForegroundColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedForegroundColor(String value) {
            this.assessmentNeedForegroundColor = value;
        }

        /**
         * Gets the value of the assessmentNeedIncreasedWhitespacingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedIncreasedWhitespacingType() {
            return assessmentNeedIncreasedWhitespacingType;
        }

        /**
         * Sets the value of the assessmentNeedIncreasedWhitespacingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedIncreasedWhitespacingType(String value) {
            this.assessmentNeedIncreasedWhitespacingType = value;
        }

        /**
         * Gets the value of the assessmentNeedOverlayColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentNeedOverlayColor() {
            return assessmentNeedOverlayColor;
        }

        /**
         * Sets the value of the assessmentNeedOverlayColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentNeedOverlayColor(String value) {
            this.assessmentNeedOverlayColor = value;
        }

    }

}
