
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuthenticationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="System" type="{http://www.sifassociation.org/datamodel/na/4.x}AuthenticationInfoSystemType"/>
 *         &lt;element name="Username" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DistinguishedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PasswordList" type="{http://www.sifassociation.org/datamodel/na/4.x}PasswordListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "system",
    "username",
    "distinguishedName",
    "passwordList"
})
public class AuthenticationInfoType {

    @XmlElement(name = "System", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected AuthenticationInfoSystemType system;
    @XmlElement(name = "Username", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String username;
    @XmlElement(name = "DistinguishedName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distinguishedName;
    @XmlElement(name = "PasswordList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PasswordListType passwordList;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationInfoSystemType }
     *     
     */
    public AuthenticationInfoSystemType getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationInfoSystemType }
     *     
     */
    public void setSystem(AuthenticationInfoSystemType value) {
        this.system = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the distinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     * Sets the value of the distinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinguishedName(String value) {
        this.distinguishedName = value;
    }

    /**
     * Gets the value of the passwordList property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordListType }
     *     
     */
    public PasswordListType getPasswordList() {
        return passwordList;
    }

    /**
     * Sets the value of the passwordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordListType }
     *     
     */
    public void setPasswordList(PasswordListType value) {
        this.passwordList = value;
    }

}
