
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xProgramSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xProgramSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialEducation" type="{http://www.sifassociation.org/datamodel/na/3.3}xSpecialEducationType" minOccurs="0"/>
 *         &lt;element name="activities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity" type="{http://www.sifassociation.org/datamodel/na/3.3}xActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lep" type="{http://www.sifassociation.org/datamodel/na/3.3}xLepType" minOccurs="0"/>
 *         &lt;element name="migrant" type="{http://www.sifassociation.org/datamodel/na/3.3}xMigrantType" minOccurs="0"/>
 *         &lt;element name="homeless" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="foodService" type="{http://www.sifassociation.org/datamodel/na/3.3}xFoodServiceType" minOccurs="0"/>
 *         &lt;element name="title1" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="giftedTalented" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="neglectedDelinquent" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="section504" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="immigrant" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="vocationalConcentrator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xProgramSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "specialEducation",
    "activities",
    "lep",
    "migrant",
    "homeless",
    "foodService",
    "title1",
    "giftedTalented",
    "neglectedDelinquent",
    "section504",
    "immigrant",
    "vocationalConcentrator",
    "any"
})
public class XProgramSummaryType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSpecialEducationType specialEducation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XProgramSummaryType.Activities activities;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XLepType lep;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XMigrantType migrant;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType homeless;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XFoodServiceType foodService;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType title1;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType giftedTalented;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType neglectedDelinquent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType section504;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType immigrant;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType vocationalConcentrator;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the specialEducation property.
     * 
     * @return
     *     possible object is
     *     {@link XSpecialEducationType }
     *     
     */
    public XSpecialEducationType getSpecialEducation() {
        return specialEducation;
    }

    /**
     * Sets the value of the specialEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSpecialEducationType }
     *     
     */
    public void setSpecialEducation(XSpecialEducationType value) {
        this.specialEducation = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link XProgramSummaryType.Activities }
     *     
     */
    public XProgramSummaryType.Activities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link XProgramSummaryType.Activities }
     *     
     */
    public void setActivities(XProgramSummaryType.Activities value) {
        this.activities = value;
    }

    /**
     * Gets the value of the lep property.
     * 
     * @return
     *     possible object is
     *     {@link XLepType }
     *     
     */
    public XLepType getLep() {
        return lep;
    }

    /**
     * Sets the value of the lep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLepType }
     *     
     */
    public void setLep(XLepType value) {
        this.lep = value;
    }

    /**
     * Gets the value of the migrant property.
     * 
     * @return
     *     possible object is
     *     {@link XMigrantType }
     *     
     */
    public XMigrantType getMigrant() {
        return migrant;
    }

    /**
     * Sets the value of the migrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMigrantType }
     *     
     */
    public void setMigrant(XMigrantType value) {
        this.migrant = value;
    }

    /**
     * Gets the value of the homeless property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getHomeless() {
        return homeless;
    }

    /**
     * Sets the value of the homeless property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setHomeless(GYesNoUnknownType value) {
        this.homeless = value;
    }

    /**
     * Gets the value of the foodService property.
     * 
     * @return
     *     possible object is
     *     {@link XFoodServiceType }
     *     
     */
    public XFoodServiceType getFoodService() {
        return foodService;
    }

    /**
     * Sets the value of the foodService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFoodServiceType }
     *     
     */
    public void setFoodService(XFoodServiceType value) {
        this.foodService = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setTitle1(GYesNoUnknownType value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the giftedTalented property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getGiftedTalented() {
        return giftedTalented;
    }

    /**
     * Sets the value of the giftedTalented property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setGiftedTalented(GYesNoUnknownType value) {
        this.giftedTalented = value;
    }

    /**
     * Gets the value of the neglectedDelinquent property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getNeglectedDelinquent() {
        return neglectedDelinquent;
    }

    /**
     * Sets the value of the neglectedDelinquent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setNeglectedDelinquent(GYesNoUnknownType value) {
        this.neglectedDelinquent = value;
    }

    /**
     * Gets the value of the section504 property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSection504() {
        return section504;
    }

    /**
     * Sets the value of the section504 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSection504(GYesNoUnknownType value) {
        this.section504 = value;
    }

    /**
     * Gets the value of the immigrant property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getImmigrant() {
        return immigrant;
    }

    /**
     * Sets the value of the immigrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setImmigrant(GYesNoUnknownType value) {
        this.immigrant = value;
    }

    /**
     * Gets the value of the vocationalConcentrator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getVocationalConcentrator() {
        return vocationalConcentrator;
    }

    /**
     * Sets the value of the vocationalConcentrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setVocationalConcentrator(GYesNoUnknownType value) {
        this.vocationalConcentrator = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="activity" type="{http://www.sifassociation.org/datamodel/na/3.3}xActivityType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "activity"
    })
    public static class Activities {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XActivityType> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XActivityType }
         * 
         * 
         */
        public List<XActivityType> getActivity() {
            if (activity == null) {
                activity = new ArrayList<XActivityType>();
            }
            return this.activity;
        }

    }

}
