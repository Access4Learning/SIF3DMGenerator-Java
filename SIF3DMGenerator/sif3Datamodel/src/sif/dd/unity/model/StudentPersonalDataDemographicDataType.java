
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
 * <p>Java class for StudentPersonalDataDemographicDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPersonalDataDemographicDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RaceList" type="{http://www.sifassociation.org/datamodel/na/4.x}RaceListType" minOccurs="0"/>
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
 *         &lt;element name="EnglishProficiency" type="{http://www.sifassociation.org/datamodel/na/4.x}EnglishProficiencyType" minOccurs="0"/>
 *         &lt;element name="LanguageList" type="{http://www.sifassociation.org/datamodel/na/4.x}LanguageListType" minOccurs="0"/>
 *         &lt;element name="HispanicLatino" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryOfBirth" type="{http://www.sifassociation.org/datamodel/na/4.x}CountryType" minOccurs="0"/>
 *         &lt;element name="DwellingArrangement" type="{http://www.sifassociation.org/datamodel/na/4.x}DwellingArrangementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPersonalDataDemographicDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "raceList",
    "gender",
    "birthDate",
    "englishProficiency",
    "languageList",
    "hispanicLatino",
    "countryOfBirth",
    "dwellingArrangement"
})
public class StudentPersonalDataDemographicDataType {

    @XmlElement(name = "RaceList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RaceListType raceList;
    @XmlElement(name = "Gender", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalDataDemographicDataType.Gender gender;
    @XmlElement(name = "BirthDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "EnglishProficiency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EnglishProficiencyType englishProficiency;
    @XmlElement(name = "LanguageList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LanguageListType languageList;
    @XmlElement(name = "HispanicLatino", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalDataDemographicDataType.HispanicLatino hispanicLatino;
    @XmlElement(name = "CountryOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CountryType countryOfBirth;
    @XmlElement(name = "DwellingArrangement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DwellingArrangementType dwellingArrangement;

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalDataDemographicDataType.Gender }
     *     
     */
    public StudentPersonalDataDemographicDataType.Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalDataDemographicDataType.Gender }
     *     
     */
    public void setGender(StudentPersonalDataDemographicDataType.Gender value) {
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
     * Gets the value of the hispanicLatino property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalDataDemographicDataType.HispanicLatino }
     *     
     */
    public StudentPersonalDataDemographicDataType.HispanicLatino getHispanicLatino() {
        return hispanicLatino;
    }

    /**
     * Sets the value of the hispanicLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalDataDemographicDataType.HispanicLatino }
     *     
     */
    public void setHispanicLatino(StudentPersonalDataDemographicDataType.HispanicLatino value) {
        this.hispanicLatino = value;
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
