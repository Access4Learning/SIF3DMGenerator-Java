
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
 * <p>Java class for iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAccommodationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCategoryType" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="achievementStandard" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accommodation",
    "location",
    "category",
    "explanation",
    "achievementStandard"
})
public class IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepCommonAccommodationType> accommodation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String location;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCategoryType category;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String explanation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType achievementStandard;

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepCommonAccommodationType }
     * 
     * 
     */
    public List<IepCommonAccommodationType> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<IepCommonAccommodationType>();
        }
        return this.accommodation;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link IepCategoryType }
     *     
     */
    public IepCategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCategoryType }
     *     
     */
    public void setCategory(IepCategoryType value) {
        this.category = value;
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
     * Gets the value of the achievementStandard property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType }
     *     
     */
    public IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType getAchievementStandard() {
        return achievementStandard;
    }

    /**
     * Sets the value of the achievementStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType }
     *     
     */
    public void setAchievementStandard(IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListAccommodationAchievementStandardType value) {
        this.achievementStandard = value;
    }

}
