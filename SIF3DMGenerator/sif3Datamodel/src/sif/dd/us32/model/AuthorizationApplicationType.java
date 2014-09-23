
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for authorizationApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationApplicationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "applicationName",
    "applicationURI",
    "applicationRoleName",
    "authorizationStartDate",
    "authorizationEndDate"
})
public class AuthorizationApplicationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String applicationName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String applicationURI;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String applicationRoleName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String authorizationStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String authorizationEndDate;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the applicationURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationURI() {
        return applicationURI;
    }

    /**
     * Sets the value of the applicationURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationURI(String value) {
        this.applicationURI = value;
    }

    /**
     * Gets the value of the applicationRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationRoleName() {
        return applicationRoleName;
    }

    /**
     * Sets the value of the applicationRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationRoleName(String value) {
        this.applicationRoleName = value;
    }

    /**
     * Gets the value of the authorizationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationStartDate() {
        return authorizationStartDate;
    }

    /**
     * Sets the value of the authorizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationStartDate(String value) {
        this.authorizationStartDate = value;
    }

    /**
     * Gets the value of the authorizationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationEndDate() {
        return authorizationEndDate;
    }

    /**
     * Sets the value of the authorizationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationEndDate(String value) {
        this.authorizationEndDate = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
