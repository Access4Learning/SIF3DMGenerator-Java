
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanPlacementScheduleModificationSchoolDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPlacementScheduleModificationSchoolDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCategoryType" minOccurs="0"/>
 *         &lt;element name="specificModification" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="rationale" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPlacementScheduleModificationSchoolDayType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "category",
    "specificModification",
    "rationale"
})
public class IepPlanPlacementScheduleModificationSchoolDayType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCategoryType category;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specificModification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rationale;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link IepCategoryType }
     *     
     */
    public IepCategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCategoryType }
     *     
     */
    public void setCategory(IepCategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the specificModification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificModification() {
        return specificModification;
    }

    /**
     * Sets the value of the specificModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificModification(String value) {
        this.specificModification = value;
    }

    /**
     * Gets the value of the rationale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRationale() {
        return rationale;
    }

    /**
     * Sets the value of the rationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRationale(String value) {
        this.rationale = value;
    }

}
