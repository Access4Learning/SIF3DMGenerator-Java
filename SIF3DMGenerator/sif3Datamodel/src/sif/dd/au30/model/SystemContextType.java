
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
 * <p>Java class for SystemContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleList" type="{http://www.sifassociation.org/datamodel/au/3.4}SystemRoleListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SystemId" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemContextType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "roleList"
})
public class SystemContextType {

    @XmlElementRef(name = "RoleList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemRoleListType> roleList;
    @XmlAttribute(name = "SystemId", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String systemId;

    /**
     * Gets the value of the roleList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleListType }{@code >}
     *     
     */
    public JAXBElement<SystemRoleListType> getRoleList() {
        return roleList;
    }

    /**
     * Sets the value of the roleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleListType }{@code >}
     *     
     */
    public void setRoleList(JAXBElement<SystemRoleListType> value) {
        this.roleList = value;
    }

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

}
