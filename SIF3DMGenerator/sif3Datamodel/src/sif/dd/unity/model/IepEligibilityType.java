
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
 * <p>Java class for iepEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="background" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityBackgroundType" minOccurs="0"/>
 *         &lt;element name="evaluationResultList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityEvaluationResultListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ideaDisability" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityIdeaDisabilityType" minOccurs="0"/>
 *         &lt;element name="eligibilityParticipantReportList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityParticipantReportListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lifecyclePurpose" type="{http://www.sifassociation.org/datamodel/na/4.x}iepLifecyclePurposeType" minOccurs="0"/>
 *         &lt;element name="determination" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="identity" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAuthorizingPersonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "background",
    "evaluationResultList",
    "ideaDisability",
    "eligibilityParticipantReportList",
    "lifecyclePurpose",
    "determination",
    "identity"
})
public class IepEligibilityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityBackgroundType background;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepEligibilityEvaluationResultListType> evaluationResultList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityIdeaDisabilityType ideaDisability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepEligibilityParticipantReportListType> eligibilityParticipantReportList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepLifecyclePurposeType lifecyclePurpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String determination;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonAuthorizingPersonType identity;

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityBackgroundType }
     *     
     */
    public IepEligibilityBackgroundType getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityBackgroundType }
     *     
     */
    public void setBackground(IepEligibilityBackgroundType value) {
        this.background = value;
    }

    /**
     * Gets the value of the evaluationResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluationResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluationResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepEligibilityEvaluationResultListType }
     * 
     * 
     */
    public List<IepEligibilityEvaluationResultListType> getEvaluationResultList() {
        if (evaluationResultList == null) {
            evaluationResultList = new ArrayList<IepEligibilityEvaluationResultListType>();
        }
        return this.evaluationResultList;
    }

    /**
     * Gets the value of the ideaDisability property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityIdeaDisabilityType }
     *     
     */
    public IepEligibilityIdeaDisabilityType getIdeaDisability() {
        return ideaDisability;
    }

    /**
     * Sets the value of the ideaDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityIdeaDisabilityType }
     *     
     */
    public void setIdeaDisability(IepEligibilityIdeaDisabilityType value) {
        this.ideaDisability = value;
    }

    /**
     * Gets the value of the eligibilityParticipantReportList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibilityParticipantReportList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibilityParticipantReportList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepEligibilityParticipantReportListType }
     * 
     * 
     */
    public List<IepEligibilityParticipantReportListType> getEligibilityParticipantReportList() {
        if (eligibilityParticipantReportList == null) {
            eligibilityParticipantReportList = new ArrayList<IepEligibilityParticipantReportListType>();
        }
        return this.eligibilityParticipantReportList;
    }

    /**
     * Gets the value of the lifecyclePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link IepLifecyclePurposeType }
     *     
     */
    public IepLifecyclePurposeType getLifecyclePurpose() {
        return lifecyclePurpose;
    }

    /**
     * Sets the value of the lifecyclePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepLifecyclePurposeType }
     *     
     */
    public void setLifecyclePurpose(IepLifecyclePurposeType value) {
        this.lifecyclePurpose = value;
    }

    /**
     * Gets the value of the determination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetermination() {
        return determination;
    }

    /**
     * Sets the value of the determination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetermination(String value) {
        this.determination = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public IepCommonAuthorizingPersonType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public void setIdentity(IepCommonAuthorizingPersonType value) {
        this.identity = value;
    }

}
