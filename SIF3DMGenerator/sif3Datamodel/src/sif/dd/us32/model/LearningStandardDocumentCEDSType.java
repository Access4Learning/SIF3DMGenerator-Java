
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learningStandardDocumentCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardDocumentCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardDocumentCreator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentIdentifierURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentPublicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentPublisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentRights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardDocumentRightsHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "learningStandardDocumentCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learningStandardDocumentCreator",
    "learningStandardDocumentDescription",
    "learningStandardDocumentIdentifierURI",
    "learningStandardDocumentJurisdiction",
    "learningStandardDocumentPublicationStatus",
    "learningStandardDocumentSubject",
    "learningStandardDocumentTitle",
    "learningStandardDocumentValidEndDate",
    "learningStandardDocumentValidStartDate",
    "learningStandardDocumentVersion",
    "learningStandardDocumentLanguage",
    "learningStandardDocumentLicense",
    "learningStandardDocumentPublisher",
    "learningStandardDocumentRights",
    "learningStandardDocumentRightsHolder",
    "learningStandardItemValidEndDate",
    "learningStandardItemValidStartDate"
})
public class LearningStandardDocumentCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentCreator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentIdentifierURI;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentJurisdiction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentPublicationStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentValidEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentValidStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentLicense;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentPublisher;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentRights;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardDocumentRightsHolder;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemValidEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemValidStartDate;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the learningStandardDocumentCreator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentCreator() {
        return learningStandardDocumentCreator;
    }

    /**
     * Sets the value of the learningStandardDocumentCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentCreator(String value) {
        this.learningStandardDocumentCreator = value;
    }

    /**
     * Gets the value of the learningStandardDocumentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentDescription() {
        return learningStandardDocumentDescription;
    }

    /**
     * Sets the value of the learningStandardDocumentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentDescription(String value) {
        this.learningStandardDocumentDescription = value;
    }

    /**
     * Gets the value of the learningStandardDocumentIdentifierURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentIdentifierURI() {
        return learningStandardDocumentIdentifierURI;
    }

    /**
     * Sets the value of the learningStandardDocumentIdentifierURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentIdentifierURI(String value) {
        this.learningStandardDocumentIdentifierURI = value;
    }

    /**
     * Gets the value of the learningStandardDocumentJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentJurisdiction() {
        return learningStandardDocumentJurisdiction;
    }

    /**
     * Sets the value of the learningStandardDocumentJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentJurisdiction(String value) {
        this.learningStandardDocumentJurisdiction = value;
    }

    /**
     * Gets the value of the learningStandardDocumentPublicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentPublicationStatus() {
        return learningStandardDocumentPublicationStatus;
    }

    /**
     * Sets the value of the learningStandardDocumentPublicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentPublicationStatus(String value) {
        this.learningStandardDocumentPublicationStatus = value;
    }

    /**
     * Gets the value of the learningStandardDocumentSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentSubject() {
        return learningStandardDocumentSubject;
    }

    /**
     * Sets the value of the learningStandardDocumentSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentSubject(String value) {
        this.learningStandardDocumentSubject = value;
    }

    /**
     * Gets the value of the learningStandardDocumentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentTitle() {
        return learningStandardDocumentTitle;
    }

    /**
     * Sets the value of the learningStandardDocumentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentTitle(String value) {
        this.learningStandardDocumentTitle = value;
    }

    /**
     * Gets the value of the learningStandardDocumentValidEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentValidEndDate() {
        return learningStandardDocumentValidEndDate;
    }

    /**
     * Sets the value of the learningStandardDocumentValidEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentValidEndDate(String value) {
        this.learningStandardDocumentValidEndDate = value;
    }

    /**
     * Gets the value of the learningStandardDocumentValidStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentValidStartDate() {
        return learningStandardDocumentValidStartDate;
    }

    /**
     * Sets the value of the learningStandardDocumentValidStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentValidStartDate(String value) {
        this.learningStandardDocumentValidStartDate = value;
    }

    /**
     * Gets the value of the learningStandardDocumentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentVersion() {
        return learningStandardDocumentVersion;
    }

    /**
     * Sets the value of the learningStandardDocumentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentVersion(String value) {
        this.learningStandardDocumentVersion = value;
    }

    /**
     * Gets the value of the learningStandardDocumentLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentLanguage() {
        return learningStandardDocumentLanguage;
    }

    /**
     * Sets the value of the learningStandardDocumentLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentLanguage(String value) {
        this.learningStandardDocumentLanguage = value;
    }

    /**
     * Gets the value of the learningStandardDocumentLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentLicense() {
        return learningStandardDocumentLicense;
    }

    /**
     * Sets the value of the learningStandardDocumentLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentLicense(String value) {
        this.learningStandardDocumentLicense = value;
    }

    /**
     * Gets the value of the learningStandardDocumentPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentPublisher() {
        return learningStandardDocumentPublisher;
    }

    /**
     * Sets the value of the learningStandardDocumentPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentPublisher(String value) {
        this.learningStandardDocumentPublisher = value;
    }

    /**
     * Gets the value of the learningStandardDocumentRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentRights() {
        return learningStandardDocumentRights;
    }

    /**
     * Sets the value of the learningStandardDocumentRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentRights(String value) {
        this.learningStandardDocumentRights = value;
    }

    /**
     * Gets the value of the learningStandardDocumentRightsHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentRightsHolder() {
        return learningStandardDocumentRightsHolder;
    }

    /**
     * Sets the value of the learningStandardDocumentRightsHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentRightsHolder(String value) {
        this.learningStandardDocumentRightsHolder = value;
    }

    /**
     * Gets the value of the learningStandardItemValidEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemValidEndDate() {
        return learningStandardItemValidEndDate;
    }

    /**
     * Sets the value of the learningStandardItemValidEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemValidEndDate(String value) {
        this.learningStandardItemValidEndDate = value;
    }

    /**
     * Gets the value of the learningStandardItemValidStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemValidStartDate() {
        return learningStandardItemValidStartDate;
    }

    /**
     * Sets the value of the learningStandardItemValidStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemValidStartDate(String value) {
        this.learningStandardItemValidStartDate = value;
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
