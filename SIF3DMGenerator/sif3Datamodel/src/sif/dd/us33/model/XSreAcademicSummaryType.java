
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Extends the basic xAcademicSummaryType to include more comprehensive academic summary information that may be necessary to complete a successful student record exchange.
 * 
 * <p>Java class for xSreAcademicSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSreAcademicSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}xAcademicSummaryType">
 *       &lt;sequence>
 *         &lt;element name="achievements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="achievement" type="{http://www.sifassociation.org/datamodel/na/3.3}xAchievementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="graduationRequirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="graduationRequirement" type="{http://www.sifassociation.org/datamodel/na/3.3}xGraduationRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gpaScale" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="termGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cumulativeGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gpaType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="termCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="termCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="classTotalNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSreAcademicSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "achievements",
    "graduationRequirements",
    "gpaScale",
    "termGpa",
    "cumulativeGpa",
    "gpaType",
    "termCreditsEarned",
    "termCreditsAttempted",
    "totalCreditsEarned",
    "totalCreditsAttempted",
    "classTotalNumber"
})
public class XSreAcademicSummaryType
    extends XAcademicSummaryType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreAcademicSummaryType.Achievements achievements;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSreAcademicSummaryType.GraduationRequirements graduationRequirements;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String gpaScale;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal termGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal cumulativeGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gpaType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal termCreditsEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal termCreditsAttempted;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal totalCreditsEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal totalCreditsAttempted;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long classTotalNumber;

    /**
     * Gets the value of the achievements property.
     * 
     * @return
     *     possible object is
     *     {@link XSreAcademicSummaryType.Achievements }
     *     
     */
    public XSreAcademicSummaryType.Achievements getAchievements() {
        return achievements;
    }

    /**
     * Sets the value of the achievements property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreAcademicSummaryType.Achievements }
     *     
     */
    public void setAchievements(XSreAcademicSummaryType.Achievements value) {
        this.achievements = value;
    }

    /**
     * Gets the value of the graduationRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link XSreAcademicSummaryType.GraduationRequirements }
     *     
     */
    public XSreAcademicSummaryType.GraduationRequirements getGraduationRequirements() {
        return graduationRequirements;
    }

    /**
     * Sets the value of the graduationRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSreAcademicSummaryType.GraduationRequirements }
     *     
     */
    public void setGraduationRequirements(XSreAcademicSummaryType.GraduationRequirements value) {
        this.graduationRequirements = value;
    }

    /**
     * Gets the value of the gpaScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpaScale() {
        return gpaScale;
    }

    /**
     * Sets the value of the gpaScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpaScale(String value) {
        this.gpaScale = value;
    }

    /**
     * Gets the value of the termGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermGpa() {
        return termGpa;
    }

    /**
     * Sets the value of the termGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermGpa(BigDecimal value) {
        this.termGpa = value;
    }

    /**
     * Gets the value of the cumulativeGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeGpa() {
        return cumulativeGpa;
    }

    /**
     * Sets the value of the cumulativeGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeGpa(BigDecimal value) {
        this.cumulativeGpa = value;
    }

    /**
     * Gets the value of the gpaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpaType() {
        return gpaType;
    }

    /**
     * Sets the value of the gpaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpaType(String value) {
        this.gpaType = value;
    }

    /**
     * Gets the value of the termCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermCreditsEarned() {
        return termCreditsEarned;
    }

    /**
     * Sets the value of the termCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermCreditsEarned(BigDecimal value) {
        this.termCreditsEarned = value;
    }

    /**
     * Gets the value of the termCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermCreditsAttempted() {
        return termCreditsAttempted;
    }

    /**
     * Sets the value of the termCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermCreditsAttempted(BigDecimal value) {
        this.termCreditsAttempted = value;
    }

    /**
     * Gets the value of the totalCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    /**
     * Sets the value of the totalCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditsEarned(BigDecimal value) {
        this.totalCreditsEarned = value;
    }

    /**
     * Gets the value of the totalCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditsAttempted() {
        return totalCreditsAttempted;
    }

    /**
     * Sets the value of the totalCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditsAttempted(BigDecimal value) {
        this.totalCreditsAttempted = value;
    }

    /**
     * Gets the value of the classTotalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassTotalNumber() {
        return classTotalNumber;
    }

    /**
     * Sets the value of the classTotalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassTotalNumber(Long value) {
        this.classTotalNumber = value;
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
     *         &lt;element name="achievement" type="{http://www.sifassociation.org/datamodel/na/3.3}xAchievementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "achievement"
    })
    public static class Achievements {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XAchievementType> achievement;

        /**
         * Gets the value of the achievement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the achievement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAchievement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAchievementType }
         * 
         * 
         */
        public List<XAchievementType> getAchievement() {
            if (achievement == null) {
                achievement = new ArrayList<XAchievementType>();
            }
            return this.achievement;
        }

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
     *         &lt;element name="graduationRequirement" type="{http://www.sifassociation.org/datamodel/na/3.3}xGraduationRequirementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "graduationRequirement"
    })
    public static class GraduationRequirements {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<XGraduationRequirementType> graduationRequirement;

        /**
         * Gets the value of the graduationRequirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the graduationRequirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGraduationRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XGraduationRequirementType }
         * 
         * 
         */
        public List<XGraduationRequirementType> getGraduationRequirement() {
            if (graduationRequirement == null) {
                graduationRequirement = new ArrayList<XGraduationRequirementType>();
            }
            return this.graduationRequirement;
        }

    }

}
