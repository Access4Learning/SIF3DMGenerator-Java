
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StandardIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearCreated" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="ACStrandSubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandSubjectAreaType" minOccurs="0"/>
 *         &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType" minOccurs="0"/>
 *         &lt;element name="Benchmark" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="IndicatorNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AlternateIdentificationCodes" type="{http://www.sifassociation.org/datamodel/au/3.4}AlternateIdentificationCodeListType" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardIdentifierType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "yearCreated",
    "acStrandSubjectArea",
    "standardNumber",
    "yearLevels",
    "benchmark",
    "yearLevel",
    "indicatorNumber",
    "alternateIdentificationCodes",
    "organization"
})
public class StandardIdentifierType {

    @XmlElement(name = "YearCreated", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearCreated;
    @XmlElement(name = "ACStrandSubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ACStrandSubjectAreaType acStrandSubjectArea;
    @XmlElement(name = "StandardNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String standardNumber;
    @XmlElement(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected YearLevelsType yearLevels;
    @XmlElementRef(name = "Benchmark", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> benchmark;
    @XmlElementRef(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelType> yearLevel;
    @XmlElementRef(name = "IndicatorNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicatorNumber;
    @XmlElementRef(name = "AlternateIdentificationCodes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AlternateIdentificationCodeListType> alternateIdentificationCodes;
    @XmlElement(name = "Organization", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String organization;

    /**
     * Gets the value of the yearCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearCreated() {
        return yearCreated;
    }

    /**
     * Sets the value of the yearCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearCreated(XMLGregorianCalendar value) {
        this.yearCreated = value;
    }

    /**
     * Gets the value of the acStrandSubjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link ACStrandSubjectAreaType }
     *     
     */
    public ACStrandSubjectAreaType getACStrandSubjectArea() {
        return acStrandSubjectArea;
    }

    /**
     * Sets the value of the acStrandSubjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACStrandSubjectAreaType }
     *     
     */
    public void setACStrandSubjectArea(ACStrandSubjectAreaType value) {
        this.acStrandSubjectArea = value;
    }

    /**
     * Gets the value of the standardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardNumber() {
        return standardNumber;
    }

    /**
     * Sets the value of the standardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardNumber(String value) {
        this.standardNumber = value;
    }

    /**
     * Gets the value of the yearLevels property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelsType }
     *     
     */
    public YearLevelsType getYearLevels() {
        return yearLevels;
    }

    /**
     * Sets the value of the yearLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelsType }
     *     
     */
    public void setYearLevels(YearLevelsType value) {
        this.yearLevels = value;
    }

    /**
     * Gets the value of the benchmark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBenchmark() {
        return benchmark;
    }

    /**
     * Sets the value of the benchmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBenchmark(JAXBElement<String> value) {
        this.benchmark = value;
    }

    /**
     * Gets the value of the yearLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public JAXBElement<YearLevelType> getYearLevel() {
        return yearLevel;
    }

    /**
     * Sets the value of the yearLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public void setYearLevel(JAXBElement<YearLevelType> value) {
        this.yearLevel = value;
    }

    /**
     * Gets the value of the indicatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicatorNumber() {
        return indicatorNumber;
    }

    /**
     * Sets the value of the indicatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicatorNumber(JAXBElement<String> value) {
        this.indicatorNumber = value;
    }

    /**
     * Gets the value of the alternateIdentificationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlternateIdentificationCodeListType }{@code >}
     *     
     */
    public JAXBElement<AlternateIdentificationCodeListType> getAlternateIdentificationCodes() {
        return alternateIdentificationCodes;
    }

    /**
     * Sets the value of the alternateIdentificationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlternateIdentificationCodeListType }{@code >}
     *     
     */
    public void setAlternateIdentificationCodes(JAXBElement<AlternateIdentificationCodeListType> value) {
        this.alternateIdentificationCodes = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

}
