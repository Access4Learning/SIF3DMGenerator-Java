
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for psApplicantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="psApplicantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admittedStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpaDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpaWeightedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolPercentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolStudentClassRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postsecondaryApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNumberInClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waitListedStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "psApplicantType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "admittedStudent",
    "gpaCumulative",
    "gpaDomain",
    "gpaWeightedIndicator",
    "highSchoolPercentile",
    "highSchoolStudentClassRank",
    "postsecondaryApplicant",
    "totalNumberInClass",
    "waitListedStudent"
})
public class PsApplicantType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String admittedStudent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String gpaCumulative;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String gpaDomain;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String gpaWeightedIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String highSchoolPercentile;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String highSchoolStudentClassRank;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String postsecondaryApplicant;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String totalNumberInClass;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String waitListedStudent;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the admittedStudent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmittedStudent() {
        return admittedStudent;
    }

    /**
     * Sets the value of the admittedStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmittedStudent(String value) {
        this.admittedStudent = value;
    }

    /**
     * Gets the value of the gpaCumulative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpaCumulative() {
        return gpaCumulative;
    }

    /**
     * Sets the value of the gpaCumulative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpaCumulative(String value) {
        this.gpaCumulative = value;
    }

    /**
     * Gets the value of the gpaDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpaDomain() {
        return gpaDomain;
    }

    /**
     * Sets the value of the gpaDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpaDomain(String value) {
        this.gpaDomain = value;
    }

    /**
     * Gets the value of the gpaWeightedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpaWeightedIndicator() {
        return gpaWeightedIndicator;
    }

    /**
     * Sets the value of the gpaWeightedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpaWeightedIndicator(String value) {
        this.gpaWeightedIndicator = value;
    }

    /**
     * Gets the value of the highSchoolPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighSchoolPercentile() {
        return highSchoolPercentile;
    }

    /**
     * Sets the value of the highSchoolPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighSchoolPercentile(String value) {
        this.highSchoolPercentile = value;
    }

    /**
     * Gets the value of the highSchoolStudentClassRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighSchoolStudentClassRank() {
        return highSchoolStudentClassRank;
    }

    /**
     * Sets the value of the highSchoolStudentClassRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighSchoolStudentClassRank(String value) {
        this.highSchoolStudentClassRank = value;
    }

    /**
     * Gets the value of the postsecondaryApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostsecondaryApplicant() {
        return postsecondaryApplicant;
    }

    /**
     * Sets the value of the postsecondaryApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostsecondaryApplicant(String value) {
        this.postsecondaryApplicant = value;
    }

    /**
     * Gets the value of the totalNumberInClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNumberInClass() {
        return totalNumberInClass;
    }

    /**
     * Sets the value of the totalNumberInClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNumberInClass(String value) {
        this.totalNumberInClass = value;
    }

    /**
     * Gets the value of the waitListedStudent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitListedStudent() {
        return waitListedStudent;
    }

    /**
     * Sets the value of the waitListedStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitListedStudent(String value) {
        this.waitListedStudent = value;
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
