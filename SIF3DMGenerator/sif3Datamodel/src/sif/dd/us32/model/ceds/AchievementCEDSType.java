
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for achievementCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="achievementCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achievementTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementAwardIssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementAwardIssuerOriginURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementCategorySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementCategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementCriteriaURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievementEvidenceStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "achievementCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "achievementTitle",
    "achievementDescription",
    "achievementStartDate",
    "achievementEndDate",
    "achievementAwardIssuerName",
    "achievementAwardIssuerOriginURL",
    "achievementCategorySystem",
    "achievementCategoryType",
    "achievementImageURL",
    "achievementCriteria",
    "achievementCriteriaURL",
    "achievementEvidenceStatement"
})
public class AchievementCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementAwardIssuerName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementAwardIssuerOriginURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementCategorySystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementCategoryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementImageURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementCriteria;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementCriteriaURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String achievementEvidenceStatement;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the achievementTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementTitle() {
        return achievementTitle;
    }

    /**
     * Sets the value of the achievementTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementTitle(String value) {
        this.achievementTitle = value;
    }

    /**
     * Gets the value of the achievementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementDescription() {
        return achievementDescription;
    }

    /**
     * Sets the value of the achievementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementDescription(String value) {
        this.achievementDescription = value;
    }

    /**
     * Gets the value of the achievementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementStartDate() {
        return achievementStartDate;
    }

    /**
     * Sets the value of the achievementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementStartDate(String value) {
        this.achievementStartDate = value;
    }

    /**
     * Gets the value of the achievementEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementEndDate() {
        return achievementEndDate;
    }

    /**
     * Sets the value of the achievementEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementEndDate(String value) {
        this.achievementEndDate = value;
    }

    /**
     * Gets the value of the achievementAwardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementAwardIssuerName() {
        return achievementAwardIssuerName;
    }

    /**
     * Sets the value of the achievementAwardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementAwardIssuerName(String value) {
        this.achievementAwardIssuerName = value;
    }

    /**
     * Gets the value of the achievementAwardIssuerOriginURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementAwardIssuerOriginURL() {
        return achievementAwardIssuerOriginURL;
    }

    /**
     * Sets the value of the achievementAwardIssuerOriginURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementAwardIssuerOriginURL(String value) {
        this.achievementAwardIssuerOriginURL = value;
    }

    /**
     * Gets the value of the achievementCategorySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementCategorySystem() {
        return achievementCategorySystem;
    }

    /**
     * Sets the value of the achievementCategorySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementCategorySystem(String value) {
        this.achievementCategorySystem = value;
    }

    /**
     * Gets the value of the achievementCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementCategoryType() {
        return achievementCategoryType;
    }

    /**
     * Sets the value of the achievementCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementCategoryType(String value) {
        this.achievementCategoryType = value;
    }

    /**
     * Gets the value of the achievementImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementImageURL() {
        return achievementImageURL;
    }

    /**
     * Sets the value of the achievementImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementImageURL(String value) {
        this.achievementImageURL = value;
    }

    /**
     * Gets the value of the achievementCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementCriteria() {
        return achievementCriteria;
    }

    /**
     * Sets the value of the achievementCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementCriteria(String value) {
        this.achievementCriteria = value;
    }

    /**
     * Gets the value of the achievementCriteriaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementCriteriaURL() {
        return achievementCriteriaURL;
    }

    /**
     * Sets the value of the achievementCriteriaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementCriteriaURL(String value) {
        this.achievementCriteriaURL = value;
    }

    /**
     * Gets the value of the achievementEvidenceStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementEvidenceStatement() {
        return achievementEvidenceStatement;
    }

    /**
     * Sets the value of the achievementEvidenceStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementEvidenceStatement(String value) {
        this.achievementEvidenceStatement = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
