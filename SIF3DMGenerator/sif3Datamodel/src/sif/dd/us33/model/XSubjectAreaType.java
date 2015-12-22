
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xSubjectAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSubjectAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}xCourseSubjectAreaType" minOccurs="0"/>
 *         &lt;element name="creditsRequired" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="schoolOfEnrollment" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
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
@XmlType(name = "xSubjectAreaType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "subjectArea",
    "creditsRequired",
    "creditsEarnedCumulative",
    "schoolOfEnrollment",
    "any"
})
public class XSubjectAreaType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subjectArea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal creditsRequired;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal creditsEarnedCumulative;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType schoolOfEnrollment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectArea(String value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the creditsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsRequired() {
        return creditsRequired;
    }

    /**
     * Sets the value of the creditsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsRequired(BigDecimal value) {
        this.creditsRequired = value;
    }

    /**
     * Gets the value of the creditsEarnedCumulative property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsEarnedCumulative() {
        return creditsEarnedCumulative;
    }

    /**
     * Sets the value of the creditsEarnedCumulative property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsEarnedCumulative(BigDecimal value) {
        this.creditsEarnedCumulative = value;
    }

    /**
     * Gets the value of the schoolOfEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchoolOfEnrollment() {
        return schoolOfEnrollment;
    }

    /**
     * Sets the value of the schoolOfEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchoolOfEnrollment(XSchoolType value) {
        this.schoolOfEnrollment = value;
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

}
