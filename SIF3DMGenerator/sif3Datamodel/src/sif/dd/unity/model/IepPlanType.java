
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectivePeriod" type="{http://www.sifassociation.org/datamodel/na/4.x}effectivePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enrollmentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanEnrollmentGradeLevelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="presentLevelPerformance" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceType" minOccurs="0"/>
 *         &lt;element name="annualGoalsList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalListType" minOccurs="0"/>
 *         &lt;element name="accommodationsList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAccommodationsListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="standardizedAssessmentResultList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanStandardizedAssessmentResultListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placement" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementType" minOccurs="0"/>
 *         &lt;element name="authorization" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanCommonAuthorizationType" minOccurs="0"/>
 *         &lt;element name="amendmentList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAmendmentListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "effectivePeriod",
    "enrollmentGradeLevel",
    "presentLevelPerformance",
    "annualGoalsList",
    "accommodationsList",
    "standardizedAssessmentResultList",
    "placement",
    "authorization",
    "amendmentList"
})
public class IepPlanType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<EffectivePeriodType> effectivePeriod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanEnrollmentGradeLevelType> enrollmentGradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceType presentLevelPerformance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalListType annualGoalsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAccommodationsListType> accommodationsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanStandardizedAssessmentResultListType> standardizedAssessmentResultList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementType placement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanCommonAuthorizationType authorization;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAmendmentListType> amendmentList;

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivePeriodType }
     * 
     * 
     */
    public List<EffectivePeriodType> getEffectivePeriod() {
        if (effectivePeriod == null) {
            effectivePeriod = new ArrayList<EffectivePeriodType>();
        }
        return this.effectivePeriod;
    }

    /**
     * Gets the value of the enrollmentGradeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollmentGradeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollmentGradeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanEnrollmentGradeLevelType }
     * 
     * 
     */
    public List<IepPlanEnrollmentGradeLevelType> getEnrollmentGradeLevel() {
        if (enrollmentGradeLevel == null) {
            enrollmentGradeLevel = new ArrayList<IepPlanEnrollmentGradeLevelType>();
        }
        return this.enrollmentGradeLevel;
    }

    /**
     * Gets the value of the presentLevelPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceType }
     *     
     */
    public IepPlanPresentLevelPerformanceType getPresentLevelPerformance() {
        return presentLevelPerformance;
    }

    /**
     * Sets the value of the presentLevelPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceType }
     *     
     */
    public void setPresentLevelPerformance(IepPlanPresentLevelPerformanceType value) {
        this.presentLevelPerformance = value;
    }

    /**
     * Gets the value of the annualGoalsList property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalListType }
     *     
     */
    public IepPlanAnnualGoalListType getAnnualGoalsList() {
        return annualGoalsList;
    }

    /**
     * Sets the value of the annualGoalsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalListType }
     *     
     */
    public void setAnnualGoalsList(IepPlanAnnualGoalListType value) {
        this.annualGoalsList = value;
    }

    /**
     * Gets the value of the accommodationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAccommodationsListType }
     * 
     * 
     */
    public List<IepPlanAccommodationsListType> getAccommodationsList() {
        if (accommodationsList == null) {
            accommodationsList = new ArrayList<IepPlanAccommodationsListType>();
        }
        return this.accommodationsList;
    }

    /**
     * Gets the value of the standardizedAssessmentResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardizedAssessmentResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardizedAssessmentResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanStandardizedAssessmentResultListType }
     * 
     * 
     */
    public List<IepPlanStandardizedAssessmentResultListType> getStandardizedAssessmentResultList() {
        if (standardizedAssessmentResultList == null) {
            standardizedAssessmentResultList = new ArrayList<IepPlanStandardizedAssessmentResultListType>();
        }
        return this.standardizedAssessmentResultList;
    }

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementType }
     *     
     */
    public IepPlanPlacementType getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementType }
     *     
     */
    public void setPlacement(IepPlanPlacementType value) {
        this.placement = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanCommonAuthorizationType }
     *     
     */
    public IepPlanCommonAuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanCommonAuthorizationType }
     *     
     */
    public void setAuthorization(IepPlanCommonAuthorizationType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the amendmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAmendmentListType }
     * 
     * 
     */
    public List<IepPlanAmendmentListType> getAmendmentList() {
        if (amendmentList == null) {
            amendmentList = new ArrayList<IepPlanAmendmentListType>();
        }
        return this.amendmentList;
    }

}
