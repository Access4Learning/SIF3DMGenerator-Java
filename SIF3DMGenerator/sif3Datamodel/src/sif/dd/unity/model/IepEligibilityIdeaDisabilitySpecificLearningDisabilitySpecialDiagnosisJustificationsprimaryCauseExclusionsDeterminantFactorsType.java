
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insufficientMath" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="insufficientReading" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="insufficientEnglish" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="visualHearingOrMotorDisability" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="intellectualDisability" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="emotionalDisability" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="culturalFactors" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="environmentalOrEconomicDisadvantage" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="limitedEnglishProficiency" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "insufficientMath",
    "insufficientReading",
    "insufficientEnglish",
    "visualHearingOrMotorDisability",
    "intellectualDisability",
    "emotionalDisability",
    "culturalFactors",
    "environmentalOrEconomicDisadvantage",
    "limitedEnglishProficiency"
})
public class IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insufficientMath;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insufficientReading;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insufficientEnglish;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String visualHearingOrMotorDisability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String intellectualDisability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String emotionalDisability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String culturalFactors;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String environmentalOrEconomicDisadvantage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String limitedEnglishProficiency;

    /**
     * Gets the value of the insufficientMath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsufficientMath() {
        return insufficientMath;
    }

    /**
     * Sets the value of the insufficientMath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsufficientMath(String value) {
        this.insufficientMath = value;
    }

    /**
     * Gets the value of the insufficientReading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsufficientReading() {
        return insufficientReading;
    }

    /**
     * Sets the value of the insufficientReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsufficientReading(String value) {
        this.insufficientReading = value;
    }

    /**
     * Gets the value of the insufficientEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsufficientEnglish() {
        return insufficientEnglish;
    }

    /**
     * Sets the value of the insufficientEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsufficientEnglish(String value) {
        this.insufficientEnglish = value;
    }

    /**
     * Gets the value of the visualHearingOrMotorDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualHearingOrMotorDisability() {
        return visualHearingOrMotorDisability;
    }

    /**
     * Sets the value of the visualHearingOrMotorDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualHearingOrMotorDisability(String value) {
        this.visualHearingOrMotorDisability = value;
    }

    /**
     * Gets the value of the intellectualDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntellectualDisability() {
        return intellectualDisability;
    }

    /**
     * Sets the value of the intellectualDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntellectualDisability(String value) {
        this.intellectualDisability = value;
    }

    /**
     * Gets the value of the emotionalDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmotionalDisability() {
        return emotionalDisability;
    }

    /**
     * Sets the value of the emotionalDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmotionalDisability(String value) {
        this.emotionalDisability = value;
    }

    /**
     * Gets the value of the culturalFactors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulturalFactors() {
        return culturalFactors;
    }

    /**
     * Sets the value of the culturalFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulturalFactors(String value) {
        this.culturalFactors = value;
    }

    /**
     * Gets the value of the environmentalOrEconomicDisadvantage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentalOrEconomicDisadvantage() {
        return environmentalOrEconomicDisadvantage;
    }

    /**
     * Sets the value of the environmentalOrEconomicDisadvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentalOrEconomicDisadvantage(String value) {
        this.environmentalOrEconomicDisadvantage = value;
    }

    /**
     * Gets the value of the limitedEnglishProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedEnglishProficiency() {
        return limitedEnglishProficiency;
    }

    /**
     * Sets the value of the limitedEnglishProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedEnglishProficiency(String value) {
        this.limitedEnglishProficiency = value;
    }

}
