
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
 * <p>Java class for iepEligibilityBackgroundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityBackgroundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referral" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityBackgroundReferralType" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="currentPlacement" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="parentObservations" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="consentToEvaluation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityBackgroundConsentToEvaluateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityBackgroundType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "referral",
    "history",
    "currentPlacement",
    "parentObservations",
    "consentToEvaluation"
})
public class IepEligibilityBackgroundType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityBackgroundReferralType referral;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String history;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String currentPlacement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parentObservations;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepEligibilityBackgroundConsentToEvaluateType> consentToEvaluation;

    /**
     * Gets the value of the referral property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityBackgroundReferralType }
     *     
     */
    public IepEligibilityBackgroundReferralType getReferral() {
        return referral;
    }

    /**
     * Sets the value of the referral property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityBackgroundReferralType }
     *     
     */
    public void setReferral(IepEligibilityBackgroundReferralType value) {
        this.referral = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistory(String value) {
        this.history = value;
    }

    /**
     * Gets the value of the currentPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPlacement() {
        return currentPlacement;
    }

    /**
     * Sets the value of the currentPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPlacement(String value) {
        this.currentPlacement = value;
    }

    /**
     * Gets the value of the parentObservations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentObservations() {
        return parentObservations;
    }

    /**
     * Sets the value of the parentObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentObservations(String value) {
        this.parentObservations = value;
    }

    /**
     * Gets the value of the consentToEvaluation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consentToEvaluation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsentToEvaluation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepEligibilityBackgroundConsentToEvaluateType }
     * 
     * 
     */
    public List<IepEligibilityBackgroundConsentToEvaluateType> getConsentToEvaluation() {
        if (consentToEvaluation == null) {
            consentToEvaluation = new ArrayList<IepEligibilityBackgroundConsentToEvaluateType>();
        }
        return this.consentToEvaluation;
    }

}
