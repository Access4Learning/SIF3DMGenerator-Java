
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryCauseExclusions" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType" minOccurs="0"/>
 *         &lt;element name="lackOfAdequateAchievementExplanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="learningSettingObservations" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="decisions" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "primaryCauseExclusions",
    "lackOfAdequateAchievementExplanation",
    "learningSettingObservations",
    "decisions"
})
public class IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType primaryCauseExclusions;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lackOfAdequateAchievementExplanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String learningSettingObservations;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType decisions;

    /**
     * Gets the value of the primaryCauseExclusions property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType }
     *     
     */
    public IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType getPrimaryCauseExclusions() {
        return primaryCauseExclusions;
    }

    /**
     * Sets the value of the primaryCauseExclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType }
     *     
     */
    public void setPrimaryCauseExclusions(IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsPrimaryCauseExclusionsType value) {
        this.primaryCauseExclusions = value;
    }

    /**
     * Gets the value of the lackOfAdequateAchievementExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLackOfAdequateAchievementExplanation() {
        return lackOfAdequateAchievementExplanation;
    }

    /**
     * Sets the value of the lackOfAdequateAchievementExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLackOfAdequateAchievementExplanation(String value) {
        this.lackOfAdequateAchievementExplanation = value;
    }

    /**
     * Gets the value of the learningSettingObservations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningSettingObservations() {
        return learningSettingObservations;
    }

    /**
     * Sets the value of the learningSettingObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningSettingObservations(String value) {
        this.learningSettingObservations = value;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType }
     *     
     */
    public IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType getDecisions() {
        return decisions;
    }

    /**
     * Sets the value of the decisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType }
     *     
     */
    public void setDecisions(IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType value) {
        this.decisions = value;
    }

}
