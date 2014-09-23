
package sif.dd.us32.model.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gDemographicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gDemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ethnicityList" type="{http://www.sifassociation.org/datamodel/na/3.2}gEthnicityList" minOccurs="0"/>
 *         &lt;element name="sexus" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="birthDateVerification" type="{http://www.sifassociation.org/datamodel/na/3.2}gBirthdateVerificationType" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subregionOfBirth" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="stateProvinceOfBirth" type="{http://www.sifassociation.org/datamodel/na/3.2}gStateProvinceType" minOccurs="0"/>
 *         &lt;element name="countryOfBirth" type="{http://www.sifassociation.org/datamodel/na/3.2}gCountryType" minOccurs="0"/>
 *         &lt;element name="countryOfCitizenshipList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryOfCitizenship" type="{http://www.sifassociation.org/datamodel/na/3.2}gCountryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="countryOfResidency" type="{http://www.sifassociation.org/datamodel/na/3.2}gCountryType" minOccurs="0"/>
 *         &lt;element name="countryArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="citizenshipStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gCitizenshipStatusType" minOccurs="0"/>
 *         &lt;element name="languageProficiency" type="{http://www.sifassociation.org/datamodel/na/3.2}gLanguageProficiencyType" minOccurs="0"/>
 *         &lt;element name="languageList" type="{http://www.sifassociation.org/datamodel/na/3.2}gLanguageList" minOccurs="0"/>
 *         &lt;element name="dwellingArrangement" type="{http://www.sifassociation.org/datamodel/na/3.2}gDwellingArrangementType" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gMaritalStatusType" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gDemographicsType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "ethnicityList",
    "sexus",
    "birthDate",
    "birthDateVerification",
    "placeOfBirth",
    "subregionOfBirth",
    "stateProvinceOfBirth",
    "countryOfBirth",
    "countryOfCitizenshipList",
    "countryOfResidency",
    "countryArrivalDate",
    "citizenshipStatus",
    "languageProficiency",
    "languageList",
    "dwellingArrangement",
    "maritalStatus",
    "any"
})
public class GDemographicsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GEthnicityList ethnicityList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSexusType sexus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String birthDateVerification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String placeOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLaxCodedElementType subregionOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GStateProvinceType stateProvinceOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCountryType countryOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GDemographicsType.CountryOfCitizenshipList countryOfCitizenshipList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCountryType countryOfResidency;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar countryArrivalDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String citizenshipStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String languageProficiency;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLanguageList languageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dwellingArrangement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maritalStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ethnicityList property.
     * 
     * @return
     *     possible object is
     *     {@link GEthnicityList }
     *     
     */
    public GEthnicityList getEthnicityList() {
        return ethnicityList;
    }

    /**
     * Sets the value of the ethnicityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEthnicityList }
     *     
     */
    public void setEthnicityList(GEthnicityList value) {
        this.ethnicityList = value;
    }

    /**
     * Gets the value of the sexus property.
     * 
     * @return
     *     possible object is
     *     {@link GSexusType }
     *     
     */
    public GSexusType getSexus() {
        return sexus;
    }

    /**
     * Sets the value of the sexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSexusType }
     *     
     */
    public void setSexus(GSexusType value) {
        this.sexus = value;
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
     *     {@link String }
     *     
     */
    public String getBirthDateVerification() {
        return birthDateVerification;
    }

    /**
     * Sets the value of the birthDateVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDateVerification(String value) {
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
     * Gets the value of the subregionOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getSubregionOfBirth() {
        return subregionOfBirth;
    }

    /**
     * Sets the value of the subregionOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setSubregionOfBirth(GLaxCodedElementType value) {
        this.subregionOfBirth = value;
    }

    /**
     * Gets the value of the stateProvinceOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link GStateProvinceType }
     *     
     */
    public GStateProvinceType getStateProvinceOfBirth() {
        return stateProvinceOfBirth;
    }

    /**
     * Sets the value of the stateProvinceOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GStateProvinceType }
     *     
     */
    public void setStateProvinceOfBirth(GStateProvinceType value) {
        this.stateProvinceOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link GCountryType }
     *     
     */
    public GCountryType getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCountryType }
     *     
     */
    public void setCountryOfBirth(GCountryType value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the countryOfCitizenshipList property.
     * 
     * @return
     *     possible object is
     *     {@link GDemographicsType.CountryOfCitizenshipList }
     *     
     */
    public GDemographicsType.CountryOfCitizenshipList getCountryOfCitizenshipList() {
        return countryOfCitizenshipList;
    }

    /**
     * Sets the value of the countryOfCitizenshipList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDemographicsType.CountryOfCitizenshipList }
     *     
     */
    public void setCountryOfCitizenshipList(GDemographicsType.CountryOfCitizenshipList value) {
        this.countryOfCitizenshipList = value;
    }

    /**
     * Gets the value of the countryOfResidency property.
     * 
     * @return
     *     possible object is
     *     {@link GCountryType }
     *     
     */
    public GCountryType getCountryOfResidency() {
        return countryOfResidency;
    }

    /**
     * Sets the value of the countryOfResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCountryType }
     *     
     */
    public void setCountryOfResidency(GCountryType value) {
        this.countryOfResidency = value;
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
     *     {@link String }
     *     
     */
    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Sets the value of the citizenshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipStatus(String value) {
        this.citizenshipStatus = value;
    }

    /**
     * Gets the value of the languageProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageProficiency() {
        return languageProficiency;
    }

    /**
     * Sets the value of the languageProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageProficiency(String value) {
        this.languageProficiency = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link GLanguageList }
     *     
     */
    public GLanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLanguageList }
     *     
     */
    public void setLanguageList(GLanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the dwellingArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwellingArrangement() {
        return dwellingArrangement;
    }

    /**
     * Sets the value of the dwellingArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellingArrangement(String value) {
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     *         &lt;element name="countryOfCitizenship" type="{http://www.sifassociation.org/datamodel/na/3.2}gCountryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "countryOfCitizenship"
    })
    public static class CountryOfCitizenshipList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GCountryType> countryOfCitizenship;

        /**
         * Gets the value of the countryOfCitizenship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryOfCitizenship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryOfCitizenship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCountryType }
         * 
         * 
         */
        public List<GCountryType> getCountryOfCitizenship() {
            if (countryOfCitizenship == null) {
                countryOfCitizenship = new ArrayList<GCountryType>();
            }
            return this.countryOfCitizenship;
        }

    }

}
