
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResidencyStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}ResidencyStatusType"/>
 *         &lt;element name="ProvidingInstruction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProvidingServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FinanciallyResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationRelationshipType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "residencyStatus",
    "providingInstruction",
    "providingServices",
    "financiallyResponsible"
})
public class OrganizationRelationshipType {

    @XmlElement(name = "ResidencyStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ResidencyStatusType residencyStatus;
    @XmlElement(name = "ProvidingInstruction", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected boolean providingInstruction;
    @XmlElement(name = "ProvidingServices", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected boolean providingServices;
    @XmlElement(name = "FinanciallyResponsible", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected boolean financiallyResponsible;

    /**
     * Gets the value of the residencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencyStatusType }
     *     
     */
    public ResidencyStatusType getResidencyStatus() {
        return residencyStatus;
    }

    /**
     * Sets the value of the residencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencyStatusType }
     *     
     */
    public void setResidencyStatus(ResidencyStatusType value) {
        this.residencyStatus = value;
    }

    /**
     * Gets the value of the providingInstruction property.
     * 
     */
    public boolean isProvidingInstruction() {
        return providingInstruction;
    }

    /**
     * Sets the value of the providingInstruction property.
     * 
     */
    public void setProvidingInstruction(boolean value) {
        this.providingInstruction = value;
    }

    /**
     * Gets the value of the providingServices property.
     * 
     */
    public boolean isProvidingServices() {
        return providingServices;
    }

    /**
     * Sets the value of the providingServices property.
     * 
     */
    public void setProvidingServices(boolean value) {
        this.providingServices = value;
    }

    /**
     * Gets the value of the financiallyResponsible property.
     * 
     */
    public boolean isFinanciallyResponsible() {
        return financiallyResponsible;
    }

    /**
     * Sets the value of the financiallyResponsible property.
     * 
     */
    public void setFinanciallyResponsible(boolean value) {
        this.financiallyResponsible = value;
    }

}
