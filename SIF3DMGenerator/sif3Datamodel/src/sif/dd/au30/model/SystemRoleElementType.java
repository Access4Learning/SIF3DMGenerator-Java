
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SystemRoleElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemRoleElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleScopeList" type="{http://www.sifassociation.org/datamodel/au/3.4}SystemRoleScopeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoleId" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemRoleElementType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "roleScopeList"
})
public class SystemRoleElementType {

    @XmlElementRef(name = "RoleScopeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemRoleScopeListType> roleScopeList;
    @XmlAttribute(name = "RoleId", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String roleId;

    /**
     * Gets the value of the roleScopeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleScopeListType }{@code >}
     *     
     */
    public JAXBElement<SystemRoleScopeListType> getRoleScopeList() {
        return roleScopeList;
    }

    /**
     * Sets the value of the roleScopeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleScopeListType }{@code >}
     *     
     */
    public void setRoleScopeList(JAXBElement<SystemRoleScopeListType> value) {
        this.roleScopeList = value;
    }

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleId(String value) {
        this.roleId = value;
    }

}
