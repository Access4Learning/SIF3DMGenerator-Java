
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CensusStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentCohortId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="CensusAge" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="CohortGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="X"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CohortIndigenousType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="NS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EducationMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="DE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StudentOnVisa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OverseasStudent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisabilityLevelOfAdjustment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="QDTP"/>
 *               &lt;enumeration value="Supplementary"/>
 *               &lt;enumeration value="Substantial"/>
 *               &lt;enumeration value="Extensive"/>
 *               &lt;enumeration value="None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisabilityCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Physical"/>
 *               &lt;enumeration value="Cognitive"/>
 *               &lt;enumeration value="Social-Emotional"/>
 *               &lt;enumeration value="Sensory"/>
 *               &lt;enumeration value="None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Headcount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusStudentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentCohortId",
    "yearLevel",
    "censusAge",
    "cohortGender",
    "cohortIndigenousType",
    "educationMode",
    "studentOnVisa",
    "overseasStudent",
    "disabilityLevelOfAdjustment",
    "disabilityCategory",
    "fte",
    "headcount"
})
public class CensusStudentType {

    @XmlElement(name = "StudentCohortId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String studentCohortId;
    @XmlElement(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected YearLevelType yearLevel;
    @XmlElement(name = "CensusAge", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long censusAge;
    @XmlElement(name = "CohortGender", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cohortGender;
    @XmlElement(name = "CohortIndigenousType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cohortIndigenousType;
    @XmlElement(name = "EducationMode", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String educationMode;
    @XmlElement(name = "StudentOnVisa", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentOnVisa;
    @XmlElement(name = "OverseasStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String overseasStudent;
    @XmlElement(name = "DisabilityLevelOfAdjustment", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String disabilityLevelOfAdjustment;
    @XmlElement(name = "DisabilityCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String disabilityCategory;
    @XmlElement(name = "FTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal fte;
    @XmlElement(name = "Headcount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long headcount;

    /**
     * Gets the value of the studentCohortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCohortId() {
        return studentCohortId;
    }

    /**
     * Sets the value of the studentCohortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCohortId(String value) {
        this.studentCohortId = value;
    }

    /**
     * Gets the value of the yearLevel property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getYearLevel() {
        return yearLevel;
    }

    /**
     * Sets the value of the yearLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setYearLevel(YearLevelType value) {
        this.yearLevel = value;
    }

    /**
     * Gets the value of the censusAge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCensusAge() {
        return censusAge;
    }

    /**
     * Sets the value of the censusAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCensusAge(Long value) {
        this.censusAge = value;
    }

    /**
     * Gets the value of the cohortGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohortGender() {
        return cohortGender;
    }

    /**
     * Sets the value of the cohortGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohortGender(String value) {
        this.cohortGender = value;
    }

    /**
     * Gets the value of the cohortIndigenousType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohortIndigenousType() {
        return cohortIndigenousType;
    }

    /**
     * Sets the value of the cohortIndigenousType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohortIndigenousType(String value) {
        this.cohortIndigenousType = value;
    }

    /**
     * Gets the value of the educationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationMode() {
        return educationMode;
    }

    /**
     * Sets the value of the educationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationMode(String value) {
        this.educationMode = value;
    }

    /**
     * Gets the value of the studentOnVisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentOnVisa() {
        return studentOnVisa;
    }

    /**
     * Sets the value of the studentOnVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentOnVisa(String value) {
        this.studentOnVisa = value;
    }

    /**
     * Gets the value of the overseasStudent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverseasStudent() {
        return overseasStudent;
    }

    /**
     * Sets the value of the overseasStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverseasStudent(String value) {
        this.overseasStudent = value;
    }

    /**
     * Gets the value of the disabilityLevelOfAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityLevelOfAdjustment() {
        return disabilityLevelOfAdjustment;
    }

    /**
     * Sets the value of the disabilityLevelOfAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityLevelOfAdjustment(String value) {
        this.disabilityLevelOfAdjustment = value;
    }

    /**
     * Gets the value of the disabilityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityCategory() {
        return disabilityCategory;
    }

    /**
     * Sets the value of the disabilityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityCategory(String value) {
        this.disabilityCategory = value;
    }

    /**
     * Gets the value of the fte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFTE() {
        return fte;
    }

    /**
     * Sets the value of the fte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFTE(BigDecimal value) {
        this.fte = value;
    }

    /**
     * Gets the value of the headcount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeadcount() {
        return headcount;
    }

    /**
     * Sets the value of the headcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeadcount(Long value) {
        this.headcount = value;
    }

}
