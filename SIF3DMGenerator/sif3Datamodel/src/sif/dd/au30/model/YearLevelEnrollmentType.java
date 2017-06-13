
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Containter for Year Level of Enrolments.
 * 
 * <p>Java class for YearLevelEnrollmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearLevelEnrollmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Year" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYearLevelCodeType"/>
 *         &lt;element name="Enrollment" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearLevelEnrollmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "year",
    "enrollment"
})
public class YearLevelEnrollmentType {

    @XmlElement(name = "Year", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String year;
    @XmlElement(name = "Enrollment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enrollment;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollment(String value) {
        this.enrollment = value;
    }

}
