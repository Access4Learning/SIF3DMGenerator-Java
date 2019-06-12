
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceFunctionalSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceFunctionalSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="accommodationList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceFunctionalSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "description",
    "accommodationList"
})
public class IepPlanPresentLevelPerformanceFunctionalSummaryType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType accommodationList;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accommodationList property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType }
     *     
     */
    public IepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType getAccommodationList() {
        return accommodationList;
    }

    /**
     * Sets the value of the accommodationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType }
     *     
     */
    public void setAccommodationList(IepPlanPresentLevelPerformanceFunctionalSummaryAccommodationListType value) {
        this.accommodationList = value;
    }

}
