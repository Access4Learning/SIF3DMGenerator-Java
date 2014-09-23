
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for familyCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="familyCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="familyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPeopleInFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPeopleInHousehold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceOfFamilyIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeCalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proofOfResidency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "familyCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "familyId",
    "numberOfPeopleInFamily",
    "numberOfPeopleInHousehold",
    "familyIncome",
    "sourceOfFamilyIncome",
    "incomeCalculationMethod",
    "proofOfResidency"
})
public class FamilyCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String familyId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String numberOfPeopleInFamily;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String numberOfPeopleInHousehold;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String familyIncome;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sourceOfFamilyIncome;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incomeCalculationMethod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String proofOfResidency;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyId(String value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the numberOfPeopleInFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPeopleInFamily() {
        return numberOfPeopleInFamily;
    }

    /**
     * Sets the value of the numberOfPeopleInFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPeopleInFamily(String value) {
        this.numberOfPeopleInFamily = value;
    }

    /**
     * Gets the value of the numberOfPeopleInHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPeopleInHousehold() {
        return numberOfPeopleInHousehold;
    }

    /**
     * Sets the value of the numberOfPeopleInHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPeopleInHousehold(String value) {
        this.numberOfPeopleInHousehold = value;
    }

    /**
     * Gets the value of the familyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyIncome() {
        return familyIncome;
    }

    /**
     * Sets the value of the familyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyIncome(String value) {
        this.familyIncome = value;
    }

    /**
     * Gets the value of the sourceOfFamilyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfFamilyIncome() {
        return sourceOfFamilyIncome;
    }

    /**
     * Sets the value of the sourceOfFamilyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfFamilyIncome(String value) {
        this.sourceOfFamilyIncome = value;
    }

    /**
     * Gets the value of the incomeCalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeCalculationMethod() {
        return incomeCalculationMethod;
    }

    /**
     * Sets the value of the incomeCalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeCalculationMethod(String value) {
        this.incomeCalculationMethod = value;
    }

    /**
     * Gets the value of the proofOfResidency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofOfResidency() {
        return proofOfResidency;
    }

    /**
     * Sets the value of the proofOfResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofOfResidency(String value) {
        this.proofOfResidency = value;
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
