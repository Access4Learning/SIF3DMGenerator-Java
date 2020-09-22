
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CensusStaffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusStaffType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffCohortId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StaffActivity" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffActivityExtensionType" minOccurs="0"/>
 *         &lt;element name="CohortGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="X"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CohortIndigenousType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="NS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecondaryFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Headcount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusStaffType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "staffCohortId",
    "staffActivity",
    "cohortGender",
    "cohortIndigenousType",
    "primaryFTE",
    "secondaryFTE",
    "jobFTE",
    "headcount"
})
public class CensusStaffType {

    @XmlElement(name = "StaffCohortId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String staffCohortId;
    @XmlElement(name = "StaffActivity", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected StaffActivityExtensionType staffActivity;
    @XmlElement(name = "CohortGender", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cohortGender;
    @XmlElement(name = "CohortIndigenousType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cohortIndigenousType;
    @XmlElementRef(name = "PrimaryFTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryFTE;
    @XmlElementRef(name = "SecondaryFTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> secondaryFTE;
    @XmlElementRef(name = "JobFTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> jobFTE;
    @XmlElement(name = "Headcount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger headcount;

    /**
     * Gets the value of the staffCohortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCohortId() {
        return staffCohortId;
    }

    /**
     * Sets the value of the staffCohortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCohortId(String value) {
        this.staffCohortId = value;
    }

    /**
     * Gets the value of the staffActivity property.
     * 
     * @return
     *     possible object is
     *     {@link StaffActivityExtensionType }
     *     
     */
    public StaffActivityExtensionType getStaffActivity() {
        return staffActivity;
    }

    /**
     * Sets the value of the staffActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffActivityExtensionType }
     *     
     */
    public void setStaffActivity(StaffActivityExtensionType value) {
        this.staffActivity = value;
    }

    /**
     * Gets the value of the cohortGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohortGender() {
        return cohortGender;
    }

    /**
     * Sets the value of the cohortGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohortGender(String value) {
        this.cohortGender = value;
    }

    /**
     * Gets the value of the cohortIndigenousType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohortIndigenousType() {
        return cohortIndigenousType;
    }

    /**
     * Sets the value of the cohortIndigenousType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohortIndigenousType(String value) {
        this.cohortIndigenousType = value;
    }

    /**
     * Gets the value of the primaryFTE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaryFTE() {
        return primaryFTE;
    }

    /**
     * Sets the value of the primaryFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaryFTE(JAXBElement<BigDecimal> value) {
        this.primaryFTE = value;
    }

    /**
     * Gets the value of the secondaryFTE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSecondaryFTE() {
        return secondaryFTE;
    }

    /**
     * Sets the value of the secondaryFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSecondaryFTE(JAXBElement<BigDecimal> value) {
        this.secondaryFTE = value;
    }

    /**
     * Gets the value of the jobFTE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getJobFTE() {
        return jobFTE;
    }

    /**
     * Sets the value of the jobFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setJobFTE(JAXBElement<BigDecimal> value) {
        this.jobFTE = value;
    }

    /**
     * Gets the value of the headcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeadcount() {
        return headcount;
    }

    /**
     * Sets the value of the headcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeadcount(BigInteger value) {
        this.headcount = value;
    }

}
