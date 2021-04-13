
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemRoleScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemRoleScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleScopeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="RoleScopeRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}SystemRoleScopeRefIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemRoleScopeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "roleScopeName",
    "roleScopeRefId"
})
public class SystemRoleScopeType {

    @XmlElementRef(name = "RoleScopeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleScopeName;
    @XmlElementRef(name = "RoleScopeRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemRoleScopeRefIdType> roleScopeRefId;

    /**
     * Gets the value of the roleScopeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleScopeName() {
        return roleScopeName;
    }

    /**
     * Sets the value of the roleScopeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleScopeName(JAXBElement<String> value) {
        this.roleScopeName = value;
    }

    /**
     * Gets the value of the roleScopeRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleScopeRefIdType }{@code >}
     *     
     */
    public JAXBElement<SystemRoleScopeRefIdType> getRoleScopeRefId() {
        return roleScopeRefId;
    }

    /**
     * Sets the value of the roleScopeRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemRoleScopeRefIdType }{@code >}
     *     
     */
    public void setRoleScopeRefId(JAXBElement<SystemRoleScopeRefIdType> value) {
        this.roleScopeRefId = value;
    }

}
