
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for elClassGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elClassGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="classGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="structure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="beginningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="endingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceOptionVariation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hoursAvailablePerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="daysAvailablePerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyChildhoodSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programAnnualOperatingWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="languageTranslationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningGroupSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="population" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="youngestAgeAuthorizedToServe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="oIdestAgeAuthorizedToServe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="servesChildrenWithSpecialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="groupSizeStandardsMet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enrollmentServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="curriculum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EarlylearningClassGroupCurriculumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elClassGroupType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identification",
    "structure",
    "population",
    "curriculum"
})
public class ElClassGroupType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElClassGroupType.Identification identification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElClassGroupType.Structure structure;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElClassGroupType.Population population;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElClassGroupType.Curriculum curriculum;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link ElClassGroupType.Identification }
     *     
     */
    public ElClassGroupType.Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElClassGroupType.Identification }
     *     
     */
    public void setIdentification(ElClassGroupType.Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link ElClassGroupType.Structure }
     *     
     */
    public ElClassGroupType.Structure getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElClassGroupType.Structure }
     *     
     */
    public void setStructure(ElClassGroupType.Structure value) {
        this.structure = value;
    }

    /**
     * Gets the value of the population property.
     * 
     * @return
     *     possible object is
     *     {@link ElClassGroupType.Population }
     *     
     */
    public ElClassGroupType.Population getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElClassGroupType.Population }
     *     
     */
    public void setPopulation(ElClassGroupType.Population value) {
        this.population = value;
    }

    /**
     * Gets the value of the curriculum property.
     * 
     * @return
     *     possible object is
     *     {@link ElClassGroupType.Curriculum }
     *     
     */
    public ElClassGroupType.Curriculum getCurriculum() {
        return curriculum;
    }

    /**
     * Sets the value of the curriculum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElClassGroupType.Curriculum }
     *     
     */
    public void setCurriculum(ElClassGroupType.Curriculum value) {
        this.curriculum = value;
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
     *         &lt;element name="EarlylearningClassGroupCurriculumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "earlylearningClassGroupCurriculumType"
    })
    public static class Curriculum {

        @XmlElement(name = "EarlylearningClassGroupCurriculumType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningClassGroupCurriculumType;

        /**
         * Gets the value of the earlylearningClassGroupCurriculumType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningClassGroupCurriculumType() {
            return earlylearningClassGroupCurriculumType;
        }

        /**
         * Sets the value of the earlylearningClassGroupCurriculumType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningClassGroupCurriculumType(String value) {
            this.earlylearningClassGroupCurriculumType = value;
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
     *         &lt;element name="classGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "classGroupName",
        "classGroupId"
    })
    public static class Identification {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classGroupName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classGroupId;

        /**
         * Gets the value of the classGroupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassGroupName() {
            return classGroupName;
        }

        /**
         * Sets the value of the classGroupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassGroupName(String value) {
            this.classGroupName = value;
        }

        /**
         * Gets the value of the classGroupId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassGroupId() {
            return classGroupId;
        }

        /**
         * Sets the value of the classGroupId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassGroupId(String value) {
            this.classGroupId = value;
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
     *         &lt;element name="youngestAgeAuthorizedToServe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="oIdestAgeAuthorizedToServe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="servesChildrenWithSpecialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="groupSizeStandardsMet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enrollmentServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "youngestAgeAuthorizedToServe",
        "oIdestAgeAuthorizedToServe",
        "servesChildrenWithSpecialNeeds",
        "groupSizeStandardsMet",
        "enrollmentServiceType"
    })
    public static class Population {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String youngestAgeAuthorizedToServe;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String oIdestAgeAuthorizedToServe;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String servesChildrenWithSpecialNeeds;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String groupSizeStandardsMet;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String enrollmentServiceType;

        /**
         * Gets the value of the youngestAgeAuthorizedToServe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYoungestAgeAuthorizedToServe() {
            return youngestAgeAuthorizedToServe;
        }

        /**
         * Sets the value of the youngestAgeAuthorizedToServe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYoungestAgeAuthorizedToServe(String value) {
            this.youngestAgeAuthorizedToServe = value;
        }

        /**
         * Gets the value of the oIdestAgeAuthorizedToServe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOIdestAgeAuthorizedToServe() {
            return oIdestAgeAuthorizedToServe;
        }

        /**
         * Sets the value of the oIdestAgeAuthorizedToServe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOIdestAgeAuthorizedToServe(String value) {
            this.oIdestAgeAuthorizedToServe = value;
        }

        /**
         * Gets the value of the servesChildrenWithSpecialNeeds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServesChildrenWithSpecialNeeds() {
            return servesChildrenWithSpecialNeeds;
        }

        /**
         * Sets the value of the servesChildrenWithSpecialNeeds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServesChildrenWithSpecialNeeds(String value) {
            this.servesChildrenWithSpecialNeeds = value;
        }

        /**
         * Gets the value of the groupSizeStandardsMet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupSizeStandardsMet() {
            return groupSizeStandardsMet;
        }

        /**
         * Sets the value of the groupSizeStandardsMet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupSizeStandardsMet(String value) {
            this.groupSizeStandardsMet = value;
        }

        /**
         * Gets the value of the enrollmentServiceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnrollmentServiceType() {
            return enrollmentServiceType;
        }

        /**
         * Sets the value of the enrollmentServiceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnrollmentServiceType(String value) {
            this.enrollmentServiceType = value;
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
     *         &lt;element name="beginningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="endingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceOptionVariation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hoursAvailablePerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="daysAvailablePerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyChildhoodSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programAnnualOperatingWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="languageTranslationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningGroupSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "beginningTime",
        "endingTime",
        "serviceOptionVariation",
        "hoursAvailablePerDay",
        "daysAvailablePerWeek",
        "earlyChildhoodSetting",
        "programAnnualOperatingWeeks",
        "languageTranslationPolicy",
        "earlyLearningGroupSize"
    })
    public static class Structure {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String beginningTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String endingTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String serviceOptionVariation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hoursAvailablePerDay;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String daysAvailablePerWeek;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyChildhoodSetting;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programAnnualOperatingWeeks;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String languageTranslationPolicy;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningGroupSize;

        /**
         * Gets the value of the beginningTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginningTime() {
            return beginningTime;
        }

        /**
         * Sets the value of the beginningTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginningTime(String value) {
            this.beginningTime = value;
        }

        /**
         * Gets the value of the endingTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndingTime() {
            return endingTime;
        }

        /**
         * Sets the value of the endingTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndingTime(String value) {
            this.endingTime = value;
        }

        /**
         * Gets the value of the serviceOptionVariation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceOptionVariation() {
            return serviceOptionVariation;
        }

        /**
         * Sets the value of the serviceOptionVariation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceOptionVariation(String value) {
            this.serviceOptionVariation = value;
        }

        /**
         * Gets the value of the hoursAvailablePerDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoursAvailablePerDay() {
            return hoursAvailablePerDay;
        }

        /**
         * Sets the value of the hoursAvailablePerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoursAvailablePerDay(String value) {
            this.hoursAvailablePerDay = value;
        }

        /**
         * Gets the value of the daysAvailablePerWeek property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysAvailablePerWeek() {
            return daysAvailablePerWeek;
        }

        /**
         * Sets the value of the daysAvailablePerWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysAvailablePerWeek(String value) {
            this.daysAvailablePerWeek = value;
        }

        /**
         * Gets the value of the earlyChildhoodSetting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyChildhoodSetting() {
            return earlyChildhoodSetting;
        }

        /**
         * Sets the value of the earlyChildhoodSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyChildhoodSetting(String value) {
            this.earlyChildhoodSetting = value;
        }

        /**
         * Gets the value of the programAnnualOperatingWeeks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramAnnualOperatingWeeks() {
            return programAnnualOperatingWeeks;
        }

        /**
         * Sets the value of the programAnnualOperatingWeeks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramAnnualOperatingWeeks(String value) {
            this.programAnnualOperatingWeeks = value;
        }

        /**
         * Gets the value of the languageTranslationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguageTranslationPolicy() {
            return languageTranslationPolicy;
        }

        /**
         * Sets the value of the languageTranslationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguageTranslationPolicy(String value) {
            this.languageTranslationPolicy = value;
        }

        /**
         * Gets the value of the earlyLearningGroupSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningGroupSize() {
            return earlyLearningGroupSize;
        }

        /**
         * Sets the value of the earlyLearningGroupSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningGroupSize(String value) {
            this.earlyLearningGroupSize = value;
        }

    }

}
