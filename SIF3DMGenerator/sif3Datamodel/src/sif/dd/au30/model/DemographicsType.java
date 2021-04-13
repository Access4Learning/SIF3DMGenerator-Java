
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DemographicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndigenousStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsIndigenousStatusType" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSexCodeType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.sifassociation.org/datamodel/au/3.4}BirthDateType" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Deceased" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="BirthDateVerification" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsBirthdateVerificationType" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StateOfBirth" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceType" minOccurs="0"/>
 *         &lt;element name="CountryOfBirth" type="{http://www.sifassociation.org/datamodel/au/3.4}CountryType" minOccurs="0"/>
 *         &lt;element name="CountriesOfCitizenship" type="{http://www.sifassociation.org/datamodel/au/3.4}CountryListType" minOccurs="0"/>
 *         &lt;element name="CountriesOfResidency" type="{http://www.sifassociation.org/datamodel/au/3.4}CountryList2Type" minOccurs="0"/>
 *         &lt;element name="CountryArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AustralianCitizenshipStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAustralianCitizenshipStatusType" minOccurs="0"/>
 *         &lt;element name="EnglishProficiency" type="{http://www.sifassociation.org/datamodel/au/3.4}EnglishProficiencyType" minOccurs="0"/>
 *         &lt;element name="LanguageList" type="{http://www.sifassociation.org/datamodel/au/3.4}LanguageListType" minOccurs="0"/>
 *         &lt;element name="DwellingArrangement" type="{http://www.sifassociation.org/datamodel/au/3.4}DwellingArrangementType" minOccurs="0"/>
 *         &lt;element name="Religion" type="{http://www.sifassociation.org/datamodel/au/3.4}ReligionType" minOccurs="0"/>
 *         &lt;element name="ReligiousEventList" type="{http://www.sifassociation.org/datamodel/au/3.4}ReligiousEventListType" minOccurs="0"/>
 *         &lt;element name="ReligiousRegion" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PermanentResident" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsPermanentResidentStatusType" minOccurs="0"/>
 *         &lt;element name="VisaSubClass" type="{http://www.sifassociation.org/datamodel/au/3.4}VisaSubClassCodeType" minOccurs="0"/>
 *         &lt;element name="VisaStatisticalCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="VisaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VisaSubClassList" type="{http://www.sifassociation.org/datamodel/au/3.4}VisaSubClassListType" minOccurs="0"/>
 *         &lt;element name="LBOTE" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="InterpreterRequired" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ImmunisationCertificateStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsImmunisationCertificateStatusType" minOccurs="0"/>
 *         &lt;element name="CulturalBackground" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAustralianStandardClassificationOfCulturalAndEthnicGroupsASCCEGType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsMaritalStatusAIHWType" minOccurs="0"/>
 *         &lt;element name="MedicareNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemographicsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "indigenousStatus",
    "sex",
    "birthDate",
    "dateOfDeath",
    "deceased",
    "birthDateVerification",
    "placeOfBirth",
    "stateOfBirth",
    "countryOfBirth",
    "countriesOfCitizenship",
    "countriesOfResidency",
    "countryArrivalDate",
    "australianCitizenshipStatus",
    "englishProficiency",
    "languageList",
    "dwellingArrangement",
    "religion",
    "religiousEventList",
    "religiousRegion",
    "permanentResident",
    "visaSubClass",
    "visaStatisticalCode",
    "visaExpiryDate",
    "visaSubClassList",
    "lbote",
    "interpreterRequired",
    "immunisationCertificateStatus",
    "culturalBackground",
    "maritalStatus",
    "medicareNumber"
})
public class DemographicsType {

    @XmlElementRef(name = "IndigenousStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indigenousStatus;
    @XmlElementRef(name = "Sex", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "BirthDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDate;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfDeath;
    @XmlElementRef(name = "Deceased", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> deceased;
    @XmlElementRef(name = "BirthDateVerification", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthDateVerification;
    @XmlElementRef(name = "PlaceOfBirth", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeOfBirth;
    @XmlElementRef(name = "StateOfBirth", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOfBirth;
    @XmlElementRef(name = "CountryOfBirth", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryOfBirth;
    @XmlElementRef(name = "CountriesOfCitizenship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryListType> countriesOfCitizenship;
    @XmlElementRef(name = "CountriesOfResidency", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryList2Type> countriesOfResidency;
    @XmlElementRef(name = "CountryArrivalDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> countryArrivalDate;
    @XmlElementRef(name = "AustralianCitizenshipStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> australianCitizenshipStatus;
    @XmlElementRef(name = "EnglishProficiency", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<EnglishProficiencyType> englishProficiency;
    @XmlElementRef(name = "LanguageList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LanguageListType> languageList;
    @XmlElementRef(name = "DwellingArrangement", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<DwellingArrangementType> dwellingArrangement;
    @XmlElementRef(name = "Religion", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ReligionType> religion;
    @XmlElementRef(name = "ReligiousEventList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ReligiousEventListType> religiousEventList;
    @XmlElementRef(name = "ReligiousRegion", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> religiousRegion;
    @XmlElementRef(name = "PermanentResident", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permanentResident;
    @XmlElementRef(name = "VisaSubClass", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visaSubClass;
    @XmlElementRef(name = "VisaStatisticalCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visaStatisticalCode;
    @XmlElementRef(name = "VisaExpiryDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> visaExpiryDate;
    @XmlElementRef(name = "VisaSubClassList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<VisaSubClassListType> visaSubClassList;
    @XmlElementRef(name = "LBOTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> lbote;
    @XmlElementRef(name = "InterpreterRequired", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> interpreterRequired;
    @XmlElementRef(name = "ImmunisationCertificateStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsImmunisationCertificateStatusType> immunisationCertificateStatus;
    @XmlElementRef(name = "CulturalBackground", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> culturalBackground;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "MedicareNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> medicareNumber;

    /**
     * Gets the value of the indigenousStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndigenousStatus() {
        return indigenousStatus;
    }

    /**
     * Sets the value of the indigenousStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndigenousStatus(JAXBElement<String> value) {
        this.indigenousStatus = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setDeceased(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the birthDateVerification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthDateVerification() {
        return birthDateVerification;
    }

    /**
     * Sets the value of the birthDateVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthDateVerification(JAXBElement<String> value) {
        this.birthDateVerification = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaceOfBirth(JAXBElement<String> value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the stateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOfBirth() {
        return stateOfBirth;
    }

    /**
     * Sets the value of the stateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOfBirth(JAXBElement<String> value) {
        this.stateOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryOfBirth(JAXBElement<String> value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the countriesOfCitizenship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryListType }{@code >}
     *     
     */
    public JAXBElement<CountryListType> getCountriesOfCitizenship() {
        return countriesOfCitizenship;
    }

    /**
     * Sets the value of the countriesOfCitizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryListType }{@code >}
     *     
     */
    public void setCountriesOfCitizenship(JAXBElement<CountryListType> value) {
        this.countriesOfCitizenship = value;
    }

    /**
     * Gets the value of the countriesOfResidency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryList2Type }{@code >}
     *     
     */
    public JAXBElement<CountryList2Type> getCountriesOfResidency() {
        return countriesOfResidency;
    }

    /**
     * Sets the value of the countriesOfResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryList2Type }{@code >}
     *     
     */
    public void setCountriesOfResidency(JAXBElement<CountryList2Type> value) {
        this.countriesOfResidency = value;
    }

    /**
     * Gets the value of the countryArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCountryArrivalDate() {
        return countryArrivalDate;
    }

    /**
     * Sets the value of the countryArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCountryArrivalDate(JAXBElement<XMLGregorianCalendar> value) {
        this.countryArrivalDate = value;
    }

    /**
     * Gets the value of the australianCitizenshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAustralianCitizenshipStatus() {
        return australianCitizenshipStatus;
    }

    /**
     * Sets the value of the australianCitizenshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAustralianCitizenshipStatus(JAXBElement<String> value) {
        this.australianCitizenshipStatus = value;
    }

    /**
     * Gets the value of the englishProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnglishProficiencyType }{@code >}
     *     
     */
    public JAXBElement<EnglishProficiencyType> getEnglishProficiency() {
        return englishProficiency;
    }

    /**
     * Sets the value of the englishProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnglishProficiencyType }{@code >}
     *     
     */
    public void setEnglishProficiency(JAXBElement<EnglishProficiencyType> value) {
        this.englishProficiency = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LanguageListType }{@code >}
     *     
     */
    public JAXBElement<LanguageListType> getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LanguageListType }{@code >}
     *     
     */
    public void setLanguageList(JAXBElement<LanguageListType> value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the dwellingArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DwellingArrangementType }{@code >}
     *     
     */
    public JAXBElement<DwellingArrangementType> getDwellingArrangement() {
        return dwellingArrangement;
    }

    /**
     * Sets the value of the dwellingArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DwellingArrangementType }{@code >}
     *     
     */
    public void setDwellingArrangement(JAXBElement<DwellingArrangementType> value) {
        this.dwellingArrangement = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReligionType }{@code >}
     *     
     */
    public JAXBElement<ReligionType> getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReligionType }{@code >}
     *     
     */
    public void setReligion(JAXBElement<ReligionType> value) {
        this.religion = value;
    }

    /**
     * Gets the value of the religiousEventList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReligiousEventListType }{@code >}
     *     
     */
    public JAXBElement<ReligiousEventListType> getReligiousEventList() {
        return religiousEventList;
    }

    /**
     * Sets the value of the religiousEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReligiousEventListType }{@code >}
     *     
     */
    public void setReligiousEventList(JAXBElement<ReligiousEventListType> value) {
        this.religiousEventList = value;
    }

    /**
     * Gets the value of the religiousRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReligiousRegion() {
        return religiousRegion;
    }

    /**
     * Sets the value of the religiousRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReligiousRegion(JAXBElement<String> value) {
        this.religiousRegion = value;
    }

    /**
     * Gets the value of the permanentResident property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermanentResident() {
        return permanentResident;
    }

    /**
     * Sets the value of the permanentResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermanentResident(JAXBElement<String> value) {
        this.permanentResident = value;
    }

    /**
     * Gets the value of the visaSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaSubClass() {
        return visaSubClass;
    }

    /**
     * Sets the value of the visaSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaSubClass(JAXBElement<String> value) {
        this.visaSubClass = value;
    }

    /**
     * Gets the value of the visaStatisticalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaStatisticalCode() {
        return visaStatisticalCode;
    }

    /**
     * Sets the value of the visaStatisticalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaStatisticalCode(JAXBElement<String> value) {
        this.visaStatisticalCode = value;
    }

    /**
     * Gets the value of the visaExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVisaExpiryDate() {
        return visaExpiryDate;
    }

    /**
     * Sets the value of the visaExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVisaExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.visaExpiryDate = value;
    }

    /**
     * Gets the value of the visaSubClassList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VisaSubClassListType }{@code >}
     *     
     */
    public JAXBElement<VisaSubClassListType> getVisaSubClassList() {
        return visaSubClassList;
    }

    /**
     * Sets the value of the visaSubClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VisaSubClassListType }{@code >}
     *     
     */
    public void setVisaSubClassList(JAXBElement<VisaSubClassListType> value) {
        this.visaSubClassList = value;
    }

    /**
     * Gets the value of the lbote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getLBOTE() {
        return lbote;
    }

    /**
     * Sets the value of the lbote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setLBOTE(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.lbote = value;
    }

    /**
     * Gets the value of the interpreterRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getInterpreterRequired() {
        return interpreterRequired;
    }

    /**
     * Sets the value of the interpreterRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setInterpreterRequired(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.interpreterRequired = value;
    }

    /**
     * Gets the value of the immunisationCertificateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsImmunisationCertificateStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsImmunisationCertificateStatusType> getImmunisationCertificateStatus() {
        return immunisationCertificateStatus;
    }

    /**
     * Sets the value of the immunisationCertificateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsImmunisationCertificateStatusType }{@code >}
     *     
     */
    public void setImmunisationCertificateStatus(JAXBElement<AUCodeSetsImmunisationCertificateStatusType> value) {
        this.immunisationCertificateStatus = value;
    }

    /**
     * Gets the value of the culturalBackground property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCulturalBackground() {
        return culturalBackground;
    }

    /**
     * Sets the value of the culturalBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCulturalBackground(JAXBElement<String> value) {
        this.culturalBackground = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the medicareNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedicareNumber() {
        return medicareNumber;
    }

    /**
     * Sets the value of the medicareNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedicareNumber(JAXBElement<String> value) {
        this.medicareNumber = value;
    }

}
