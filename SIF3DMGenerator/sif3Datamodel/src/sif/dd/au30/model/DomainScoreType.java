
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DomainScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScaledScoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScaledScoreLogitValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScaledScoreStandardError" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScaledScoreLogitStandardError" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StudentDomainBand" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StudentProficiency" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PlausibleScaledValueList" type="{http://www.sifassociation.org/datamodel/au/3.4}PlausibleScaledValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainScoreType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "rawScore",
    "scaledScoreValue",
    "scaledScoreLogitValue",
    "scaledScoreStandardError",
    "scaledScoreLogitStandardError",
    "studentDomainBand",
    "studentProficiency",
    "plausibleScaledValueList"
})
public class DomainScoreType {

    @XmlElement(name = "RawScore", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal rawScore;
    @XmlElement(name = "ScaledScoreValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal scaledScoreValue;
    @XmlElement(name = "ScaledScoreLogitValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal scaledScoreLogitValue;
    @XmlElement(name = "ScaledScoreStandardError", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal scaledScoreStandardError;
    @XmlElement(name = "ScaledScoreLogitStandardError", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal scaledScoreLogitStandardError;
    @XmlElement(name = "StudentDomainBand", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger studentDomainBand;
    @XmlElement(name = "StudentProficiency", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String studentProficiency;
    @XmlElement(name = "PlausibleScaledValueList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<PlausibleScaledValueListType> plausibleScaledValueList;

    /**
     * Gets the value of the rawScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRawScore(BigDecimal value) {
        this.rawScore = value;
    }

    /**
     * Gets the value of the scaledScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaledScoreValue() {
        return scaledScoreValue;
    }

    /**
     * Sets the value of the scaledScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaledScoreValue(BigDecimal value) {
        this.scaledScoreValue = value;
    }

    /**
     * Gets the value of the scaledScoreLogitValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaledScoreLogitValue() {
        return scaledScoreLogitValue;
    }

    /**
     * Sets the value of the scaledScoreLogitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaledScoreLogitValue(BigDecimal value) {
        this.scaledScoreLogitValue = value;
    }

    /**
     * Gets the value of the scaledScoreStandardError property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaledScoreStandardError() {
        return scaledScoreStandardError;
    }

    /**
     * Sets the value of the scaledScoreStandardError property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaledScoreStandardError(BigDecimal value) {
        this.scaledScoreStandardError = value;
    }

    /**
     * Gets the value of the scaledScoreLogitStandardError property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaledScoreLogitStandardError() {
        return scaledScoreLogitStandardError;
    }

    /**
     * Sets the value of the scaledScoreLogitStandardError property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaledScoreLogitStandardError(BigDecimal value) {
        this.scaledScoreLogitStandardError = value;
    }

    /**
     * Gets the value of the studentDomainBand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStudentDomainBand() {
        return studentDomainBand;
    }

    /**
     * Sets the value of the studentDomainBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStudentDomainBand(BigInteger value) {
        this.studentDomainBand = value;
    }

    /**
     * Gets the value of the studentProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentProficiency() {
        return studentProficiency;
    }

    /**
     * Sets the value of the studentProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentProficiency(String value) {
        this.studentProficiency = value;
    }

    /**
     * Gets the value of the plausibleScaledValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plausibleScaledValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlausibleScaledValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlausibleScaledValueListType }
     * 
     * 
     */
    public List<PlausibleScaledValueListType> getPlausibleScaledValueList() {
        if (plausibleScaledValueList == null) {
            plausibleScaledValueList = new ArrayList<PlausibleScaledValueListType>();
        }
        return this.plausibleScaledValueList;
    }

}
