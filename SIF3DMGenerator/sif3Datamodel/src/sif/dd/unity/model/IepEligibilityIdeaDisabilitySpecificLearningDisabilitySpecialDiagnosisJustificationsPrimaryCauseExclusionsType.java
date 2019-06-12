
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="determinantFactors" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType" minOccurs="0"/>
 *         &lt;element name="medicalExplanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="otherFactorsExplanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "determinantFactors",
    "medicalExplanation",
    "otherFactorsExplanation"
})
public class IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType determinantFactors;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String medicalExplanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String otherFactorsExplanation;

    /**
     * Gets the value of the determinantFactors property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType }
     *     
     */
    public IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType getDeterminantFactors() {
        return determinantFactors;
    }

    /**
     * Sets the value of the determinantFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType }
     *     
     */
    public void setDeterminantFactors(IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsprimaryCauseExclusionsDeterminantFactorsType value) {
        this.determinantFactors = value;
    }

    /**
     * Gets the value of the medicalExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalExplanation() {
        return medicalExplanation;
    }

    /**
     * Sets the value of the medicalExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalExplanation(String value) {
        this.medicalExplanation = value;
    }

    /**
     * Gets the value of the otherFactorsExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFactorsExplanation() {
        return otherFactorsExplanation;
    }

    /**
     * Sets the value of the otherFactorsExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFactorsExplanation(String value) {
        this.otherFactorsExplanation = value;
    }

}
