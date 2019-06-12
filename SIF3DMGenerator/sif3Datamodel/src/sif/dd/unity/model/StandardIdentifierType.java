
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="YearCreated" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType"/>
 *         &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType"/>
 *         &lt;element name="Benchmark" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="GradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="IndicatorNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AlternateIdentificationCodes" type="{http://www.sifassociation.org/datamodel/na/4.x}AlternateIdentificationCodeListType" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardIdentifierType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "yearCreated",
    "subjectArea",
    "standardNumber",
    "gradeLevels",
    "benchmark",
    "gradeLevel",
    "indicatorNumber",
    "alternateIdentificationCodes",
    "organization"
})
public class StandardIdentifierType {

    @XmlElement(name = "YearCreated", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearCreated;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "StandardNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String standardNumber;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "Benchmark", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String benchmark;
    @XmlElement(name = "GradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevel;
    @XmlElement(name = "IndicatorNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String indicatorNumber;
    @XmlElement(name = "AlternateIdentificationCodes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AlternateIdentificationCodeListType alternateIdentificationCodes;
    @XmlElement(name = "Organization", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
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
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaType }
     *     
     */
    public SubjectAreaType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaType }
     *     
     */
    public void setSubjectArea(SubjectAreaType value) {
        this.subjectArea = value;
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
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the benchmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenchmark() {
        return benchmark;
    }

    /**
     * Sets the value of the benchmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenchmark(String value) {
        this.benchmark = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevel(GradeLevelType value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the indicatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorNumber() {
        return indicatorNumber;
    }

    /**
     * Sets the value of the indicatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorNumber(String value) {
        this.indicatorNumber = value;
    }

    /**
     * Gets the value of the alternateIdentificationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdentificationCodeListType }
     *     
     */
    public AlternateIdentificationCodeListType getAlternateIdentificationCodes() {
        return alternateIdentificationCodes;
    }

    /**
     * Sets the value of the alternateIdentificationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdentificationCodeListType }
     *     
     */
    public void setAlternateIdentificationCodes(AlternateIdentificationCodeListType value) {
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
