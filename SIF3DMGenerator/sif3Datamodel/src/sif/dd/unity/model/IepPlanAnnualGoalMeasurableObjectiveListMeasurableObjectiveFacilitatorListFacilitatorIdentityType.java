
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonContactRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="staffRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonStaffRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="parentGuardianRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonStudentContactRefIdPointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "contactRefId",
    "staffRefId",
    "parentGuardianRefId"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parentGuardianRefId;

    /**
     * Gets the value of the contactRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRefId() {
        return contactRefId;
    }

    /**
     * Sets the value of the contactRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRefId(String value) {
        this.contactRefId = value;
    }

    /**
     * Gets the value of the staffRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffRefId() {
        return staffRefId;
    }

    /**
     * Sets the value of the staffRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffRefId(String value) {
        this.staffRefId = value;
    }

    /**
     * Gets the value of the parentGuardianRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuardianRefId() {
        return parentGuardianRefId;
    }

    /**
     * Sets the value of the parentGuardianRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuardianRefId(String value) {
        this.parentGuardianRefId = value;
    }

}
