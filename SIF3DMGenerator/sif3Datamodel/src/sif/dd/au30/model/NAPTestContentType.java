
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contents of an assessment assigned in the context of NAP, targeted at a particular domain and year level.
 * 
 * <p>Java class for NAPTestContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="TestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TestLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType"/>
 *         &lt;element name="TestType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPTestTypeType"/>
 *         &lt;element name="Domain" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPTestDomainType"/>
 *         &lt;element name="TestYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType"/>
 *         &lt;element name="StagesCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DomainBands" type="{http://www.sifassociation.org/datamodel/au/3.4}DomainBandsContainerType"/>
 *         &lt;element name="DomainProficiency" type="{http://www.sifassociation.org/datamodel/au/3.4}DomainProficiencyContainerType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestContentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestLocalId",
    "testName",
    "testLevel",
    "testType",
    "domain",
    "testYear",
    "stagesCount",
    "domainBands",
    "domainProficiency"
})
public class NAPTestContentType {

    @XmlElement(name = "NAPTestLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestLocalId;
    @XmlElement(name = "TestName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String testName;
    @XmlElement(name = "TestLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected YearLevelType testLevel;
    @XmlElement(name = "TestType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AUCodeSetsNAPTestTypeType testType;
    @XmlElement(name = "Domain", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AUCodeSetsNAPTestDomainType domain;
    @XmlElement(name = "TestYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected XMLGregorianCalendar testYear;
    @XmlElement(name = "StagesCount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected int stagesCount;
    @XmlElement(name = "DomainBands", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected DomainBandsContainerType domainBands;
    @XmlElement(name = "DomainProficiency", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected DomainProficiencyContainerType domainProficiency;

    /**
     * Gets the value of the napTestLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestLocalId() {
        return napTestLocalId;
    }

    /**
     * Sets the value of the napTestLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestLocalId(String value) {
        this.napTestLocalId = value;
    }

    /**
     * Gets the value of the testName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Sets the value of the testName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestName(String value) {
        this.testName = value;
    }

    /**
     * Gets the value of the testLevel property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getTestLevel() {
        return testLevel;
    }

    /**
     * Sets the value of the testLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setTestLevel(YearLevelType value) {
        this.testLevel = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPTestTypeType }
     *     
     */
    public AUCodeSetsNAPTestTypeType getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPTestTypeType }
     *     
     */
    public void setTestType(AUCodeSetsNAPTestTypeType value) {
        this.testType = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPTestDomainType }
     *     
     */
    public AUCodeSetsNAPTestDomainType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPTestDomainType }
     *     
     */
    public void setDomain(AUCodeSetsNAPTestDomainType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the testYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestYear() {
        return testYear;
    }

    /**
     * Sets the value of the testYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestYear(XMLGregorianCalendar value) {
        this.testYear = value;
    }

    /**
     * Gets the value of the stagesCount property.
     * 
     */
    public int getStagesCount() {
        return stagesCount;
    }

    /**
     * Sets the value of the stagesCount property.
     * 
     */
    public void setStagesCount(int value) {
        this.stagesCount = value;
    }

    /**
     * Gets the value of the domainBands property.
     * 
     * @return
     *     possible object is
     *     {@link DomainBandsContainerType }
     *     
     */
    public DomainBandsContainerType getDomainBands() {
        return domainBands;
    }

    /**
     * Sets the value of the domainBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainBandsContainerType }
     *     
     */
    public void setDomainBands(DomainBandsContainerType value) {
        this.domainBands = value;
    }

    /**
     * Gets the value of the domainProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link DomainProficiencyContainerType }
     *     
     */
    public DomainProficiencyContainerType getDomainProficiency() {
        return domainProficiency;
    }

    /**
     * Sets the value of the domainProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainProficiencyContainerType }
     *     
     */
    public void setDomainProficiency(DomainProficiencyContainerType value) {
        this.domainProficiency = value;
    }

}
