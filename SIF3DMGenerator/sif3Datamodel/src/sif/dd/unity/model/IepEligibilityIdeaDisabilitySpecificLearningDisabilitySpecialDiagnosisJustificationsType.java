
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificLearningDisability" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType" minOccurs="0"/>
 *         &lt;element name="TeamOverride" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "specificLearningDisability",
    "teamOverride"
})
public class IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType specificLearningDisability;
    @XmlElement(name = "TeamOverride", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String teamOverride;

    /**
     * Gets the value of the specificLearningDisability property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType }
     *     
     */
    public IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType getSpecificLearningDisability() {
        return specificLearningDisability;
    }

    /**
     * Sets the value of the specificLearningDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType }
     *     
     */
    public void setSpecificLearningDisability(IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsSpecificLearningDisabilityType value) {
        this.specificLearningDisability = value;
    }

    /**
     * Gets the value of the teamOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamOverride() {
        return teamOverride;
    }

    /**
     * Sets the value of the teamOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamOverride(String value) {
        this.teamOverride = value;
    }

}
