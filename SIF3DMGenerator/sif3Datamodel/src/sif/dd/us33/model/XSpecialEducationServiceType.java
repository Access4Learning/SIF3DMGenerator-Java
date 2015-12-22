
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xSpecialEducationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSpecialEducationServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ideaIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="ideaEnvironmentEarlyChildhood" type="{http://www.sifassociation.org/datamodel/na/3.3}xIdeaEnvironmentSchoolAgeType" minOccurs="0"/>
 *         &lt;element name="ideaEnvironmentSchoolAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.sifassociation.org/datamodel/na/3.3}xStudentSupportServiceType" minOccurs="0"/>
 *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingSourceCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="fundingSourceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="providerPhone" type="{http://www.sifassociation.org/datamodel/na/3.3}gPhoneNumberType" minOccurs="0"/>
 *         &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="noninclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
@XmlType(name = "xSpecialEducationServiceType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "ideaIndicator",
    "ideaEnvironmentEarlyChildhood",
    "ideaEnvironmentSchoolAge",
    "serviceType",
    "serviceDescription",
    "fundingSourceCode",
    "fundingSourceCodeDescription",
    "serviceProvider",
    "providerPhone",
    "inclusionMinutes",
    "noninclusionMinutes",
    "any"
})
public class XSpecialEducationServiceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType ideaIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XIdeaEnvironmentSchoolAgeType ideaEnvironmentEarlyChildhood;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String ideaEnvironmentSchoolAge;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String serviceType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String serviceDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLaxCodedElementType fundingSourceCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String fundingSourceCodeDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String serviceProvider;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GPhoneNumberType providerPhone;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long inclusionMinutes;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long noninclusionMinutes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ideaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getIdeaIndicator() {
        return ideaIndicator;
    }

    /**
     * Sets the value of the ideaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setIdeaIndicator(GYesNoUnknownType value) {
        this.ideaIndicator = value;
    }

    /**
     * Gets the value of the ideaEnvironmentEarlyChildhood property.
     * 
     * @return
     *     possible object is
     *     {@link XIdeaEnvironmentSchoolAgeType }
     *     
     */
    public XIdeaEnvironmentSchoolAgeType getIdeaEnvironmentEarlyChildhood() {
        return ideaEnvironmentEarlyChildhood;
    }

    /**
     * Sets the value of the ideaEnvironmentEarlyChildhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIdeaEnvironmentSchoolAgeType }
     *     
     */
    public void setIdeaEnvironmentEarlyChildhood(XIdeaEnvironmentSchoolAgeType value) {
        this.ideaEnvironmentEarlyChildhood = value;
    }

    /**
     * Gets the value of the ideaEnvironmentSchoolAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeaEnvironmentSchoolAge() {
        return ideaEnvironmentSchoolAge;
    }

    /**
     * Sets the value of the ideaEnvironmentSchoolAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeaEnvironmentSchoolAge(String value) {
        this.ideaEnvironmentSchoolAge = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the fundingSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getFundingSourceCode() {
        return fundingSourceCode;
    }

    /**
     * Sets the value of the fundingSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setFundingSourceCode(GLaxCodedElementType value) {
        this.fundingSourceCode = value;
    }

    /**
     * Gets the value of the fundingSourceCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingSourceCodeDescription() {
        return fundingSourceCodeDescription;
    }

    /**
     * Sets the value of the fundingSourceCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingSourceCodeDescription(String value) {
        this.fundingSourceCodeDescription = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the providerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link GPhoneNumberType }
     *     
     */
    public GPhoneNumberType getProviderPhone() {
        return providerPhone;
    }

    /**
     * Sets the value of the providerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPhoneNumberType }
     *     
     */
    public void setProviderPhone(GPhoneNumberType value) {
        this.providerPhone = value;
    }

    /**
     * Gets the value of the inclusionMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInclusionMinutes() {
        return inclusionMinutes;
    }

    /**
     * Sets the value of the inclusionMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInclusionMinutes(Long value) {
        this.inclusionMinutes = value;
    }

    /**
     * Gets the value of the noninclusionMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoninclusionMinutes() {
        return noninclusionMinutes;
    }

    /**
     * Sets the value of the noninclusionMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoninclusionMinutes(Long value) {
        this.noninclusionMinutes = value;
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
