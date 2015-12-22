
package sif.dd.us33.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xSreCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSreCourseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}xCourseType">
 *       &lt;sequence>
 *         &lt;element name="creditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditTypeEarned" type="{http://www.sifassociation.org/datamodel/na/3.3}xCreditTypeEarnedType" minOccurs="0"/>
 *         &lt;element name="progressGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="progressMark" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="gpaWeightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gpaUnweightedMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="finalMarkValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="classSectionId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="courseLevelCharacteristic" type="{http://www.sifassociation.org/datamodel/na/3.3}xCourseLevelCharacteristicType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSreCourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "creditsAttempted",
    "creditsEarned",
    "creditTypeEarned",
    "progressGPA",
    "progressMark",
    "gpaWeightedMark",
    "gpaUnweightedMark",
    "finalMarkValue",
    "classSectionId",
    "courseLevelCharacteristic"
})
public class XSreCourseType
    extends XCourseType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal creditsAttempted;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal creditsEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditTypeEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal progressGPA;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String progressMark;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal gpaWeightedMark;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal gpaUnweightedMark;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String finalMarkValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String classSectionId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String courseLevelCharacteristic;

    /**
     * Gets the value of the creditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsAttempted() {
        return creditsAttempted;
    }

    /**
     * Sets the value of the creditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsAttempted(BigDecimal value) {
        this.creditsAttempted = value;
    }

    /**
     * Gets the value of the creditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsEarned() {
        return creditsEarned;
    }

    /**
     * Sets the value of the creditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsEarned(BigDecimal value) {
        this.creditsEarned = value;
    }

    /**
     * Gets the value of the creditTypeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTypeEarned() {
        return creditTypeEarned;
    }

    /**
     * Sets the value of the creditTypeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTypeEarned(String value) {
        this.creditTypeEarned = value;
    }

    /**
     * Gets the value of the progressGPA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProgressGPA() {
        return progressGPA;
    }

    /**
     * Sets the value of the progressGPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProgressGPA(BigDecimal value) {
        this.progressGPA = value;
    }

    /**
     * Gets the value of the progressMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressMark() {
        return progressMark;
    }

    /**
     * Sets the value of the progressMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressMark(String value) {
        this.progressMark = value;
    }

    /**
     * Gets the value of the gpaWeightedMark property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGpaWeightedMark() {
        return gpaWeightedMark;
    }

    /**
     * Sets the value of the gpaWeightedMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGpaWeightedMark(BigDecimal value) {
        this.gpaWeightedMark = value;
    }

    /**
     * Gets the value of the gpaUnweightedMark property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGpaUnweightedMark() {
        return gpaUnweightedMark;
    }

    /**
     * Sets the value of the gpaUnweightedMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGpaUnweightedMark(BigDecimal value) {
        this.gpaUnweightedMark = value;
    }

    /**
     * Gets the value of the finalMarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalMarkValue() {
        return finalMarkValue;
    }

    /**
     * Sets the value of the finalMarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalMarkValue(String value) {
        this.finalMarkValue = value;
    }

    /**
     * Gets the value of the classSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassSectionId() {
        return classSectionId;
    }

    /**
     * Sets the value of the classSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassSectionId(String value) {
        this.classSectionId = value;
    }

    /**
     * Gets the value of the courseLevelCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseLevelCharacteristic() {
        return courseLevelCharacteristic;
    }

    /**
     * Sets the value of the courseLevelCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseLevelCharacteristic(String value) {
        this.courseLevelCharacteristic = value;
    }

}
