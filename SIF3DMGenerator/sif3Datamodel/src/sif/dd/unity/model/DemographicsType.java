
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="RaceList" type="{http://www.sifassociation.org/datamodel/na/4.x}RaceListType" minOccurs="0"/>
 *         &lt;element name="HispanicLatino" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Gender" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BirthDate" type="{http://www.sifassociation.org/datamodel/na/4.x}BirthDateType" minOccurs="0"/>
 *         &lt;element name="BirthDateVerification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CountyOfBirth" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StateOfBirth" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceType" minOccurs="0"/>
 *         &lt;element name="CountryOfBirth" type="{http://www.sifassociation.org/datamodel/na/4.x}CountryType" minOccurs="0"/>
 *         &lt;element name="CountriesOfCitizenship" type="{http://www.sifassociation.org/datamodel/na/4.x}CountriesOfCitizenshipType" minOccurs="0"/>
 *         &lt;element name="CountriesOfResidency" type="{http://www.sifassociation.org/datamodel/na/4.x}CountriesOfResidencyType" minOccurs="0"/>
 *         &lt;element name="CountryArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CitizenshipStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EnglishProficiency" type="{http://www.sifassociation.org/datamodel/na/4.x}EnglishProficiencyType" minOccurs="0"/>
 *         &lt;element name="LanguageList" type="{http://www.sifassociation.org/datamodel/na/4.x}LanguageListType" minOccurs="0"/>
 *         &lt;element name="DwellingArrangement" type="{http://www.sifassociation.org/datamodel/na/4.x}DwellingArrangementType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemographicsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "raceList",
    "hispanicLatino",
    "gender",
    "birthDate",
    "birthDateVerification",
    "placeOfBirth",
    "countyOfBirth",
    "stateOfBirth",
    "countryOfBirth",
    "countriesOfCitizenship",
    "countriesOfResidency",
    "countryArrivalDate",
    "citizenshipStatus",
    "englishProficiency",
    "languageList",
    "dwellingArrangement",
    "maritalStatus"
})
public class DemographicsType {

    @XmlElement(name = "RaceList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RaceListType raceList;
    @XmlElement(name = "HispanicLatino", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType.HispanicLatino hispanicLatino;
    @XmlElement(name = "Gender", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType.Gender gender;
    @XmlElement(name = "BirthDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthDateVerification", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType.BirthDateVerification birthDateVerification;
    @XmlElement(name = "PlaceOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String placeOfBirth;
    @XmlElement(name = "CountyOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String countyOfBirth;
    @XmlElement(name = "StateOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StateProvinceType stateOfBirth;
    @XmlElement(name = "CountryOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CountryType countryOfBirth;
    @XmlElement(name = "CountriesOfCitizenship", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CountriesOfCitizenshipType countriesOfCitizenship;
    @XmlElement(name = "CountriesOfResidency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CountriesOfResidencyType countriesOfResidency;
    @XmlElement(name = "CountryArrivalDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar countryArrivalDate;
    @XmlElement(name = "CitizenshipStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType.CitizenshipStatus citizenshipStatus;
    @XmlElement(name = "EnglishProficiency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EnglishProficiencyType englishProficiency;
    @XmlElement(name = "LanguageList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LanguageListType languageList;
    @XmlElement(name = "DwellingArrangement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DwellingArrangementType dwellingArrangement;
    @XmlElement(name = "MaritalStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maritalStatus;

    /**
     * Gets the value of the raceList property.
     * 
     * @return
     *     possible object is
     *     {@link RaceListType }
     *     
     */
    public RaceListType getRaceList() {
        return raceList;
    }

    /**
     * Sets the value of the raceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceListType }
     *     
     */
    public void setRaceList(RaceListType value) {
        this.raceList = value;
    }

    /**
     * Gets the value of the hispanicLatino property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.HispanicLatino }
     *     
     */
    public DemographicsType.HispanicLatino getHispanicLatino() {
        return hispanicLatino;
    }

    /**
     * Sets the value of the hispanicLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.HispanicLatino }
     *     
     */
    public void setHispanicLatino(DemographicsType.HispanicLatino value) {
        this.hispanicLatino = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.Gender }
     *     
     */
    public DemographicsType.Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.Gender }
     *     
     */
    public void setGender(DemographicsType.Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthDateVerification property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.BirthDateVerification }
     *     
     */
    public DemographicsType.BirthDateVerification getBirthDateVerification() {
        return birthDateVerification;
    }

    /**
     * Sets the value of the birthDateVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.BirthDateVerification }
     *     
     */
    public void setBirthDateVerification(DemographicsType.BirthDateVerification value) {
        this.birthDateVerification = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the countyOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOfBirth() {
        return countyOfBirth;
    }

    /**
     * Sets the value of the countyOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOfBirth(String value) {
        this.countyOfBirth = value;
    }

    /**
     * Gets the value of the stateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceType }
     *     
     */
    public StateProvinceType getStateOfBirth() {
        return stateOfBirth;
    }

    /**
     * Sets the value of the stateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceType }
     *     
     */
    public void setStateOfBirth(StateProvinceType value) {
        this.stateOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfBirth(CountryType value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the countriesOfCitizenship property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesOfCitizenshipType }
     *     
     */
    public CountriesOfCitizenshipType getCountriesOfCitizenship() {
        return countriesOfCitizenship;
    }

    /**
     * Sets the value of the countriesOfCitizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesOfCitizenshipType }
     *     
     */
    public void setCountriesOfCitizenship(CountriesOfCitizenshipType value) {
        this.countriesOfCitizenship = value;
    }

    /**
     * Gets the value of the countriesOfResidency property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesOfResidencyType }
     *     
     */
    public CountriesOfResidencyType getCountriesOfResidency() {
        return countriesOfResidency;
    }

    /**
     * Sets the value of the countriesOfResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesOfResidencyType }
     *     
     */
    public void setCountriesOfResidency(CountriesOfResidencyType value) {
        this.countriesOfResidency = value;
    }

    /**
     * Gets the value of the countryArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCountryArrivalDate() {
        return countryArrivalDate;
    }

    /**
     * Sets the value of the countryArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCountryArrivalDate(XMLGregorianCalendar value) {
        this.countryArrivalDate = value;
    }

    /**
     * Gets the value of the citizenshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.CitizenshipStatus }
     *     
     */
    public DemographicsType.CitizenshipStatus getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Sets the value of the citizenshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.CitizenshipStatus }
     *     
     */
    public void setCitizenshipStatus(DemographicsType.CitizenshipStatus value) {
        this.citizenshipStatus = value;
    }

    /**
     * Gets the value of the englishProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link EnglishProficiencyType }
     *     
     */
    public EnglishProficiencyType getEnglishProficiency() {
        return englishProficiency;
    }

    /**
     * Sets the value of the englishProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnglishProficiencyType }
     *     
     */
    public void setEnglishProficiency(EnglishProficiencyType value) {
        this.englishProficiency = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageListType }
     *     
     */
    public LanguageListType getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageListType }
     *     
     */
    public void setLanguageList(LanguageListType value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the dwellingArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link DwellingArrangementType }
     *     
     */
    public DwellingArrangementType getDwellingArrangement() {
        return dwellingArrangement;
    }

    /**
     * Sets the value of the dwellingArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DwellingArrangementType }
     *     
     */
    public void setDwellingArrangement(DwellingArrangementType value) {
        this.dwellingArrangement = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
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
    public static class BirthDateVerification {

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
    public static class CitizenshipStatus {

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
    public static class Gender {

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
    public static class HispanicLatino {

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

}
