
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepCommonServiceProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepCommonServiceProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonContactRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="organizationRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonOrganizationRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="staffRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonStaffRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.sifassociation.org/datamodel/na/4.x}iepRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepCommonServiceProviderType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "contactRefId",
    "organizationRefId",
    "staffRefId",
    "role"
})
public class IepCommonServiceProviderType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organizationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepRoleType role;

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
     * Gets the value of the organizationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationRefId() {
        return organizationRefId;
    }

    /**
     * Sets the value of the organizationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationRefId(String value) {
        this.organizationRefId = value;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link IepRoleType }
     *     
     */
    public IepRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepRoleType }
     *     
     */
    public void setRole(IepRoleType value) {
        this.role = value;
    }

}
