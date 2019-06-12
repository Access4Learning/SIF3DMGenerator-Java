
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disabilityCodeList" type="{http://www.sifassociation.org/datamodel/na/4.x}xDisabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="analysis" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilityAnalysisType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialDiagnosisJustifications" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType" minOccurs="0"/>
 *         &lt;element name="decisions" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilityDecisionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "disabilityCodeList",
    "explanation",
    "analysis",
    "specialDiagnosisJustifications",
    "decisions"
})
public class IepEligibilityIdeaDisabilityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<XDisabilityType> disabilityCodeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String explanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepEligibilityIdeaDisabilityAnalysisType> analysis;
    @XmlElement(name = "SpecialDiagnosisJustifications", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType specialDiagnosisJustifications;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilityDecisionsType decisions;

    /**
     * Gets the value of the disabilityCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XDisabilityType }
     * 
     * 
     */
    public List<XDisabilityType> getDisabilityCodeList() {
        if (disabilityCodeList == null) {
            disabilityCodeList = new ArrayList<XDisabilityType>();
        }
        return this.disabilityCodeList;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the analysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepEligibilityIdeaDisabilityAnalysisType }
     * 
     * 
     */
    public List<IepEligibilityIdeaDisabilityAnalysisType> getAnalysis() {
        if (analysis == null) {
            analysis = new ArrayList<IepEligibilityIdeaDisabilityAnalysisType>();
        }
        return this.analysis;
    }

    /**
     * Gets the value of the specialDiagnosisJustifications property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType }
     *     
     */
    public IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType getSpecialDiagnosisJustifications() {
        return specialDiagnosisJustifications;
    }

    /**
     * Sets the value of the specialDiagnosisJustifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType }
     *     
     */
    public void setSpecialDiagnosisJustifications(IepEligibilityIdeaDisabilitySpecificLearningDisabilitySpecialDiagnosisJustificationsType value) {
        this.specialDiagnosisJustifications = value;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilityDecisionsType }
     *     
     */
    public IepEligibilityIdeaDisabilityDecisionsType getDecisions() {
        return decisions;
    }

    /**
     * Sets the value of the decisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilityDecisionsType }
     *     
     */
    public void setDecisions(IepEligibilityIdeaDisabilityDecisionsType value) {
        this.decisions = value;
    }

}
