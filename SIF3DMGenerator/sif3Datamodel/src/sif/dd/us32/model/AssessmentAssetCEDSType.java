
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentAssetCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentAssetCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentAssetIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetPublishedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetContentXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetContentMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAssetContentURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentAssetCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentAssetIdentifier",
    "assessmentAssetIdentifierType",
    "assessmentAssetName",
    "assessmentAssetOwner",
    "assessmentAssetType",
    "assessmentAssetPublishedDate",
    "assessmentAssetVersion",
    "assessmentAssetContentXML",
    "assessmentAssetContentMimeType",
    "assessmentAssetContentURL",
    "languageCode"
})
public class AssessmentAssetCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetIdentifierType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetOwner;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetPublishedDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetContentXML;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetContentMimeType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAssetContentURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String languageCode;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentAssetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetIdentifier() {
        return assessmentAssetIdentifier;
    }

    /**
     * Sets the value of the assessmentAssetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetIdentifier(String value) {
        this.assessmentAssetIdentifier = value;
    }

    /**
     * Gets the value of the assessmentAssetIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetIdentifierType() {
        return assessmentAssetIdentifierType;
    }

    /**
     * Sets the value of the assessmentAssetIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetIdentifierType(String value) {
        this.assessmentAssetIdentifierType = value;
    }

    /**
     * Gets the value of the assessmentAssetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetName() {
        return assessmentAssetName;
    }

    /**
     * Sets the value of the assessmentAssetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetName(String value) {
        this.assessmentAssetName = value;
    }

    /**
     * Gets the value of the assessmentAssetOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetOwner() {
        return assessmentAssetOwner;
    }

    /**
     * Sets the value of the assessmentAssetOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetOwner(String value) {
        this.assessmentAssetOwner = value;
    }

    /**
     * Gets the value of the assessmentAssetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetType() {
        return assessmentAssetType;
    }

    /**
     * Sets the value of the assessmentAssetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetType(String value) {
        this.assessmentAssetType = value;
    }

    /**
     * Gets the value of the assessmentAssetPublishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetPublishedDate() {
        return assessmentAssetPublishedDate;
    }

    /**
     * Sets the value of the assessmentAssetPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetPublishedDate(String value) {
        this.assessmentAssetPublishedDate = value;
    }

    /**
     * Gets the value of the assessmentAssetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetVersion() {
        return assessmentAssetVersion;
    }

    /**
     * Sets the value of the assessmentAssetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetVersion(String value) {
        this.assessmentAssetVersion = value;
    }

    /**
     * Gets the value of the assessmentAssetContentXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetContentXML() {
        return assessmentAssetContentXML;
    }

    /**
     * Sets the value of the assessmentAssetContentXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetContentXML(String value) {
        this.assessmentAssetContentXML = value;
    }

    /**
     * Gets the value of the assessmentAssetContentMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetContentMimeType() {
        return assessmentAssetContentMimeType;
    }

    /**
     * Sets the value of the assessmentAssetContentMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetContentMimeType(String value) {
        this.assessmentAssetContentMimeType = value;
    }

    /**
     * Gets the value of the assessmentAssetContentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAssetContentURL() {
        return assessmentAssetContentURL;
    }

    /**
     * Sets the value of the assessmentAssetContentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAssetContentURL(String value) {
        this.assessmentAssetContentURL = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
