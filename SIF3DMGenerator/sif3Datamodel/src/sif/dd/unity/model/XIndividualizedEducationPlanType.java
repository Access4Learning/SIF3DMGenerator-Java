
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xIndividualizedEducationPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xIndividualizedEducationPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iepAdministrativeData" type="{http://www.sifassociation.org/datamodel/na/4.x}iepAdministrativeDataType" minOccurs="0"/>
 *         &lt;element name="iepEligibility" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibilityType" minOccurs="0"/>
 *         &lt;element name="iepPlan" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xIndividualizedEducationPlanType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "iepAdministrativeData",
    "iepEligibility",
    "iepPlan"
})
public class XIndividualizedEducationPlanType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepAdministrativeDataType iepAdministrativeData;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibilityType iepEligibility;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanType iepPlan;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the iepAdministrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link IepAdministrativeDataType }
     *     
     */
    public IepAdministrativeDataType getIepAdministrativeData() {
        return iepAdministrativeData;
    }

    /**
     * Sets the value of the iepAdministrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepAdministrativeDataType }
     *     
     */
    public void setIepAdministrativeData(IepAdministrativeDataType value) {
        this.iepAdministrativeData = value;
    }

    /**
     * Gets the value of the iepEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibilityType }
     *     
     */
    public IepEligibilityType getIepEligibility() {
        return iepEligibility;
    }

    /**
     * Sets the value of the iepEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibilityType }
     *     
     */
    public void setIepEligibility(IepEligibilityType value) {
        this.iepEligibility = value;
    }

    /**
     * Gets the value of the iepPlan property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanType }
     *     
     */
    public IepPlanType getIepPlan() {
        return iepPlan;
    }

    /**
     * Sets the value of the iepPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanType }
     *     
     */
    public void setIepPlan(IepPlanType value) {
        this.iepPlan = value;
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
