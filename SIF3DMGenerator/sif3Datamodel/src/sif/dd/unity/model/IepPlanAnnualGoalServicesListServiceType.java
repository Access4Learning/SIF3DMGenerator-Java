
package sif.dd.unity.model;

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
 * <p>Java class for iepPlanAnnualGoalServicesListServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalServicesListServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.sifassociation.org/datamodel/na/4.x}iepTypeType" minOccurs="0"/>
 *         &lt;element name="inclusiveSettingIndicator" type="{http://www.sifassociation.org/datamodel/na/4.x}iepInclusiveSettingIndicatorType" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonServiceProviderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalServicesListServiceFrequencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="nonParticipationReason" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="extendsSchoolYear" type="{http://www.sifassociation.org/datamodel/na/4.x}iepExtendsSchoolYearType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalServicesListServiceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "type",
    "inclusiveSettingIndicator",
    "serviceProvider",
    "frequency",
    "startDate",
    "endDate",
    "nonParticipationReason",
    "extendsSchoolYear"
})
public class IepPlanAnnualGoalServicesListServiceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepTypeType type;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepInclusiveSettingIndicatorType inclusiveSettingIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepCommonServiceProviderType> serviceProvider;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalServicesListServiceFrequencyType> frequency;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String endDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nonParticipationReason;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepExtendsSchoolYearType extendsSchoolYear;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link IepTypeType }
     *     
     */
    public IepTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepTypeType }
     *     
     */
    public void setType(IepTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the inclusiveSettingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IepInclusiveSettingIndicatorType }
     *     
     */
    public IepInclusiveSettingIndicatorType getInclusiveSettingIndicator() {
        return inclusiveSettingIndicator;
    }

    /**
     * Sets the value of the inclusiveSettingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepInclusiveSettingIndicatorType }
     *     
     */
    public void setInclusiveSettingIndicator(IepInclusiveSettingIndicatorType value) {
        this.inclusiveSettingIndicator = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepCommonServiceProviderType }
     * 
     * 
     */
    public List<IepCommonServiceProviderType> getServiceProvider() {
        if (serviceProvider == null) {
            serviceProvider = new ArrayList<IepCommonServiceProviderType>();
        }
        return this.serviceProvider;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalServicesListServiceFrequencyType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalServicesListServiceFrequencyType> getFrequency() {
        if (frequency == null) {
            frequency = new ArrayList<IepPlanAnnualGoalServicesListServiceFrequencyType>();
        }
        return this.frequency;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the nonParticipationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonParticipationReason() {
        return nonParticipationReason;
    }

    /**
     * Sets the value of the nonParticipationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonParticipationReason(String value) {
        this.nonParticipationReason = value;
    }

    /**
     * Gets the value of the extendsSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link IepExtendsSchoolYearType }
     *     
     */
    public IepExtendsSchoolYearType getExtendsSchoolYear() {
        return extendsSchoolYear;
    }

    /**
     * Sets the value of the extendsSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepExtendsSchoolYearType }
     *     
     */
    public void setExtendsSchoolYear(IepExtendsSchoolYearType value) {
        this.extendsSchoolYear = value;
    }

}
