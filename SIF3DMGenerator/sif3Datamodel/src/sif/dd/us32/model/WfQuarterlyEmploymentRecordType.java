
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for wfQuarterlyEmploymentRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wfQuarterlyEmploymentRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employedPriorToEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrativeDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencePeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="militaryEnlistmentAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personEmployedInMultipleJobsCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterlyEarnings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "wfQuarterlyEmploymentRecordType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "employedAfterExit",
    "employedPriorToEnrollment",
    "employedWhileEnrolled",
    "employmentLocation",
    "employmentNAICSCode",
    "administrativeDataSource",
    "referencePeriodEndDate",
    "referencePeriodStartDate",
    "militaryEnlistmentAfterExit",
    "personEmployedInMultipleJobsCount",
    "quarterlyEarnings",
    "socialSecurityNumber"
})
public class WfQuarterlyEmploymentRecordType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String employedAfterExit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String employedPriorToEnrollment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String employedWhileEnrolled;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String employmentLocation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String employmentNAICSCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String administrativeDataSource;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String referencePeriodEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String referencePeriodStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String militaryEnlistmentAfterExit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String personEmployedInMultipleJobsCount;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String quarterlyEarnings;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String socialSecurityNumber;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the employedAfterExit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployedAfterExit() {
        return employedAfterExit;
    }

    /**
     * Sets the value of the employedAfterExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployedAfterExit(String value) {
        this.employedAfterExit = value;
    }

    /**
     * Gets the value of the employedPriorToEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployedPriorToEnrollment() {
        return employedPriorToEnrollment;
    }

    /**
     * Sets the value of the employedPriorToEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployedPriorToEnrollment(String value) {
        this.employedPriorToEnrollment = value;
    }

    /**
     * Gets the value of the employedWhileEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployedWhileEnrolled() {
        return employedWhileEnrolled;
    }

    /**
     * Sets the value of the employedWhileEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployedWhileEnrolled(String value) {
        this.employedWhileEnrolled = value;
    }

    /**
     * Gets the value of the employmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentLocation() {
        return employmentLocation;
    }

    /**
     * Sets the value of the employmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentLocation(String value) {
        this.employmentLocation = value;
    }

    /**
     * Gets the value of the employmentNAICSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentNAICSCode() {
        return employmentNAICSCode;
    }

    /**
     * Sets the value of the employmentNAICSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentNAICSCode(String value) {
        this.employmentNAICSCode = value;
    }

    /**
     * Gets the value of the administrativeDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeDataSource() {
        return administrativeDataSource;
    }

    /**
     * Sets the value of the administrativeDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeDataSource(String value) {
        this.administrativeDataSource = value;
    }

    /**
     * Gets the value of the referencePeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePeriodEndDate() {
        return referencePeriodEndDate;
    }

    /**
     * Sets the value of the referencePeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePeriodEndDate(String value) {
        this.referencePeriodEndDate = value;
    }

    /**
     * Gets the value of the referencePeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePeriodStartDate() {
        return referencePeriodStartDate;
    }

    /**
     * Sets the value of the referencePeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePeriodStartDate(String value) {
        this.referencePeriodStartDate = value;
    }

    /**
     * Gets the value of the militaryEnlistmentAfterExit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryEnlistmentAfterExit() {
        return militaryEnlistmentAfterExit;
    }

    /**
     * Sets the value of the militaryEnlistmentAfterExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryEnlistmentAfterExit(String value) {
        this.militaryEnlistmentAfterExit = value;
    }

    /**
     * Gets the value of the personEmployedInMultipleJobsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEmployedInMultipleJobsCount() {
        return personEmployedInMultipleJobsCount;
    }

    /**
     * Sets the value of the personEmployedInMultipleJobsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEmployedInMultipleJobsCount(String value) {
        this.personEmployedInMultipleJobsCount = value;
    }

    /**
     * Gets the value of the quarterlyEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterlyEarnings() {
        return quarterlyEarnings;
    }

    /**
     * Sets the value of the quarterlyEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterlyEarnings(String value) {
        this.quarterlyEarnings = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
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
